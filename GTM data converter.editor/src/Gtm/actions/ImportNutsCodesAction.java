package Gtm.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.NUTSCodes;
import Gtm.NutsCode;

public class ImportNutsCodesAction extends ImportCsvDataAction {


	public ImportNutsCodesAction(IEditingDomainProvider editingDomainProvider) {
		super("import NUTS codes", editingDomainProvider);
	}

	@Override
	protected void runAction(GTMTool tool) {
		BufferedReader br = super.getReader("import NUTS codes (.csv)");
		
		CompoundCommand command =  new CompoundCommand();
		
		EditingDomain domain = GtmUtils.getActiveDomain();
		    	
    	NUTSCodes newNuts = GtmFactory.eINSTANCE.createNUTSCodes();

        String st; 

        try {
			while ((st = br.readLine()) != null) {
				
				NutsCode nuts = decodeLine(st);

				if (nuts != null) {
					newNuts.getNutsCodes().add(nuts);	
				}
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("nuts codes file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
        int added = 0;
        int updated = 0;
        
        HashMap<String, NutsCode> oldNuts = new HashMap<String,NutsCode>();
		for (NutsCode code : tool.getCodeLists().getNutsCodes().getNutsCodes()) {
	       	oldNuts.put(code.getCode(),code);       			
        }
        

		for (NutsCode nuts : newNuts.getNutsCodes()) {
       	
			NutsCode oldCode = oldNuts.get(nuts.getCode());
        	
        	if (oldCode == null) {
        		Command cmd2 = new AddCommand(domain, tool.getCodeLists().getNutsCodes().getNutsCodes(), nuts);
        		command.append(cmd2);
        		added++;
        	} else {
        		Command cmd2 = new SetCommand(domain, oldCode, GtmPackage.Literals.NUTS_CODE__NAME, nuts.getName());
                command.append(cmd2);
                updated++;
           	}
        			
        }
        
        if (command != null && !command.isEmpty()) {
        	domain.getCommandStack().execute(command);
			GtmUtils.writeConsoleInfog("nuts codes added: (" + Integer.toString(added)+")" );
			GtmUtils.writeConsoleInfog("nits codes updated: (" + Integer.toString(updated) + ")" );
        }		
	}

	private NutsCode decodeLine(String st) {
		String[] strings = st.split(";");
		if (strings.length < 2) return null;
		
		NutsCode nuts = GtmFactory.eINSTANCE.createNutsCode();
		nuts.setCode(strings[0]);
			
		String nameUTF8 = null;
		nameUTF8 = strings[1];//new String(strings[2].getBytes("ISO-8859-1"));
			
		nuts.setName(nameUTF8);
		return nuts;

	}

}
