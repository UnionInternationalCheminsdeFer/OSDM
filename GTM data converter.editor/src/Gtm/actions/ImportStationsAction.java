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
import org.eclipse.emf.edit.command.RemoveCommand;
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
import Gtm.StationRelation;
import Gtm.StationRelationType;
import Gtm.console.ConsoleUtil;
import Gtm.nls.NationalLanguageSupport;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.GtmEditor;


public class ImportStationsAction extends BasicGtmAction {
	
	
		public static String regexQmPlus = "(?<!" + Pattern.quote("?") + ")" + Pattern.quote("+"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		public static String regexQmDouble = "(?<!" + Pattern.quote("?") + ")" + Pattern.quote(":"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
	
		
		protected IEditingDomainProvider editingDomainProvider = null;

		public ImportStationsAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ImportStationsAction_8, editingDomainProvider);
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
				dialog.setText(NationalLanguageSupport.ImportStationsAction_9);
				dialog.open(); 
				return;
			}
			
			
			
			BufferedReader reader = getReader(NationalLanguageSupport.ImportStationsAction_10);

			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						monitor.beginTask(NationalLanguageSupport.ImportStationsAction_11, 90000); 
			
						monitor.subTask(NationalLanguageSupport.ImportStationsAction_12);
						prepareStructure(tool, domain);
						monitor.worked(1000);
										
						
						monitor.subTask(NationalLanguageSupport.ImportStationsAction_13);
						ArrayList<Station> importedStations = new ArrayList<Station>();
						ArrayList<Station> newStations = new ArrayList<Station>();
						ArrayList<Station> updatedStations = new ArrayList<Station>();
						ArrayList<Station> borderStations = new ArrayList<Station>();
						
						String st = null;
						int stationNb = 0;
						while ((st = reader.readLine()) != null) {
								
							Station newStation =  decodeLine(st,tool,editor);
							
							if (newStation != null) {
								stationNb++;
								
								if (GtmUtils.importStation(tool.getConversionFromLegacy().getParams().getStationImportFilter(), newStation.getCountry().getCode())) {
									importedStations.add(newStation);
									if (newStation.isBorderStation()) {
										borderStations.add(newStation);
									}
									if (stationNb % 100 == 0) {
										monitor.subTask(NationalLanguageSupport.ImportStationsAction_14 + String.valueOf(stationNb));
										monitor.worked(1000);
									}
								}
							}
						} 
						
						monitor.subTask(NationalLanguageSupport.ImportStationsAction_15);
						HashMap<Integer,Station> oldStations = GtmUtils.getStationMap(tool);
						
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
						
						
						/*
						 * trying to link border stations via geo-coordinates
						 * 
						 * result depends on the data quality which was poor in the test data
						 * 
						 */
						
						
						
						
						Float accuracy = ((float)PreferencesAccess.getIntFromPreferenceStore(PreferenceConstants.P_LINK_STATIONS_BY_GEO_ACCURACY)) / (60 * 60);
						
						if (PreferencesAccess.getBoolFromPreferenceStore(PreferenceConstants.P_LINK_STATIONS_BY_GEO)) {
							monitor.subTask(NationalLanguageSupport.ImportStationsAction_CONNECT_BORDER_STATIONS);
							for (Station station1 : borderStations) {
								
								for (Station station2 : borderStations) {
									
									if (station1 != station2 && 
										station1.getLatitude() > 0 &&
										station2.getLatitude() > 0 &&
										station1.getLongitude() > 0 &&
										station2.getLongitude() > 0 &&
										Math.abs(station1.getLatitude() - station2.getLatitude()) < accuracy &&
										Math.abs(station1.getLongitude() - station2.getLongitude()) < accuracy) {
										
										StationRelation rel1 = GtmFactory.eINSTANCE.createStationRelation();
										rel1.setRelationType(StationRelationType.SAME_STATION);
										rel1.setStation(station2);
										StationRelation rel2 = GtmFactory.eINSTANCE.createStationRelation();
										rel2.setRelationType(StationRelationType.SAME_STATION);
										rel2.setStation(station1);
										
										station1.getRelations().add(rel1);
										station2.getRelations().add(rel2);
									}
								}									
							}
						}
						monitor.worked(10);						
						
