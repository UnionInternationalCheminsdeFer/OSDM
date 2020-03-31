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
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import export.ExportFareDelivery;
import gtm.FareDelivery;



public class ExportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ExportGTMJsonAction_0, editingDomainProvider);
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
			
			GtmEditor editor = GtmUtils.getActiveEditor();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_1);
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (tool.getGeneralTariffModel() == null || 
				tool.getGeneralTariffModel().getDelivery() == null ) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Delivery Data are missing");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (tool.getGeneralTariffModel() == null || 
				tool.getGeneralTariffModel().getDelivery() == null || 
				tool.getGeneralTariffModel().getDelivery().getProvider() == null || 
				tool.getGeneralTariffModel().getDelivery().getProvider().getCode() == null 	) {
				
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Fare Provider is missing in the Delivery Data");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (tool.getGeneralTariffModel() == null || 
				tool.getGeneralTariffModel().getDelivery() == null || 
				tool.getGeneralTariffModel().getDelivery().getId()== null || 
				tool.getGeneralTariffModel().getDelivery().getId().length() < 1	) {	
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Delivery ID is missing in the Delivery Data");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}

			
			String name = tool.getGeneralTariffModel().getDelivery().getProvider().getCode().trim() 
					+ "_" + tool.getGeneralTariffModel().getDelivery().getId().trim()+".gtm.json"; //$NON-NLS-1$ //$NON-NLS-2$
            File file = getFile(name);
			if (file == null) {
				return;
			}
			
			GtmJsonExporter jsonModelExporter = new GtmJsonExporter();
			
			ExportFareDelivery fileExporter = new ExportFareDelivery(editor.getSite().getShell());

		
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						monitor.beginTask(NationalLanguageSupport.ExportGTMJsonAction_4, 31); 

						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_5);
						prepareStructure(tool,domain);
						monitor.worked(1);
					
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_6);
						insertIds(tool,domain,editor);
						monitor.worked(1);
							
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_7);						
						FareDelivery fares= jsonModelExporter.convertToJson(tool.getGeneralTariffModel(), monitor);
						monitor.worked(1);
			 	
						monitor.subTask(NationalLanguageSupport.ExportGTMJsonAction_8);
						fileExporter.exportFareDelivery(fares, file);
						monitor.worked(1);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
					}  finally {
						monitor.done();
					}
				}
			};

			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
			
			} catch (Exception e) {
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_9);
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
				} else {
					dialog.setMessage(NationalLanguageSupport.ExportGTMJsonAction_10);
				}
				dialog.open(); 
				GtmEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}
		}		
		
		


  
		private void insertIds(GTMTool tool,EditingDomain domain, GtmEditor editor) {
			
			CompoundCommand command =  GtmUtils.setIds(tool,domain);
			
			if (command == null) {
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_11);
				dialog.open(); 
				return;
			}
			
	        if (command != null && !command.isEmpty()) {
	        	
				if (!command.canExecute()) {
					MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText(NationalLanguageSupport.ExportGTMJsonAction_12);
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
		    dialog.setFilterExtensions(new String[] { "*.json"});  //$NON-NLS-1$
		    
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

			  prefs.put("LAST_PATH", path); //$NON-NLS-1$
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
		  return prefs.get("LAST_PATH","c:\\"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		
		

}
