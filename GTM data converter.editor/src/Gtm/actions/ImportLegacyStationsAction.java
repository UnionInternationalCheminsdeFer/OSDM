package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Legacy108;
import Gtm.Legacy108Station;
import Gtm.Legacy108Stations;
import Gtm.nls.NationalLanguageSupport;




public class ImportLegacyStationsAction extends ImportLegacyAction {
	
	public ImportLegacyStationsAction(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportLegacyStationsAction_0, editingDomainProvider);
	}

	public ImportLegacyStationsAction(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
	}

	
	/*
	 * to be implemented by all actions
	 */
	protected void runAction(Legacy108 legacy108) {
		
		BufferedReader br = super.getReader(NationalLanguageSupport.ImportLegacyStationsAction_1);
		
		if (br == null) return;
      
        String st; 
        
        Legacy108Stations stations = GtmFactory.eINSTANCE.createLegacy108Stations();
        
        
        String charset = null;
		try  {
			String charsetlit = legacy108.getCharacterSet().getLiteral();
			int i = charsetlit.indexOf("_");	 //$NON-NLS-1$
			charset = charsetlit.substring(i+1);
			if (!Charset.isSupported(charset)) {
				String message = NationalLanguageSupport.ImportLegacyStationsAction_3;
				GtmUtils.writeConsoleError(message);
				charset = null; 
				return;
			};

		} catch (Exception e) {
			String message = NationalLanguageSupport.ImportLegacyStationsAction_4;
			GtmUtils.writeConsoleError(message);
			return;
		}
        
        try {
			while ((st = br.readLine()) != null) {
				
			  Legacy108Station station = decodeLine(st, charset);
			  if (station != null) {
				  stations.getLegacyStations().add(station);
			  }
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportLegacyStationsAction_5);
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
		EditingDomain domain = GtmUtils.getActiveDomain();
           	
		Command cmd =  SetCommand.create(domain, legacy108, GtmPackage.Literals.LEGACY108__LEGACY_STATIONS, stations );
		if (cmd.canExecute()) {
			domain.getCommandStack().execute(cmd);
			GtmUtils.writeConsoleInfo(NationalLanguageSupport.ImportLegacyStationsAction_6 + Integer.toString(stations.getLegacyStations().size()));
		}

	}



	private Legacy108Station decodeLine(String st , String charset) {
		
		try {
		
		String flag  		= st.substring(9, 10);
		
		if (flag.equals("2")) return null; //$NON-NLS-1$


		String nameUTF8 = new String(st.substring(15,50).getBytes(charset));
	
		String nameASCII 	= st.substring(51,68);	

		String shortNameASCII 	= st.substring(51,68);	
		
		int code	= 0;
		try  {
			code = Integer.parseInt(st.substring(4, 9));		
		} catch (Exception e) {
			//do nothing
		}

		int fareReferenceStationCode = 0;
		try {
			fareReferenceStationCode = Integer.parseInt(st.substring(129,134));		
		} catch (Exception e) {
			//do nothing
		}	
		
		int borderPointCode	= 0;
		try  {
			borderPointCode = Integer.parseInt(st.substring(92,96));		
		} catch (Exception e) {
			//do nothing
		}

		
		Legacy108Station station = GtmFactory.eINSTANCE.createLegacy108Station();
		
		station.setBorderPointCode(borderPointCode);
		station.setName(nameASCII);
		station.setNameUTF8(nameUTF8);
		station.setShortName(shortNameASCII);
		station.setStationCode(code);
		station.setFareReferenceStationCode(fareReferenceStationCode);
		
		return station;
		
		} catch (Exception e) {
			return null;
		}

	}


	   	
	
}
