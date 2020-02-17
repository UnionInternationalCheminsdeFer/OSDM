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


import Gtm.GTMTool;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.ServiceBrand;
import Gtm.ServiceBrands;

public class ImportServiceBrandsAction extends ImportCsvDataAction {


	public ImportServiceBrandsAction(IEditingDomainProvider editingDomainProvider) {
		super("import service brands", editingDomainProvider);
	}

	@Override
	protected void runAction(GTMTool tool) {
		BufferedReader br = super.getReader("import service brands (.csv)");
		
		CompoundCommand command =  new CompoundCommand();
		
    	
    	ServiceBrands newBrands = GtmFactory.eINSTANCE.createServiceBrands();

        String st; 
        boolean isFirstLine = true;
        
        try {
			while ((st = br.readLine()) != null) {
				
				ServiceBrand brand = decodeLine(st);
				
				if (!isFirstLine) {
					if (brand != null) {
						newBrands.getServiceBrands().add(brand);	
					}
				} else {
					isFirstLine = false;
				}
			}
		} catch (IOException e) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("service brand file read error");
			dialog.setMessage(e.getMessage());
			dialog.open(); 
			e.printStackTrace();
			return;
		} 
        
        int added = 0;
        int updated = 0;
        
		EditingDomain domain = GtmUtils.getActiveDomain();

		for (ServiceBrand newBrand : newBrands.getServiceBrands()) {
       	
        	ServiceBrand brand = tool.getCodeLists().getServiceBrands().findServiceBRand(newBrand.getCode());
        	
        	if (brand == null) {
        		Command cmd2 = new AddCommand(domain, tool.getCodeLists().getServiceBrands().getServiceBrands(), newBrand);
        		command.append(cmd2);
        		added++;
        	} else {
        		Command cmd2 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__NAME, newBrand.getName());
                command.append(cmd2);
        		Command cmd3 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__ABBREVIATION, newBrand.getAbbreviation());
                command.append(cmd3);        	
        		Command cmd4 = new SetCommand(domain, brand, GtmPackage.Literals.SERVICE_BRAND__DESCRIPTION, newBrand.getDescription());
                command.append(cmd4);   
                updated++;
           	}
        			
        }
        
        if (command != null && !command.isEmpty()) {
        	domain.getCommandStack().execute(command);
			GtmUtils.writeConsoleInfog("service brands added: (" + Integer.toString(added)+")" );
			GtmUtils.writeConsoleInfog("service brands updated: (" + Integer.toString(updated) + ")" );
        }		
	}

	private ServiceBrand decodeLine(String st) {
		String[] strings = st.split(";");
		
		if (strings.length < 3) return null;
		
		try {
			if (strings[0].length() < 4) {
				ServiceBrand brand = GtmFactory.eINSTANCE.createServiceBrand();
				brand.setCode(Integer.parseInt(strings[0]));
				brand.setAbbreviation(strings[1]);
				brand.setName(strings[2]);
				brand.setDescription(strings[3]);
				return brand;
			}
		} catch (Exception e){
			return null;
		}
		return null;

	}

}
