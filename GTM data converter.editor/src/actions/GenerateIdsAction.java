package actions;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.CarrierConstraint;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.FareElement;
import Gtm.FareResourceLocation;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GtmPackage;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceClass;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Text;
import Gtm.TravelValidityConstraint;
import Gtm.ZoneDefinition;



public class GenerateIdsAction extends BaseSelectionListenerAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public GenerateIdsAction(IEditingDomainProvider editingDomainProvider) {
			super("Generate ids");
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public GenerateIdsAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text);
			this.editingDomainProvider = editingDomainProvider;
		}

		public void run() {
			run( this.getStructuredSelection() );
			return;
		}
		
		protected void run(IStructuredSelection structuredSelection) {
			
			
			FareStructure fareStructure = getSelectedFareStructure();
			
			if (fareStructure == null) return;
			
			CompoundCommand command =  new CompoundCommand();
			
			for (AfterSalesRule object : fareStructure.getAfterSalesRules()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command);
				}
			}
			
			for (Calendar object : fareStructure.getCalendars()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.CALENDAR__ID, command);
				}
			}

			for (CarrierConstraint object : fareStructure.getCarrierConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.CARRIER_CONSTRAINT__ID, command);
				}
			}
			
			for (CombinationConstraint object : fareStructure.getCombinationConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.COMBINATION_CONSTRAINT__ID, command);
				}
			}
			
			for (ConnectionPoint object : fareStructure.getConnectionPoints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.CONNECTION_POINT__ID, command);
				}
			}
			
			for (FareElement object : fareStructure.getFareElements()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.FARE_ELEMENT__ID, command);
				}
			}		
			
			for (FareResourceLocation object : fareStructure.getFareResourceLocations()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.FARE_RESOURCE_LOCATION__ID, command);
				}
			}
			
			for (FulfillmentConstraint object : fareStructure.getFulfillmentConstraint()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.FULFILLMENT_CONSTRAINT__ID, command);
				}
			}
			
			for (PassengerConstraint object : fareStructure.getPassengerConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.PASSENGER_CONSTRAINT__ID, command);
				}
			}		
			
			for (PersonalDataConstraint object : fareStructure.getPersonalDataConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command);
				}
			}		
			
			for (Price object : fareStructure.getPrices()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.PRICE__ID, command);
				}
			}		
			
			for (ReductionCard object : fareStructure.getReductionCards()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.REDUCTION_CARD__ID, command);
				}
			}		
			
			for (ReductionConstraint object : fareStructure.getReductionConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.REDUCTION_CONSTRAINT__ID, command);
				}
			}		
			
			for (RegionalConstraint object : fareStructure.getRegionalConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.REGIONAL_CONSTRAINT__ID, command);
				}
			}	
			
			for (ReservationParameter object : fareStructure.getReservationParameters()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.RESERVATION_PARAMETER__ID, command);
				}
			}			
			
			for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINT__ID, command);
				}
			}	
			
			for (ServiceClass object : fareStructure.getServiceClassDefinitions()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.SERVICE_CLASS__ID, command);
				}
			}		
			
			for (ServiceConstraint object : fareStructure.getServiceConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.SERVICE_CONSTRAINT__ID, command);
				}
			}	
			
			for (ServiceLevel object : fareStructure.getServiceLevelDefinitions()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.SERVICE_LEVEL__ID, command);
				}
			}	
			
			for (Text object : fareStructure.getTexts()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.TEXT__ID, command);
				}
			}	
			
			for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID, command);
				}
			}		
			
			for (ZoneDefinition object : fareStructure.getZoneDefinitions()) {
				if (object.getId() == null || object.getId().isEmpty()) {
					setId(editingDomainProvider.getEditingDomain(), object,GtmPackage.Literals.ZONE_DEFINITION__ID, command);
				}
			}					
							
			
	        if (command != null && !command.isEmpty()) {
	        	editingDomainProvider.getEditingDomain().getCommandStack().execute(command);
	        }
		
		}
		
		protected void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command) {
			SetCommand cmd = new SetCommand(domain, object,feature, EcoreUtil.generateUUID());
			if (cmd.canExecute()) {
				command.append(cmd);
			}
		}
		

		protected FareStructure getSelectedFareStructure(){
			
			IStructuredSelection selection =  this.getStructuredSelection();
			if (selection == null) return null;
			
			EObject o = (EObject) selection.getFirstElement();
			
			GTMTool tool = (GTMTool) editingDomainProvider.getEditingDomain().getRoot(o);
			
			CompoundCommand preparationCommand = GtmUtils.getPreparationCommand(o, editingDomainProvider.getEditingDomain());
			
			if (preparationCommand != null && !preparationCommand.isEmpty()) {
				editingDomainProvider.getEditingDomain().getCommandStack().execute(preparationCommand);
			}
			
			return tool.getGeneralTariffModel().getFareStructure();

		}
		


		protected boolean checkSelection(IStructuredSelection selection)
		{
			if (selection == null) return false;
	    	
	    	if (!(selection.getFirstElement() instanceof EObject )) return false;
	    	    	
			return true;
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
	    
	
	

}
