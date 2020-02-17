package Gtm.actions;


import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

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
import Gtm.presentation.GtmEditor;

public class GtmUtils {
	
	
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
	
	public static EditingDomain getActiveDomain() {
	   	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return ((GtmEditor) editor).getEditingDomain();
	}
	
	public static void disconnectViews() {
		GtmEditor editor = (GtmEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editor.disconnectViews();
	}
	
	public static void reconnectViews() {
		GtmEditor editor = (GtmEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editor.reconnectViews();
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
				if (tool.getConversionFromLegacy().getLegacy108().getLegacyFares() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getLegacy108(),GtmPackage.Literals.LEGACY108__LEGACY_FARES,GtmFactory.eINSTANCE.createLegacyFares()));				
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
				if (tool.getConversionFromLegacy().getParams().getLegacyTargetFares() == null) {
					command.append(new SetCommand(domain,tool.getConversionFromLegacy().getParams(),GtmPackage.Literals.CONVERSION_PARAMS__LEGACY_TARGET_FARES,GtmFactory.eINSTANCE.createLegacyTargetFares()));									
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
		legacy108.setLegacyFares(GtmFactory.eINSTANCE.createLegacyFares());
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
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_EURAIL","Eurail Pass", findCarrier(tool,"9902"));
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_INTERRAIL","Interrail Pass", findCarrier(tool,"9902"));		
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_FIP_DUTY","FIP duty", null);			
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_FIP_LEISURE_FREE","FIP leasure", null);	
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_FIP_LEISURE_REDU","FIP leasure reduction", null);
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_RAILPLUS","RailPlus", null);	
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_RIT_1","Rail Inclusive Toures 1", null);	
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_RIT_2","Rail Inclusive Toures 2", null);	
		createReductionCard(tool.getGeneralTariffModel().getFareStructure(),"UIC_RIT_3","Rail Inclusive Toures 3", null);	
	
		
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
		params.setLegacyTargetFares(GtmFactory.eINSTANCE.createLegacyTargetFares());
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
		
		countries.getCountries().add(createCountry(10,"Finland","FI"));
		countries.getCountries().add(createCountry(20,"Russian Federation","RU"));
		countries.getCountries().add(createCountry(21,"Belarus","BY"));
		countries.getCountries().add(createCountry(22,"Ukraine","UA"));
		countries.getCountries().add(createCountry(23,"Moldova, Republic of","MD"));
		countries.getCountries().add(createCountry(24,"Lithuania","LT"));
		countries.getCountries().add(createCountry(25,"Latvia","LV"));
		countries.getCountries().add(createCountry(26,"Estonia","EE"));
		countries.getCountries().add(createCountry(27,"Kazakhstan"," KZ"));
		countries.getCountries().add(createCountry(28,"Georgia","GE"));
		countries.getCountries().add(createCountry(29,"Uzbekistan","UZ"));
		countries.getCountries().add(createCountry(30,"Korea, Democratic People's Republic of","KP"));
		countries.getCountries().add(createCountry(31,"Mongolia","MN"));
		countries.getCountries().add(createCountry(32,"Viet nam","VN"));
		countries.getCountries().add(createCountry(33,"China","CN"));
		countries.getCountries().add(createCountry(40,"Cuba","CU"));
		countries.getCountries().add(createCountry(41,"Albania","AL"));
		countries.getCountries().add(createCountry(42,"Japan","JP"));
		countries.getCountries().add(createCountry(44,"Bosnia and Herzegovina, Serb Republic of ","BA"));
		countries.getCountries().add(createCountry(50,"Bosnia and Herzegovina, Muslim-Croat Federation of","BA"));
		countries.getCountries().add(createCountry(51,"Poland","PL"));
		countries.getCountries().add(createCountry(52,"Bulgaria"," BG"));
		countries.getCountries().add(createCountry(53,"Romania","RO"));
		countries.getCountries().add(createCountry(54,"Czech Republic","CZ"));
		countries.getCountries().add(createCountry(55,"Hungary","HU"));
		countries.getCountries().add(createCountry(56,"Slovakia","SK"));
		countries.getCountries().add(createCountry(57,"Azerbaijan","AZ"));
		countries.getCountries().add(createCountry(58,"Armenia","AM"));
		countries.getCountries().add(createCountry(59,"Kyrgyzstan","KG"));
		countries.getCountries().add(createCountry(60,"Ireland","IE"));
		countries.getCountries().add(createCountry(61,"Korea, Republic of","KR"));
		countries.getCountries().add(createCountry(62,"Montenegro","ME"));
		countries.getCountries().add(createCountry(65,"Macedonia, The former Yugoslav Republic of","MD"));
		countries.getCountries().add(createCountry(66,"Tajikistan","TJ"));
		countries.getCountries().add(createCountry(67,"Turkmenistan","TM"));
		countries.getCountries().add(createCountry(70,"United Kingdom of Great Britain and Northern Ireland","GB"));
		countries.getCountries().add(createCountry(71,"Spain","ES"));
		countries.getCountries().add(createCountry(72,"Serbia","RS"));	
		countries.getCountries().add(createCountry(73,"Greece","GR"));
		countries.getCountries().add(createCountry(74,"Sweden","SE"));
		countries.getCountries().add(createCountry(75,"Turkey","TR"));	
		countries.getCountries().add(createCountry(76,"Norway","NO"));
		countries.getCountries().add(createCountry(78,"Croatia","HR"));	
		countries.getCountries().add(createCountry(79,"Slovenia","SI"));
		countries.getCountries().add(createCountry(80,"Germany","DE"));
		countries.getCountries().add(createCountry(81,"Austria","AT"));	
		countries.getCountries().add(createCountry(82,"Luxemburg","LU"));
		countries.getCountries().add(createCountry(83,"Italy","IT"));
		countries.getCountries().add(createCountry(84,"Netherlands","NL"));	
		countries.getCountries().add(createCountry(85,"Switzerland","CH"));
		countries.getCountries().add(createCountry(86,"Denmark","DK"));	
		countries.getCountries().add(createCountry(87,"France","FR"));
		countries.getCountries().add(createCountry(88,"Belgium","BE"));
		countries.getCountries().add(createCountry(90,"Egypt","EG"));
		countries.getCountries().add(createCountry(91,"Tunesia","TN"));
		countries.getCountries().add(createCountry(92,"Algeria","DZ"));
		countries.getCountries().add(createCountry(93,"Morocco","MA"));
		countries.getCountries().add(createCountry(94,"Portugal","PT"));
		countries.getCountries().add(createCountry(95,"Israel","IL"));			
		countries.getCountries().add(createCountry(96,"Iran, Islamic Republic of","IR"));	
		countries.getCountries().add(createCountry(97,"Syrian Arab Republic","SY"));	
		countries.getCountries().add(createCountry(98,"Lebanon","LB"));	
		countries.getCountries().add(createCountry(99,"Iraq","IQ"));	
		
	}
	
	public static void populateUICLaguages(Languages languages){
		
		languages.getLanguages().add(createLanguage("de", "German"));
		languages.getLanguages().add(createLanguage("ru", "Russian"));
		languages.getLanguages().add(createLanguage("fr", "French"));
		languages.getLanguages().add(createLanguage("it", "Italian"));
		languages.getLanguages().add(createLanguage("en", "English"));		
		
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
		currency.setIsoCode("EUR");
		currency.setName("Euro");		
		currencies.getCurrencies().add(currency);
	}
	
	public static void populateServiceBrands(ServiceBrands brands) {
		
	}



	public static void writeConsoleError(String message) {
		ConsoleUtil.printError("Errors", message);
	}

	public static void writeConsoleWarning(String message) {
		ConsoleUtil.printWarning("Errors", message);
	}
	
	public static void writeConsoleInfog(String message) {
		ConsoleUtil.printInfo("Errors", message);
	}	

	public static CompoundCommand setIds(GTMTool tool, EditingDomain domain) {
		
		if (tool == null || domain == null) return null;
		
		CompoundCommand command =  new CompoundCommand();
		
		FareStructure fareStructure = tool.getGeneralTariffModel().getFareStructure();
		
		String baseName = tool.getGeneralTariffModel().getDelivery().getProvider().getCode();
		baseName = baseName +"_"+ tool.getGeneralTariffModel().getDelivery().getId()+"_";
		
		String listName = baseName;
				
		listName = baseName + "A_";
		int i = 0;
		for (AfterSalesRule object : fareStructure.getAfterSalesRules().getAfterSalesRules()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command, listName,i);
				//setId(domain, object,GtmPackage.Literals.AFTER_SALES_RULE__ID, command);
			}
		}
		
		listName = baseName + "B_";
		i = 0;
		for (Calendar object : fareStructure.getCalendars().getCalendars()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command, listName,i);
				//setId(domain, object,GtmPackage.Literals.CALENDAR__ID, command);
			}
		}

		listName = baseName + "C_";
		i = 0;
		for (CarrierConstraint object : fareStructure.getCarrierConstraints().getCarrierConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.CARRIER_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "D_";
		i = 0;		
		for (CombinationConstraint object : fareStructure.getCombinationConstraints().getCombinationConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.COMBINATION_CONSTRAINT__ID, command, listName,i);
			}
		}
		
		listName = baseName + "E_";
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
		
		listName = baseName + "G_";
		i = 0;
		for (PassengerConstraint object : fareStructure.getPassengerConstraints().getPassengerConstraints()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PASSENGER_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "H_";
		i = 0;
		for (PersonalDataConstraint object : fareStructure.getPersonalDataConstraints().getPersonalDataConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PERSONAL_DATA_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "I_";
		i = 0;
		for (Price object : fareStructure.getPrices().getPrices()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.PRICE__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "J_";
		i = 0;
		for (ReductionCard object : fareStructure.getReductionCards().getReductionCards()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.REDUCTION_CARD__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "K_";
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
		
		listName = baseName + "L_";
		i = 0;
		for (ReservationParameter object : fareStructure.getReservationParameters().getReservationParameters()) {
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.RESERVATION_PARAMETER__ID, command, listName,i);
			}
		}			
		
		listName = baseName + "M_";
		i = 0;
		for (SalesAvailabilityConstraint object : fareStructure.getSalesAvailabilityConstraints().getSalesAvailabilityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SALES_AVAILABILITY_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		
		listName = baseName + "N_";
		i = 0;
		for (ServiceConstraint object : fareStructure.getServiceConstraints().getServiceConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_CONSTRAINT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "O_";
		i = 0;
		for (ServiceLevel object : fareStructure.getServiceLevelDefinitions().getServiceLevelDefinition()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.SERVICE_LEVEL__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "P_";
		i = 0;
		for (Text object : fareStructure.getTexts().getTexts()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TEXT__ID, command, listName,i);
			}
		}	
		
		listName = baseName + "Q_";
		i = 0;
		for (TravelValidityConstraint object : fareStructure.getTravelValidityConstraints().getTravelValidityConstraints()) {
			i++;
			if (object.getId() == null || object.getId().isEmpty()) {
				setId(domain, object,GtmPackage.Literals.TRAVEL_VALIDITY_CONSTRAINT__ID, command, listName,i);
			}
		}		
		
		listName = baseName + "R_";
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
		SetCommand cmd = new SetCommand(domain, object,feature, listName+"_"+Integer.toString(index));
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
	
	
}
