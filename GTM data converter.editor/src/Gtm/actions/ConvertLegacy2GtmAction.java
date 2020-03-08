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
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;


public class ConvertLegacy2GtmAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ConvertLegacy2GtmAction(IEditingDomainProvider editingDomainProvider) {
			super("Convert Legacy 108 to GTM", editingDomainProvider);
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
				dialog.setText("no data found");
				dialog.open(); 
				return;
			}
			
			Country country = tool.getConversionFromLegacy().getParams().getCountry();
			if (country == null) {
				String message = "the country is missing in the conversion parameter";
				GtmUtils.writeConsoleError(message);
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("the country is missing in the conversion parameter");
				dialog.open(); 
				return;
			}
			
			EditingDomain domain = GtmUtils.getActiveDomain();
			if (domain == null) return;
			
			GtmEditor editor = GtmUtils.getActiveEditor(); 
			
			ConverterFromLegacy converter = new ConverterFromLegacy(tool);
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask("Convert Legacy 108 fare data to GTM", 107); 

					try {
			
						monitor.subTask("Initialize main structure");
						prepareStructure(tool, domain);
						monitor.worked(1);
						
						monitor.subTask("deleting old conversion data");						
						int deleted = ConverterFromLegacy.deleteOldConversionResults(tool, domain);
						GtmUtils.writeConsoleInfog("old series conversions deleted: " + Integer.toString(deleted));
						monitor.worked(1);
				
						monitor.subTask("convert fare reference stations");
						int added = converter.convertFareStationSets(tool,  domain);
						GtmUtils.writeConsoleInfog("fare reference station sets converted: " + Integer.toString(added));	
						monitor.worked(1);
			
						monitor.subTask("convert border points");						
						added = converter.convertBorderPoints(tool,  domain);
						GtmUtils.writeConsoleInfog("border points converted: " + Integer.toString(added));	
						monitor.worked(1);
				
						monitor.subTask("convert station names");
						added = converter.convertStationNames(tool,  domain);
						GtmUtils.writeConsoleInfog("station names converted: " + Integer.toString(added));		
						monitor.worked(1);
			
						monitor.subTask("convert sales availabilities");
						added = converter.convertSalesAvailabilities(tool,  domain);
						GtmUtils.writeConsoleInfog("sales avialabiliy ranges converted: " + Integer.toString(added));					
						monitor.worked(1);
			
						monitor.subTask("convert fares");
						added = converter.convertToGtm(tool, domain, monitor);
						GtmUtils.writeConsoleInfog("fares converted: " + Integer.toString(added));
						monitor.worked(1);
						
					} catch (Exception e) {
						//
						e.printStackTrace();
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

			} catch (Exception exception) {
					// Something went wrong that shouldn't.
					GtmEditorPlugin.INSTANCE.log(exception);
			} finally {
					editor.reconnectViews();
			}

				
		}

	

}
