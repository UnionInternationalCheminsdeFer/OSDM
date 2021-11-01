        departureTime:   # EXT Array out of Scope
        destination:  # EXT Array out of Scope
        via:  # EXT Array out of Scope
    VehicleFilter: ## OJP # EXT
        carrierFilter: # EXT
        serviceBrandFilter: # EXT
          $ref: "#/components/schemas/Place" # EXT no support for array
          $ref: "#/components/schemas/Place" # EXT no support for array
        seqId: # EXT
        legBoard: # EXT: use Place instead of LegBoard
        legIntermediates: # EXT: use Place instead of LegIntermediate
        legAlight: # EXT: use Place instead of LegAlight
        duration: # EXT add attribute for consistency
    LegStop: ## EXT OJP LegStop unifies LegBoard, LegIntermediate, LegAlign
          $ref: "#/components/schemas/StopPlace" ## EXT
        serviceArrival: # EXT directly inline service time
        serviceDeparture: # EXT directly inline service time
        vehicleNumber: # EXT Fix to OJP submitted, see https://github.com/VDVde/OJP/issues/173
        ptMode: # EXT
      #  - name  # EXT no longer mandatory as being passed in a trip
      #  - shortName  # EXT no longer mandatory as being passed in a trip
      #  - pointOfInterestName  ## EXT no longer mandatory as being passed in a trip
      #   - pointOfInterestClassification  #EXT no longer mandatory
        #  - stopPlaceName  # EXT no longer mandatory as being passed in a trip
    StopPlaceRef: ## OJP  # EXT add code list
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
          $ref: "#/components/schemas/StopPlace" # EXT Changed from StopPoint
              $ref: "#/components/schemas/StopPlaceRef" # EXT Changed from StopPoint
              $ref: "#/components/schemas/StopPlaceRef" # EXT Changed from StopPoint
