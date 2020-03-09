package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.ConversionFromLegacy;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.LegacyCalculationType;
import Gtm.LegacySeries;
import Gtm.LegacySeriesList;
import Gtm.LegacySeriesType;
import Gtm.LegacyViastation;



public class ImportLegacySeriesAction extends ImportLegacyAction {
	
	public ImportLegacySeriesAction(IEditingDomainProvider editingDomainProvider) {
		super("Import Legacy series TCVS", editingDomainProvider);
	}

	public ImportLegacySeriesAction(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
	}

	
	/*
	 * to be implemented by all actions
	 */
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import series TCVS");
		
      
        String st; 
        
        LegacySeriesList seriesList = GtmFactory.eINSTANCE.createLegacySeriesList();
		ConversionFromLegacy converter = (ConversionFromLegacy) legacy108.eContainer();
		String timeZone = converter.getLegacy108().getTimeZone().getName();
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "GMT";
		}
        
        try {
			while ((st = br.readLine()) != null) {
				
			  LegacySeries series = decodeLine(st, timeZone);
			  if (series != null) {
				  seriesList.getSeries().add(series);
			  }
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("TCVS file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
		EditingDomain domain = GtmUtils.getActiveDomain();
           	
		Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST, seriesList );
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			GtmUtils.writeConsoleInfo("series imported: " + Integer.toString(seriesList.getSeries().size()));
		}

	}



	private LegacySeries decodeLine(String st, String timeZone) {
		
		try {
		
		String supplier   				= st.substring(0, 4);
		String number  					= st.substring(4, 9);
		String flag  					= st.substring(9, 10);
		
		if (flag.equals("2")) return null;
		
		String type 					= st.substring(10,11);
		//String flag2 					= st.substring(11,12);		
		String departure 				= st.substring(12,17);		
		String departureStationName 	= st.substring(19,36);	
		
		String destination				= st.substring(37,42);		
		String arrivalStationName 		= st.substring(44,61);	

		String carrier   	        	= st.substring(74,78);
		String routeDescription 		= st.substring(79,137);	

		String distanceKl2				= st.substring(138,143);
		String distanceKl1				= st.substring(144,149);		
		
		String calculation				= st.substring(150,151);		
		
			
		String via1						= st.substring(175,180);			
		String pos1						= st.substring(180,181);			

		String via2						= st.substring(182,187);			
		String pos2						= st.substring(187,188);	
		
		String via3						= st.substring(189,194);			
		String pos3						= st.substring(194,195);	
		
		String via4						= st.substring(196,201);			
		String pos4						= st.substring(201,202);	
		
		String via5						= st.substring(203,208);			
		String pos5						= st.substring(208,209);	
		
		String validFromString 			= st.substring(211,219);		
		String validUntilString 		= st.substring(221,229);				
		
		LegacySeries series = GtmFactory.eINSTANCE.createLegacySeries();
		
		series.setCarrierCode(carrier);
		series.setSupplyingCarrierCode(supplier);
		series.setRouteDescription(routeDescription);
		series.setFromStationName(departureStationName);
		series.setToStationName(arrivalStationName);
		
		series.setNumber(Integer.parseInt(number));
		
		if (type.equals("1")) series.setType(LegacySeriesType.TRANSIT);
		if (type.equals("2")) series.setType(LegacySeriesType.BORDER_DESTINATION);
		if (type.equals("3")) series.setType(LegacySeriesType.STATION_STATION);

		if (calculation.equals("1")) series.setPricetype(LegacyCalculationType.DISTANCE_BASED);
		if (calculation.equals("2")) series.setPricetype(LegacyCalculationType.ROUTE_BASED);		
		
		series.setFromStation(Integer.parseInt(departure));
		series.setToStation(Integer.parseInt(destination));
		
		series.setDistance1(Integer.parseInt(distanceKl1));
		series.setDistance2(Integer.parseInt(distanceKl2));
		
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		df.setTimeZone(TimeZone.getTimeZone(timeZone)); 
		Date dt = null;
		try {
		    dt = df.parse(validFromString);
		    series.setValidFrom(dt);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		Date dt2 = null;
		try {
		    dt2 = df.parse(validUntilString);
		    series.setValidUntil(dt2);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		
		
		int viaStation1 = Integer.parseInt(via1); 
		int viaStation2 = Integer.parseInt(via2); 
		int viaStation3 = Integer.parseInt(via3); 
		int viaStation4 = Integer.parseInt(via4); 
		int viaStation5 = Integer.parseInt(via5); 
		
		if (viaStation1 > 0) {
			addViaStation(series, viaStation1, pos1);
		}
			
		if (viaStation2 > 0) {
			addViaStation(series, viaStation2, pos2);
		}
		
		if (viaStation3 > 0) {
			addViaStation(series, viaStation3, pos3);
		}
		
		if (viaStation4 > 0) {
			addViaStation(series, viaStation4, pos4);
		}
		
		if (viaStation5 > 0) {
			addViaStation(series, viaStation5, pos5);
		}
		
		return series;
		
		} catch (Exception e) {
			return null;
		}

	}


	private void addViaStation(LegacySeries series, int via, String pos1) {
		LegacyViastation station = GtmFactory.eINSTANCE.createLegacyViastation();
		
		station.setCode(via);
		station.setPosition(Integer.parseInt(pos1));
		series.getViastations().add(station);
		
	}
		
	
	   	
	
}
