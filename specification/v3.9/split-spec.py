#!/usr/bin/env python3
"""
Split the monolithic OSDM v3.8 OpenAPI spec into modular v3.9 files.
This script reads the v3.8 YAML, categorizes schemas and paths by domain,
and writes them out as separate files with correct $ref rewiring.
"""

import yaml
import json
import os
import re
import copy
from collections import OrderedDict

# Preserve YAML ordering
class OrderedDumper(yaml.SafeDumper):
    pass

def _dict_representer(dumper, data):
    return dumper.represent_mapping(yaml.resolver.BaseResolver.DEFAULT_MAPPING_TAG, data.items())

OrderedDumper.add_representer(OrderedDict, _dict_representer)
OrderedDumper.add_representer(dict, _dict_representer)

# Force literal block style for multiline strings
def _str_representer(dumper, data):
    if '\n' in data:
        return dumper.represent_scalar('tag:yaml.org,2002:str', data, style='|')
    return dumper.represent_scalar('tag:yaml.org,2002:str', data)

OrderedDumper.add_representer(str, _str_representer)

# Custom loader to preserve ordering
class OrderedLoader(yaml.SafeLoader):
    pass

def _construct_mapping(loader, node):
    loader.flatten_mapping(node)
    pairs = loader.construct_pairs(node)
    return OrderedDict(pairs)

OrderedLoader.add_constructor(yaml.resolver.BaseResolver.DEFAULT_MAPPING_TAG, _construct_mapping)

BASE_DIR = os.path.dirname(os.path.abspath(__file__))
SOURCE = os.path.join(BASE_DIR, '..', 'v3.8', 'OSDM-online-api-v3.8.0.yml')

# === DOMAIN MAPPING FOR PATHS ===
PATH_RULES = [
    (r'^/versions$', 'versions'),
    (r'^/places', 'places'),
    (r'^/trips-collection', 'trips'),
    (r'^/trips', 'trips'),
    (r'^/offers$', 'offers'),
    (r'^/offer-overview', 'offers'),
    (r'^/bookings/\{bookingId\}/on-hold-offer', 'on-hold'),
    (r'^/bookings/\{bookingId\}/passengers', 'passengers'),
    (r'^/bookings/\{bookingId\}/purchaser', 'purchaser'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/additional-offers', 'offers'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/offer-parts', 'booking-parts'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/reservations', 'booking-parts'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/ancillaries', 'booking-parts'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/admissions', 'booking-parts'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/passengers', 'booked-offers'),
    (r'^/bookings/\{bookingId\}/booked-offers', 'booked-offers'),
    (r'^/bookings/\{bookingId\}/fulfillment', 'fulfillments'),
    (r'^/bookings/\{bookingId\}/refund-offers', 'refund'),
    (r'^/bookings/\{bookingId\}/release-offers', 'release'),
    (r'^/bookings/\{bookingId\}/cancel-fulfillments', 'cancel-fulfillments'),
    (r'^/bookings/\{bookingId\}/exchange', 'exchange'),
    (r'^/bookings/\{bookingId\}/split', 'bookings-split'),
    (r'^/bookings/\{bookingId\}/cleanup', 'bookings'),
    (r'^/bookings/\{bookingId\}/history', 'bookings'),
    (r'^/bookings/\{bookingId\}/documents', 'documents'),
    (r'^/bookings/\{bookingId\}/reimbursements', 'reimbursements'),
    (r'^/bookings-search', 'bookings-search'),
    (r'^/bookings', 'bookings'),
    (r'^/fulfillments', 'fulfillments'),
    (r'^/complaints', 'complaints'),
    (r'^/coach-deck-layouts', 'master-data'),
    (r'^/coach-layouts', 'master-data'),
    (r'^/passenger-categories', 'master-data'),
    (r'^/promotion-codes', 'master-data'),
    (r'^/reduction-cards', 'master-data'),
    (r'^/zones', 'master-data'),
    (r'^/travel-accounts', 'travel-accounts'),
    (r'^/availabilities', 'availabilities'),
    (r'^/products', 'products'),
    (r'^/product-tags', 'products'),
]

