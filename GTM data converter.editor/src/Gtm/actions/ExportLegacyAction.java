package Gtm.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
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
	
	    
		protected BufferedWriter getWriter(String text){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.SAVE);
	        fd.setText(text);
	        String[] filterExt = { "*.txt" };
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedWriter br;
			try {
				br = new BufferedWriter(new FileWriter(file));
			} catch (IOException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("file write error");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return br;

			
		}

		@Override
		protected void runAction(GTMTool tool) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("not yet implemented");
			dialog.open(); 		
		}

	

}
