package Gtm.actions;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import Gtm.GTMTool;


public class ExportLegacyAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
	
		public ExportLegacyAction(IEditingDomainProvider editingDomainProvider) {
			super("Export Legacy 108 data", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ExportLegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
	
	    
		protected Path getWriter(String text){
			
	        DirectoryDialog fd = new DirectoryDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
	        fd.setText(text);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return Path.forWindows(path);
	        
			
		}

		@Override
		protected void runAction(GTMTool tool) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("not yet implemented");
			dialog.open(); 		
		}

	

}
