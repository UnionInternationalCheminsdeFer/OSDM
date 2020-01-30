package actions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Gtm.GTMTool;
import gtm.FareDelivery;
import jsonImportExport.GtmJsonUtils;


public class ExportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Export GTM data", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ExportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
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
	    
		protected File getFile(String name){
			
			String fileName = name + ".gtm.json";
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.SAVE);
	        fd.setText("json export file");
	        fd.setFileName(fileName);
	        String[] filterExt = { "*.json" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
	        
		
		}

		@Override
		protected void runAction(GTMTool tool) {
			
			
			CompoundCommand command =  GtmUtils.setIds(tool,editingDomainProvider.getEditingDomain());
			
			if (command == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("no export data found");
				dialog.open(); 
				return;
			}
			
	        if (command != null && !command.isEmpty()) {
	        	
				if (!command.canExecute()) {
					MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("ids can not be created");
					dialog.open(); 
					return;
				}
	        	
	        	
	        	editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
	        }
			
			
			FareDelivery fares = GtmJsonUtils.convertToJson(tool.getGeneralTariffModel());
			
			ObjectMapper mapper = new ObjectMapper();

			// Java object to JSON file
			try {
				
				Date now = Calendar.getInstance().getTime();
				String name = tool.getGeneralTariffModel().getDelivery().getProvider().getCode().trim() 
						+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()
						+ "_" + DateFormat.getInstance().format(now).trim();
				mapper.writeValue(getFile(name), fares);
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

	

}
