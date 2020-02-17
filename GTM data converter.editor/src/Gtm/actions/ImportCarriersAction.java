package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Carrier;
import Gtm.Carriers;
import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;

public class ImportCarriersAction extends ImportCsvDataAction {


	public ImportCarriersAction(IEditingDomainProvider editingDomainProvider) {
		super("import carrier codes", editingDomainProvider);
	}

	@Override
	protected void runAction(GTMTool tool) {
		BufferedReader br = super.getReader("import carrier codes (.csv)");
		
		CompoundCommand command =  new CompoundCommand();
		
		EditingDomain domain = GtmUtils.getActiveDomain();
		    	
    	Carriers newCarriers = GtmFactory.eINSTANCE.createCarriers();

        String st; 
        boolean isFirstLine = true;
        
        try {
			while ((st = br.readLine()) != null) {
				
				Carrier carrier = decodeLine(st);
				
				if (!isFirstLine) {
					if (carrier != null) {
						newCarriers.getCarriers().add(carrier);	
					}
				} else {
					isFirstLine = false;
				}
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("carrier file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
        int added = 0;
        int updated = 0;

		for (Carrier newCarrier : newCarriers.getCarriers()) {
       	
        	Carrier carrier = tool.getCodeLists().getCarriers().findCarrier(newCarrier.getCode());
        	
        	if (carrier == null) {
        		Command cmd2 = new AddCommand(domain, tool.getCodeLists().getCarriers().getCarriers(), newCarrier);
        		command.append(cmd2);
        		added++;
        	} else {
        		Command cmd2 = new SetCommand(domain, carrier, GtmPackage.Literals.CARRIER__NAME, newCarrier.getName());
                command.append(cmd2);
        		Command cmd3 = new SetCommand(domain, carrier, GtmPackage.Literals.CARRIER__SHORT_NAME, newCarrier.getShortName());
                command.append(cmd3); 
                updated++;
           	}
        			
        }
        
        if (command != null && !command.isEmpty()) {
        	domain.getCommandStack().execute(command);
			GtmUtils.writeConsoleInfog("carriers added: (" + Integer.toString(added)+")" );
			GtmUtils.writeConsoleInfog("carriers updated: (" + Integer.toString(updated) + ")" );
        }		
	}

	private Carrier decodeLine(String st) {
		String[] strings = st.split(";");
		if (strings.length < 3) return null;
		
		if (strings[0].length() == 4) {
			Carrier carrier = GtmFactory.eINSTANCE.createCarrier();
			carrier.setCode(strings[0]);
			
			String nameUTF8 = null;
			nameUTF8 = strings[2];//new String(strings[2].getBytes("ISO-8859-1"));
			
			carrier.setName(nameUTF8);
			carrier.setShortName(strings[1]);
			return carrier;
		}
		return null;

	}

}
