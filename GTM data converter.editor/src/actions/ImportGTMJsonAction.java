package actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmPackage;
import gtm.FareDelivery;


public class ImportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ImportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Import GTM data", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ImportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}


		private GeneralTariffModel convertFareData(FareDelivery fareDelivery) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("Not yet implemented");
			dialog.open(); 
			return null;
		}

    
		protected File getFile(){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText("select import json file");
	        String[] filterExt = { "*.json" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
			
		}

		@Override
		protected void runAction(GTMTool tool) {
			
			ObjectMapper mapper = new ObjectMapper();
			
			FareDelivery fareDelivery = null;

			//JSON file to Java object
			try {
				fareDelivery  = mapper.readValue(getFile(), FareDelivery.class);
			} catch (JsonParseException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("json parsing error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return;
			} catch (JsonMappingException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("json mapping error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return;
			} catch (IOException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("file error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return;
			}
			
			if (fareDelivery == null) return;
			
			
			
			GeneralTariffModel model = convertFareData(fareDelivery);
			
			SetCommand command = new SetCommand(editingDomainProvider.getEditingDomain(), tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, model);
				
			if (command.canExecute()) {
				editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
			}
		}

	

}