# === DOMAIN MAPPING FOR SCHEMAS ===
SCHEMA_DOMAINS = {
    'trip': [
        'Trip', 'TripSearchCriteria', 'TripSpecification', 'TripSpecificationSummary',
        'TripLeg', 'TripLegSpecification', 'TimedLeg', 'TimedLegSpecification',
        'TransferLeg', 'ContinuousLeg', 'TripCoverage', 'TripLegCoverage',
        'TripSummary', 'TripParameters', 'TripResult', 'TripCollectionResponse',
        'TripResponse', 'TripResponseContent', 'TripResponseParameters',
        'TripAllocationConstraint', 'TripAllocationProcess', 'TripAllocationUnit',
        'TripChangeCriteria', 'TripDataFilter', 'TripInterruptionConstraint',
        'TripInterruptionProcess', 'TripMobilityFilter', 'TripVia', 'NotVia',
        'TripDirectionType', 'TripStatus', 'Board', 'BoardSpecification',
        'Alight', 'AlightSpecification', 'Intermediate', 'IntermediateSpecification',
        'StopPlace', 'StopPlaceRef', 'StopBehavior', 'StopCallStatus',
        'DatedJourney', 'JourneyRef', 'TrainLink', 'Route', 'RouteItem',
        'RouteSpecification', 'Section', 'BaseTripPolicyFilter',
        'TripTravelAccountUnit', 'TripsCollectionResponseContent',
        'ReturnSearchParameters', 'NonTripSearchCriteria', 'TimeFrameSegmentation',
        'OperatingDays', 'OperationDayRef', 'DatedJourneyRef',
        'TripRequest', 'TripCollectionRequest', 'TripsCollectionRequest',
    ],
    'offer': [
        'Offer', 'OfferCollectionRequest', 'OfferCollectionResponse',
        'OfferCollectionResponseContent', 'OfferSummary', 'OfferMode',
        'OfferSearchCriteria', 'OfferSelection', 'OfferTag', 'OfferPartReference',
        'OfferPartType', 'AbstractOfferPart', 'AdmissionOfferPart',
        'ReservationOfferPart', 'AncillaryOfferPart', 'ContinuousServiceOfferPart',
        'OfferOverviewRouteRequest', 'OfferOverviewRouteResponse',
        'OfferOverviewTripRequest', 'OfferOverviewTripResponse',
        'AdditionalOfferCollectionResponse',
        'OnHoldOffer', 'OnHoldOfferPatchRequest', 'OnHoldOfferRequest',
        'OnHoldOfferResponse', 'CombinationTag', 'ThroughTicketTag',
        'ProductRequestOfferSelection', 'ProductLegAssociation',
        'Admission', 'AdmissionGroup', 'AdmissionRelation', 'AdmissionSelection',
        'Ancillary', 'AncillaryGroup', 'AncillaryRelation', 'AncillarySelection',
        'AncillaryType', 'Reservation', 'ReservationGroup', 'ReservationRelation',
        'ReservationSelection', 'ReservationReference', 'ReservedPlace',
        'OfferPartOverview', 'OfferOverviewResult', 'OfferOverviewRouteResult',
        'OfferOverviewTripResult', 'OfferOverview', 'Flexibility',
    ],
    'booking': [
        'Booking', 'BookingRequest', 'BookingResponse', 'BookingResponseContent',
        'BookingPatchRequest', 'BookingCleanupRequest', 'BookingHistoryResponse',
        'BookingSearchParameters', 'BookingSearchRequest', 'BookingSearchResponse',
        'BookingSearchResult', 'BookingSplit', 'BookingSplitGroup',
        'BookingSplitRequest', 'BookingSplitResponse', 'BookingSplitResult',
        'BookedOffer', 'BookedOfferRequest', 'BookedOfferResponse',
        'BookedOfferSummary', 'BookedOfferAncillaryRequest',
        'BookedOfferAncillaryResponse', 'BookedOfferReservationRequest',
        'BookedOfferReservationResponse', 'BookedOfferPartRequest',
        'BookedOfferPartResponse', 'BookedOfferPartDeleteRequest',
        'AbstractBookingPart', 'BookingPartReference', 'BookingPartStatus',
        'BookingPartSummary', 'BookingPartType', 'PartReference',
        'ContinuousServiceBookingPart',
    ],
    'passenger': [
        'Passenger', 'PassengerSpecification', 'AnonymousPassengerSpecification',
        'PassengerResponse', 'PassengersBatchUpdateRequest',
        'PassengersCollectionResponse', 'PassengerSearchRequest',
        'PassengerType', 'PassengerCategory', 'PassengerConstraints',
        'ActualPassengerType', 'AppliedPassengerType', 'PRMNeedType',
        'Purchaser', 'PurchaserResponse', 'PurchaserSpecification',
        'PurchaserSearchRequest', 'ReductionGranted', 'GrantedReductionAmount',
        'GrantedReductionAmounts', 'ReductionCardType',
        'ReductionCardCollectionResponse', 'PassengerCategoriesCollectionResponse',
        'ReductionCardAccount',
    ],
    'fulfillment': [
        'Fulfillment', 'FulfillmentPostRequest', 'FulfillmentPatchRequest',
        'FulfillmentActivationPatchRequest', 'FulfillmentResponse',
        'FulfillmentCollectionResponse', 'FulfillmentConstraint',
        'FulfillmentDocument', 'FulfillmentDocumentType', 'FulfillmentId',
        'FulfillmentItemSecurityFeature', 'FulfillmentItemSecurityFeatureLinks',
        'FulfillmentMediaType', 'FulfillmentOption', 'FulfillmentPart',
        'FulfillmentStatus', 'FulfillmentSummaryStatus', 'FulfillmentType',
        'FulfillmentUsage', 'SecurityElementFormat', 'SecurityElementType',
        'SecurityFeatureType', 'ControlSecurityType', 'SiSType',
        'Document', 'DocumentCollectionResponse', 'DocumentFormat',
        'DocumentRequest', 'DocumentResponse', 'DocumentScope',
        'DocumentSpecification', 'DocumentType', 'FulfillmentCheckRequest',
        'FulfillmentCheckResponse',
    ],
    'aftersales': [
        'RefundOffer', 'RefundOfferBreakdownItem', 'RefundOfferCollectionResponse',
        'RefundOfferPatchRequest', 'RefundOfferRequest', 'RefundOfferResponse',
        'RefundSpecification', 'RefundStatus', 'RefundType',
        'ReleaseOffer', 'ReleaseOfferCollectionResponse', 'ReleaseOfferPatchRequest',
        'ReleaseOfferRequest', 'ReleaseOfferRequestAsyncResponse',
        'ReleaseOfferResponse', 'ReleaseStatus',
        'CancelFulfillmentsOffer', 'CancelFulfillmentsOfferCollectionResponse',
        'CancelFulfillmentsOfferPatchRequest', 'CancelFulfillmentsOfferRequest',
        'CancelFulfillmentsOfferResponse', 'CancelFulfillmentsStatus',
        'ExchangeOffer', 'ExchangeOfferCollectionRequest',
        'ExchangeOfferCollectionResponse', 'ExchangeOfferCollectionResponseContent',
        'ExchangeOperation', 'ExchangeOperationPatchRequest',
        'ExchangeOperationRequest', 'ExchangeOperationResponse',
        'ExchangeOperationResponseContent', 'ExchangeStatus',
        'ExchangeableType', 'ExchangeBreakdownItem',
        'AfterSaleCondition', 'AfterSaleConditionType', 'AfterSalesConditionsLink',
        'AfterSalesOverrideDetails', 'RefundConfirmationCheckRequest',
        'RefundConfirmationCheckResponse',
    ],
    'place': [
        'Place', 'PlaceRef', 'PlaceRequest', 'PlaceResponse',
        'PlaceAvailability', 'PlaceAvailabilityResponse',
        'PlaceAvailabilityCollectionResponse', 'PlaceAvailabilityMapRequest',
        'PlaceAvailabilityMapResponse', 'SpecificPlaceAvailability',
        'PlaceAllocation', 'PlaceGroup', 'PlaceLayout', 'PlaceParam',
        'PlacePosition', 'PlacePreferenceGroup', 'PlacePreSelection',
        'PlaceProperty', 'PlaceRestriction', 'PlaceSelection',
        'PlaceSelectionFlow', 'PlaceType', 'PlaceUsage',
        'SelectedPlace', 'SelectedReferencePlace', 'SelectedAccommodation',
        'SelectedCompartment', 'AvailablePlace', 'AvailablePlacePreferences',
        'AvailabilityScope', 'AvailabilityStatus', 'InitialPlaceInput',
        'PointOfInterest', 'PointOfInterestCategory', 'PointOfInterestFilter',
        'PointOfInterestRef', 'CompartmentPreSelection',
        'Coach', 'CoachAvailability', 'CoachDeckLayout',
        'CoachDeckLayoutCollectionResponse', 'CoachDeckLayoutResponse',
        'CoachDeckLevel', 'CoachLayout', 'CoachLayoutResponse',
        'CoachLayoutCollectionResponse', 'CoachLayoutPlace',
        'CoachLayoutDirectedInternal', 'CoachLayoutInternal',
        'CoachLayoutGridSize', 'CoachLayoutCompartmentNumber',
        'CoachLayoutSign', 'Compartment', 'CompartmentAvailability',
        'DeckAvailability', 'GridDimension', 'GridPosition',
        'LayoutCoordinates', 'BorderRadius', 'RectangleGeometry',
        'AccommodationSubType', 'AccommodationType', 'SpecialCoachType',
        'Orientation', 'GraphicElement', 'GraphicElementCode',
        'PlaceAvailabilitiesResponse', 'NearbyAvailabilityRequest',
        'NearbyAvailabilityResponse', 'PlacePreferencesAvailabilityRequest',
        'PlacePreferencesAvailabilityResponse',
        'VehiclePlaceMapAvailabilityRequest', 'VehiclePlaceMapAvailabilityResponse',
    ],
    'product': [
        'Product', 'ProductCategory', 'ProductCategoryRef',
        'ProductCollectionResponse', 'ProductResponse',
        'ProductSearchRequest', 'ProductSearchResponse', 'ProductSummary',
        'ProductTag', 'ProductTagGroup', 'ProductTagName',
        'ProductTagsResponse', 'ProductType', 'Fare', 'FareCombinationModel',
        'FareConnectionPoint', 'FareConnectionPointRef', 'FareReferenceStation',
        'FareType', 'Zone', 'ZoneCollectionResponse', 'ZoneDefinition',
        'StationSet', 'RegionalConstraint', 'RegionalValidity',
        'RegionalValiditySummary', 'TrainValidity', 'TrainValidityScope',
        'TravelValidity', 'TravelValidityRange', 'CarrierConstraint',
        'LuggageConstraint', 'LuggageDimension',
        'LuggageDimensionEnum', 'LuggageRestriction', 'LuggageRestrictionRuleEnum',
        'ExclusionScope', 'PromotionCodeCollectionResponse',
    ],
    'complaint': [
        'Complaint', 'ComplaintChangeReason', 'ComplaintDecision',
        'ComplaintPatchRequest', 'ComplaintResponse', 'CustomerComplaint',
        'ClaimedJourneyDetails', 'ClaimedLeg', 'DecisionType', 'ImpactType',
        'Reimbursement', 'ReimbursementDecision', 'ReimbursementMethod',
        'ReimbursementPatchRequest', 'ReimbursementReason',
        'ReimbursementRequest', 'ReimbursementResponse', 'ReimbursementStatus',
        'ComplaintRequest', 'ReimbursementCollectionResponse',
    ],
    'travel-account': [
        'AbstractTravelAccount', 'AbstractTravelAccountUnit',
        'TravelAccountConsumption', 'TravelAccountResponse',
        'TravelAccountResponseContent', 'TravelAccountType',
        'TravelPassAccount', 'MultiRideAccount', 'MultiRideBalance',
        'DayTravelAccountUnit', 'MoneyTravelAccountUnit',
        'NamedTravelAccountUnit', 'IndicatedConsumption',
        'IndicatedTravelAccountConsumption', 'TravelAccount',
    ],
    'continuous-service': [
        'ContinuousService', 'ContinuousServiceAvailabilityScope',
        'ContinuousServicePickUpPlace', 'ContinuousServiceProcessIndication',
        'ContinuousServicesAvailabilityResponse',
        'ContinuousServiceUsage', 'ContinuousServiceUsagePatchRequest',
        'ContinuousServiceUsageStatus', 'ContinuousServiceVehicleAvailability',
        'ContinuousServiceVehicleSelection', 'ContinuousServiceVehicleType',
        'ContinuousMode',
    ],
    'transport': [
        'Vehicle', 'VehicleAvailability', 'VehicleFilter', 'VehicleNumber',
        'AbstractTransportableVehicleSpecification', 'Transportable',
        'TransportableSpecification', 'TransportableType',
        'Car', 'CarSpecification', 'CarRack', 'MotorCycle',
        'MotorcycleSpecification', 'MountingType', 'AttachableItemType',
        'DirectionChange', 'DirectionType',
    ],
}

