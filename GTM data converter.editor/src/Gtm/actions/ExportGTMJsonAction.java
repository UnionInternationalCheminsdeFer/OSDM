package Gtm.actions;

import java.io.File;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;

import Gtm.GTMTool;
import Gtm.jsonImportExport.GtmJsonExporter;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import export.ExportFareDelivery;
import gtm.FareDelivery;



public class ExportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Export GTM data", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportGtm.png")); //$NON-NLS-1$
		}
		
		public ExportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("no data found");
				dialog.open(); 
				return;
			}
			
			String name = tool.getGeneralTariffModel().getDelivery().getProvider().getCode().trim() 
					+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()+".gtm.json";
            File file = getFile(name);
			if (file == null) {
				return;
			}

			GtmEditor editor = GtmUtils.getActiveEditor();
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask("Exporting fare data to json", 30); 

					monitor.subTask("Initialize main structure");
					prepareStructure(tool,domain);
					monitor.worked(1);

					try {
					
						monitor.subTask("create IDs");
						insertIds(tool,domain);
						monitor.worked(1);
							
						monitor.subTask("convert to json");						
						FareDelivery fares = null;
						try {
							fares = GtmJsonExporter.convertToJson(tool.getGeneralTariffModel(), monitor);
						} catch (Exception e) {
							MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
							dialog.setText("json formating error");
							if (e.getMessage()!= null) {
								dialog.setMessage(e.getMessage());
							} else {
								dialog.setMessage("unknown error");
							}
							dialog.open(); 
							monitor.done();
							return;
						}
						monitor.worked(1);
			 	
						monitor.subTask("write json file");
						ExportFareDelivery.exportFareDelivery(fares, file);
						monitor.worked(1);

					} catch (Exception exception) {
						// Something went wrong that shouldn't.
						GtmEditorPlugin.INSTANCE.log(exception);					
					}
					
					monitor.done();
				}
			};

			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
		
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);

			} catch (Exception exception) {
					// Something went wrong that shouldn't.
					GtmEditorPlugin.INSTANCE.log(exception);
			} finally {
					editor.reconnectViews();
			}
		}		

  
		private void insertIds(GTMTool tool,EditingDomain domain) {
			
		
			
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
