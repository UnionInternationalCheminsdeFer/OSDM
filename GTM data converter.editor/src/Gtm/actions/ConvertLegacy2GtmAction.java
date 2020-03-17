package Gtm.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.actions.converter.ConverterFromLegacy;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;


public class ConvertLegacy2GtmAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ConvertLegacy2GtmAction(IEditingDomainProvider editingDomainProvider) {
			super(NationalLanguageSupport.ConvertLegacy2GtmAction_0, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertFromLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
			
		
		public ConvertLegacy2GtmAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertFromLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
		}

		
		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			if (tool == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ConvertLegacy2GtmAction_1);
				dialog.open(); 
				return;
			}
			
			Country country = tool.getConversionFromLegacy().getParams().getCountry();
			if (country == null) {
				String message = NationalLanguageSupport.ConvertLegacy2GtmAction_2;
				GtmUtils.writeConsoleError(message);
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ConvertLegacy2GtmAction_3);
				dialog.open(); 
				return;
			}
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			if (domain == null) return;
			
			GtmEditor editor = GtmUtils.getActiveEditor(); 
			
			ConverterFromLegacy converter = new ConverterFromLegacy(tool,domain,editor);
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask(NationalLanguageSupport.ConvertLegacy2GtmAction_4, 107); 

					try {
			
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_5);
						prepareStructure(tool, domain);
						monitor.worked(1);
						
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_6);						
						int deleted = converter.deleteOldConversionResults();
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_7 + Integer.toString(deleted));
						monitor.worked(1);
				
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_8);
						int added = converter.convertFareStationSets();
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_9 + Integer.toString(added));	
						monitor.worked(1);
			
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_10);						
						added = converter.convertBorderPoints();
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_11 + Integer.toString(added));	
						monitor.worked(1);
				
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_12);
						added = converter.convertStationNames();
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_13 + Integer.toString(added));		
						monitor.worked(1);
			
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_14);
						added = converter.convertSalesAvailabilities();
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_15 + Integer.toString(added));					
						monitor.worked(1);
			
						monitor.subTask(NationalLanguageSupport.ConvertLegacy2GtmAction_16);
						added = converter.convertToGtm(monitor);
						GtmUtils.writeConsoleInfo(NationalLanguageSupport.ConvertLegacy2GtmAction_17 + Integer.toString(added));
						monitor.worked(1);
						
					} catch (Exception e) {
						//
						throw e;
					} finally {
						editor.reconnectViews();
					}
					monitor.done();
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
			} finally {
					editor.reconnectViews();
			}

				
		}

	

}
