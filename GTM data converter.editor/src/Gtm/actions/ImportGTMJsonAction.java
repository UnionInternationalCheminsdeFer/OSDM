package Gtm.actions;

import java.io.File;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmPackage;
import Gtm.Station;
import Gtm.jsonImportExport.GTMJsonImporter;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;
import export.ImportFareDelivery;
import gtm.FareDelivery;
import gtm.StationNamesDef;


public class ImportGTMJsonAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ImportGTMJsonAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ImportGTMJsonAction_0, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ImportGTMJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

   
		protected File getFile(){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(NationalLanguageSupport.ImportGTMJsonAction_1);
	        String[] filterExt = { "*.json" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
			
		}
		
		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			GtmEditor editor = GtmUtils.getActiveEditor();
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_3);
				dialog.open(); 
				return;
			}
			
			
			File file = getFile();
			if (file == null) return;
			
			GTMJsonImporter importer = new GTMJsonImporter(tool);
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
					
						monitor.beginTask(NationalLanguageSupport.ImportGTMJsonAction_4, 5); 
						
						monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_5);
						prepareStructure(tool,domain);
						monitor.worked(1);
					
						monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_6);
						FareDelivery fareDelivery = ImportFareDelivery.importFareDelivery(file);
						monitor.worked(1);
					
						if (fareDelivery != null) {

							monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_7);
							GeneralTariffModel model = importer.convertFromJson(fareDelivery);
							monitor.worked(1);

							monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_8);
							SetCommand command = new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, model);
							if (command.canExecute()) {
								domain.getCommandStack().execute(command);
							}	
							monitor.worked(1);
						} 
						
						monitor.subTask(NationalLanguageSupport.ImportGTMJsonAction_9);
						
						CompoundCommand command = new CompoundCommand();
							
						for (StationNamesDef jS : fareDelivery.getFareStructureDelivery().getFareStructure().getStationNames() ) {
								
							Station s = tool.getCodeLists().getStations().findStation(jS.getCountry(), jS.getLocalCode());
							if (s != null) {
									
								command.append(SetCommand.create(domain, s,GtmPackage.Literals.STATION__NAME_CASE_ASCII,jS.getName()));
								command.append(SetCommand.create(domain, s,GtmPackage.Literals.STATION__NAME_CASE_UTF8,jS.getNameUtf8()));		
								command.append(SetCommand.create(domain, s,GtmPackage.Literals.STATION__SHORT_NAME_CASE_ASCII,jS.getName()));		
								command.append(SetCommand.create(domain, s,GtmPackage.Literals.STATION__SHORT_NAME_CASE_UTF8,jS.getNameUtf8()));	
								command.append(SetCommand.create(domain, s,GtmPackage.Literals.STATION__LEGACY_BORDER_POINT_CODE, jS.getLegacyBorderPointCode()));
								
								if (command.canExecute()) {
									domain.getCommandStack().execute(command);
									command = new CompoundCommand();
								}	
							}
						}
						monitor.worked(1);
					
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						monitor.done();
					}
				}
			};	
			
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
		
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);

			} catch (Exception e) {
				e.printStackTrace();
				// Something went wrong that shouldn't.
				GtmEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}			

			return;

		}



	

}
