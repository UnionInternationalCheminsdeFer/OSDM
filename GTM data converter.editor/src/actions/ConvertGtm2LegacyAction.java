package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import Gtm.GTMTool;


public class ConvertGtm2LegacyAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ConvertGtm2LegacyAction(IEditingDomainProvider editingDomainProvider) {
			super("Convert GTM to Legacy 108", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ConvertGtm2LegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}

		private void convert(GTMTool tool, CompoundCommand command) {
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("not yet implemented");
			dialog.open(); 
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

		
		@Override
		protected void runAction(GTMTool tool) {
			
		
			EditingDomain domain = GtmUtils.getActiveDomain();
			
			CompoundCommand command = new CompoundCommand();
			
			convert(tool,command);
			
			if (command != null && !command.isEmpty() && command.canExecute()) {
				domain.getCommandStack().execute(command);	
			}
		}

	

}
