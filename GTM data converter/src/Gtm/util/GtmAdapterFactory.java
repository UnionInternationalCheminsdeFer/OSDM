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
			public Adapter caseGeneralTariffModel(GeneralTariffModel object) {
				return createGeneralTariffModelAdapter();
			}
			@Override
			public Adapter caseConversionFromLegacy(ConversionFromLegacy object) {
				return createConversionFromLegacyAdapter();
			}
			@Override
			public Adapter caseFareStructure(FareStructure object) {
				return createFareStructureAdapter();
			}
			@Override
			public Adapter caseDelivery(Delivery object) {
				return createDeliveryAdapter();
			}
			@Override
			public Adapter caseBorderPoints(BorderPoints object) {
				return createBorderPointsAdapter();
			}
			@Override
			public Adapter caseCalendar(Calendar object) {
				return createCalendarAdapter();
			}
			@Override
			public Adapter caseCarrier(Carrier object) {
				return createCarrierAdapter();
			}
			@Override
			public Adapter caseCoversionParams(CoversionParams object) {
				return createCoversionParamsAdapter();
			}
			@Override
			public Adapter caseLegacyDescription(LegacyDescription object) {
				return createLegacyDescriptionAdapter();
			}
			@Override
			public Adapter caseLegacyDistanceFare(LegacyDistanceFare object) {
				return createLegacyDistanceFareAdapter();
			}
			@Override
			public Adapter caseLegacyFares(LegacyFares object) {
				return createLegacyFaresAdapter();
			}
			@Override
			public Adapter caseLegacy108(Legacy108 object) {
				return createLegacy108Adapter();
			}
			@Override
			public Adapter caseLegacyRouteFare(LegacyRouteFare object) {
				return createLegacyRouteFareAdapter();
			}
			@Override
			public Adapter caseLegacySeries(LegacySeries object) {
				return createLegacySeriesAdapter();
			}
			@Override
			public Adapter caseLegacyViastation(LegacyViastation object) {
				return createLegacyViastationAdapter();
			}
			@Override
			public Adapter caseLegacyStationMap(LegacyStationMap object) {
				return createLegacyStationMapAdapter();
			}
			@Override
			public Adapter caseCarrierConstraint(CarrierConstraint object) {
				return createCarrierConstraintAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseConnectionPoint(ConnectionPoint object) {
				return createConnectionPointAdapter();
			}
			@Override
			public Adapter caseCurrency(Currency object) {
				return createCurrencyAdapter();
			}
			@Override
			public Adapter caseCurrencyPrice(CurrencyPrice object) {
				return createCurrencyPriceAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter casePrice(Price object) {
				return createPriceAdapter();
			}
			@Override
			public Adapter caseReductionCard(ReductionCard object) {
				return createReductionCardAdapter();
			}
			@Override
			public Adapter caseRegionalConstraint(RegionalConstraint object) {
				return createRegionalConstraintAdapter();
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
			public Adapter caseReservationPreference(ReservationPreference object) {
				return createReservationPreferenceAdapter();
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
			public Adapter caseServiceConstraint(ServiceConstraint object) {
				return createServiceConstraintAdapter();
			}
			@Override
			public Adapter caseStation(Station object) {
				return createStationAdapter();
			}
			@Override
			public Adapter caseStationsType(StationsType object) {
				return createStationsTypeAdapter();
			}
			@Override
			public Adapter caseTargetFareTemplate(TargetFareTemplate object) {
				return createTargetFareTemplateAdapter();
			}
			@Override
			public Adapter caseTravelValidityConstraint(TravelValidityConstraint object) {
				return createTravelValidityConstraintAdapter();
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
			public Adapter caseVATDetail(VATDetail object) {
				return createVATDetailAdapter();
			}
			@Override
			public Adapter caseFareElement(FareElement object) {
				return createFareElementAdapter();
			}
			@Override
			public Adapter caseServiceBrand(ServiceBrand object) {
				return createServiceBrandAdapter();
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
			public Adapter caseTimeReference(TimeReference object) {
				return createTimeReferenceAdapter();
			}
			@Override
			public Adapter caseCombinationConstraint(CombinationConstraint object) {
				return createCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseValidityRange(ValidityRange object) {
				return createValidityRangeAdapter();
			}
			@Override
			public Adapter caseTimeRange(TimeRange object) {
				return createTimeRangeAdapter();
			}
			@Override
			public Adapter caseReturnValidityConstraint(ReturnValidityConstraint object) {
				return createReturnValidityConstraintAdapter();
			}
			@Override
			public Adapter caseFareCombinationModel(FareCombinationModel object) {
				return createFareCombinationModelAdapter();
			}
			@Override
			public Adapter caseRegionalValidity(RegionalValidity object) {
				return createRegionalValidityAdapter();
			}
			@Override
			public Adapter caseViaStation(ViaStation object) {
				return createViaStationAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseNutsCode(NutsCode object) {
				return createNutsCodeAdapter();
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
			public Adapter casePassengerConstraint(PassengerConstraint object) {
				return createPassengerConstraintAdapter();
			}
			@Override
			public Adapter casePassengerCombinationConstraint(PassengerCombinationConstraint object) {
				return createPassengerCombinationConstraintAdapter();
			}
			@Override
			public Adapter caseRelativeTime(RelativeTime object) {
				return createRelativeTimeAdapter();
			}
			@Override
			public Adapter caseZoneDefinition(ZoneDefinition object) {
				return createZoneDefinitionAdapter();
			}
			@Override
			public Adapter caseAfterSalesCondition(AfterSalesCondition object) {
				return createAfterSalesConditionAdapter();
			}
			@Override
			public Adapter caseAfterSalesRule(AfterSalesRule object) {
				return createAfterSalesRuleAdapter();
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
			public Adapter caseCrossBorderCondition(CrossBorderCondition object) {
				return createCrossBorderConditionAdapter();
			}
			@Override
			public Adapter caseAllowedPersonalDataChanges(AllowedPersonalDataChanges object) {
				return createAllowedPersonalDataChangesAdapter();
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
			public Adapter caseFulfillmentConstraint(FulfillmentConstraint object) {
				return createFulfillmentConstraintAdapter();
			}
			@Override
			public Adapter caseFareResourceLocation(FareResourceLocation object) {
				return createFareResourceLocationAdapter();
			}
			@Override
			public Adapter caseTrainResourceLocation(TrainResourceLocation object) {
				return createTrainResourceLocationAdapter();
			}
			@Override
			public Adapter caseCarrierResourceLocation(CarrierResourceLocation object) {
				return createCarrierResourceLocationAdapter();
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
	 * Creates a new adapter for an object of class '{@link Gtm.BorderPoints <em>Border Points</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.BorderPoints
	 * @generated
	 */
	public Adapter createBorderPointsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Gtm.CoversionParams <em>Coversion Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.CoversionParams
	 * @generated
	 */
	public Adapter createCoversionParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyDescription <em>Legacy Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyDescription
	 * @generated
	 */
	public Adapter createLegacyDescriptionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Gtm.LegacyFares <em>Legacy Fares</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.LegacyFares
	 * @generated
	 */
	public Adapter createLegacyFaresAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Gtm.StationsType <em>Stations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.StationsType
	 * @generated
	 */
	public Adapter createStationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gtm.TargetFareTemplate <em>Target Fare Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TargetFareTemplate
	 * @generated
	 */
	public Adapter createTargetFareTemplateAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Gtm.ReservationPreference <em>Reservation Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.ReservationPreference
	 * @generated
	 */
	public Adapter createReservationPreferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Gtm.TimeReference <em>Time Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.TimeReference
	 * @generated
	 */
	public Adapter createTimeReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link Gtm.FareResourceLocation <em>Fare Resource Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gtm.FareResourceLocation
	 * @generated
	 */
	public Adapter createFareResourceLocationAdapter() {
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
