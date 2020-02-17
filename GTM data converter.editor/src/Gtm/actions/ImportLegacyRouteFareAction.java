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
import Gtm.LegacyRouteFare;
import Gtm.LegacyRouteFares;



public class ImportLegacyRouteFareAction extends ImportLegacyAction {

	
	public ImportLegacyRouteFareAction(IEditingDomainProvider editingDomainProvider) {
		super("Import legacy route fares", editingDomainProvider);
	}
	
	public ImportLegacyRouteFareAction(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
	}

	
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import route fares");
		       
        String st; 
        
		LegacyRouteFares resultList = GtmFactory.eINSTANCE.createLegacyRouteFares();
		
		ConversionFromLegacy converter = (ConversionFromLegacy) legacy108.eContainer();
		String timeZone = converter.getLegacy108().getTimeZone().getName();
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "GMT";
		}
		
        try {
			while ((st = br.readLine()) != null) {
				
			  LegacyRouteFare fare = decodeLine(st, timeZone);
			  
			  if (fare != null) {
				  resultList.getRouteFare().add(fare);
			  }
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("TCVI file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
		EditingDomain domain = GtmUtils.getActiveDomain();
		
		Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES, resultList );
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			GtmUtils.writeConsoleInfog("route prices imported: " + Integer.toString(resultList.getRouteFare().size()));
		}
		
	}


	private LegacyRouteFare decodeLine(String st, String timeZone) {
		
		if (st.length() != 174)	return null;
		
		//String carrier 		= st.substring(0, 4);
		//String number  			= st.substring(4, 8);
		String series    		= st.substring(8,13);

		String fare1st 	 		= st.substring(132,139);	
		String fare2nd 	 		= st.substring(124,131);	
		
		String returnFare1st 	= st.substring(148,155);	
		String returnFare2nd 	= st.substring(140,147);	
		
		String validFromString   = st.substring(156,164); //YYYYMMDD
		String validUntilString  = st.substring(166,174); //YYYYMMDD
		
		
		LegacyRouteFare fare = GtmFactory.eINSTANCE.createLegacyRouteFare();

		
		fare.setSeriesNumber(Integer.parseInt(series));
		
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
	}


	   	
	
}
