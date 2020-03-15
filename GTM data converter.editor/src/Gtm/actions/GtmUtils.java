package Gtm.actions;


import java.net.URL;
import java.util.MissingResourceException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import Gtm.AfterSalesRule;
import Gtm.Calendar;
import Gtm.Carrier;
import Gtm.CarrierConstraint;
import Gtm.CodeLists;
import Gtm.CombinationConstraint;
import Gtm.ConnectionPoint;
import Gtm.ConversionFromLegacy;
import Gtm.ConversionParams;
import Gtm.Countries;
import Gtm.Country;
import Gtm.Currencies;
import Gtm.Currency;
import Gtm.FareElement;
import Gtm.FareStationSetDefinition;
import Gtm.FareStructure;
import Gtm.FulfillmentConstraint;
import Gtm.GTMTool;
import Gtm.GeneralTariffModel;
import Gtm.GenericReductionCards;
import Gtm.GtmFactory;
import Gtm.GtmPackage;
import Gtm.Language;
import Gtm.Languages;
import Gtm.Legacy108;
import Gtm.PassengerConstraint;
import Gtm.PersonalDataConstraint;
import Gtm.Price;
import Gtm.ReductionCard;
import Gtm.ReductionConstraint;
import Gtm.RegionalConstraint;
import Gtm.ReservationParameter;
import Gtm.SalesAvailabilityConstraint;
import Gtm.ServiceBrands;
import Gtm.ServiceConstraint;
import Gtm.ServiceLevel;
import Gtm.Text;
import Gtm.TravelValidityConstraint;
import Gtm.console.ConsoleUtil;
import Gtm.nls.NationalLanguageSupport;
import Gtm.preferences.PreferenceConstants;
import Gtm.preferences.PreferencesAccess;
import Gtm.presentation.DirtyCommand;
import Gtm.presentation.GtmEditor;
import Gtm.presentation.GtmEditorPlugin;

public class GtmUtils {
	
	
	public static GtmEditor getActiveEditor() {
	   	
	   	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return (GtmEditor) editor;

	}
	
