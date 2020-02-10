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
import Gtm.LegacyDistanceFare;
import Gtm.LegacyDistanceFares;



public class ImportLegacyDistanceFareAction extends ImportLegacyAction {

	public ImportLegacyDistanceFareAction(IEditingDomainProvider editingDomainProvider) {
		super("Import legacy distance fares", editingDomainProvider);
	}
	
	/*
	 * to be implemented by all actions
	 */
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import distance fares");
		
		LegacyDistanceFares resultList = GtmFactory.eINSTANCE.createLegacyDistanceFares();
		
		ConversionFromLegacy converter = (ConversionFromLegacy) legacy108.eContainer();
		String timeZone = converter.getLegacy108().getTimeZone().getName();
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "GMT";
		}
		
		
        String st; 
        try {
			while ((st = br.readLine()) != null) {
				
				LegacyDistanceFare fare = decodeLine(st, timeZone);
				
				if (fare != null) {
					resultList.getDistanceFare().add(fare);
				}
			  
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("distance prices file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 

		EditingDomain domain = GtmUtils.getActiveDomain();
        
		Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_DISTANCE_FARES, resultList );
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			GtmUtils.writeConsoleInfog("distance prices imported: " + Integer.toString(resultList.getDistanceFare().size()));
		}
		
	}



	private LegacyDistanceFare decodeLine(String st, String timeZone) {

		if (st.length()!= 64)	return null;
		
		try {
			

		//String carrier 		= st.substring(0, 4);
		String number  			= st.substring(4, 8);
		String distance  		= st.substring(8,13);
		String flag 			= st.substring(13,14);	 
				
		if (flag.equals("2")) return null;

		String fare2nd 	 		= st.substring(14,21);	
		String fare1st 	 		= st.substring(22,29);	
		
		String returnFare1st 	= st.substring(38,45);	
		String returnFare2nd 	= st.substring(30,37);	
		
		String validFromString   = st.substring(46,54); //YYYYMMDD
		String validUntilString  = st.substring(56,64); //YYYYMMDD

		
		LegacyDistanceFare fare = GtmFactory.eINSTANCE.createLegacyDistanceFare();
		
		fare.setFareTableNumber(Integer.parseInt(number));
		fare.setDistance(Integer.parseInt(distance));
		
		fare.setFare1st(Integer.parseInt(fare1st));
		fare.setFare2nd(Integer.parseInt(fare2nd));
		
		fare.setReturnFare1st(Integer.parseInt(returnFare1st));
		fare.setReturnFare2nd(Integer.parseInt(returnFare2nd));		
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		df.setTimeZone(TimeZone.getTimeZone(timeZone)); 
		Date dt = null;
		try {
		    dt = df.parse(validFromString);
		    fare.setValidFrom(dt);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		Date dt2 = null;
		try {
		    dt2 = df.parse(validUntilString);
		    fare.setValidUntil(dt2);
		} catch (ParseException e) {
		    e.printStackTrace();
		} 
		
		return fare;
		
		} catch (Exception e) {
			return null;
		}
	}


	   	
	
}
