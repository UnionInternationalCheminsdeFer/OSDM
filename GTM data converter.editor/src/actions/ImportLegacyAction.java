package actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import Gtm.GTMTool;
import Gtm.Legacy108;


public abstract class ImportLegacyAction extends BaseSelectionListenerAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
	
		public ImportLegacyAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text);
			this.editingDomainProvider = editingDomainProvider;
		}

		public void run() {
			run( this.getStructuredSelection() );
			return;
		}
		
		protected void run(IStructuredSelection structuredSelection) {
			
			if (editingDomainProvider == null) return;
			
			if (!checkSelection( structuredSelection)) return;	
			
			EObject o = (EObject) structuredSelection.getFirstElement();
			
			CompoundCommand preparationCommand = GtmUtils.getPreparationCommand(o, editingDomainProvider.getEditingDomain());
			
			if (preparationCommand != null && !preparationCommand.isEmpty()) {
				editingDomainProvider.getEditingDomain().getCommandStack().execute(preparationCommand);
			}
			

			runAction(getSelectedLegacy108());
		
		}
		
		protected Legacy108 getSelectedLegacy108(){
			
			IStructuredSelection selection =  this.getStructuredSelection();
			if (selection == null) return null;
			
			EObject o = (EObject) selection.getFirstElement();
			
			GTMTool tool = (GTMTool) editingDomainProvider.getEditingDomain().getRoot(o);
			
			CompoundCommand preparationCommand = GtmUtils.getPreparationCommand(o, editingDomainProvider.getEditingDomain());
			
			if (preparationCommand != null && !preparationCommand.isEmpty()) {
				editingDomainProvider.getEditingDomain().getCommandStack().execute(preparationCommand);
			}
			
			return tool.getConversionFromLegacy().getLegacy108();

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
		abstract protected void runAction(Legacy108 o);
		   	
		
	    public boolean updateSelection (IStructuredSelection selection)
	    {
	  		this.setEnabled(false);

	  		if (checkSelection(selection)) 	{
	  			this.setEnabled(true);
	  			return true;
	  		}
	  		return false;
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

	

}
