package actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmPackage;
import gtm.FareDelivery;


public class ImportGTMJsonAction extends BaseSelectionListenerAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ImportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Import GTM data");
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ImportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text);
			this.editingDomainProvider = editingDomainProvider;
		}

		public void run() {
			run( this.getStructuredSelection() );
			return;
		}
		
		protected void run(IStructuredSelection structuredSelection) {
			
			if (!checkSelection( structuredSelection)) return;	
			
			EObject o = (EObject) structuredSelection.getFirstElement();

			GTMTool tool = (GTMTool) editingDomainProvider.getEditingDomain().getRoot(o);
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("no export data found");
				dialog.open(); 
				return;
			}

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
		

		


		private GeneralTariffModel convertFareData(FareDelivery fareDelivery) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("Not yet implemented");
			dialog.open(); 
			return null;
		}

		protected boolean checkSelection(IStructuredSelection selection)
		{
			if (selection == null) return false;
	    	
	    	if (!(selection.getFirstElement() instanceof EObject )) return false;
	    	    	
			return true;
		}
		

		   	
		
	    public boolean updateSelection (IStructuredSelection selection)
	    {
	  		this.setEnabled(false);

	  		if (checkSelection(selection)) 	{
	  			this.setEnabled(true);
	  			return true;
	  		}
	  		return false;
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

	

}
