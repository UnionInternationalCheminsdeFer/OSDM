package actions;


import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Gtm.ConversionFromLegacy;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GtmFactory;
import Gtm.GtmPackage;

public class GtmUtils {
	
	
	public static CompoundCommand getPreparationCommand (EObject o, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
		
		GTMTool tool = (GTMTool) domain.getRoot(o);

		
		if (tool.getCodeLists() == null) {
			command.append(new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__CODE_LISTS, GtmFactory.eINSTANCE.createCodeLists()));	
		}
		if (tool.getConversionFromLegacy() == null) {
			ConversionFromLegacy conversion = GtmFactory.eINSTANCE.createConversionFromLegacy();
			conversion.setLegacy108(GtmFactory.eINSTANCE.createLegacy108());
			conversion.setParams(GtmFactory.eINSTANCE.createCoversionParams());
			command.append(new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__CONVERSION_FROM_LEGACY, conversion));	
		} else {
			if (tool.getConversionFromLegacy().getLegacy108() == null) {
				command.append(new SetCommand(domain, tool.getConversionFromLegacy(), GtmPackage.Literals.CONVERSION_FROM_LEGACY__LEGACY108, GtmFactory.eINSTANCE.createLegacy108()));	
			}
			if (tool.getConversionFromLegacy().getParams() == null) {
				command.append(new SetCommand(domain, tool.getConversionFromLegacy(), GtmPackage.Literals.CONVERSION_FROM_LEGACY__PARAMS, GtmFactory.eINSTANCE.createCoversionParams()));	
			}
		}
		
		if (tool.getGeneralTariffModel() == null) {
			GeneralTariffModel model = GtmFactory.eINSTANCE.createGeneralTariffModel();

			model.setDelivery(GtmFactory.eINSTANCE.createDelivery());
			model.setFareStructure(GtmFactory.eINSTANCE.createFareStructure());
			
			command.append(new SetCommand(domain,tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, model));

		} else {
			if (tool.getGeneralTariffModel().getDelivery() == null) {
				command.append(new SetCommand(domain, tool.getGeneralTariffModel(), GtmPackage.Literals.GENERAL_TARIFF_MODEL__DELIVERY, GtmFactory.eINSTANCE.createDelivery()));	
			}
			if (tool.getGeneralTariffModel().getFareStructure() == null) {
				command.append(new SetCommand(domain, tool.getGeneralTariffModel(), GtmPackage.Literals.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, GtmFactory.eINSTANCE.createFareStructure()));	
			}
		}
		return command;
	}

}
