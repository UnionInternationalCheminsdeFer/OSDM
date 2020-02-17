package Gtm.actions;

import java.io.File;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;

import Gtm.GTMTool;
import Gtm.jsonImportExport.GtmJsonUtils;
import Gtm.presentation.GtmEditorPlugin;
import export.ExportFareDelivery;
import gtm.FareDelivery;



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
	    
		@Override
		protected void runAction(GTMTool tool) {
			
			String name = tool.getGeneralTariffModel().getDelivery().getProvider().getCode().trim() 
					+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()+".gtm.json";
            File file = getFile(name);
			if (file == null) {
				return;
			}
			
			GtmUtils.disconnectViews();
			
			try {
			
				insertIds(tool);
					
				FareDelivery fares = null;
				try {
					fares = GtmJsonUtils.convertToJson(tool.getGeneralTariffModel());
				} catch (Exception e) {
					MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("json formating error");
					if (e.getMessage()!= null) {
						dialog.setMessage(e.getMessage());
					} else {
						dialog.setMessage("unknown error");
					}
				
					dialog.open(); 
					e.printStackTrace();
					return;
				}
	 	
				ExportFareDelivery.exportFareDelivery(fares, file);

				GtmUtils.reconnectViews();
				
			} catch (Exception e) {
				GtmUtils.reconnectViews();
			}
				
		}
	    
		private void insertIds(GTMTool tool) {
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			CompoundCommand command =  GtmUtils.setIds(tool,domain);
			
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
	        	
	        	domain.getCommandStack().execute(command);
	        }

		}


		private File getFile(String name) {
		    Shell shell = Display.getDefault().getActiveShell();
		    shell.open();
		    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		    dialog.setFilterExtensions(new String[] { "*.json"}); 
		    
		    String lastPath = getLastPath();
			dialog.setFilterPath(lastPath); 
			
			dialog.setFileName(name);
			
		    String path = dialog.open();

		    storeLastPath(path);
		    File file = new File(path);
		    
		    return file;
	    
		}

		private void storeLastPath(String path) {

			// saves plugin preferences at the workspace level
			 IEclipsePreferences prefs =  InstanceScope.INSTANCE.getNode(GtmEditorPlugin.PLUGIN_ID); // does all the above behind the scenes

			  prefs.put("LAST_PATH", path);
			  try {
			    // prefs are automatically flushed during a plugin's "super.stop()".
			    prefs.flush();
			  } catch(BackingStoreException e) {
			    // not important
			  }

		}

		private String getLastPath() {

		  IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(GtmEditorPlugin.PLUGIN_ID);
		  // you might want to call prefs.sync() if you're worried about others changing your settings
		  return prefs.get("LAST_PATH","c:\\");
		}
		
		

}
