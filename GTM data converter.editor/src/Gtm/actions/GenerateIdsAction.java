package Gtm.actions;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import Gtm.FareStructure;
import Gtm.GTMTool;



public class GenerateIdsAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public GenerateIdsAction(IEditingDomainProvider editingDomainProvider) {
			super("Generate ids", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public GenerateIdsAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}

		

		

		protected FareStructure getSelectedFareStructure(){
			
			IStructuredSelection selection =  this.getStructuredSelection();
			if (selection == null) return null;
			
			EObject o = (EObject) selection.getFirstElement();
			
			GTMTool tool = (GTMTool) editingDomainProvider.getEditingDomain().getRoot(o);
			
			CompoundCommand preparationCommand = GtmUtils.getPreparationCommand(tool, editingDomainProvider.getEditingDomain());
			
			if (preparationCommand != null && !preparationCommand.isEmpty()) {
				editingDomainProvider.getEditingDomain().getCommandStack().execute(preparationCommand);
			}
			
			return tool.getGeneralTariffModel().getFareStructure();

		}
		
		@Override
		protected void runAction(GTMTool tool) {
			
			
			CompoundCommand command =  GtmUtils.setIds(tool,editingDomainProvider.getEditingDomain());
			
	        if (command != null && !command.isEmpty()) {
	        	editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
	        }
		
		}	
	    
	
	

}
