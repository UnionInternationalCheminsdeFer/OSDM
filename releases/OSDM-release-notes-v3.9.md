---
layout: page
title: OSDM Release Version 3.9
hide_hero: false
permalink: /releases/OSDM-release-notes-v3.9/
---

## What's New in OSDM Version 3.9

### Modularization of the Online API Specification

The monolithic `OSDM-online-api-v3.8.0.yml` (18,112 lines) has been restructured into a modular multi-file format:

- **Root hub file:** `OSDM-online-api.yml` (~150 lines) — entrypoint that assembles all modules via `$ref`
- **24 path files** in `paths/` — one per API domain (trips, offers, bookings, fulfillments, etc.)
- **15 schema files** in `schemas/` — organized by domain (`_common`, `trip`, `offer`, `booking`, `person`, `transportable`, etc.)
- **3 component files** in `components/` — parameters, responses, security schemes

A bundled single-file output (`OSDM-online-api-v3.9.0.bundled.yml`) is provided for consumers who require it.

### New Schemas

- **`person.yml`** — person and company identification, replacing the former `passenger.yml` references
- **`transportable.yml`** — vehicle, car, motorcycle, and related transport schemas

### No Functional API Changes

This version contains no changes to the API surface — only the file organization has been restructured for maintainability and long-term extensibility.

### Breaking Changes

None. This version is fully backwards compatible with version 3.8.
