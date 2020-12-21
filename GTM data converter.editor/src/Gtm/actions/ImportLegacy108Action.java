package Gtm.actions;

import java.io.File;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.Country;
import Gtm.GTMTool;
import Gtm.actions.converter.LegacyImporter;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.GtmEditor;





public class ImportLegacy108Action extends BasicGtmAction {
	
	public ImportLegacy108Action(IEditingDomainProvider editingDomainProvider) {
		super(NationalLanguageSupport.ImportLegacy108Action_0, editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importLegacy.png")); //$NON-NLS-1$
	}

	public ImportLegacy108Action(String text, IEditingDomainProvider editingDomainProvider) {
		super(text, editingDomainProvider);
		this.setToolTipText(this.getText());
		setImageDescriptor(GtmUtils.getImageDescriptor("/icons/importLegacy.png")); //$NON-NLS-1$
	}

	
	@Override
	protected void runAction(GTMTool tool) {
		
		EditingDomain domain = GtmUtils.getActiveDomain();
		
		GtmEditor editor = GtmUtils.getActiveEditor(); 
		
		if (tool == null) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ConvertLegacy2GtmAction_1);
			dialog.open(); 
			return;
		}
		
		
		Country country = tool.getConversionFromLegacy().getParams().getCountry();
		if (country == null) {
			String message = NationalLanguageSupport.ConvertLegacy2GtmAction_2;
			GtmUtils.writeConsoleError(message, editor);
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ConvertLegacy2GtmAction_3);
			dialog.open(); 
			return;
		}
		
        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
        fd.setText(NationalLanguageSupport.ImportLegacy108Action_1);
        String[] filterExt = { "*.txt" }; //$NON-NLS-1$
        fd.setFilterExtensions(filterExt);
        String path = fd.open();
        
        if (path == null || path.length() < 7 ) return;
        
        File file = new File(path);
        
		
		LegacyImporter importer = new LegacyImporter(GtmUtils.getGtmTool(), file.toPath(), domain, editor);
		

		IRunnableWithProgress operation =	new IRunnableWithProgress() {
			// This is the method that gets invoked when the operation runs.

			public void run(IProgressMonitor monitor) {

				monitor.beginTask(NationalLanguageSupport.ImportLegacyAction_Monitor, 30); 
		
				importer.importAll(monitor);
					
				monitor.done();
				
			}
		};
		try {
			// This runs the operation, and shows progress.
			editor.disconnectViews();
			new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
		} catch (Exception e) {
			e.printStackTrace();
			MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText(NationalLanguageSupport.ImportStationsAction_23);
			if (e.getMessage()!= null) {
				dialog.setMessage(e.getMessage());
			} else {
				dialog.setMessage("unkown");
			}
			dialog.open(); 
		} finally {
			editor.reconnectViews();
		}

	}

}