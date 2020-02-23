package Gtm.actions;

import java.nio.file.Path;
import java.nio.file.Paths;


import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import Gtm.GTMTool;
import Gtm.actions.converter.LegacyExporter;


public class ExportLegacyAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
	
		public ExportLegacyAction(IEditingDomainProvider editingDomainProvider) {
			super("Export Legacy 108 data", editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ExportLegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(GtmUtils.getImageDescriptor("/icons/exportLegacy.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
	
	    
		protected Path getPath(String text){
			
	        DirectoryDialog fd = new DirectoryDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
	        fd.setText(text);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return Paths.get(path);
	        
			
		}

		@Override
		protected void runAction(GTMTool tool) {
			
			Path path =  getPath("Select export directory");
			
			LegacyExporter exporter = new LegacyExporter(tool, path);
			
			exporter.export();
		
		}

	

}