def get_path_domain(path):
    for pattern, domain in PATH_RULES:
        if re.match(pattern, path):
            return domain
    print(f"WARNING: No domain match for path: {path}")
    return 'bookings'

def get_schema_domain(name):
    for domain, schemas in SCHEMA_DOMAINS.items():
        if name in schemas:
            return domain
    return '_common'

def build_schema_to_domain_map(all_schemas):
    mapping = {}
    for name in all_schemas:
        mapping[name] = get_schema_domain(name)
    return mapping

def rewrite_refs(obj, schema_map, current_domain, context='schema'):
    """
    Rewrite $ref paths.
    For schemas: cross-domain refs become ./<domain>.yml#/X, same-domain stay #/X
    For paths/responses: keep as #/components/schemas/X (resolved via root hub)
    """
    if isinstance(obj, dict):
        result = OrderedDict()
        for k, v in obj.items():
            if k == '$ref' and isinstance(v, str) and v.startswith('#/components/schemas/'):
                schema_name = v.split('/')[-1]
                if context == 'schema':
                    target_domain = schema_map.get(schema_name, '_common')
                    if target_domain == current_domain:
                        result[k] = f'#/{schema_name}'
                    else:
                        result[k] = f'./{target_domain}.yml#/{schema_name}'
                else:
                    result[k] = v
            else:
                result[k] = rewrite_refs(v, schema_map, current_domain, context)
        return result
    elif isinstance(obj, list):
        return [rewrite_refs(item, schema_map, current_domain, context) for item in obj]
    return obj

