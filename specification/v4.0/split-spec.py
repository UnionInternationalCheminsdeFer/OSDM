#!/usr/bin/env python3
"""
Split the monolithic OSDM v4.0 draft OpenAPI spec into modular files.
Adapted from specification/v3.9/split-spec.py.
"""

import yaml
import os
import re
import copy
from collections import OrderedDict

class OrderedDumper(yaml.SafeDumper):
    pass

def _dict_representer(dumper, data):
    return dumper.represent_mapping(yaml.resolver.BaseResolver.DEFAULT_MAPPING_TAG, data.items())

OrderedDumper.add_representer(OrderedDict, _dict_representer)
OrderedDumper.add_representer(dict, _dict_representer)

def _str_representer(dumper, data):
    if '\n' in data:
        return dumper.represent_scalar('tag:yaml.org,2002:str', data, style='|')
    return dumper.represent_scalar('tag:yaml.org,2002:str', data)

OrderedDumper.add_representer(str, _str_representer)

class OrderedLoader(yaml.SafeLoader):
    pass

def _construct_mapping(loader, node):
    loader.flatten_mapping(node)
    pairs = loader.construct_pairs(node)
    return OrderedDict(pairs)

OrderedLoader.add_constructor(yaml.resolver.BaseResolver.DEFAULT_MAPPING_TAG, _construct_mapping)

BASE_DIR = os.path.dirname(os.path.abspath(__file__))
SOURCE = os.path.join(BASE_DIR, 'OSDM-online-api-v4.0.0-draft.yml')

