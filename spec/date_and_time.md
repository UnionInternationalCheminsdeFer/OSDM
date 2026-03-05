---
layout: page
title: Deep dive on dates and times
hide_hero: true
permalink: /spec/dates-and-times/
---

## Table of contents

1. [JSON expression of date-time](#json)
2. [Schedule use](#schedules)
3. [Other uses](#others)

Dates and times are transported across the OSDM API for various purposes.

These purposes can be roughly grouped as follows:

- schedules of modes of transports, both in search requests and in search results
- dates and times for various points in the booking journey

## JSON expression of date-time <a name="json">

Both types of dates and times are expressed as JSON strings with the `format: date-time`
specification.

Such a specification denotes a point-in-time which is - in principle - completely agnostic
of the place where the user resides. Internally, in most systems, it is translated to a number
of seconds since a specific point in time (e.g. in UNIX, since January 1st, 1970 UTC).
The date and time displayed to users is a function of some software doing the translation.

The JSON date-time format is a string formatted according to 
[RFC 3339, section 5.6](https://www.rfc-editor.org/rfc/rfc3339#section-5.6). 
It consists of these main parts

- the date (e.g. `2026-03-02`)
- the time (e.g. `11:28:14`)
- the timezone or offset-specification (e.g. `Z`, or `+01:00`, or `-08:00`)

In the date-time world, the following strings denote exactly the same point-in-time, i.e.
exactly the same number of seconds since the defined origin time:

- `2026-03-02T11:28:14+01:00` (Central European time zone, no daylight savings time)
- `2026-03-02T10:28:14Z` (UTC, aka Zulu time zone)
- `2026-03-02T02:28:14-08:00` (Pacific time zone)

## Schedule use <a name="schedules">

Schedule times are - throughout the passenger transport industry, including land
transport (such as rail), air transport and sea (ferries) - displayed to the customer
not in their local time at the time of request, but always in the local time of the
stations, airports or ports involved. The one notable exception to this is the 
Trans-Siberian Railway, where schedule times are listed in the time zone of Moscow.

In order to correctly interpret a schedule related time (i.e. departure time, arrival time
or the time at intermediate stops), the timezone of the station must be known. This timezone
is obviously dependent on the geographical location of the station, and whether or not
daylight savings time is in operation at the particular point-in-time.

As the OSDM API (following the OJP standard) just transfers a string formatted as a JSON date-time,
to retrieve the **local station times** (i.e. the times used in schedules and search
requests), care must be taken that the timezone string is

- specified correctly for the individual station **at the point in time**
- retained and not lost throughout the various parsing and serialization steps
- used to obtain the local (wall clock) time of the station when displaying it to customers or printing it on customer documents

Another pitfall that should be avoided is to try and calculate running time between stations by subtracting
arrival and departure times. This can and will fail in unexpected ways when trains cross a timezone
boundary - either geographically, or twice a year when daylight savings time is turned on and off. For
this purpose, the `duration` attribute (present at the trip level and at the leg level) should be used.

# Other uses of date and time <a name="other">

Other times - like the time a booking was completed, or the deadline for cancelling
a trip - are typically shown to users in their local time, i.e. the frontend translates
them to the local timezone of the user.

These include

- timestamps within the customer flow, e.g. offer creation, booking time etc.
- validity times of a ticket
- deadlines for customer actions, e.g. booking time limit of an offer, validity of an after sales condition etc.
