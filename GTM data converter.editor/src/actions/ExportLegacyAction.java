package actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import Gtm.Legacy108;


public class ExportLegacyAction extends BaseSelectionListenerAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
	
		public ExportLegacyAction(IEditingDomainProvider editingDomainProvider) {
			super("Export Legacy 108 data");
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ExportLegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text);
			this.editingDomainProvider = editingDomainProvider;
		}

		public void run() {
			run( this.getStructuredSelection() );
			return;
		}
		
		protected void run(IStructuredSelection structuredSelection) {
			
			if (!checkSelection( structuredSelection)) return;	
			
			//EObject o = (EObject) structuredSelection.getFirstElement();
			
			MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
			dialog.setText("not yet implemented");
			dialog.open(); 					
		
		}
		
		protected boolean checkSelection(IStructuredSelection selection)
		{
			if (selection == null) return false;
	    	
	    	if (!(selection.getFirstElement() instanceof EObject )) return false;
	    	    	
			return true;
		}
		
		/*
		 * to be implemented by all actions
		 */
		protected void runAction(Legacy108 legacy108) {
			
		}
		   	
		
	    public boolean updateSelection (IStructuredSelection selection)
	    {
	  		this.setEnabled(false);

	  		if (checkSelection(selection)) 	{
	  			this.setEnabled(true);
	  			return true;
	  		}
	  		return false;
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

	

}
