---
layout: page
title: Persons with reduced mobility (PRMs) and accessability
hide_hero: true
permalink: /spec/prm_and_access/
---

## Table of contents

1. [Introduction](#introduction)
2. [Companion requirements](#companion)
3. [Wheelchairs](#wheelchair)
4. [Assistance Requirements](#assistance)

## Introduction <a name="introduction">

Persons with reduced mobility (PRMs) and people with other accessibility requirements
are an important customer base for the sale of public transport tickets.

Furthermore, there are multiple laws and EU regulations covering these requirements.
Many of these laws are national laws and the regulations are not internationally aligned.
In most countries, however, a 'disability card' is given to PRMs. With this card the PRMs
can prove their status. The card typically defines which specific rights a PRM has as a
traveler.

Regarding transport by rail, the major requirements are within these subject areas:

- persons who need a permanent companion
- the necessity to transport a person with a wheelchair
- assistance requirements, especially for loading and unloading a wheelchair to and from a vehicle
- trip search adjustments, e.g. 'no step' at stations or increased walk time

These requirements and their relationship to the OSDM standard are covered in this document.

## Companion requirements <a name="companion">

If a permanent companion is required for a person with disabilities, the person is given a
disability card with a specific mark in order to prove this requirement. Usually, the companion
travels for free or for an extremely reduced price.

These rights are subject to national laws and carrier specific tariff regulations.

In OSDM, the right to have a companion under PRM rules is specified in the offer search (`POST /offers`)
by specifying the value `COMPANION` in `AnonymousPassengerSpecification.prmNeeds`.

This value should be specified at the entry for the PRM. In most cases it is required that, if the
party consists of the PRM and multiple companions, the price is reduced for the 'most expensive'
traveler accompanying the PRM.

If the offer request is successfully handled, one of the passengers besides the PRM will become
the companion and will be marked accordingly in the offer response.

## Wheelchairs <a name="wheelchair">

Seats for wheelchair users have specific properties:

- space to store the wheelchair while traveling
- close to accessible toilet
- easier access to these seats, e.g. wider doors or aisles

Therefore, there is a limited number of wheelchair places available on typical long distance
trains. To manage these places, wheelchair requirements must be specified when requesting an offer
by specifying the value `WHEELCHAIR` in `AnonymousPassengerSpecification.prmNeeds`.

The provider system should, if this is specified, request the seats appropriate for the wheelchair
users from the seat inventory. If no more appropriate seats are available on a given
trip or section, no offer should be returned.

In a multi-person offer request, the value `COMPANION_SEAT` in `AnonymousPassengerSpecification.prmNeeds`
can be used to specify who will be assigned the seat beside the wheelchair seat. It is not appropriate
to use this value when no person with `prmNeeds = WHEELCHAIR` is included in the party for which the
offer is requested.

## Assistance requirements <a name="assistance">

The type of assistance which is required in almost all cases is help to load or unload a
wheelchair and the passenger to and from the vehicle.

Some vehicles are low-floor, but in many cases either vehicle-based or station-based
loading equipment will be needed.

The station-based assistance is typically not provided by the carrier ('Railway undertaking')
but by the infrastructure provider. Furthermore, requesting this assistance is a manual
process in many cases and not automated or connected to the selling system.

If the manual booking of assistance fails, it should be possible to cancel the booking by
providing the value `PRM_SUPPORT_UNAVAILABLE` as overruleCode in a refundOffer request.

## Trip search extensions <a name="tripsearch">

PRMs typically cannot use stairs to reach a platform. This means that for a trip to be accessible
for PRMs, the way to the platform at the originating station, the way between platform at any
changes and the way from the platform at the terminating stations must be navigatable without
the use of stairs.

Visually impaired people may need specific aids (e.g. braille symbols on handrails) in order to 
navigate the station.

To specify these requirements to the trip search engine, the policy filter of the trip parameters (`TripSearchCriteria.parameters.policyFilter`) needs to have
the appropriate flags set:
- `noSingleStep` for wheelchair users who cannot use stairs
- `noSight` for visually impaired passengers

The use of these attributes requires the relevant timetable data to be available to the underlying journey planner. This may or may not be the case
and should be clearly indicated by the party providing the journey planner.

In order to support travelers which need more time to transfer between trains,
other attributes can be used, which reside in `TripSearchCriteria.parameters.mobilityFilter`:

- `walkSpeed` (as a percentage, with the default of 100 indicating 'average' speed) can be set to a value lower than 100
- `additionalTransferTime` and `minimalTransferTime` are time values (specified as durations)



