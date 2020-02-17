package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import Gtm.Country;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.Stations;


public class ImportStationsAction extends BasicGtmAction {
	
	
		public static String regexQmPlus = "(?<!" + Pattern.quote("?") + ")" + Pattern.quote("+");
		public static String regexQmDouble = "(?<!" + Pattern.quote("?") + ")" + Pattern.quote(":");
	
		
		protected IEditingDomainProvider editingDomainProvider = null;

		public ImportStationsAction(IEditingDomainProvider editingDomainProvider) {
			super("Import stations (TSDUPD)", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
	
		public ImportStationsAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}

		
		private Stations readStationsByLine(GTMTool tool) {
			
			Stations newStations = GtmFactory.eINSTANCE.createStations();
			
			BufferedReader reader = getReader("Station file (MERITS TSDUPD)");
			
			
			String st = null;
	        try {
				while ((st = reader.readLine()) != null) {
					
					Station newStation =  decodeLine(st,tool);
					
					if (newStation != null) {
						newStations.getStations().add(newStation);
					}
				}
			} catch (IOException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("service brand file read error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
			
			return newStations;

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

		@Override
		protected void runAction(GTMTool tool) {
			Stations newStations = readStationsByLine(tool);
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			CompoundCommand command = new CompoundCommand();
			 
			int addedStations = 0;
			int updatedStations = 0;
			
			HashMap<Integer,Station> oldStations = new HashMap<Integer,Station>();
			for (Station station: tool.getCodeLists().getStations().getStations()) {
				try {
					Integer code = Integer.valueOf(station.getCountry().getCode() * 100000 + Integer.parseInt(station.getCode()));
					oldStations.put(code, station);
				} catch (Exception e) {
					//not important, might be proprietary code
				}
			}
			
			
			for (Station newStation : newStations.getStations()) {
				
				Station station = null;
				try {
					Integer code = Integer.valueOf(station.getCountry().getCode() * 100000 + Integer.parseInt(station.getCode()));
					station = oldStations.get(code);
				} catch (Exception e) {
					//not important, might be proprietary code
				}
			
				if (station == null) {
					command.append(new AddCommand(domain, tool.getCodeLists().getStations().getStations(), newStation));
                    addedStations++;
				} else {
					command.append(new SetCommand(domain, station,GtmPackage.Literals.STATION__NAME, newStation.getName()));
					updatedStations++;
				}
			
			}
			
			if (command != null & !command.isEmpty() & command.canExecute()) {
				domain.getCommandStack().execute(command);
				GtmUtils.writeConsoleInfog("MERITS stations added: (" + Integer.toString(addedStations)+")" );
				GtmUtils.writeConsoleInfog("MERITS stations updated: (" + Integer.toString(updatedStations) + ")" );
			}
			

		}
	

}
