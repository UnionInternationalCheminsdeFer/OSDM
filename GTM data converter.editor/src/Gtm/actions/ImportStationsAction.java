package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;


public class ImportStationsAction extends BasicGtmAction {
	
	
		public static String regexQmPlus = "(?<!" + Pattern.quote("?") + ")" + Pattern.quote("+");
		public static String regexQmDouble = "(?<!" + Pattern.quote("?") + ")" + Pattern.quote(":");
	
		
		protected IEditingDomainProvider editingDomainProvider = null;

		public ImportStationsAction(IEditingDomainProvider editingDomainProvider) {
			super("Import stations (TSDUPD)", editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importStations.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
	
		public ImportStationsAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importStations.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			GtmEditor editor = GtmUtils.getActiveEditor(); 
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			if (domain == null) return;
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("no data found");
				dialog.open(); 
				return;
			}
			
			BufferedReader reader = getReader("Station file (MERITS TSDUPD)");

			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						monitor.beginTask("Import stations", 90000); 
			
						monitor.subTask("Initialize main structure");
						prepareStructure(tool, domain);
						monitor.worked(1000);
										
						
						monitor.subTask("Read stations");
						ArrayList<Station> importedStations = new ArrayList<Station>();
						ArrayList<Station> newStations = new ArrayList<Station>();
						ArrayList<Station> updatedStations = new ArrayList<Station>();
						
						String st = null;
						int stationNb = 0;
						while ((st = reader.readLine()) != null) {
								
							Station newStation =  decodeLine(st,tool);
							
							if (newStation != null) {
								stationNb++;
								
								if (GtmUtils.importStation(tool.getConversionFromLegacy().getParams().getStationImportFilter(), newStation.getCountry().getCode())) {
									importedStations.add(newStation);
									if (stationNb % 100 == 0) {
										monitor.subTask("Read station - " + String.valueOf(stationNb));
										monitor.worked(1000);
									}
								}
							}
						} 
						
						monitor.subTask("Select new stations");
						HashMap<Integer,Station> oldStations = new HashMap<Integer,Station>();
						for (Station station: tool.getCodeLists().getStations().getStations()) {
							try {
								Integer code = Integer.valueOf(station.getCountry().getCode() * 100000 + Integer.parseInt(station.getCode()));
								oldStations.put(code, station);
							} catch (Exception e) {
								//not important, might be proprietary code
							}
						}
						
						for (Station newStation : importedStations) {
							Station station = null;
							try {
								Integer code = Integer.valueOf(newStation.getCountry().getCode() * 100000 + Integer.parseInt(newStation.getCode()));
								station = oldStations.get(code);
							} catch (Exception e) {
								//not important, might be proprietary code
							}
						
							if (station == null) {
								newStations.add(newStation);
							} else {
								updatedStations.add(newStation);
							}
						}
						monitor.worked(1000);
						
						monitor.subTask("Add new stations to data");
						final int addedStationsF = newStations.size();
						Command addCommand = AddCommand.create(domain, tool.getCodeLists().getStations(), GtmPackage.Literals.STATIONS__STATIONS, newStations);
						if (addCommand != null & addCommand.canExecute()) {
							domain.getCommandStack().execute(addCommand);
							editor.getSite().getShell().getDisplay().asyncExec(() -> {
								GtmUtils.writeConsoleInfo("MERITS stations added: (" + Integer.toString(addedStationsF)+")" );
							});

						}
						monitor.worked(1000);
						
						monitor.subTask("Update stations");						
						final int updatedStationsF = updatedStations.size();
						CompoundCommand command = new CompoundCommand();
						for (Station newStation : updatedStations) {
							Integer code = Integer.valueOf(newStation.getCountry().getCode() * 100000 + Integer.parseInt(newStation.getCode()));
							Station station = oldStations.get(code);
							
							if (!station.getTimetableName().equals(newStation.getTimetableName())) {
								command.append(new SetCommand(domain, station,GtmPackage.Literals.STATION__NAME, newStation.getTimetableName()));
							}
							if (station.getLatitude() != newStation.getLatitude()) {
								command.append(new SetCommand(domain, station,GtmPackage.Literals.STATION__LATITUDE, newStation.getLatitude()));
							}
							if (station.getLongitude() != newStation.getLongitude()) {
								command.append(new SetCommand(domain, station,GtmPackage.Literals.STATION__LONGITUDE, newStation.getLongitude()));										
							}
						}
						if (command != null & !command.isEmpty() & command.canExecute()) {
							domain.getCommandStack().execute(command);
							editor.getSite().getShell().getDisplay().asyncExec(() -> {
								GtmUtils.writeConsoleInfo("MERITS stations updated: (" + Integer.toString(updatedStationsF) + ")" );
							});
						}
						monitor.worked(1000);
						
					} catch (IOException e) {
						MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
						dialog.setText("station file read error");
						dialog.setMessage(e.getMessage());
						dialog.open(); 
					} catch (Exception e) {
						MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
						dialog.setText("station import error");
						dialog.setMessage(e.getMessage());
						dialog.open(); 
					} finally {
						monitor.done();
					}
				}
			};
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
			} catch (Exception exception) {
				// Something went wrong that shouldn't.
				GtmEditorPlugin.INSTANCE.log(exception);
			} finally {
				editor.reconnectViews();
			}

				
		}


		private Station decodeLine(String st, GTMTool tool) {
			if (st.startsWith("ALS+")) {
				return decodeStationSegment(st, tool);
			}
			return null;
		}
 


		
		private Station decodeStationSegment(String edifact, GTMTool tool) {
			 
			 // ALS+29+008008618:MENDEN(SAUERLAND)S+512542N+074828E'
			 //"?" release indicator
			
			 String[] section = edifact.split("\\+");
			 
			 String functionCodeQualifier = section[1];
			 		 			
			 String[] stationElementSplit = section[2].split(":");
			 
			 String stationCode = stationElementSplit[0];
			 int countryCodeUIC = Integer.parseInt(stationCode.substring(0, 4));
			 
			 String  localCode = stationCode.substring(4, 9);
			 	 
			 String stationName = stationElementSplit[1];
			 
			 //strange MERITS data
			 if (countryCodeUIC == 0) {
				 GtmUtils.writeConsoleError("Merits station without country code: " + stationName);
				 return null;
			 }
			
			 float longitude = 0;
			 float latitude = 0;
			 
			 try {

				 if (section.length > 4) {
			 
					 // Format = ddmmssx   dd = degrees   mm = minutes   ss = seconds   x = N (North) or S (South) 
					 longitude = decodeMeritsGeoString(section[3]);
			 
					 //Format = ddmmssx   dd = degrees   mm = minutes   ss = seconds   x = E (East) or W (West) 
					 latitude = decodeMeritsGeoString(section[4]);
				 
				 }
			 } catch(Exception e ) {
					 //do nothing, geocoordinates not usable
			 }
			 
			 Country  country = tool.getCodeLists().getCountries().findCountry(countryCodeUIC);
			 
			 if (country != null) {
				 Station station = GtmFactory.eINSTANCE.createStation();
				 
				 if (Integer.parseInt(functionCodeQualifier) == 17) {
					 station.setBorderStation(true);
				 } else {
					 station.setBorderStation(false);
				 }
				 
				 station.setCountry(country);
				 station.setTimetableName(stationName);
				 station.setName(stationName);				 
				 station.setCode(localCode);
				 station.setLatitude(latitude);
				 station.setLongitude(longitude);
				 return station;
			 } else {
				 GtmUtils.writeConsoleError("Merits station with unknown country: " + stationCode + " " + stationName);
			 }
			 return null;
		}

		private float decodeMeritsGeoString(String string) {
			 // Format = ddmmssx   dd = degrees   mm = minutes   ss = seconds   x = N (North) or S (South) 
			 // Format = ddmmssx   dd = degrees   mm = minutes   ss = seconds   x = E (East) or W (West) 
			
			 float geo = 0;
			 int degrees = Integer.parseInt(string.substring(0, 2));
			 int minutes = Integer.parseInt(string.substring(2, 4));
			 int seconds = Integer.parseInt(string.substring(4, 6));
			 String hem = string.substring(6, 7);

			 if (hem == "N" || hem == "E") {
				 geo = (degrees*60*60 + minutes*60 + seconds);
				 geo = geo / (3600);
			 } else {
				 geo = -1 * (degrees*3600 + minutes*60 + seconds);	
				 geo = -1 * geo / (3600);
			 }
			 return geo;
		}

		private String[]  edifactSplitSection(String edifact) {
			return edifact.split(regexQmPlus);	
		}


	    
		private BufferedReader getReader(String text){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.*" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("file read error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return br;

		}


}