						monitor.subTask(NationalLanguageSupport.ImportStationsAction_16);
						final int addedStationsF = newStations.size();
						Command addCommand = AddCommand.create(domain, tool.getCodeLists().getStations(), GtmPackage.Literals.STATIONS__STATIONS, newStations);
						if (addCommand != null & addCommand.canExecute()) {
							domain.getCommandStack().execute(addCommand);
							editor.getSite().getShell().getDisplay().asyncExec(() -> {
								GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportStationsAction_17 + Integer.toString(addedStationsF)+")" ); //$NON-NLS-2$
							});

						}
						monitor.worked(1000);
						
						monitor.subTask(NationalLanguageSupport.ImportStationsAction_19);						
						final int updatedStationsF = updatedStations.size();
						CompoundCommand command = new CompoundCommand();
						for (Station newStation : updatedStations) {
							Integer code = Integer.valueOf(newStation.getCountry().getCode() * 100000 + Integer.parseInt(newStation.getCode()));
							Station station = oldStations.get(code);
							
							if (!station.getTimetableName().equals(newStation.getTimetableName())) {
								command.append(SetCommand.create(domain, station,GtmPackage.Literals.STATION__NAME, newStation.getTimetableName()));
							}
							if (station.getLatitude() != newStation.getLatitude()) {
								command.append(SetCommand.create(domain, station,GtmPackage.Literals.STATION__LATITUDE, newStation.getLatitude()));
							}
							if (station.getLongitude() != newStation.getLongitude()) {
								command.append(SetCommand.create(domain, station,GtmPackage.Literals.STATION__LONGITUDE, newStation.getLongitude()));										
							}
							if (station.getRelations() != null && !station.getRelations().isEmpty()) {
								command.append(RemoveCommand.create(domain,station, GtmPackage.Literals.STATION__RELATIONS,station.getRelations()));										
							}							
							if (newStation.getRelations() != null && !newStation.getRelations().isEmpty()) {
								command.append(AddCommand.create(domain,station,GtmPackage.Literals.STATION__RELATIONS, newStation.getRelations()));										
							}								
							
						}
						if (command != null & !command.isEmpty() & command.canExecute()) {
							domain.getCommandStack().execute(command);
							editor.getSite().getShell().getDisplay().asyncExec(() -> {
								GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportStationsAction_20 + Integer.toString(updatedStationsF) + ")" ); //$NON-NLS-2$
							});
						}
						monitor.worked(1000);
						
					} catch (IOException e) {
						String message = NationalLanguageSupport.ImportStationsAction_22 + " - " + e.getMessage();
						editor.getSite().getShell().getDisplay().asyncExec(() -> {
							ConsoleUtil.printError(NationalLanguageSupport.ConverterToLegacy_42, message);
						});
					} catch (Exception e) {
						String message = NationalLanguageSupport.ImportStationsAction_23  + " - " + e.getMessage();
						editor.getSite().getShell().getDisplay().asyncExec(() -> {
							ConsoleUtil.printError(NationalLanguageSupport.ConverterToLegacy_42, message);
						});
					} finally {
						monitor.done();
					}
				}
			};
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
			} catch (Exception e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportStationsAction_23);
				dialog.setMessage(e.getMessage());
				dialog.open();
			} finally {
				editor.reconnectViews();
			}

				
		}


		private Station decodeLine(String st, GTMTool tool,GtmEditor editor) {
			if (st.startsWith("ALS+")) { //$NON-NLS-1$
				return decodeStationSegment(st, tool,editor);
			}
			return null;
		}
 


		
		private Station decodeStationSegment(String edifact, GTMTool tool, GtmEditor editor) {
			
			try {
			 
				 // ALS+29+008008618:MENDEN(SAUERLAND)S+512542N+074828E'
				 //"?" release indicator
				
				 String[] section = edifact.split("\\+"); //$NON-NLS-1$
				 
				 String functionCodeQualifier = section[1];
				 		 			
				 String[] stationElementSplit = section[2].split(":"); //$NON-NLS-1$
				 
				 String stationCode = stationElementSplit[0];
				 int countryCodeUIC = Integer.parseInt(stationCode.substring(0, 4));
				 
				 String  localCode = stationCode.substring(4, 9);
				 	 
				 String stationName = stationElementSplit[1].trim();
				 
				 //strange MERITS data
				 if (countryCodeUIC == 0) {
					 String message = NationalLanguageSupport.ImportStationsAction_27 + stationName;
					 editor.getSite().getShell().getDisplay().asyncExec(() -> {
							GtmUtils.writeConsoleError(message); 
					 });
					 
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
					 String message = NationalLanguageSupport.ImportStationsAction_28 + stationCode + " " + stationName; //$NON-NLS-2$
					 editor.getSite().getShell().getDisplay().asyncExec(() -> {
							GtmUtils.writeConsoleError(message); 
					 });
				 }
			 
			 
			} catch (Exception e) {
				 e.printStackTrace();
				 String message = "could not decode edifact segment: " +  edifact;
				 editor.getSite().getShell().getDisplay().asyncExec(() -> {
						GtmUtils.writeConsoleError(message); 
				 });
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

			 if (hem == "N" || hem == "E") { //$NON-NLS-1$ //$NON-NLS-2$
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
	        String[] filterExt = { "*.*" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportStationsAction_33);
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return br;

		}


}
