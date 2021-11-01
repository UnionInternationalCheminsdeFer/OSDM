    PlaceRequest: ## OJP  # Reduced scope
      #  - $ref: "#/components/schemas/PlaceRefStructure"  # Out of scope
    PlaceParam: ## OJP  # Reduced scope
      # topographicPlaceRef:  ## Out of scope
      # continueAt:   # Out of scope
      # includePtModes:   # Out of scope
    #         - $ref: "#/components/schemas/GeoRestriction"   # Out of scope
    #         - $ref: "#/components/schemas/AllowedSystemId"    # Out of scope
    # PlaceInformationResponse:  ## OJP # Out of scope
    #     placeInformationResponseContext:   # Out of scope
    #     continueAt:   # Ouf of scope
    #     placeResults:  # Out of scope
    # PlaceResult: ## OJP # Out of scope
    #     place:  # Out of scope
    #     complete:  # Out of scope
    #     probability:  # Out of scope
    #     modes:  # Out of scope
    TripRequest: ## OJP # Reduced scope
        # notVia:   # Out of scope
        # noChangesAt:   # Out of scope
    # TimeAllowanceStructure:  ## OJP # Out of scope
    # PlacePlaceStructure:  ## OJP Hack # Out of scope
    # PlaceTimeStructure:  ## OJP Hack # Out of scope
    # PlaceContext:  ## OJP # Out of scope
    # StopPointRefStructure:  ## OJP # Out of scope
    # PlaceRef:  ## OJP # Out of scope
        # noStairs:  # Out of scope
        # noEscalator:  # Out of scope
        # noElevator:  # Out of scope
        # noRamp:  # Out of scope
    # NumberOfResultsGroup:  ## OJP # Out of scope
    #   numberOfResultsBefore:  # Out of scope
    #    numberOfResultsAfter:  # Out of scope
    # PtModeChoiceGroup:  ## OJP # Out of scope
    #     ptMode:  # Out of scope
    # PrivateModeFilter:  ## OJP # Out of scope
    #     exclude:  # Out of scope
    #     privateMode:  # Out of scope
    TripDataFilter: ## OJP # Reduced scope
        # lineFilter:  # Out of scope
        # privateModeFilter:  # Out of scope
    # BaseTripPolicy:  ## OJP # Out of scope
    # TripPolicy:  ## OJP # Out of scope
    #    transferLimit:  # Out of scope
    #    optimisationMethod:  # Out of scope
    #    itModesToCover: # Out of scope
    # OptimisationMethod:  ## OJP # Out of scope
    TripParam: ## OJP # Reduced scope
        # optimisationMethod:  # Out of scope
      #  - $ref: "#/components/schemas/BaseTripContentFilter"  ## Out of scope
    TripCollectionResponse: ## OJP  # Reduced scope
        # tripResponseContext:  # Out of scope
    #    TripResult:  ## OJP  # Out of scope
    # ErrorMessage: ## OJP  # Out of scope
    Trip: ## OJP # Reduced scope
        # operatingDays: ## Out of scope
        # situationFullRef: ## Out of scope
    TripLeg: ## OJP  # Reduced scope
        # participantRef:   # Out of scope
    # GeneralAttribute:  ## OJP  # Out of scope
    #     text:  # Out of scope
    #     code:  # Out of scope
    #     mandatory:  # Out of scope
    #     importance:  # Out of scope
    #     url:  # Out of scope
    #     mimeType:  # Out of scope
    #     embeddable: # Out of scope
    # LegAttribute:  ## OJP # Out of scope
    #     - $ref: "#/components/schemas/GeneralAttribute"  # Out of scope
    #         fromStopSeqNumber:  # Out of scope
    #         toStopSeqNumber:  # Out of scope
    # LinkProjection:  ## OJP # Out of scope
    #    positions:  # Out of scope
    # TrackSection:  ## OJP # Out of scope
    #    trackStart:  # Out of scope
    #    trackEnd:  # Out of scope
    #    lineProjection:  # Out of scope
    #    roadName:  # Out of scope
    #    duration:  # Out of scope
    #    length:  # Out of scope
    # LegTrack:  ## OJP # Out of scope
    #   properties:  # Out of scope
    TimedLeg: ## OJP # Reduced scope
        # legAttribute:  # Out of scope
        # operatingDays:  # Out of scope
        # legTrack:  # Out of scope
    # TimeWindow:  ## OJP # Out of scope
    #     timeWindowStart:  # Out of scope
    #     timeWindowEnd:   # Out of scope
    TransferLeg: ## OJP # Reduced scope
        # walkDuration:  # Out of scope
        # bufferTime:  # Out of scope
        # legDescription:  # Out of scope
        # length:  # Out of scope
        # attribute:  # Out of scope
        # pathGuidance:  # Out of scope
        # situationFullRef:  # Out of scope
    ContinuousLeg: ## OJP # Reduced scope
        # legDescription:  # Out of scope
        # length:  # Out of scope
        # pathGuidance:  # Out of scope
        # situationFullRef:  # Out of scope
    # PrivateModesEnumeration:  ## OJP # Out of scope
    # VehicleModesOfTransportEnumeration:  ## OJP  # Out of scope
        # stopPointName: # Out of scope
    #    LegIntermediate:  ## OJP # Out of scope
    #            stopPlace:  # Out of scope
    #            stopPointName:   # Out of scope
    #            plannedQuay:   # Out of scope
    #            status:  # Out of scope
    #    LegAlight:  ## OJP # Out of scope
    #        stopPlace:   # Out of scope
    #        stopPointName:  # Out of scope
    #        nameSuffix:  # Out of scope
    #        plannedQuay:   # Out of scope
    #        estimatedQuay:   # Out of scope
    #        status:   # Out of scope
    DatedJourney: ## OJP # Reduced scope
        # operatingDayRef:  # Out of scope
        # journeyRef:  # Out of scope
    Place: ## OJP # Reduced scope
      #  - $ref: "#/components/schemas/StopPointStructure"  # Out of scope
      #  - $ref: "#/components/schemas/TopographicPlaceStructure"  # Out of scope
        #  - $ref: "#/components/schemas/StopPointStructure"  # Out of scope
        #  - $ref: "#/components/schemas/TopographicPlaceStructure"  # Out of scope
        #  attribute:   # Out of scope
        #  extension:   # Out of scope
    Address: ## OJP # Reduced scope
        # privateCode:  # Out of scope
        # nameSuffix:  # Out of scope
        # topographicPlaceName:  # Out of scope
        # topographicPlaceRef:  # Out of scope
        # crossRoad:  # Out of scope
    PointOfInterest: ## OJP # Reduced scope
        # nameSuffix:  # Out of scope
        # pointOfInterestCategory:  # Out of scope
        # privateCode:  # Out of scope
        # topographicPlaceRef:  # Out of scope
    StopPlace: ## OJP # Reduced scope
        # nameSuffix:  # Out of scope
        # privateCode:  # Out of scope
        # topographicPlaceRef:  # Out of scope
        # - $ref: "#/components/schemas/StopAttributes" # Out of scope
    # StopAttributes:  ## OJP  # Out of scope
    #     wheelchairAccessible:  # Out of scope
    #     lighting:  # Out of scope
    #     covered:  # Out of scope
    # TopographicPlaceStructure:  ## OJP  # Out of scope
    #     toppographicPlace:  # Out of scope
    #     - topographicPlace  # Out of scope
    # TopographicPlace:  ## OJP  # Out of scope
    #     topographicPlaceCode:  # Out of scope  
    #     topographicPlaceName:  # Out of scope
    #     privateCode:  # Out of scope
    #     parentRef:  # Out of scope
    #     referredSystemId:  # Out of scope
    #     area: # Out of scope
    # StopPointStructure:  ## OJP # Out of scope
    #     stopPoint:  # Out of scope
    # StopPoint:  ## OJP # Out of scope
    #         stopPointRef:  # Out of scope
    #         stopPointName:  # Out of scope
    #         nameSuffix:  # Out of scope
    #         plannedQuay:  # Out of scope
    #         estimatedQuay:  # Out of scope
    #         privateCode:  # Out of scope
    #         parentRef:  # Out of scope
    #         topographicPlaceRef:  # Out of scope
    # PrivateCode:  ## OJP  # Out of scope
    #     system:  # Out of scope
    #     value:  # Out of scope
    GeoPosition: ## OJP # Reduced scope
        # altitude:   # Out of scope
        # precision:   # Out of scope
    # Altitude:  ## OJP # Out of scope
    # Precision:  ## OJP # Out of scope
    #     code:  # Out of scope
    #     codeList:  # Out of scope
    # PointOfInterestRef: ## OJP  # Out of scope
    # AddressRef: ## OJP  # Out of scope
    # TopographicPlaceRef:  ## OJP # Out of scope
                  scope:
                  - scope
        scope:
        scope:
      description: scope where the VAT applies
