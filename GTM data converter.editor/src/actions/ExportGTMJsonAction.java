package actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import gtm.FareDelivery;


public class ExportGTMJsonAction extends BaseSelectionListenerAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Export GTM data");
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ExportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text);
			this.editingDomainProvider = editingDomainProvider;
		}

		public void run() {
			run( this.getStructuredSelection() );
			return;
		}
		
		protected void run(IStructuredSelection structuredSelection) {
			
			if (editingDomainProvider == null) return;
			
			if (!checkSelection( structuredSelection)) return;	
			
			EObject o = (EObject) structuredSelection.getFirstElement();
			
			GTMTool tool = (GTMTool) editingDomainProvider.getEditingDomain().getRoot(o);
			
			if (tool == null || tool.getGeneralTariffModel() == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("no export data found");
				dialog.open(); 
				return;
			}
			
			FareDelivery fareDelivery = convertToJson(tool.getGeneralTariffModel());
			
			ObjectMapper mapper = new ObjectMapper();

			// Java object to JSON file
			try {
				mapper.writeValue(getFile(), fareDelivery);
			} catch (JsonGenerationException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("json formating error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
			} catch (JsonMappingException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("json mapping error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
			} catch (IOException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("file error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
			}
			
		
		}
		
		private FareDelivery convertToJson(GeneralTariffModel generalTariffModel) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("not yet implemented");
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
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.SAVE);
	        fd.setText("json export file");
	        String[] filterExt = { "*.json" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
	        
		
		}

	

}
