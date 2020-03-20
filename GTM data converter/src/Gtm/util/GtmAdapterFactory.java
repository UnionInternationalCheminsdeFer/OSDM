/**
 */
package Gtm.util;

import Gtm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage
 * @generated
 */
public class GtmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GtmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GtmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GtmSwitch<Adapter> modelSwitch =
		new GtmSwitch<Adapter>() {
			@Override
			public Adapter caseGTMTool(GTMTool object) {
				return createGTMToolAdapter();
			}
			@Override
			public Adapter caseCodeLists(CodeLists object) {
				return createCodeListsAdapter();
			}
			@Override
			public Adapter caseNUTSCodes(NUTSCodes object) {
				return createNUTSCodesAdapter();
			}
			@Override
			public Adapter caseNutsCode(NutsCode object) {
				return createNutsCodeAdapter();
			}
			@Override
			public Adapter caseServiceBrands(ServiceBrands object) {
				return createServiceBrandsAdapter();
			}
			@Override
			public Adapter caseServiceBrand(ServiceBrand object) {
				return createServiceBrandAdapter();
			}
			@Override
			public Adapter caseCountries(Countries object) {
				return createCountriesAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseLanguages(Languages object) {
				return createLanguagesAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseCurrencies(Currencies object) {
				return createCurrenciesAdapter();
			}
			@Override
			public Adapter caseCurrency(Currency object) {
				return createCurrencyAdapter();
			}
			@Override
			public Adapter caseStations(Stations object) {
				return createStationsAdapter();
			}
			@Override
			public Adapter caseStation(Station object) {
				return createStationAdapter();
			}
			@Override
			public Adapter caseStationRelation(StationRelation object) {
				return createStationRelationAdapter();
			}
			@Override
			public Adapter caseCarrier(Carrier object) {
				return createCarrierAdapter();
			}
			@Override
			public Adapter caseCarriers(Carriers object) {
				return createCarriersAdapter();
			}
			@Override
			public Adapter caseStationSet(StationSet object) {
				return createStationSetAdapter();
			}
			@Override
			public Adapter caseGeneralTariffModel(GeneralTariffModel object) {
				return createGeneralTariffModelAdapter();
			}
			@Override
			public Adapter caseDelivery(Delivery object) {
				return createDeliveryAdapter();
			}
			@Override
			public Adapter caseAfterSalesRules(AfterSalesRules object) {
				return createAfterSalesRulesAdapter();
			}
			@Override
			public Adapter caseAfterSalesRule(AfterSalesRule object) {
				return createAfterSalesRuleAdapter();
			}
			@Override
			public Adapter caseAfterSalesCondition(AfterSalesCondition object) {
				return createAfterSalesConditionAdapter();
			}
			@Override
			public Adapter caseApplicationTime(ApplicationTime object) {
				return createApplicationTimeAdapter();
			}
			@Override
			public Adapter caseFareStructure(FareStructure object) {
				return createFareStructureAdapter();
			}
			@Override
			public Adapter caseConnectionPoints(ConnectionPoints object) {
				return createConnectionPointsAdapter();
			}
			@Override
			public Adapter caseConnectionPoint(ConnectionPoint object) {
				return createConnectionPointAdapter();
			}
			@Override
			public Adapter caseFareResourceLocations(FareResourceLocations object) {
				return createFareResourceLocationsAdapter();
			}
			@Override
			public Adapter caseTrainResourceLocations(TrainResourceLocations object) {
				return createTrainResourceLocationsAdapter();
			}
			@Override
			public Adapter caseStationResourceLocations(StationResourceLocations object) {
				return createStationResourceLocationsAdapter();
			}
			@Override
			public Adapter caseCarrierResourceLocations(CarrierResourceLocations object) {
				return createCarrierResourceLocationsAdapter();
			}
			@Override
			public Adapter caseTrainResourceLocation(TrainResourceLocation object) {
				return createTrainResourceLocationAdapter();
			}
			@Override
			public Adapter caseStationResourceLocation(StationResourceLocation object) {
				return createStationResourceLocationAdapter();
			}
			@Override
			public Adapter caseOnlineResource(OnlineResource object) {
				return createOnlineResourceAdapter();
			}
			@Override
			public Adapter caseFulfillmentConstraints(FulfillmentConstraints object) {
				return createFulfillmentConstraintsAdapter();
			}
			@Override
			public Adapter caseFulfillmentConstraint(FulfillmentConstraint object) {
				return createFulfillmentConstraintAdapter();
			}
			@Override
			public Adapter caseRequiredBarcodes(RequiredBarcodes object) {
				return createRequiredBarcodesAdapter();
			}
			@Override
			public Adapter caseAcceptedBarcodes(AcceptedBarcodes object) {
				return createAcceptedBarcodesAdapter();
			}
			@Override
			public Adapter caseSupportedOnlineServices(SupportedOnlineServices object) {
				return createSupportedOnlineServicesAdapter();
			}
			@Override
			public Adapter caseStationNames(StationNames object) {
				return createStationNamesAdapter();
			}
			@Override
			public Adapter caseFareElements(FareElements object) {
				return createFareElementsAdapter();
			}
			@Override
			public Adapter caseFareElement(FareElement object) {
				return createFareElementAdapter();
			}
			@Override
			public Adapter caseFareStationSetDefinitions(FareStationSetDefinitions object) {
				return createFareStationSetDefinitionsAdapter();
			}
			@Override
			public Adapter caseFareStationSetDefinition(FareStationSetDefinition object) {
				return createFareStationSetDefinitionAdapter();
			}
			@Override
			public Adapter caseLegacyAccountingIdentifier(LegacyAccountingIdentifier object) {
				return createLegacyAccountingIdentifierAdapter();
			}
			@Override
			public Adapter caseReductionConstraints(ReductionConstraints object) {
				return createReductionConstraintsAdapter();
			}
			@Override
			public Adapter casePersonalDataConstraints(PersonalDataConstraints object) {
				return createPersonalDataConstraintsAdapter();
			}
			@Override
			public Adapter casePersonalDataConstraint(PersonalDataConstraint object) {
				return createPersonalDataConstraintAdapter();
			}
			@Override
			public Adapter caseRequiredPersonalData(RequiredPersonalData object) {
				return createRequiredPersonalDataAdapter();
			}
			@Override
			public Adapter caseAllowedPersonalDataChanges(AllowedPersonalDataChanges object) {
				return createAllowedPersonalDataChangesAdapter();
			}
			@Override
			public Adapter casePassengerConstraints(PassengerConstraints object) {
				return createPassengerConstraintsAdapter();
			}
			@Override
			public Adapter casePassengerConstraint(PassengerConstraint object) {
				return createPassengerConstraintAdapter();
			}
			@Override
			public Adapter casePassengerCombinationConstraint(PassengerCombinationConstraint object) {
				return createPassengerCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseIncludedFreePassengerLimit(IncludedFreePassengerLimit object) {
				return createIncludedFreePassengerLimitAdapter();
			}
			@Override
			public Adapter caseCombinationConstraints(CombinationConstraints object) {
				return createCombinationConstraintsAdapter();
			}
			@Override
			public Adapter caseCombinationConstraint(CombinationConstraint object) {
				return createCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseTravelValidityConstraints(TravelValidityConstraints object) {
				return createTravelValidityConstraintsAdapter();
			}
			@Override
			public Adapter caseTravelValidityConstraint(TravelValidityConstraint object) {
				return createTravelValidityConstraintAdapter();
			}
			@Override
			public Adapter caseSalesAvailabilityConstraints(SalesAvailabilityConstraints object) {
				return createSalesAvailabilityConstraintsAdapter();
			}
			@Override
			public Adapter caseSalesAvailabilityConstraint(SalesAvailabilityConstraint object) {
				return createSalesAvailabilityConstraintAdapter();
			}
			@Override
			public Adapter caseSalesRestriction(SalesRestriction object) {
				return createSalesRestrictionAdapter();
			}
			@Override
			public Adapter caseEndOfSale(EndOfSale object) {
				return createEndOfSaleAdapter();
			}
			@Override
			public Adapter caseStartOfSale(StartOfSale object) {
				return createStartOfSaleAdapter();
			}
			@Override
			public Adapter caseReductionCards(ReductionCards object) {
				return createReductionCardsAdapter();
			}
			@Override
			public Adapter caseReductionCard(ReductionCard object) {
				return createReductionCardAdapter();
			}
			@Override
			public Adapter caseCarrierConstraints(CarrierConstraints object) {
				return createCarrierConstraintsAdapter();
			}
			@Override
			public Adapter caseCarrierConstraint(CarrierConstraint object) {
				return createCarrierConstraintAdapter();
			}
			@Override
			public Adapter caseServiceConstraints(ServiceConstraints object) {
				return createServiceConstraintsAdapter();
			}
			@Override
			public Adapter caseServiceConstraint(ServiceConstraint object) {
				return createServiceConstraintAdapter();
			}
			@Override
			public Adapter caseRegionalConstraints(RegionalConstraints object) {
				return createRegionalConstraintsAdapter();
			}
			@Override
			public Adapter caseRegionalConstraint(RegionalConstraint object) {
				return createRegionalConstraintAdapter();
			}
			@Override
			public Adapter caseRegionalValidity(RegionalValidity object) {
				return createRegionalValidityAdapter();
			}
			@Override
			public Adapter caseServiceLevelDefinitions(ServiceLevelDefinitions object) {
				return createServiceLevelDefinitionsAdapter();
			}
			@Override
			public Adapter caseTexts(Texts object) {
				return createTextsAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseTranslation(Translation object) {
				return createTranslationAdapter();
			}
			@Override
			public Adapter casePrices(Prices object) {
				return createPricesAdapter();
			}
			@Override
			public Adapter casePrice(Price object) {
				return createPriceAdapter();
			}
			@Override
			public Adapter caseVATDetail(VATDetail object) {
				return createVATDetailAdapter();
			}
			@Override
			public Adapter caseCurrencyPrice(CurrencyPrice object) {
				return createCurrencyPriceAdapter();
			}
			@Override
			public Adapter caseServiceClassDefinitions(ServiceClassDefinitions object) {
				return createServiceClassDefinitionsAdapter();
			}
			@Override
			public Adapter caseCalendars(Calendars object) {
				return createCalendarsAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseReservationParameters(ReservationParameters object) {
				return createReservationParametersAdapter();
			}
			@Override
			public Adapter caseReservationParameter(ReservationParameter object) {
				return createReservationParameterAdapter();
			}
			@Override
			public Adapter caseReservationParams9181(ReservationParams9181 object) {
				return createReservationParams9181Adapter();
			}
			@Override
			public Adapter caseReservationOptions(ReservationOptions object) {
				return createReservationOptionsAdapter();
			}
			@Override
			public Adapter caseReservationPreferenceGroup(ReservationPreferenceGroup object) {
				return createReservationPreferenceGroupAdapter();
			}
			@Override
			public Adapter caseServiceClass(ServiceClass object) {
				return createServiceClassAdapter();
			}
			@Override
			public Adapter caseServiceLevel(ServiceLevel object) {
				return createServiceLevelAdapter();
			}
			@Override
			public Adapter caseTimeRange(TimeRange object) {
				return createTimeRangeAdapter();
			}
			@Override
			public Adapter caseExcludedTimeRange(ExcludedTimeRange object) {
				return createExcludedTimeRangeAdapter();
			}
			@Override
			public Adapter caseValidityRange(ValidityRange object) {
				return createValidityRangeAdapter();
			}
			@Override
			public Adapter caseRelativeTime(RelativeTime object) {
				return createRelativeTimeAdapter();
			}
			@Override
			public Adapter caseReturnValidityConstraint(ReturnValidityConstraint object) {
				return createReturnValidityConstraintAdapter();
			}
			@Override
			public Adapter caseViaStation(ViaStation object) {
				return createViaStationAdapter();
			}
			@Override
			public Adapter caseAlternativeRoute(AlternativeRoute object) {
				return createAlternativeRouteAdapter();
			}
			@Override
			public Adapter caseRoute(Route object) {
				return createRouteAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter casePolygone(Polygone object) {
				return createPolygoneAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseZoneDefinitions(ZoneDefinitions object) {
				return createZoneDefinitionsAdapter();
			}
			@Override
			public Adapter caseZoneDefinition(ZoneDefinition object) {
				return createZoneDefinitionAdapter();
			}
			@Override
			public Adapter caseCarrierResourceLocation(CarrierResourceLocation object) {
				return createCarrierResourceLocationAdapter();
			}
			@Override
			public Adapter caseCrossBorderCondition(CrossBorderCondition object) {
				return createCrossBorderConditionAdapter();
			}
			@Override
			public Adapter caseFareCombinationModel(FareCombinationModel object) {
				return createFareCombinationModelAdapter();
			}
			@Override
			public Adapter caseReductionConstraint(ReductionConstraint object) {
				return createReductionConstraintAdapter();
			}
			@Override
			public Adapter caseRequiredReductionCard(RequiredReductionCard object) {
				return createRequiredReductionCardAdapter();
			}
			@Override
			public Adapter caseConversionFromLegacy(ConversionFromLegacy object) {
				return createConversionFromLegacyAdapter();
			}
			@Override
			public Adapter caseConversionParams(ConversionParams object) {
				return createConversionParamsAdapter();
			}
			@Override
			public Adapter caseFareTemplate(FareTemplate object) {
				return createFareTemplateAdapter();
			}
			@Override
			public Adapter caseLegacyStationToServiceConstraintMappings(LegacyStationToServiceConstraintMappings object) {
				return createLegacyStationToServiceConstraintMappingsAdapter();
			}
			@Override
			public Adapter caseLegacyStationToServiceConstraintMapping(LegacyStationToServiceConstraintMapping object) {
				return createLegacyStationToServiceConstraintMappingAdapter();
			}
			@Override
			public Adapter caseLegacyStationMappings(LegacyStationMappings object) {
				return createLegacyStationMappingsAdapter();
			}
			@Override
			public Adapter caseLegacyStationMap(LegacyStationMap object) {
				return createLegacyStationMapAdapter();
			}
			@Override
			public Adapter caseLegacyFareDetailMaps(LegacyFareDetailMaps object) {
				return createLegacyFareDetailMapsAdapter();
			}
			@Override
			public Adapter caseLegacyFareDetailMap(LegacyFareDetailMap object) {
				return createLegacyFareDetailMapAdapter();
			}
			@Override
			public Adapter caseLegacyStation(LegacyStation object) {
				return createLegacyStationAdapter();
			}
			@Override
			public Adapter caseLegacyBoderPointMappings(LegacyBoderPointMappings object) {
				return createLegacyBoderPointMappingsAdapter();
			}
			@Override
			public Adapter caseLegacyBorderPointMapping(LegacyBorderPointMapping object) {
				return createLegacyBorderPointMappingAdapter();
			}
			@Override
			public Adapter caseLegacyFareStationSetMappings(LegacyFareStationSetMappings object) {
				return createLegacyFareStationSetMappingsAdapter();
			}
			@Override
			public Adapter caseLegacyFareStationSetMap(LegacyFareStationSetMap object) {
				return createLegacyFareStationSetMapAdapter();
			}
			@Override
			public Adapter caseLegacy108(Legacy108 object) {
				return createLegacy108Adapter();
			}
			@Override
			public Adapter caseLegacy108FareDescription(Legacy108FareDescription object) {
				return createLegacy108FareDescriptionAdapter();
			}
			@Override
			public Adapter caseLegacy108FaresDescriptions(Legacy108FaresDescriptions object) {
				return createLegacy108FaresDescriptionsAdapter();
			}
			@Override
			public Adapter caseLegacy108Stations(Legacy108Stations object) {
				return createLegacy108StationsAdapter();
			}
			@Override
			public Adapter caseLegacy108Station(Legacy108Station object) {
				return createLegacy108StationAdapter();
			}
			@Override
			public Adapter caseLegacyRouteFares(LegacyRouteFares object) {
				return createLegacyRouteFaresAdapter();
			}
			@Override
			public Adapter caseLegacyRouteFare(LegacyRouteFare object) {
				return createLegacyRouteFareAdapter();
			}
			@Override
			public Adapter caseLegacySeriesList(LegacySeriesList object) {
				return createLegacySeriesListAdapter();
			}
			@Override
			public Adapter caseLegacySeries(LegacySeries object) {
				return createLegacySeriesAdapter();
			}
			@Override
			public Adapter caseLegacySeparateContractSeriesList(LegacySeparateContractSeriesList object) {
				return createLegacySeparateContractSeriesListAdapter();
			}
			@Override
			public Adapter caseLegacySeparateContractSeries(LegacySeparateContractSeries object) {
				return createLegacySeparateContractSeriesAdapter();
			}
			@Override
			public Adapter caseLegacyDistanceFares(LegacyDistanceFares object) {
				return createLegacyDistanceFaresAdapter();
			}
			@Override
			public Adapter caseLegacyDistanceFare(LegacyDistanceFare object) {
				return createLegacyDistanceFareAdapter();
			}
			@Override
			public Adapter caseLegacyViastation(LegacyViastation object) {
				return createLegacyViastationAdapter();
			}
			@Override
			public Adapter caseLegacyFareTemplates(LegacyFareTemplates object) {
				return createLegacyFareTemplatesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Gtm.GTMTool <em>GTM Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.GTMTool
	 * @generated
	 */
	public Adapter createGTMToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CodeLists <em>Code Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CodeLists
	 * @generated
	 */
	public Adapter createCodeListsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.NUTSCodes <em>NUTS Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.NUTSCodes
	 * @generated
	 */
	public Adapter createNUTSCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.NutsCode <em>Nuts Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.NutsCode
	 * @generated
	 */
	public Adapter createNutsCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceBrands <em>Service Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceBrands
	 * @generated
	 */
	public Adapter createServiceBrandsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceBrand <em>Service Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceBrand
	 * @generated
	 */
	public Adapter createServiceBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Countries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Countries
	 * @generated
	 */
	public Adapter createCountriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Languages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Languages
	 * @generated
	 */
	public Adapter createLanguagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Currencies <em>Currencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Currencies
	 * @generated
	 */
	public Adapter createCurrenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Currency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Currency
	 * @generated
	 */
	public Adapter createCurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Stations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Stations
	 * @generated
	 */
	public Adapter createStationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Station <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Station
	 * @generated
	 */
	public Adapter createStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.StationRelation <em>Station Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StationRelation
	 * @generated
	 */
	public Adapter createStationRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Carrier <em>Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Carrier
	 * @generated
	 */
	public Adapter createCarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Carriers <em>Carriers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Carriers
	 * @generated
	 */
	public Adapter createCarriersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.StationSet <em>Station Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StationSet
	 * @generated
	 */
	public Adapter createStationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.GeneralTariffModel <em>General Tariff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.GeneralTariffModel
	 * @generated
	 */
	public Adapter createGeneralTariffModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Delivery
	 * @generated
	 */
	public Adapter createDeliveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.AfterSalesRules <em>After Sales Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.AfterSalesRules
	 * @generated
	 */
	public Adapter createAfterSalesRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.AfterSalesRule <em>After Sales Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.AfterSalesRule
	 * @generated
	 */
	public Adapter createAfterSalesRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.AfterSalesCondition <em>After Sales Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.AfterSalesCondition
	 * @generated
	 */
	public Adapter createAfterSalesConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ApplicationTime <em>Application Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ApplicationTime
	 * @generated
	 */
	public Adapter createApplicationTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareStructure <em>Fare Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareStructure
	 * @generated
	 */
	public Adapter createFareStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ConnectionPoints
	 * @generated
	 */
	public Adapter createConnectionPointsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ConnectionPoint
	 * @generated
	 */
	public Adapter createConnectionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareResourceLocations <em>Fare Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareResourceLocations
	 * @generated
	 */
	public Adapter createFareResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.TrainResourceLocations <em>Train Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TrainResourceLocations
	 * @generated
	 */
	public Adapter createTrainResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.StationResourceLocations <em>Station Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StationResourceLocations
	 * @generated
	 */
	public Adapter createStationResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CarrierResourceLocations <em>Carrier Resource Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CarrierResourceLocations
	 * @generated
	 */
	public Adapter createCarrierResourceLocationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.TrainResourceLocation <em>Train Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TrainResourceLocation
	 * @generated
	 */
	public Adapter createTrainResourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.StationResourceLocation <em>Station Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StationResourceLocation
	 * @generated
	 */
	public Adapter createStationResourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.OnlineResource <em>Online Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.OnlineResource
	 * @generated
	 */
	public Adapter createOnlineResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FulfillmentConstraints <em>Fulfillment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FulfillmentConstraints
	 * @generated
	 */
	public Adapter createFulfillmentConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FulfillmentConstraint <em>Fulfillment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FulfillmentConstraint
	 * @generated
	 */
	public Adapter createFulfillmentConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RequiredBarcodes <em>Required Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RequiredBarcodes
	 * @generated
	 */
	public Adapter createRequiredBarcodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.AcceptedBarcodes <em>Accepted Barcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.AcceptedBarcodes
	 * @generated
	 */
	public Adapter createAcceptedBarcodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.SupportedOnlineServices <em>Supported Online Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.SupportedOnlineServices
	 * @generated
	 */
	public Adapter createSupportedOnlineServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.StationNames <em>Station Names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StationNames
	 * @generated
	 */
	public Adapter createStationNamesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareElement <em>Fare Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareElement
	 * @generated
	 */
	public Adapter createFareElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareStationSetDefinitions <em>Fare Station Set Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareStationSetDefinitions
	 * @generated
	 */
	public Adapter createFareStationSetDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareStationSetDefinition <em>Fare Station Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareStationSetDefinition
	 * @generated
	 */
	public Adapter createFareStationSetDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyAccountingIdentifier <em>Legacy Accounting Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyAccountingIdentifier
	 * @generated
	 */
	public Adapter createLegacyAccountingIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReductionConstraints <em>Reduction Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReductionConstraints
	 * @generated
	 */
	public Adapter createReductionConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareElements <em>Fare Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareElements
	 * @generated
	 */
	public Adapter createFareElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.PersonalDataConstraints <em>Personal Data Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.PersonalDataConstraints
	 * @generated
	 */
	public Adapter createPersonalDataConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.PersonalDataConstraint <em>Personal Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.PersonalDataConstraint
	 * @generated
	 */
	public Adapter createPersonalDataConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RequiredPersonalData <em>Required Personal Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RequiredPersonalData
	 * @generated
	 */
	public Adapter createRequiredPersonalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.AllowedPersonalDataChanges <em>Allowed Personal Data Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.AllowedPersonalDataChanges
	 * @generated
	 */
	public Adapter createAllowedPersonalDataChangesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.PassengerConstraints <em>Passenger Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.PassengerConstraints
	 * @generated
	 */
	public Adapter createPassengerConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.PassengerConstraint <em>Passenger Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.PassengerConstraint
	 * @generated
	 */
	public Adapter createPassengerConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.PassengerCombinationConstraint <em>Passenger Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.PassengerCombinationConstraint
	 * @generated
	 */
	public Adapter createPassengerCombinationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.IncludedFreePassengerLimit <em>Included Free Passenger Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.IncludedFreePassengerLimit
	 * @generated
	 */
	public Adapter createIncludedFreePassengerLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CombinationConstraints <em>Combination Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CombinationConstraints
	 * @generated
	 */
	public Adapter createCombinationConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CombinationConstraint <em>Combination Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CombinationConstraint
	 * @generated
	 */
	public Adapter createCombinationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.TravelValidityConstraints <em>Travel Validity Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TravelValidityConstraints
	 * @generated
	 */
	public Adapter createTravelValidityConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.TravelValidityConstraint <em>Travel Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TravelValidityConstraint
	 * @generated
	 */
	public Adapter createTravelValidityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.SalesAvailabilityConstraints <em>Sales Availability Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.SalesAvailabilityConstraints
	 * @generated
	 */
	public Adapter createSalesAvailabilityConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.SalesAvailabilityConstraint <em>Sales Availability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.SalesAvailabilityConstraint
	 * @generated
	 */
	public Adapter createSalesAvailabilityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.SalesRestriction <em>Sales Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.SalesRestriction
	 * @generated
	 */
	public Adapter createSalesRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.EndOfSale <em>End Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.EndOfSale
	 * @generated
	 */
	public Adapter createEndOfSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.StartOfSale <em>Start Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StartOfSale
	 * @generated
	 */
	public Adapter createStartOfSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReductionCards <em>Reduction Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReductionCards
	 * @generated
	 */
	public Adapter createReductionCardsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReductionCard <em>Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReductionCard
	 * @generated
	 */
	public Adapter createReductionCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CarrierConstraints <em>Carrier Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CarrierConstraints
	 * @generated
	 */
	public Adapter createCarrierConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CarrierConstraint <em>Carrier Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CarrierConstraint
	 * @generated
	 */
	public Adapter createCarrierConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceConstraints <em>Service Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceConstraints
	 * @generated
	 */
	public Adapter createServiceConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceConstraint <em>Service Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceConstraint
	 * @generated
	 */
	public Adapter createServiceConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RegionalConstraints <em>Regional Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RegionalConstraints
	 * @generated
	 */
	public Adapter createRegionalConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RegionalConstraint <em>Regional Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RegionalConstraint
	 * @generated
	 */
	public Adapter createRegionalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RegionalValidity <em>Regional Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RegionalValidity
	 * @generated
	 */
	public Adapter createRegionalValidityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceLevelDefinitions <em>Service Level Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceLevelDefinitions
	 * @generated
	 */
	public Adapter createServiceLevelDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Texts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Texts
	 * @generated
	 */
	public Adapter createTextsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Translation
	 * @generated
	 */
	public Adapter createTranslationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Prices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Prices
	 * @generated
	 */
	public Adapter createPricesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Price
	 * @generated
	 */
	public Adapter createPriceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.VATDetail <em>VAT Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.VATDetail
	 * @generated
	 */
	public Adapter createVATDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CurrencyPrice <em>Currency Price</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CurrencyPrice
	 * @generated
	 */
	public Adapter createCurrencyPriceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceClassDefinitions <em>Service Class Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceClassDefinitions
	 * @generated
	 */
	public Adapter createServiceClassDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Calendars <em>Calendars</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Calendars
	 * @generated
	 */
	public Adapter createCalendarsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Calendar
	 * @generated
	 */
	public Adapter createCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReservationParameters <em>Reservation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReservationParameters
	 * @generated
	 */
	public Adapter createReservationParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReservationParameter <em>Reservation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReservationParameter
	 * @generated
	 */
	public Adapter createReservationParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReservationParams9181 <em>Reservation Params9181</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReservationParams9181
	 * @generated
	 */
	public Adapter createReservationParams9181Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReservationOptions <em>Reservation Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReservationOptions
	 * @generated
	 */
	public Adapter createReservationOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReservationPreferenceGroup <em>Reservation Preference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReservationPreferenceGroup
	 * @generated
	 */
	public Adapter createReservationPreferenceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceClass
	 * @generated
	 */
	public Adapter createServiceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ServiceLevel <em>Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ServiceLevel
	 * @generated
	 */
	public Adapter createServiceLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.TimeRange <em>Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TimeRange
	 * @generated
	 */
	public Adapter createTimeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ExcludedTimeRange <em>Excluded Time Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ExcludedTimeRange
	 * @generated
	 */
	public Adapter createExcludedTimeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ValidityRange <em>Validity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ValidityRange
	 * @generated
	 */
	public Adapter createValidityRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RelativeTime <em>Relative Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RelativeTime
	 * @generated
	 */
	public Adapter createRelativeTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReturnValidityConstraint <em>Return Validity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReturnValidityConstraint
	 * @generated
	 */
	public Adapter createReturnValidityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ViaStation <em>Via Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ViaStation
	 * @generated
	 */
	public Adapter createViaStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.AlternativeRoute <em>Alternative Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.AlternativeRoute
	 * @generated
	 */
	public Adapter createAlternativeRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Polygone <em>Polygone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Polygone
	 * @generated
	 */
	public Adapter createPolygoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ZoneDefinitions <em>Zone Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ZoneDefinitions
	 * @generated
	 */
	public Adapter createZoneDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ZoneDefinition <em>Zone Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ZoneDefinition
	 * @generated
	 */
	public Adapter createZoneDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CarrierResourceLocation <em>Carrier Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CarrierResourceLocation
	 * @generated
	 */
	public Adapter createCarrierResourceLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.CrossBorderCondition <em>Cross Border Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CrossBorderCondition
	 * @generated
	 */
	public Adapter createCrossBorderConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareCombinationModel <em>Fare Combination Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareCombinationModel
	 * @generated
	 */
	public Adapter createFareCombinationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ReductionConstraint <em>Reduction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReductionConstraint
	 * @generated
	 */
	public Adapter createReductionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.RequiredReductionCard <em>Required Reduction Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.RequiredReductionCard
	 * @generated
	 */
	public Adapter createRequiredReductionCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ConversionFromLegacy <em>Conversion From Legacy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ConversionFromLegacy
	 * @generated
	 */
	public Adapter createConversionFromLegacyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.ConversionParams <em>Conversion Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ConversionParams
	 * @generated
	 */
	public Adapter createConversionParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.FareTemplate <em>Fare Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareTemplate
	 * @generated
	 */
	public Adapter createFareTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyStationToServiceConstraintMappings <em>Legacy Station To Service Constraint Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyStationToServiceConstraintMappings
	 * @generated
	 */
	public Adapter createLegacyStationToServiceConstraintMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyStationToServiceConstraintMapping <em>Legacy Station To Service Constraint Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyStationToServiceConstraintMapping
	 * @generated
	 */
	public Adapter createLegacyStationToServiceConstraintMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyStationMappings <em>Legacy Station Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyStationMappings
	 * @generated
	 */
	public Adapter createLegacyStationMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyStationMap <em>Legacy Station Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyStationMap
	 * @generated
	 */
	public Adapter createLegacyStationMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyFareDetailMaps <em>Legacy Fare Detail Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyFareDetailMaps
	 * @generated
	 */
	public Adapter createLegacyFareDetailMapsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyFareDetailMap <em>Legacy Fare Detail Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyFareDetailMap
	 * @generated
	 */
	public Adapter createLegacyFareDetailMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyStation <em>Legacy Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyStation
	 * @generated
	 */
	public Adapter createLegacyStationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyBoderPointMappings <em>Legacy Boder Point Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyBoderPointMappings
	 * @generated
	 */
	public Adapter createLegacyBoderPointMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyBorderPointMapping <em>Legacy Border Point Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyBorderPointMapping
	 * @generated
	 */
	public Adapter createLegacyBorderPointMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyFareStationSetMappings <em>Legacy Fare Station Set Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyFareStationSetMappings
	 * @generated
	 */
	public Adapter createLegacyFareStationSetMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyFareStationSetMap <em>Legacy Fare Station Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyFareStationSetMap
	 * @generated
	 */
	public Adapter createLegacyFareStationSetMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Legacy108 <em>Legacy108</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Legacy108
	 * @generated
	 */
	public Adapter createLegacy108Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Legacy108FareDescription <em>Legacy108 Fare Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Legacy108FareDescription
	 * @generated
	 */
	public Adapter createLegacy108FareDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Legacy108FaresDescriptions <em>Legacy108 Fares Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Legacy108FaresDescriptions
	 * @generated
	 */
	public Adapter createLegacy108FaresDescriptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Legacy108Stations <em>Legacy108 Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Legacy108Stations
	 * @generated
	 */
	public Adapter createLegacy108StationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.Legacy108Station <em>Legacy108 Station</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.Legacy108Station
	 * @generated
	 */
	public Adapter createLegacy108StationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyRouteFares <em>Legacy Route Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyRouteFares
	 * @generated
	 */
	public Adapter createLegacyRouteFaresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyRouteFare <em>Legacy Route Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyRouteFare
	 * @generated
	 */
	public Adapter createLegacyRouteFareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacySeriesList <em>Legacy Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacySeriesList
	 * @generated
	 */
	public Adapter createLegacySeriesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacySeries <em>Legacy Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacySeries
	 * @generated
	 */
	public Adapter createLegacySeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacySeparateContractSeriesList <em>Legacy Separate Contract Series List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacySeparateContractSeriesList
	 * @generated
	 */
	public Adapter createLegacySeparateContractSeriesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacySeparateContractSeries <em>Legacy Separate Contract Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacySeparateContractSeries
	 * @generated
	 */
	public Adapter createLegacySeparateContractSeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyDistanceFares <em>Legacy Distance Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyDistanceFares
	 * @generated
	 */
	public Adapter createLegacyDistanceFaresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyDistanceFare <em>Legacy Distance Fare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyDistanceFare
	 * @generated
	 */
	public Adapter createLegacyDistanceFareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyViastation <em>Legacy Viastation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyViastation
	 * @generated
	 */
	public Adapter createLegacyViastationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyFareTemplates <em>Legacy Fare Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyFareTemplates
	 * @generated
	 */
	public Adapter createLegacyFareTemplatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GtmAdapterFactory
