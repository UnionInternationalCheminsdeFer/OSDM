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
import Gtm.LegacySeparateContractSeries;
import Gtm.LegacySeparateContractSeriesList;



public class ImportLegacyIndividualSeriesAction extends ImportLegacyAction {
	
	public ImportLegacyIndividualSeriesAction(IEditingDomainProvider editingDomainProvider) {
		super("Import Legacy TCVL - separate contracts", editingDomainProvider);
	}

	public ImportLegacyIndividualSeriesAction(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
	}

	
	/*
	 * to be implemented by all actions
	 */
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader("import TCVL - separate contracts");
		
      
        String st; 
        
        LegacySeparateContractSeriesList seriesList = GtmFactory.eINSTANCE.createLegacySeparateContractSeriesList();
		ConversionFromLegacy converter = (ConversionFromLegacy) legacy108.eContainer();
		String timeZone = converter.getLegacy108().getTimeZone().getName();
		if (timeZone == null || timeZone.length() < 3) {
			timeZone = "GMT";
		}
        
        try {
			while ((st = br.readLine()) != null) {
				
			  LegacySeparateContractSeries series = decodeLine(st, timeZone);
			  if (series != null) {
				  seriesList.getSeparateContractSeries().add(series);
			  }
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("TCVL file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
		EditingDomain domain = GtmUtils.getActiveDomain();
           	
		Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST, seriesList );
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			GtmUtils.writeConsoleInfo("separate contract series imported: " + Integer.toString(seriesList.getSeparateContractSeries().size()));
		}

	}



	private LegacySeparateContractSeries decodeLine(String st, String timeZone) {
		
		
		/*
		 *  record Field Character s No of char's M or O a) reference Pos. Of char's Comments 
		*	1 UIC code for delivering transport enterprise numeric 4 M ERA TD B.8 1-4 e.g. 1181 for ÖBB 
		*	2 Series numeric 5 M  5-9 Serves to assign fares to a specific series 
		*	3 Flag for series numeric 5 M  10-14 0, 1 or 2 (cf. Subsection 2.2) 
		*	4 First day of validity of fare numeric 8 M  15-22 Expressed as: "YYYYMMDD" 
		*	5 version number numeric 2 M  23-24 Serial numbering for versions on the fare date; "01" for the first issue; "02" for the second 
		*	6 Last day of validity of fare numeric 8 M  25-32 Expressed as: "YYYYMMDD" 
		 */
		
		try {
		
		//String carrier 	= st.substring(0, 4);
		String number  		= st.substring(4, 9);
		String flag  		= st.substring(9, 10);
		
		if (flag.equals("2")) return null;
		
		String validFromString = st.substring(211,219);		
		String validUntilString = st.substring(24,32);	
			
		
		LegacySeparateContractSeries series = GtmFactory.eINSTANCE.createLegacySeparateContractSeries();
		
		series.setSeriesNumber(Integer.parseInt(number));
		

		
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
		
		
		return series;
		
		} catch (Exception e) {
			return null;
		}

	}


	
	
	   	
	
}