	public static GTMTool getGtmTool(IEditingDomainProvider editingDomainProvider) {
	   	
	   	
	   	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof GTMTool){
			return (GTMTool) object;
		} else {
			return null;
		}
	}
	
	public static GTMTool getGtmTool() {
	   	
	   	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		EditingDomain domain = ((GtmEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof GTMTool){
			return (GTMTool) object;
		} else {
			return null;
		}
	}
	
	public static void executeAndFlush(CompoundCommand command, EditingDomain domain) {
		
		if (command != null && domain != null && !command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
			domain.getCommandStack().flush();
			domain.getCommandStack().execute(new DirtyCommand());
		} else {
			String message = "could not change data: " + command.getDescription();
			GtmUtils.writeConsoleError(message);
		}
		
		System.gc();
		
	}
	
	public static EditingDomain getActiveDomain() {
	   	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return ((GtmEditor) editor).getEditingDomain();
	}
	

	
	public static CompoundCommand getPreparationCommand (GTMTool tool, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
	
	
		if (tool.getConversionFromLegacy() == null) {
			command.append(new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__CONVERSION_FROM_LEGACY, createInitialConversionFromLegacy()));	
		} else {
			if (tool.getConversionFromLegacy().getLegacy108() == null) {
				command.append(new SetCommand(domain, tool.getConversionFromLegacy(), GtmPackage.Literals.CONVERSION_FROM_LEGACY__LEGACY108, createInitialLegacy108()));	
			} else {
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyDistanceFares() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(), GtmPackage.Literals.LEGACY108__LEGACY_DISTANCE_FARES,GtmFactory.eINSTANCE.createLegacyDistanceFares()));
				}
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyRouteFares() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_ROUTE_FARES,GtmFactory.eINSTANCE.createLegacyRouteFares()));									
				}
				if (tool.getConversionFromLegacy().getLegacy108().getLegacySeriesList() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_SERIES_LIST,GtmFactory.eINSTANCE.createLegacySeriesList()));									
				}	
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyStations() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_STATIONS,GtmFactory.eINSTANCE.createLegacy108Stations()));									
				}
			}
			if (tool.getConversionFromLegacy().getParams() == null) {
					
				command.append(new SetCommand(domain, tool.getConversionFromLegacy(), GtmPackage.Literals.CONVERSION_FROM_LEGACY__PARAMS,createInitialConversionParams()));	
			} else {
				if (tool.getConversionFromLegacy().getParams().getLegacyStationMappings() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_MAPPINGS,GtmFactory.eINSTANCE.createLegacyStationMappings()));									
				}
				if (tool.getConversionFromLegacy().getParams().getLegacyFareTemplates() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_TEMPLATES,GtmFactory.eINSTANCE.createLegacyFareTemplates()));									
				}
				if (tool.getConversionFromLegacy().getParams().getLegacyFareStationMappings() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_FARE_STATION_MAPPINGS,GtmFactory.eINSTANCE.createLegacyFareStationSetMappings()));									
				}
				if (tool.getConversionFromLegacy().getParams().getLegacyStationToServiceBrandMappings() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_STATION_TO_SERVICE_BRAND_MAPPINGS,GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings()));									
				}
				if (tool.getConversionFromLegacy().getParams().getLegacyBorderPointMappings() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_BORDER_POINT_MAPPINGS,GtmFactory.eINSTANCE.createLegacyBoderPointMappings()));									
				}
			}
		}
		
		if (tool.getCodeLists() == null) {
			command.append(new SetCommand(domain, tool, GtmPackage.Literals.GTM_TOOL__CODE_LISTS, createInitialCodeLists()));	
		} else {
			
			if (tool.getCodeLists().getCarriers() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__CARRIERS,GtmFactory.eINSTANCE.createCarriers()));													
			}
			if (tool.getCodeLists().getCountries() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__COUNTRIES,GtmFactory.eINSTANCE.createCountries()));					
			}
			if (tool.getCodeLists().getCurrencies() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__CURRENCIES,GtmFactory.eINSTANCE.createCurrencies()));	
			}
			if (tool.getCodeLists().getLanguages() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__LANGUAGES,GtmFactory.eINSTANCE.createLanguages()));	
			}
			if (tool.getCodeLists().getServiceBrands() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__SERVICE_BRANDS,GtmFactory.eINSTANCE.createServiceBrands()));	
			}			
			if (tool.getCodeLists().getStations() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__STATIONS,GtmFactory.eINSTANCE.createStations()));	
			}				
			if (tool.getCodeLists().getNutsCodes() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),GtmPackage.Literals.CODE_LISTS__NUTS_CODES,GtmFactory.eINSTANCE.createNUTSCodes()));	
			}				
		}
		
		if (tool.getGeneralTariffModel() == null) {

			command.append(new SetCommand(domain,tool, GtmPackage.Literals.GTM_TOOL__GENERAL_TARIFF_MODEL, createInitialGeneralTariffModel()));

		} else {
			if (tool.getGeneralTariffModel().getDelivery() == null) {
				command.append(new SetCommand(domain, tool.getGeneralTariffModel(), GtmPackage.Literals.GENERAL_TARIFF_MODEL__DELIVERY, GtmFactory.eINSTANCE.createDelivery()));	
			}
			if (tool.getGeneralTariffModel().getFareStructure() == null) {
							
				command.append(new SetCommand(domain, tool.getGeneralTariffModel(), GtmPackage.Literals.GENERAL_TARIFF_MODEL__FARE_STRUCTURE, createInitialFareStructure()));	
			} else {
				
				FareStructure fare = tool.getGeneralTariffModel().getFareStructure();
				
				if (fare.getAfterSalesRules() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__AFTER_SALES_RULES, GtmFactory.eINSTANCE.createAfterSalesRules()));
				}
				
				if (fare.getCalendars() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__CALENDARS, GtmFactory.eINSTANCE.createCalendars()));
				}
				
				if (fare.getCarrierConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__CARRIER_CONSTRAINTS, GtmFactory.eINSTANCE.createCarrierConstraints()));
				}
				

				if (fare.getCombinationConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__COMBINATION_CONSTRAINTS, GtmFactory.eINSTANCE.createCombinationConstraints()));
				}
				
				
				if (fare.getConnectionPoints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__CONNECTION_POINTS, GtmFactory.eINSTANCE.createConnectionPoints()));
				}
				
				
				if (fare.getFareElements() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_ELEMENTS, GtmFactory.eINSTANCE.createFareElements()));
				}
				
				
				if (fare.getFareResourceLocations() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_RESOURCE_LOCATIONS, GtmFactory.eINSTANCE.createFareResourceLocations()));
				}
				
				
				if (fare.getFulfillmentConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FULFILLMENT_CONSTRAINTS, GtmFactory.eINSTANCE.createFulfillmentConstraints()));
				}
				
				
				if (fare.getPassengerConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PASSENGER_CONSTRAINTS, GtmFactory.eINSTANCE.createPassengerConstraints()));
				}
				
				if (fare.getPersonalDataConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PERSONAL_DATA_CONSTRAINTS, GtmFactory.eINSTANCE.createPersonalDataConstraints()));
				}
				
				if (fare.getPrices() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__PRICES, GtmFactory.eINSTANCE.createPrices()));
				}
				
				if (fare.getReductionCards() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CARDS, GtmFactory.eINSTANCE.createReductionCards()));
				}
							
				if (fare.getReductionConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__REDUCTION_CONSTRAINTS, GtmFactory.eINSTANCE.createReductionConstraints()));
				}
				
				if (fare.getRegionalConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__REGIONAL_CONSTRAINTS, GtmFactory.eINSTANCE.createRegionalConstraints()));
				}
				
				if (fare.getReservationParameters() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__RESERVATION_PARAMETERS, GtmFactory.eINSTANCE.createReservationParameters()));
				}
				
				if (fare.getSalesAvailabilityConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SALES_AVAILABILITY_CONSTRAINTS, GtmFactory.eINSTANCE.createSalesAvailabilityConstraints()));
				}
				
				if (fare.getServiceClassDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CLASS_DEFINITIONS, GtmFactory.eINSTANCE.createServiceClassDefinitions()));
				}
				
				if (fare.getServiceConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SERVICE_CONSTRAINTS, GtmFactory.eINSTANCE.createServiceConstraints()));
				}
				
				if (fare.getServiceLevelDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SERVICE_LEVEL_DEFINITIONS, GtmFactory.eINSTANCE.createServiceLevelDefinitions()));
				}
				
				if (fare.getSupportedOnlineServices() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__SUPPORTED_ONLINE_SERVICES, GtmFactory.eINSTANCE.createSupportedOnlineServices()));
				}
				
				if (fare.getTexts() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__TEXTS, GtmFactory.eINSTANCE.createTexts()));
				}				
				
				if (fare.getTravelValidityConstraints() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__TRAVEL_VALIDITY_CONSTRAINTS, GtmFactory.eINSTANCE.createTravelValidityConstraints()));
				}
				
				if (fare.getFareStationSetDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__FARE_STATION_SET_DEFINITIONS, GtmFactory.eINSTANCE.createFareStationSetDefinitions()));
				}				

				if (fare.getZoneDefinitions() == null) {
					command.append(new SetCommand(domain, fare, GtmPackage.Literals.FARE_STRUCTURE__ZONE_DEFINITIONS, GtmFactory.eINSTANCE.createZoneDefinitions()));
				}	
			}
		}
		return command;
	}
	
	
	private static FareStructure createInitialFareStructure() {
		FareStructure fareStructure = GtmFactory.eINSTANCE.createFareStructure();
		
		fareStructure.setAfterSalesRules(GtmFactory.eINSTANCE.createAfterSalesRules());
		fareStructure.setCalendars(GtmFactory.eINSTANCE.createCalendars());
		fareStructure.setCarrierConstraints(GtmFactory.eINSTANCE.createCarrierConstraints());
		fareStructure.setCombinationConstraints(GtmFactory.eINSTANCE.createCombinationConstraints());
		fareStructure.setConnectionPoints(GtmFactory.eINSTANCE.createConnectionPoints());
		fareStructure.setFareElements(GtmFactory.eINSTANCE.createFareElements());
		fareStructure.setFareResourceLocations(GtmFactory.eINSTANCE.createFareResourceLocations());
		fareStructure.setFulfillmentConstraints(GtmFactory.eINSTANCE.createFulfillmentConstraints());
		fareStructure.setPassengerConstraints(GtmFactory.eINSTANCE.createPassengerConstraints());
		fareStructure.setPersonalDataConstraints(GtmFactory.eINSTANCE.createPersonalDataConstraints());
		fareStructure.setPrices(GtmFactory.eINSTANCE.createPrices());
		fareStructure.setReductionCards(GtmFactory.eINSTANCE.createReductionCards());
		fareStructure.setReductionConstraints(GtmFactory.eINSTANCE.createReductionConstraints());
		fareStructure.setRegionalConstraints(GtmFactory.eINSTANCE.createRegionalConstraints());
		fareStructure.setReservationParameters(GtmFactory.eINSTANCE.createReservationParameters());
		fareStructure.setSalesAvailabilityConstraints(GtmFactory.eINSTANCE.createSalesAvailabilityConstraints());
		fareStructure.setServiceClassDefinitions(GtmFactory.eINSTANCE.createServiceClassDefinitions());
		fareStructure.setServiceConstraints(GtmFactory.eINSTANCE.createServiceConstraints());
		fareStructure.setServiceLevelDefinitions(GtmFactory.eINSTANCE.createServiceLevelDefinitions());
		fareStructure.setSupportedOnlineServices(GtmFactory.eINSTANCE.createSupportedOnlineServices());
		fareStructure.setTexts(GtmFactory.eINSTANCE.createTexts());
		fareStructure.setTravelValidityConstraints(GtmFactory.eINSTANCE.createTravelValidityConstraints());
		fareStructure.setFareStationSetDefinitions(GtmFactory.eINSTANCE.createFareStationSetDefinitions());	
		fareStructure.setZoneDefinitions(GtmFactory.eINSTANCE.createZoneDefinitions());
		return fareStructure;
	}


	private static CodeLists createInitialCodeLists() {
		CodeLists codes = GtmFactory.eINSTANCE.createCodeLists();
		codes.setCarriers(GtmFactory.eINSTANCE.createCarriers());
		codes.setServiceBrands(GtmFactory.eINSTANCE.createServiceBrands());
		codes.setCountries(GtmFactory.eINSTANCE.createCountries());
		codes.setCurrencies(GtmFactory.eINSTANCE.createCurrencies());
		codes.setLanguages(GtmFactory.eINSTANCE.createLanguages());
		codes.setNutsCodes(GtmFactory.eINSTANCE.createNUTSCodes());
		codes.setStations(GtmFactory.eINSTANCE.createStations());
		return codes;
	}


	private static Legacy108 createInitialLegacy108() {
		Legacy108 legacy108 = GtmFactory.eINSTANCE.createLegacy108();
		
		legacy108.setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		legacy108.setLegacyRouteFares(GtmFactory.eINSTANCE.createLegacyRouteFares());
		legacy108.setLegacyDistanceFares(GtmFactory.eINSTANCE.createLegacyDistanceFares());
		legacy108.setLegacySeriesList(GtmFactory.eINSTANCE.createLegacySeriesList());
		legacy108.setLegacyStations(GtmFactory.eINSTANCE.createLegacy108Stations());
		return legacy108;
	}


	public static void populateInitialModel(GTMTool tool){
		
		tool.setCodeLists(createInitialCodeLists());
		tool.setConversionFromLegacy(createInitialConversionFromLegacy());
		tool.setGeneralTariffModel(createInitialGeneralTariffModel());
		
		
		
		populateServiceBrands(tool.getCodeLists().getServiceBrands());
		populateUICcountries(tool.getCodeLists().getCountries());
		populateCurrencies(tool.getCodeLists().getCurrencies());
		populateUICLaguages(tool.getCodeLists().getLanguages());

		//add generic reduction cards
			
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_EURAIL.getName(),"Eurail Pass", findCarrier(tool,"9902")); //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_INTERRAIL.getName(),"Interrail Pass", findCarrier(tool,"9902"));		 //$NON-NLS-1$ //$NON-NLS-2$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_FIP_DUTY.getName(),"FIP duty", null);			 //$NON-NLS-1$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_FIP_LEISURE_FREE.getName(),"FIP leasure", null);	 //$NON-NLS-1$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_FIP_LEISURE_REDU.getName(),"FIP leasure reduction", null); //$NON-NLS-1$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_RAILPLUS.getName(),"RailPlus", null);	 //$NON-NLS-1$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_RIT_1.getName(),"Rail Inclusive Tours 1", null);	 //$NON-NLS-1$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_RIT_2.getName(),"Rail Inclusive Tours 2", null);	 //$NON-NLS-1$
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),GenericReductionCards.UIC_RIT_3.getName(),"Rail Inclusive Tours 3", null);	 //$NON-NLS-1$
	
		
	}
	
	private static GeneralTariffModel createInitialGeneralTariffModel() {
		GeneralTariffModel model = GtmFactory.eINSTANCE.createGeneralTariffModel();

		model.setDelivery(GtmFactory.eINSTANCE.createDelivery());
		model.setFareStructure(createInitialFareStructure());
		return model;
	}


	private static ConversionFromLegacy createInitialConversionFromLegacy() {
		ConversionFromLegacy conversion = GtmFactory.eINSTANCE.createConversionFromLegacy();
		conversion.setParams(createInitialConversionParams());
		conversion.setLegacy108(createInitialLegacy108());
		
		
		return conversion;
	}


	private static ConversionParams createInitialConversionParams() {
		ConversionParams params = GtmFactory.eINSTANCE.createConversionParams();
		params.setLegacyStationMappings(GtmFactory.eINSTANCE.createLegacyStationMappings());
		params.setLegacyFareTemplates(GtmFactory.eINSTANCE.createLegacyFareTemplates());
		params.setLegacyFareStationMappings(GtmFactory.eINSTANCE.createLegacyFareStationSetMappings());
		params.setLegacyBorderPointMappings(GtmFactory.eINSTANCE.createLegacyBoderPointMappings());
		params.setLegacyStationToServiceBrandMappings(GtmFactory.eINSTANCE.createLegacyStationToServiceConstraintMappings());
		return params;
	}


	private static Carrier findCarrier(GTMTool tool, String code) {
		
		if (tool == null || tool.getCodeLists() == null || tool.getCodeLists() == null) {
			return null;
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()){
			if (carrier.getCode().equalsIgnoreCase(code)) {
				return carrier;				
			}
		}
		return null;
	}


	private static void createReductionCard(FareStructure fareStructure, String id, String name, Carrier carrier) {
		
		Text text =  GtmFactory.eINSTANCE.createText();
		ReductionCard card =  GtmFactory.eINSTANCE.createReductionCard();
		text.setTextUTF8(name);
		text.setShortTextUTF8(name);
		text.setTextICAO(name);
		text.setShortTextICAO(name);
		card.setCardIssuer(carrier);
		card.setId(id);
		card.setName(text);
		fareStructure.getTexts().getTexts().add(text);
		fareStructure.getReductionCards().getReductionCards().add(card);
	}



	public Command createPopulateCountriesCommand(EditingDomain domain, CodeLists codeLists) {

		
		Countries countries = GtmFactory.eINSTANCE.createCountries();
		populateUICcountries(countries);
		
		SetCommand command = new SetCommand(domain, countries, GtmPackage.Literals.CODE_LISTS__COUNTRIES, countries);
		
		
		return command;
	}
	
	public static void populateUICcountries(Countries countries){ 
		
		countries.getCountries().add(createCountry(10,"Finland","FI")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(20,"Russian Federation","RU")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(21,"Belarus","BY")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(22,"Ukraine","UA")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(23,"Moldova, Republic of","MD")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(24,"Lithuania","LT")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(25,"Latvia","LV")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(26,"Estonia","EE")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(27,"Kazakhstan"," KZ")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(28,"Georgia","GE")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(29,"Uzbekistan","UZ")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(30,"Korea, Democratic People's Republic of","KP")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(31,"Mongolia","MN")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(32,"Viet nam","VN")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(33,"China","CN")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(40,"Cuba","CU")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(41,"Albania","AL")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(42,"Japan","JP")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(44,"Bosnia and Herzegovina, Serb Republic of ","BA")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(50,"Bosnia and Herzegovina, Muslim-Croat Federation of","BA")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(51,"Poland","PL")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(52,"Bulgaria"," BG")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(53,"Romania","RO")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(54,"Czech Republic","CZ")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(55,"Hungary","HU")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(56,"Slovakia","SK")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(57,"Azerbaijan","AZ")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(58,"Armenia","AM")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(59,"Kyrgyzstan","KG")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(60,"Ireland","IE")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(61,"Korea, Republic of","KR")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(62,"Montenegro","ME")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(65,"Macedonia, The former Yugoslav Republic of","MD")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(66,"Tajikistan","TJ")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(67,"Turkmenistan","TM")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(70,"United Kingdom of Great Britain and Northern Ireland","GB")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(71,"Spain","ES")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(72,"Serbia","RS"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(73,"Greece","GR")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(74,"Sweden","SE")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(75,"Turkey","TR"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(76,"Norway","NO")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(78,"Croatia","HR"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(79,"Slovenia","SI")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(80,"Germany","DE")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(81,"Austria","AT"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(82,"Luxemburg","LU")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(83,"Italy","IT")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(84,"Netherlands","NL"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(85,"Switzerland","CH")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(86,"Denmark","DK"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(87,"France","FR")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(88,"Belgium","BE")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(90,"Egypt","EG")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(91,"Tunesia","TN")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(92,"Algeria","DZ")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(93,"Morocco","MA")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(94,"Portugal","PT")); //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(95,"Israel","IL"));			 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(96,"Iran, Islamic Republic of","IR"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(97,"Syrian Arab Republic","SY"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(98,"Lebanon","LB"));	 //$NON-NLS-1$ //$NON-NLS-2$
		countries.getCountries().add(createCountry(99,"Iraq","IQ"));	 //$NON-NLS-1$ //$NON-NLS-2$
		
	}
	
	public static void populateUICLaguages(Languages languages){
		
		languages.getLanguages().add(createLanguage("de", "German")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("ru", "Russian")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage(NationalLanguageSupport.GtmUtils_142, "French")); //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("it", "Italian")); //$NON-NLS-1$ //$NON-NLS-2$
		languages.getLanguages().add(createLanguage("en", "English"));		 //$NON-NLS-1$ //$NON-NLS-2$
		
	}
	
	public static Language createLanguage(String code, String name) {
		Language language = GtmFactory.eINSTANCE.createLanguage();
		language.setCode(code);
		language.setName(name);
		return language;
	}


	public static Country createCountry(int code, String name, String ISOcodeA2) {		
		Country country = GtmFactory.eINSTANCE.createCountry();
		country.setCode(code);
		country.setName(name);
		country.setISOcode(ISOcodeA2);
		return country;
	}
	
	public static void populateCurrencies(Currencies currencies) {
		
		Currency currency = GtmFactory.eINSTANCE.createCurrency();
		currency.setIsoCode("EUR"); //$NON-NLS-1$
		currency.setName(NationalLanguageSupport.GtmUtils_149);		
		currencies.getCurrencies().add(currency);
	}
	
	public static void populateServiceBrands(ServiceBrands brands) {
		
	}



	public static void writeConsoleError(String message) {
		ConsoleUtil.printError(NationalLanguageSupport.GtmUtils_150, message);
	}

	public static void writeConsoleWarning(String message) {
		ConsoleUtil.printWarning(NationalLanguageSupport.GtmUtils_151, message);
	}
	
	public static void writeConsoleInfo(String message) {
		ConsoleUtil.printInfo(NationalLanguageSupport.GtmUtils_152, message);
	}	

	public static CompoundCommand setIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null || domain == null) return null;
		
		CompoundCommand command =  new CompoundCommand();
		
		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		String baseName = tool.getGeneralTariffModel().getDelivery().getProvider().getCode();
		baseName = baseName +"_"+ tool.getGeneralTariffModel().getDelivery().getId()+"_"; //$NON-NLS-1$ //$NON-NLS-2$
		
		String listName = baseName;
				
		listName = baseName + "A_"; //$NON-NLS-1$
		int i = 0;
		for (AfterSalesRule object : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command, listName,i);
				//setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command);
			}
		}
		
		listName = baseName + "B_"; //$NON-NLS-1$
		i = 0;
		for (Calendar object : fareStructure.getCalendars().getCalendars()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command, listName,i);
				//setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command);
			}
		}

		listName = baseName + "C_"; //$NON-NLS-1$
		i = 0;
		for (CarrierConstraint object : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CARRIER_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "D_"; //$NON-NLS-1$
		i = 0;		
		for (CombinationConstraint object : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.COMBINATION_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "E_"; //$NON-NLS-1$
		i = 0;
		for (ConnectionPoint object : fareStructure.getConnectionPoints().getConnectionPoints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CONNECTION_POINT__ID, command, listName,i);
			}
		}
		
		for (FareElement object : fareStructure.getFareElements().getFareElements()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_ELEMENT__ID, command);
			}
		}		
		
	
		for (FulfillmentConstraint object : fareStructure.getFulfillmentConstraints().getFulfillmentConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FULFILLMENT_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "G_"; //$NON-NLS-1$
		i = 0;
		for (PassengerConstraint object : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PASSENGER_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "H_"; //$NON-NLS-1$
		i = 0;
		for (PersonalDataConstraint object : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "I_"; //$NON-NLS-1$
		i = 0;
		for (Price object : fareStructure.getPrices().getPrices()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PRICE__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "J_"; //$NON-NLS-1$
		i = 0;
		for (ReductionCard object : fareStructure.getReductionCards().getReductionCards()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REDUCTION_CARD__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "K_"; //$NON-NLS-1$
		i = 0;
		for (ReductionConstraint object : fareStructure.getReductionConstraints().getReductionConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REDUCTION_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		for (RegionalConstraint object : fareStructure.getRegionalConstraints().getRegionalConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REGIONAL_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "L_"; //$NON-NLS-1$
		i = 0;
		for (ReservationParameter object : fareStructure.getReservationParameters().getReservationParameters()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.RESERVATION_PARAMETER__ID, command, listName,i);
			}
		}			
		
		listName = baseName + "M_"; //$NON-NLS-1$
		i = 0;
		for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		
		listName = baseName + "N_"; //$NON-NLS-1$
		i = 0;
		for (ServiceConstraint object : fareStructure.getServiceConstraints().getServiceConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "O_"; //$NON-NLS-1$
		i = 0;
		for (ServiceLevel object : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_LEVEL__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "P_"; //$NON-NLS-1$
		i = 0;
		for (Text object : fareStructure.getTexts().getTexts()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TEXT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "Q_"; //$NON-NLS-1$
		i = 0;
		for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "R_"; //$NON-NLS-1$
		i = 0;
		for (FareStationSetDefinition object : fareStructure.getFareStationSetDefinitions().getFareStationSetDefinitions()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.FARE_STATION_SET_DEFINITION__ID, command, listName,i);
			}
		}						
        
        return command;
		
	}

	
	private static void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command, String listName, int index) {
		SetCommand cmd = new SetCommand(domain, object,feature, listName+"_"+Integer.toString(index)); //$NON-NLS-1$
		if (cmd.canExecute()) {
			command.append(cmd);
		}
	}

	private static void setId(EditingDomain domain, EObject object, EStructuralFeature feature, CompoundCommand command) {
		SetCommand cmd = new SetCommand(domain, object,feature, EcoreUtil.generateUUID());
		if (cmd.canExecute()) {
			command.append(cmd);
		}
	}
	
	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		
		Bundle bundle = Platform.getBundle(GtmEditorPlugin.PLUGIN_ID);
		URL fileURL = bundle.getEntry(path); //$NON-NLS-1$
		return ImageDescriptor.createFromURL(fileURL);
	}
	
	public static void clearCommandStack() {
		//clears the command stack to reduce the memory footprint
		boolean isDirty = false;
		if (GtmUtils.getActiveDomain().getCommandStack().getMostRecentCommand() != null) {
			isDirty = true;
		}
		GtmUtils.getActiveDomain().getCommandStack().flush();
		System.gc();
		if (isDirty) {
			GtmUtils.getActiveDomain().getCommandStack().execute(new DirtyCommand());
		}
	}
	
	
	/**
	 * Gets the description.
	 *
	 * @param object the object
	 * @return the description
	 */
	public static String getTypedDescription(EObject object) {
		String typeName = ""; //$NON-NLS-1$
		EObject eObject = ((EObject) object);

		typeName = getTypeDescription(eObject);
		String adapterText = getItemLabelProviderText(object);

		if (adapterText != null && typeName != null) {
			if (adapterText.startsWith(typeName)) {
				return adapterText;
			} else {
				return typeName + " " + adapterText; //$NON-NLS-1$
			}
		}
		return typeName;
	}

	private static String getItemLabelProviderText(EObject object) {
		if(object == null){
			return ""; //$NON-NLS-1$
		}
		String adapterText = null;
		EList<Adapter> eAdapters = object.eAdapters();
		for (Adapter adapter : eAdapters) {
			if(adapter instanceof IItemLabelProvider){
				adapterText = ((IItemLabelProvider) adapter).getText(object);
				break;
			}
		}	
		
		return adapterText;

	}

	private static String getTypeDescription(EObject object) {
			String typeName = ""; //$NON-NLS-1$
			if (object instanceof EObject) {
				EObject eObject = ((EObject) object);
				String typeKey = eObject.eClass().getName();


				ItemProviderAdapter provider = null;
				EList<Adapter> eAdapters = object.eAdapters();
				for (Adapter adapter : eAdapters) {
					if(adapter instanceof ItemProviderAdapter){
						provider = ((ItemProviderAdapter) adapter);
					}
				}

				if (provider != null) {
					String resource = "_UI_" + typeKey + "_type"; //$NON-NLS-1$ //$NON-NLS-2$
					if (resource.equals("_UI_EReference_type")  ) { //$NON-NLS-1$
						typeName = ""; //$NON-NLS-1$
					} else if ( resource.equals("_UI_EObject_type")) { //$NON-NLS-1$
						typeName = NationalLanguageSupport.GtmUtils_182;
					} else if ( resource.equals("_UI_EAttribute_type")) { //$NON-NLS-1$
						typeName = "";					 //$NON-NLS-1$
					} else {
						try {
							typeName = provider.getString(resource, true);
						} catch (MissingResourceException e) {
							//
						}
					}

				}
			}
			return typeName;
		}

	public static String toPrintableAscII(String text) {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", ""); //$NON-NLS-1$ //$NON-NLS-2$
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", ""); //$NON-NLS-1$ //$NON-NLS-2$
         
        // removes non-printable characters from Unicode
        return text.replaceAll("\\p{C}", ""); //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	public static String limitStringLength(String s, int maxChar) {
		if (s == null) return " "; //$NON-NLS-1$
		return s.substring(0, Math.min(maxChar, s.length()));
	}

	public static String limitStringLengthWithConsoleEntry(String s, int maxChar, GtmEditor editor, String text) {
		if (s == null) return " "; //$NON-NLS-1$
		if (s.length() <= maxChar) return s;
		
		
		String truncated = s.substring(0, Math.min(maxChar, s.length()));

		editor.getSite().getShell().getDisplay().asyncExec(() -> {
			GtmUtils.writeConsoleInfo("text" + " truncated:" + s + " -> " + truncated); //$NON-NLS-1$ //$NON-NLS-3$
		});
		
		return truncated;
	}
	
	public static boolean importStation(String filter, int country) {
		if (country < 1 || country > 99) return false;
		
		if (filter != null && filter.length() > 0) {
			if (!filter.contains(String.valueOf(country))) return false;
		}
		
		String filterP = PreferencesAccess.getStringFromPreferenceStore(PreferenceConstants.P_IMPORT_CONTRY_FILTER);
		
		if (filterP != null && filterP.length() > 0) {
			if (!filter.contains(String.valueOf(country))) return false;
		}		
		
		return true;
		
	}
	
}