# === DOMAIN MAPPING FOR PATHS ===
PATH_RULES = [
    (r'^/versions$', 'versions'),
    (r'^/places', 'places'),
    (r'^/trips-collections', 'trips'),
    (r'^/trips-collection', 'trips'),
    (r'^/trips', 'trips'),
    (r'^/offers$', 'offers'),
    (r'^/offer-overview', 'offers'),
    (r'^/bookings/\{bookingId\}/on-hold-offer', 'on-hold'),
    (r'^/bookings/\{bookingId\}/passengers', 'passengers'),
    (r'^/bookings/\{bookingId\}/purchaser', 'purchaser'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/additional-offers', 'offers'),
    (r'^/bookings/\{bookingId\}/booked-offers/\{bookedOfferId\}/offer-parts', 'booking-parts'),
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
    (r'^/passenger-categories', 'master-data'),
    (r'^/reduction-card-types', 'master-data'),
    (r'^/zones', 'master-data'),
    (r'^/travel-accounts', 'travel-accounts'),
    (r'^/availabilities', 'availabilities'),
    (r'^/products-search', 'products'),
    (r'^/products', 'products'),
    (r'^/product-tags', 'products'),
]

# === DOMAIN MAPPING FOR SCHEMAS ===
# Domains prefixed with 'ojp/' are written to schemas/ojp/<name>.yml
SCHEMA_DOMAINS = {
    'ojp/_common': [
        'Address', 'AddressRef', 'CarrierFilter', 'GeoPosition', 'GeoPositionRef',
        'Mode', 'ModeFilter', 'OsmTag', 'ServiceBrandFilter', 'ServiceStatus',
        'Situation', 'SituationDescription', 'SituationRef',
    ],
    'ojp/continuous-service': [
        'ContinuousService',
    ],
    'ojp/place': [
        'InitialPlaceInput', 'Place', 'PlaceParam', 'PlaceRef', 'PlaceRequest',
        'PlaceType', 'PlaceUsage', 'PointOfInterest', 'PointOfInterestCategory',
        'PointOfInterestFilter', 'PointOfInterestRef',
    ],
    'ojp/product': [
        'ProductCategory', 'ProductCategoryRef',
    ],
    'ojp/trip': [
        'Alight', 'Board', 'ContinuousLeg', 'DatedJourney', 'Intermediate',
        'OperatingDays', 'OperationDayRef', 'StopCallStatus', 'StopPlace', 'StopPlaceRef',
        'TimedLeg', 'TransferLeg', 'Trip', 'TripChangeCriteria', 'TripCollectionResponse',
        'TripDataFilter', 'TripLeg', 'TripMobilityFilter', 'TripParameters',
        'TripSearchCriteria', 'TripSpecificationSummary', 'TripSummary', 'TripVia',
    ],
    'trip': [
        'AlightSpecification', 'BoardSpecification', 'IntermediateSpecification',
        'LegTrack', 'LegTrackSection', 'NonTripSearchCriteria', 'ReturnSearchParameters',
        'Route', 'RouteItem', 'RouteSpecification', 'Section', 'StopBehavior',
        'TimeFrameSegmentation', 'TimedLegSpecification', 'TrainLink', 'TransferType',
        'TripAllocationConstraint', 'TripAllocationProcess', 'TripAllocationUnit',
        'TripChangeParameter', 'TripCollectionRequest', 'TripContentFilter',
        'TripContentFilterItem', 'TripContext', 'TripCoverage', 'TripDirectionType',
        'TripFeasibility', 'TripInterruptionConstraint', 'TripInterruptionProcess',
        'TripLegCoverage', 'TripLegSpecification', 'TripMobilityFilterItem',
        'TripMobilityFilterItems', 'TripPolicyFilter', 'TripRealTimeDataUsage',
        'TripResponse', 'TripResponseContent', 'TripResponseParameters', 'TripResult',
        'TripSearchCriteriaMultiOD', 'TripSearchOptimisationMethod',
        'TripSearchTypeMultipleOD', 'TripSpecification', 'TripStatus',
        'TripTravelAccountUnit', 'TripsCollectionResponseContent',
    ],
    'offer': [
        'AbstractOfferPart', 'AdditionalOfferCollectionResponse', 'Admission',
        'AdmissionOfferPart', 'Ancillary', 'AncillaryGroup', 'AncillaryOfferPart',
        'AncillaryRelation', 'AncillarySelection', 'AncillarySubType', 'AncillaryType',
        'CombinationTag', 'ContinuousServiceOfferPart', 'FareOfferPart', 'Flexibility',
        'GroupedFacilityItem', 'Offer', 'OfferCollectionRequest', 'OfferCollectionResponse',
        'OfferCollectionResponseContent', 'OfferMode', 'OfferOverviewRouteRequest',
        'OfferOverviewRouteResponse', 'OfferOverviewTripRequest', 'OfferOverviewTripResponse',
        'OfferPartReference', 'OfferSearchCriteria', 'OfferSelection', 'OfferSummary',
        'OfferTag', 'OnHoldOffer', 'OnHoldOfferPatchRequest', 'OnHoldOfferRequest',
        'OnHoldOfferResponse', 'PartType', 'ProductLegAssociation',
        'ProductRequestOfferSelection', 'Reservation', 'ReservationGroup',
        'ReservationOfferPart', 'ReservationRelation', 'ReservedPlace',
        'ThroughTicketTag',
    ],
    'booking': [
        'AbstractBookingPart', 'BackOfficeChangeType', 'BookedOffer',
        'BookedOfferPartRequest', 'BookedOfferPartResponse', 'BookedOfferRequest',
        'BookedOfferResponse', 'BookedOfferSummary', 'Booking', 'BookingAccess',
        'BookingAccessTiming', 'BookingArrangement', 'BookingChangeType',
        'BookingCleanupRequest', 'BookingEvent', 'BookingHistoryResponse',
        'BookingMethod', 'BookingPartReference', 'BookingPartStatus', 'BookingPartSummary',
        'BookingPartType', 'BookingPatchRequest', 'BookingPurchaseMoment',
        'BookingRequest', 'BookingResponse', 'BookingResponseContent',
        'BookingSearchParameters', 'BookingSearchRequest', 'BookingSearchResponse',
        'BookingSearchResult', 'BookingSplit', 'BookingSplitGroup', 'BookingSplitRequest',
        'BookingSplitResponse', 'BookingSplitResult', 'ContinuousServiceBookingPart',
        'IndicatedUsage',
    ],
    'person': [
        'AbstractPassenger', 'ActualPassengerType', 'AnonymousPassengerSpecification',
        'BoardingPositionAssignment', 'CompanyDetail', 'Gender', 'IdentificationCard',
        'PRMNeedType', 'Passenger', 'PassengerCategory', 'PassengerConstraints',
        'PassengerResponse', 'PassengerSpecification', 'PassengerType',
        'PassengersBatchUpdateRequest', 'PassengersCollectionResponse', 'PersonDetail',
        'PersonSearchRequest', 'PersonalMode', 'PhoneNumber', 'ProductSpecification',
        'Purchaser', 'PurchaserResponse', 'PurchaserSearchRequest', 'PurchaserSpecification',
        'ReductionCardAccount', 'ReductionCardType', 'ReductionCardTypeCollectionResponse',
        'ReductionGranted',
    ],
    'fulfillment': [
        'ControlSecurityType', 'Document', 'DocumentCollectionResponse', 'DocumentContent',
        'DocumentFormat', 'DocumentRequest', 'DocumentResponse', 'DocumentScope',
        'DocumentSpecification', 'DocumentType', 'Fulfillment',
        'FulfillmentCollectionResponse', 'FulfillmentConstraint', 'FulfillmentDocument',
        'FulfillmentDocumentType', 'FulfillmentId', 'FulfillmentItemSecurityFeature',
        'FulfillmentItemSecurityFeatureLinks', 'FulfillmentMediaType', 'FulfillmentOption',
        'FulfillmentPart', 'FulfillmentPatchRequest', 'FulfillmentPostRequest',
        'FulfillmentRef', 'FulfillmentRefs', 'FulfillmentResponse', 'FulfillmentStatus',
        'FulfillmentSummaryStatus', 'FulfillmentType', 'FulfillmentUsage',
        'FulfillmentsPatchRequest', 'FulfillmentsResponse', 'SecurityElementFormat',
        'SecurityElementType', 'SecurityFeatureType', 'SiSType',
    ],
    'aftersales': [
        'AfterSaleCondition', 'AfterSaleConditionType', 'AfterSalesOverrideDetails',
        'CancelFulfillmentsOffer', 'CancelFulfillmentsOfferCollectionResponse',
        'CancelFulfillmentsOfferPatchRequest', 'CancelFulfillmentsOfferRequest',
        'CancelFulfillmentsOfferResponse', 'CancelFulfillmentsStatus',
        'ConditionSpecification', 'ConfirmedRefund', 'ConfirmedRelease',
        'ExchangeBreakdownItem', 'ExchangeOffer', 'ExchangeOfferCollectionResponse',
        'ExchangeOfferCollectionResponseContent', 'ExchangeOfferRequest',
        'ExchangeOfferRequestParameter', 'ExchangeOperation', 'ExchangeOperationPatchRequest',
        'ExchangeOperationRequest', 'ExchangeOperationResponse',
        'ExchangeOperationResponseContent', 'ExchangeParts',
        'ExchangePassengersOfferRequestSpecification',
        'ExchangeServiceOfferRequestSpecification', 'ExchangeStatus',
        'ExchangeTripOfferRequestSpecification', 'ExchangeableType', 'FareAfterSalesRules',
        'RefundBreakdownItem', 'RefundOffer', 'RefundOfferCollectionResponse',
        'RefundOfferPatchRequest', 'RefundOfferRequest', 'RefundOfferResponse',
        'RefundSpecification', 'RefundStatus', 'RefundType', 'RefundedFulfillmentSpecification',
        'ReleaseOffer', 'ReleaseOfferCollectionResponse', 'ReleaseOfferPatchRequest',
        'ReleaseOfferRequest', 'ReleaseOfferResponse', 'ReleaseSpecification', 'ReleaseStatus',
    ],
    'place': [
        'AccessFeature', 'AccessFeatureStatus', 'AccessibilityFeature',
        'AccommodationSubType', 'AccommodationType', 'AvailabilityStatus',
        'AvailablePlace', 'AvailablePlacePreferences', 'BoardingPositionAssignment',
        'BorderRadius', 'CoachAvailability', 'CoachDeckLayout',
        'CoachDeckLayoutCollectionResponse', 'CoachDeckLayoutResponse', 'CoachDeckLevel',
        'CompartmentAvailability', 'CompartmentPreSelection', 'DeckAvailability',
        'FlexibleStopAreaAssignment', 'GraphicElement', 'GraphicElementCode',
        'GridDimension', 'GridPosition', 'NamedPlaceRef', 'Orientation',
        'PathGuidance', 'PathGuidanceAdvice', 'PathGuidanceFollow', 'PathGuidancePathLink',
        'PathGuidancePathLinkEnd', 'PathGuidanceSection', 'PathGuidanceTransition',
        'PathGuidanceTurnAction', 'PlaceAllocation', 'PlaceAvailabilityCollectionResponse',
        'PlaceAvailabilityMapRequest', 'PlaceAvailabilityMapResponse', 'PlaceGroup',
        'PlaceLayout', 'PlaceMasterData', 'PlacePreSelection', 'PlacePreferenceGroup',
        'PlaceProperty', 'PlaceResponse', 'PlaceRestriction', 'PlaceSelection',
        'PlacesMasterDataResponse', 'RectangleGeometry', 'SelectedAccommodation',
        'SelectedPlace', 'SelectedReferencePlace', 'SpecificPlaceAvailability',
    ],
    'fare': [
        'CarrierConstraint', 'ExclusionScope', 'Fare', 'FareBookingPart',
        'FareCombinationModel', 'FareConnectionPoint', 'FareConnectionPointRef',
        'FareReferenceStation', 'FareType', 'LuggageConstraint', 'LuggageDimension',
        'LuggageDimensionEnum', 'LuggageRestriction', 'LuggageRestrictionRuleEnum',
        'RegionalConstraint', 'RegionalValidity', 'RegionalValiditySummary', 'StationSet',
        'TrainValidity', 'TrainValidityScope', 'TravelValidity', 'TravelValidityRange',
        'Zone', 'ZoneCollectionResponse', 'ZoneDefinition', 'ZoneSpecification',
    ],
    'product': [
        'FacilityEnum', 'FacilityGroupEnum', 'GeneralAttributeMasterData',
        'MasterDataValidity', 'Product', 'ProductCollectionResponse', 'ProductResponse',
        'ProductSearchRequest', 'ProductSearchResponse', 'ProductSummary', 'ProductTag',
        'ProductTagGroup', 'ProductTagName', 'ProductTagsResponse', 'ProductType',
    ],
    'complaint': [
        'ClaimedJourneyDetails', 'ClaimedLeg', 'Complaint', 'ComplaintChangeReason',
        'ComplaintDecision', 'ComplaintEvent', 'ComplaintPatchRequest', 'ComplaintRequest',
        'ComplaintResponse', 'CustomerComplaint', 'DecisionType', 'ImpactType',
        'NotificationEvent', 'Reimbursement', 'ReimbursementDecision', 'ReimbursementEvent',
        'ReimbursementMethod', 'ReimbursementPatchRequest', 'ReimbursementReason',
        'ReimbursementRequest', 'ReimbursementResponse', 'ReimbursementStatus',
    ],
    'travel-account': [
        'AbstractTravelAccount', 'AbstractTravelAccountUnit', 'DayTravelAccountUnit',
        'MoneyTravelAccountUnit', 'MultiRideAccount', 'MultiRideBalance',
        'NamedTravelAccountUnit', 'TravelAccountResponse', 'TravelAccountResponseContent',
        'TravelAccountType', 'TravelAccountUsage', 'TravelPassAccount',
        'TripTravelAccountUnit',
    ],
    'continuous-service': [
        'ContinuousServiceAvailabilityScope', 'ContinuousServiceBookingPart',
        'ContinuousServicePickUpPlace', 'ContinuousServiceProcessIndication',
        'ContinuousServiceUsage', 'ContinuousServiceUsagePatchRequest',
        'ContinuousServiceUsageStatus', 'ContinuousServiceVehicleAvailability',
        'ContinuousServiceVehicleSelection', 'ContinuousServiceVehicleType',
        'ContinuousServicesAvailabilityResponse',
    ],
    'transportable': [
        'AbstractTransportableVehicleSpecification', 'AttachableItemType', 'Car',
        'CarRack', 'CarSpecification', 'ContinousOperationMode', 'DirectionChange',
        'MotorCycle', 'MotorcycleSpecification', 'MountingType', 'ParallelService',
        'ServiceFormation', 'ServiceFormationPart', 'ServiceFormationPartAssignment',
        'ServiceFormationPartStatus', 'ServiceFormationPartType', 'ServiceFormationRoute',
        'Transportable', 'TransportableSpecification', 'TransportableType',
        'VehicleAvailability', 'VehicleFilter', 'VehicleNumber',
    ],
}

# Flat lookup: schema name -> domain
_SCHEMA_MAP_CACHE = None

def get_schema_map(all_schemas):
    global _SCHEMA_MAP_CACHE
    if _SCHEMA_MAP_CACHE:
        return _SCHEMA_MAP_CACHE
    mapping = {}
    for domain, names in SCHEMA_DOMAINS.items():
        for name in names:
            mapping[name] = domain
    for name in all_schemas:
        if name not in mapping:
            mapping[name] = '_common'
    _SCHEMA_MAP_CACHE = mapping
    return mapping

def get_path_domain(path):
    for pattern, domain in PATH_RULES:
        if re.match(pattern, path):
            return domain
    print(f"WARNING: No domain match for path: {path}")
    return 'bookings'

def domain_to_ref_path(domain):
    """Convert domain name to relative file path from schemas/ root."""
    if domain.startswith('ojp/'):
        return f'./schemas/{domain}.yml'
    elif domain == '_common':
        return './schemas/_common.yml'
    else:
        return f'./schemas/{domain}.yml'

def rewrite_refs(obj, schema_map, current_domain, context='schema'):
    if isinstance(obj, dict):
        result = OrderedDict()
        for k, v in obj.items():
            if k == '$ref' and isinstance(v, str):
                if context == 'schema' and v.startswith('#/components/schemas/'):
                    schema_name = v.split('/')[-1]
                    target_domain = schema_map.get(schema_name, '_common')
                    if target_domain == current_domain:
                        result[k] = f'#/{schema_name}'
                    else:
                        # Relative path from current domain file to target
                        if current_domain.startswith('ojp/'):
                            # From schemas/ojp/X.yml to schemas/Y.yml
                            if target_domain.startswith('ojp/'):
                                target_file = os.path.basename(target_domain) + '.yml'
                                result[k] = f'./{target_file}#/{schema_name}'
                            else:
                                target_file = target_domain + '.yml'
                                result[k] = f'../{target_file}#/{schema_name}'
                        else:
                            # From schemas/X.yml
                            if target_domain.startswith('ojp/'):
                                target_file = target_domain[4:] + '.yml'  # strip 'ojp/'
                                result[k] = f'./ojp/{target_file}#/{schema_name}'
                            else:
                                result[k] = f'./{target_domain}.yml#/{schema_name}'
                elif context == 'path' and v.startswith('#/components/'):
                    result[k] = f'../OSDM-online-api.yml{v}'
                elif context == 'response' and v.startswith('#/components/schemas/'):
                    result[k] = f'../OSDM-online-api.yml{v}'
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

def ensure_dir(path):
    os.makedirs(path, exist_ok=True)

def main():
    print("Loading v4.0 draft spec...")
    with open(SOURCE, 'r') as f:
        spec = yaml.load(f, Loader=OrderedLoader)

    all_schemas = spec.get('components', {}).get('schemas', OrderedDict())
    all_paths = spec.get('paths', OrderedDict())
    all_params = spec.get('components', {}).get('parameters', OrderedDict())
    all_responses = spec.get('components', {}).get('responses', OrderedDict())
    all_security = spec.get('components', {}).get('securitySchemes', OrderedDict())

    print(f"Found {len(all_schemas)} schemas, {len(all_paths)} paths")

    schema_map = get_schema_map(all_schemas)

    domain_counts = {}
    for name, domain in schema_map.items():
        domain_counts[domain] = domain_counts.get(domain, 0) + 1
    print("\nSchema domain assignments:")
    for domain, count in sorted(domain_counts.items()):
        print(f"  {domain}: {count} schemas")

    # Warn about unmapped schemas that fell to _common
    explicit_domains = set()
    for names in SCHEMA_DOMAINS.values():
        explicit_domains.update(names)
    unmapped = [n for n in all_schemas if n not in explicit_domains]
    if unmapped:
        print(f"\nSchemas falling to _common (not explicitly mapped): {unmapped}")

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
        if domain.startswith('ojp/'):
            outdir = os.path.join(BASE_DIR, 'schemas', 'ojp')
            filename = domain[4:] + '.yml'  # strip 'ojp/'
        else:
            outdir = os.path.join(BASE_DIR, 'schemas')
            filename = f'{domain}.yml'
        ensure_dir(outdir)
        outpath = os.path.join(outdir, filename)
        with open(outpath, 'w') as f:
            f.write(yaml_dump(rewritten))
        print(f"  schemas/{domain}.yml ({len(schemas)} schemas)")

    # === Write component files ===
    print("\nWriting component files...")
    ensure_dir(os.path.join(BASE_DIR, 'components'))

    outpath = os.path.join(BASE_DIR, 'components', 'parameters.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(dict(all_params)))
    print(f"  components/parameters.yml ({len(all_params)} parameters)")

    rewritten_responses = OrderedDict()
    for name, defn in all_responses.items():
        rewritten_responses[name] = rewrite_refs(defn, schema_map, None, 'response')
    outpath = os.path.join(BASE_DIR, 'components', 'responses.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(dict(rewritten_responses)))
    print(f"  components/responses.yml ({len(all_responses)} responses)")

    outpath = os.path.join(BASE_DIR, 'components', 'security-schemes.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(dict(all_security)))
    print(f"  components/security-schemes.yml")

    # === Write path files ===
    print("\nWriting path files...")
    ensure_dir(os.path.join(BASE_DIR, 'paths'))
    paths_by_domain = {}
    for path, operations in all_paths.items():
        domain = get_path_domain(path)
        if domain not in paths_by_domain:
            paths_by_domain[domain] = OrderedDict()
        paths_by_domain[domain][path] = operations

    for domain, paths in paths_by_domain.items():
        rewritten = OrderedDict()
        for path, ops in paths.items():
            rewritten[path] = rewrite_refs(ops, schema_map, domain, 'path')
        outpath = os.path.join(BASE_DIR, 'paths', f'{domain}.yml')
        with open(outpath, 'w') as f:
            f.write(yaml_dump(dict(rewritten)))
        print(f"  paths/{domain}.yml ({len(paths)} paths)")

    # === Write root hub file ===
    print("\nWriting root hub file...")
    hub = OrderedDict()
    hub['openapi'] = spec.get('openapi', '3.1.0')
    hub['info'] = copy.deepcopy(spec['info'])
    hub['servers'] = spec.get('servers', [])
    if 'tags' in spec:
        hub['tags'] = spec['tags']

    if 'security' in spec:
        hub['security'] = spec['security']

    hub['paths'] = OrderedDict()
    for path in all_paths:
        domain = get_path_domain(path)
        escaped = path.replace('~', '~0').replace('/', '~1')
        hub['paths'][path] = OrderedDict([('$ref', f'./paths/{domain}.yml#/{escaped}')])

    hub['components'] = OrderedDict()

    if all_security:
        hub['components']['securitySchemes'] = OrderedDict()
        for sec_name in all_security:
            hub['components']['securitySchemes'][sec_name] = OrderedDict([
                ('$ref', f'./components/security-schemes.yml#/{sec_name}')
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
        if domain.startswith('ojp/'):
            ref_path = f'./schemas/{domain}.yml#/{schema_name}'
        else:
            ref_path = f'./schemas/{domain}.yml#/{schema_name}'
        hub['components']['schemas'][schema_name] = OrderedDict([('$ref', ref_path)])

    outpath = os.path.join(BASE_DIR, 'OSDM-online-api.yml')
    with open(outpath, 'w') as f:
        f.write(yaml_dump(hub))
    print(f"  OSDM-online-api.yml (hub)")

    print(f"\nDone! Run: redocly bundle specification/v4.0/OSDM-online-api.yml --output specification/v4.0/OSDM-online-api-v4.0.0-bundled.yml")

if __name__ == '__main__':
    main()
