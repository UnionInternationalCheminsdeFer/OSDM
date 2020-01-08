/**
 */
package Gtm.util;

import Gtm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage
 * @generated
 */
public class GtmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GtmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GtmSwitch() {
		if (modelPackage == null) {
			modelPackage = GtmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GtmPackage.GTM_TOOL: {
				GTMTool gtmTool = (GTMTool)theEObject;
				T result = caseGTMTool(gtmTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CODE_LISTS: {
				CodeLists codeLists = (CodeLists)theEObject;
				T result = caseCodeLists(codeLists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.GENERAL_TARIFF_MODEL: {
				GeneralTariffModel generalTariffModel = (GeneralTariffModel)theEObject;
				T result = caseGeneralTariffModel(generalTariffModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CONVERSION_FROM_LEGACY: {
				ConversionFromLegacy conversionFromLegacy = (ConversionFromLegacy)theEObject;
				T result = caseConversionFromLegacy(conversionFromLegacy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_STRUCTURE: {
				FareStructure fareStructure = (FareStructure)theEObject;
				T result = caseFareStructure(fareStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.DELIVERY: {
				Delivery delivery = (Delivery)theEObject;
				T result = caseDelivery(delivery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.BORDER_POINTS: {
				BorderPoints borderPoints = (BorderPoints)theEObject;
				T result = caseBorderPoints(borderPoints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CALENDAR: {
				Calendar calendar = (Calendar)theEObject;
				T result = caseCalendar(calendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER: {
				Carrier carrier = (Carrier)theEObject;
				T result = caseCarrier(carrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COVERSION_PARAMS: {
				CoversionParams coversionParams = (CoversionParams)theEObject;
				T result = caseCoversionParams(coversionParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_DESCRIPTION: {
				LegacyDescription legacyDescription = (LegacyDescription)theEObject;
				T result = caseLegacyDescription(legacyDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_DISTANCE_FARE: {
				LegacyDistanceFare legacyDistanceFare = (LegacyDistanceFare)theEObject;
				T result = caseLegacyDistanceFare(legacyDistanceFare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_FARES: {
				LegacyFares legacyFares = (LegacyFares)theEObject;
				T result = caseLegacyFares(legacyFares);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY108: {
				Legacy108 legacy108 = (Legacy108)theEObject;
				T result = caseLegacy108(legacy108);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_ROUTE_FARE: {
				LegacyRouteFare legacyRouteFare = (LegacyRouteFare)theEObject;
				T result = caseLegacyRouteFare(legacyRouteFare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_SERIES: {
				LegacySeries legacySeries = (LegacySeries)theEObject;
				T result = caseLegacySeries(legacySeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_VIASTATION: {
				LegacyViastation legacyViastation = (LegacyViastation)theEObject;
				T result = caseLegacyViastation(legacyViastation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LEGACY_STATION_MAP: {
				LegacyStationMap legacyStationMap = (LegacyStationMap)theEObject;
				T result = caseLegacyStationMap(legacyStationMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER_CONSTRAINT: {
				CarrierConstraint carrierConstraint = (CarrierConstraint)theEObject;
				T result = caseCarrierConstraint(carrierConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COUNTRY: {
				Country country = (Country)theEObject;
				T result = caseCountry(country);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CONNECTION_POINT: {
				ConnectionPoint connectionPoint = (ConnectionPoint)theEObject;
				T result = caseConnectionPoint(connectionPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CURRENCY: {
				Currency currency = (Currency)theEObject;
				T result = caseCurrency(currency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CURRENCY_PRICE: {
				CurrencyPrice currencyPrice = (CurrencyPrice)theEObject;
				T result = caseCurrencyPrice(currencyPrice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PRICE: {
				Price price = (Price)theEObject;
				T result = casePrice(price);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REDUCTION_CARD: {
				ReductionCard reductionCard = (ReductionCard)theEObject;
				T result = caseReductionCard(reductionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REGIONAL_CONSTRAINT: {
				RegionalConstraint regionalConstraint = (RegionalConstraint)theEObject;
				T result = caseRegionalConstraint(regionalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PARAMETER: {
				ReservationParameter reservationParameter = (ReservationParameter)theEObject;
				T result = caseReservationParameter(reservationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PARAMS9181: {
				ReservationParams9181 reservationParams9181 = (ReservationParams9181)theEObject;
				T result = caseReservationParams9181(reservationParams9181);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_OPTIONS: {
				ReservationOptions reservationOptions = (ReservationOptions)theEObject;
				T result = caseReservationOptions(reservationOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RESERVATION_PREFERENCE: {
				ReservationPreference reservationPreference = (ReservationPreference)theEObject;
				T result = caseReservationPreference(reservationPreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_CLASS: {
				ServiceClass serviceClass = (ServiceClass)theEObject;
				T result = caseServiceClass(serviceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_LEVEL: {
				ServiceLevel serviceLevel = (ServiceLevel)theEObject;
				T result = caseServiceLevel(serviceLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_CONSTRAINT: {
				ServiceConstraint serviceConstraint = (ServiceConstraint)theEObject;
				T result = caseServiceConstraint(serviceConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION: {
				Station station = (Station)theEObject;
				T result = caseStation(station);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATIONS_TYPE: {
				StationsType stationsType = (StationsType)theEObject;
				T result = caseStationsType(stationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TARGET_FARE_TEMPLATE: {
				TargetFareTemplate targetFareTemplate = (TargetFareTemplate)theEObject;
				T result = caseTargetFareTemplate(targetFareTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRAVEL_VALIDITY_CONSTRAINT: {
				TravelValidityConstraint travelValidityConstraint = (TravelValidityConstraint)theEObject;
				T result = caseTravelValidityConstraint(travelValidityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRANSLATION: {
				Translation translation = (Translation)theEObject;
				T result = caseTranslation(translation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VAT_DETAIL: {
				VATDetail vatDetail = (VATDetail)theEObject;
				T result = caseVATDetail(vatDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_ELEMENT: {
				FareElement fareElement = (FareElement)theEObject;
				T result = caseFareElement(fareElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SERVICE_BRAND: {
				ServiceBrand serviceBrand = (ServiceBrand)theEObject;
				T result = caseServiceBrand(serviceBrand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SALES_AVAILABILITY_CONSTRAINT: {
				SalesAvailabilityConstraint salesAvailabilityConstraint = (SalesAvailabilityConstraint)theEObject;
				T result = caseSalesAvailabilityConstraint(salesAvailabilityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.SALES_RESTRICTION: {
				SalesRestriction salesRestriction = (SalesRestriction)theEObject;
				T result = caseSalesRestriction(salesRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TIME_REFERENCE: {
				TimeReference timeReference = (TimeReference)theEObject;
				T result = caseTimeReference(timeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.COMBINATION_CONSTRAINT: {
				CombinationConstraint combinationConstraint = (CombinationConstraint)theEObject;
				T result = caseCombinationConstraint(combinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VALIDITY_RANGE: {
				ValidityRange validityRange = (ValidityRange)theEObject;
				T result = caseValidityRange(validityRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TIME_RANGE: {
				TimeRange timeRange = (TimeRange)theEObject;
				T result = caseTimeRange(timeRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RETURN_VALIDITY_CONSTRAINT: {
				ReturnValidityConstraint returnValidityConstraint = (ReturnValidityConstraint)theEObject;
				T result = caseReturnValidityConstraint(returnValidityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_COMBINATION_MODEL: {
				FareCombinationModel fareCombinationModel = (FareCombinationModel)theEObject;
				T result = caseFareCombinationModel(fareCombinationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REGIONAL_VALIDITY: {
				RegionalValidity regionalValidity = (RegionalValidity)theEObject;
				T result = caseRegionalValidity(regionalValidity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.VIA_STATION: {
				ViaStation viaStation = (ViaStation)theEObject;
				T result = caseViaStation(viaStation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.NUTS_CODE: {
				NutsCode nutsCode = (NutsCode)theEObject;
				T result = caseNutsCode(nutsCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.POLYGONE: {
				Polygone polygone = (Polygone)theEObject;
				T result = casePolygone(polygone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.EDGE: {
				Edge edge = (Edge)theEObject;
				T result = caseEdge(edge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PASSENGER_CONSTRAINT: {
				PassengerConstraint passengerConstraint = (PassengerConstraint)theEObject;
				T result = casePassengerConstraint(passengerConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PASSENGER_COMBINATION_CONSTRAINT: {
				PassengerCombinationConstraint passengerCombinationConstraint = (PassengerCombinationConstraint)theEObject;
				T result = casePassengerCombinationConstraint(passengerCombinationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.RELATIVE_TIME: {
				RelativeTime relativeTime = (RelativeTime)theEObject;
				T result = caseRelativeTime(relativeTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ZONE_DEFINITION: {
				ZoneDefinition zoneDefinition = (ZoneDefinition)theEObject;
				T result = caseZoneDefinition(zoneDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.AFTER_SALES_CONDITION: {
				AfterSalesCondition afterSalesCondition = (AfterSalesCondition)theEObject;
				T result = caseAfterSalesCondition(afterSalesCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.AFTER_SALES_RULE: {
				AfterSalesRule afterSalesRule = (AfterSalesRule)theEObject;
				T result = caseAfterSalesRule(afterSalesRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.PERSONAL_DATA_CONSTRAINT: {
				PersonalDataConstraint personalDataConstraint = (PersonalDataConstraint)theEObject;
				T result = casePersonalDataConstraint(personalDataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REQUIRED_PERSONAL_DATA: {
				RequiredPersonalData requiredPersonalData = (RequiredPersonalData)theEObject;
				T result = caseRequiredPersonalData(requiredPersonalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CROSS_BORDER_CONDITION: {
				CrossBorderCondition crossBorderCondition = (CrossBorderCondition)theEObject;
				T result = caseCrossBorderCondition(crossBorderCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ALLOWED_PERSONAL_DATA_CHANGES: {
				AllowedPersonalDataChanges allowedPersonalDataChanges = (AllowedPersonalDataChanges)theEObject;
				T result = caseAllowedPersonalDataChanges(allowedPersonalDataChanges);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REDUCTION_CONSTRAINT: {
				ReductionConstraint reductionConstraint = (ReductionConstraint)theEObject;
				T result = caseReductionConstraint(reductionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.REQUIRED_REDUCTION_CARD: {
				RequiredReductionCard requiredReductionCard = (RequiredReductionCard)theEObject;
				T result = caseRequiredReductionCard(requiredReductionCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FULFILLMENT_CONSTRAINT: {
				FulfillmentConstraint fulfillmentConstraint = (FulfillmentConstraint)theEObject;
				T result = caseFulfillmentConstraint(fulfillmentConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.FARE_RESOURCE_LOCATION: {
				FareResourceLocation fareResourceLocation = (FareResourceLocation)theEObject;
				T result = caseFareResourceLocation(fareResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.TRAIN_RESOURCE_LOCATION: {
				TrainResourceLocation trainResourceLocation = (TrainResourceLocation)theEObject;
				T result = caseTrainResourceLocation(trainResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.CARRIER_RESOURCE_LOCATION: {
				CarrierResourceLocation carrierResourceLocation = (CarrierResourceLocation)theEObject;
				T result = caseCarrierResourceLocation(carrierResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.STATION_RESOURCE_LOCATION: {
				StationResourceLocation stationResourceLocation = (StationResourceLocation)theEObject;
				T result = caseStationResourceLocation(stationResourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GtmPackage.ONLINE_RESOURCE: {
				OnlineResource onlineResource = (OnlineResource)theEObject;
				T result = caseOnlineResource(onlineResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GTM Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GTM Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGTMTool(GTMTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Lists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Lists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLists(CodeLists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Tariff Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Tariff Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralTariffModel(GeneralTariffModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion From Legacy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion From Legacy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionFromLegacy(ConversionFromLegacy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareStructure(FareStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelivery(Delivery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Points</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Points</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderPoints(BorderPoints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendar(Calendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrier(Carrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coversion Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coversion Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoversionParams(CoversionParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyDescription(LegacyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Distance Fare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Distance Fare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyDistanceFare(LegacyDistanceFare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Fares</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Fares</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyFares(LegacyFares object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy108</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy108</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacy108(Legacy108 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Route Fare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Route Fare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyRouteFare(LegacyRouteFare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacySeries(LegacySeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Viastation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Viastation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyViastation(LegacyViastation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Station Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Station Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyStationMap(LegacyStationMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationsType(StationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Fare Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Fare Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetFareTemplate(TargetFareTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStation(Station object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountry(Country object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslation(Translation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClass(ServiceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevel(ServiceLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrice(Price object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParameter(ReservationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Params9181</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Params9181</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationParams9181(ReservationParams9181 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationOptions(ReservationOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservation Preference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservation Preference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservationPreference(ReservationPreference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyPrice(CurrencyPrice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrency(Currency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VAT Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VAT Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVATDetail(VATDetail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalConstraint(RegionalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPoint(ConnectionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConstraint(ServiceConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierConstraint(CarrierConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareElement(FareElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionCard(ReductionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBrand(ServiceBrand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Availability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Availability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesAvailabilityConstraint(SalesAvailabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Validity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelValidityConstraint(TravelValidityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sales Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sales Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalesRestriction(SalesRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeReference(TimeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationConstraint(CombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validity Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validity Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidityRange(ValidityRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeRange(TimeRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Validity Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Validity Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnValidityConstraint(ReturnValidityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Combination Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Combination Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareCombinationModel(FareCombinationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Validity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Validity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalValidity(RegionalValidity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Via Station</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Via Station</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViaStation(ViaStation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nuts Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nuts Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNutsCode(NutsCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygone(Polygone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerConstraint(PassengerConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Combination Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Combination Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerCombinationConstraint(PassengerCombinationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTime(RelativeTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneDefinition(ZoneDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesCondition(AfterSalesCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Sales Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Sales Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterSalesRule(AfterSalesRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Data Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonalDataConstraint(PersonalDataConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Personal Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Personal Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPersonalData(RequiredPersonalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Border Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Border Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossBorderCondition(CrossBorderCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Personal Data Changes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Personal Data Changes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedPersonalDataChanges(AllowedPersonalDataChanges object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReductionConstraint(ReductionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Reduction Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Reduction Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredReductionCard(RequiredReductionCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfillment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfillment Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfillmentConstraint(FulfillmentConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fare Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fare Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFareResourceLocation(FareResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainResourceLocation(TrainResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carrier Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carrier Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarrierResourceLocation(CarrierResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Resource Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Resource Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationResourceLocation(StationResourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineResource(OnlineResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GtmSwitch
