package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.actions.converter.ConverterToLegacy;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;


public class ConvertGtm2LegacyAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ConvertGtm2LegacyAction(IEditingDomainProvider editingDomainProvider) {
			super("Convert GTM to Legacy 108", editingDomainProvider);
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertToLegacy.png")); //$NON-NLS-1$
			this.setToolTipText(this.getText());
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ConvertGtm2LegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/convertToLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

    
		protected BufferedReader getReader(String text){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.txt" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("file read error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return br;

			
		}
		
		protected void run (IStructuredSelection structuredSelection) {
			
			GTMTool tool = GtmUtils.getGtmTool();
			
			GtmEditor editor = GtmUtils.getActiveEditor();
			
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
			
			
			ConverterToLegacy converter = new ConverterToLegacy(tool);
			
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					monitor.beginTask("Convert GTM fares to legacy 108.1 data", converter.getMonitorTasks() + 1); 

					monitor.subTask("Initialize main structure");
					prepareStructure(tool,domain);
					monitor.worked(1);
					
					int created = converter.convert(monitor);
					String message = "series converted: " + Integer.toString(created);
					GtmUtils.writeConsoleError(message);

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


			return;

		}


		
	

}