def yaml_dump(data):
    return yaml.dump(data, Dumper=OrderedDumper, default_flow_style=False,
                     allow_unicode=True, width=120, sort_keys=False)

def main():
    print("Loading v3.8 spec...")
    with open(SOURCE, 'r') as f:
        spec = yaml.load(f, Loader=OrderedLoader)

    all_schemas = spec.get('components', {}).get('schemas', OrderedDict())
    all_paths = spec.get('paths', OrderedDict())
    all_params = spec.get('components', {}).get('parameters', OrderedDict())
    all_responses = spec.get('components', {}).get('responses', OrderedDict())
    all_security = spec.get('components', {}).get('securitySchemes', OrderedDict())

    print(f"Found {len(all_schemas)} schemas, {len(all_paths)} paths")

    schema_map = build_schema_to_domain_map(all_schemas)

    domain_counts = {}
    for name, domain in schema_map.items():
        domain_counts[domain] = domain_counts.get(domain, 0) + 1
    print("\nSchema domain assignments:")
    for domain, count in sorted(domain_counts.items()):
        print(f"  {domain}: {count} schemas")

    # === Write schema files ===
    print("\nWriting schema files...")
    schemas_by_domain = {}
    for name, definition in all_schemas.items():
        domain = schema_map[name]
        if domain not in schemas_by_domain:
            schemas_by_domain[domain] = OrderedDict()
        schemas_by_domain[domain][name] = definition

    for domain, schemas in schemas_by_domain.items():
        rewritten = OrderedDict()
        for name, defn in schemas.items():
            rewritten[name] = rewrite_refs(defn, schema_map, domain, 'schema')
        outpath = os.path.join(BASE_DIR, 'schemas', f'{domain}.yml')
        with open(outpath, 'w') as f:
            f.write(yaml_dump(rewritten))
        print(f"  schemas/{domain}.yml ({len(schemas)} schemas)")

    # === Write component files ===
    print("\nWriting component files...")
    outpath = os.path.join(BASE_DIR, 'components', 'parameters.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(dict(all_params)))
    print(f"  components/parameters.yml ({len(all_params)} parameters)")

    outpath = os.path.join(BASE_DIR, 'components', 'responses.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(dict(all_responses)))
    print(f"  components/responses.yml ({len(all_responses)} responses)")

    outpath = os.path.join(BASE_DIR, 'components', 'security-schemes.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(dict(all_security)))
    print(f"  components/security-schemes.yml")

    # === Write path files ===
    print("\nWriting path files...")
    paths_by_domain = {}
    for path, operations in all_paths.items():
        domain = get_path_domain(path)
        if domain not in paths_by_domain:
            paths_by_domain[domain] = OrderedDict()
        paths_by_domain[domain][path] = operations

    for domain, paths in paths_by_domain.items():
        outpath = os.path.join(BASE_DIR, 'paths', f'{domain}.yml')
        with open(outpath, 'w') as f:
            f.write(yaml_dump(dict(paths)))
        print(f"  paths/{domain}.yml ({len(paths)} paths)")

    # === Write root hub file ===
    print("\nWriting root hub file...")
    hub = OrderedDict()
    hub['openapi'] = '3.0.3'
    hub['info'] = copy.deepcopy(spec['info'])
    hub['info']['version'] = '3.9.0'
    hub['servers'] = spec['servers']
    hub['tags'] = spec['tags']

    hub['paths'] = OrderedDict()
    for path in all_paths:
        domain = get_path_domain(path)
        escaped = path.replace('~', '~0').replace('/', '~1')
        hub['paths'][path] = OrderedDict([('$ref', f'./paths/{domain}.yml#/{escaped}')])

    hub['components'] = OrderedDict()
    hub['components']['securitySchemes'] = OrderedDict([
        ('oAuth2ClientCredentials', OrderedDict([
            ('$ref', './components/security-schemes.yml#/oAuth2ClientCredentials')
        ]))
    ])
    hub['components']['parameters'] = OrderedDict()
    for param_name in all_params:
        hub['components']['parameters'][param_name] = OrderedDict([
            ('$ref', f'./components/parameters.yml#/{param_name}')
        ])
    hub['components']['responses'] = OrderedDict()
    for resp_name in all_responses:
        hub['components']['responses'][resp_name] = OrderedDict([
            ('$ref', f'./components/responses.yml#/{resp_name}')
        ])
    hub['components']['schemas'] = OrderedDict()
    for schema_name in all_schemas:
        domain = schema_map[schema_name]
        hub['components']['schemas'][schema_name] = OrderedDict([
            ('$ref', f'./schemas/{domain}.yml#/{schema_name}')
        ])

    outpath = os.path.join(BASE_DIR, 'OSDM-online-api.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(hub))
    print(f"  OSDM-online-api.yml (hub)")

    print(f"\nDone! Run 'redocly bundle specification/v3.9/OSDM-online-api.yml' to verify.")

if __name__ == '__main__':
    main()