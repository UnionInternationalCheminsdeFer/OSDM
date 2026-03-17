# Fix 11 `no-invalid-schema-examples` lint warnings in Online API spec

## Summary

`redocly lint` reports 11 warnings where `example` values don't conform to their declared schema types. These have been present since at least v3.8 and carry over into v3.9.

## Warnings

All 11 are violations of the `no-invalid-schema-examples` rule: "Example value must conform to the schema."

### 1. Numeric examples on `string` fields (6 warnings)

The `plannedStopPointName` and `estimatedStopPointName` properties on `Board`, `Alight`, and `Intermediate` are typed `string` but have numeric examples (`3`, `8`). These represent platform/bay numbers and should be quoted strings.

| Schema | Property | Example | Fix |
|--------|----------|---------|-----|
| `Board` | `plannedStopPointName` | `3` | `"3"` |
| `Board` | `estimatedStopPointName` | `8` | `"8"` |
| `Alight` | `plannedStopPointName` | `3` | `"3"` |
| `Alight` | `estimatedStopPointName` | `8` | `"8"` |
| `Intermediate` | `plannedStopPointName` | `3` | `"3"` |
| `Intermediate` | `estimatedStopPointName` | `8` | `"8"` |

**Source files:** `schemas/ojp/trip.yml` (Board, Alight, Intermediate)

### 2. Numeric `houseNumber` examples (2 warnings)

`Address.houseNumber` and `PostalAddress.houseNumber` are typed `string` but have numeric example `7`.

| Schema | Property | Example | Fix |
|--------|----------|---------|-----|
| `Address` | `houseNumber` | `7` | `"7"` |
| `PostalAddress` | `houseNumber` | `7` | `"7"` |

**Source files:** `schemas/ojp/_common.yml` (Address), `schemas/_common.yml` (PostalAddress)

### 3. Invalid duration format (1 warning)

`TripMobilityFilter.additionalTransferTime` is typed `string` with `format: duration` but has example `0S` instead of the ISO 8601 duration format `PT0S`.

| Schema | Property | Example | Fix |
|--------|----------|---------|-----|
| `TripMobilityFilter` | `additionalTransferTime` | `0S` | `PT0S` |

**Source file:** `schemas/ojp/trip.yml`

### 4. Invalid URI format (1 warning)

`Warning.instance` is typed `string` with `format: uri` but has example `offers/offer1234` which is a relative path, not a valid URI.

| Schema | Property | Example | Fix |
|--------|----------|---------|-----|
| `Warning` | `instance` | `offers/offer1234` | `/offers/offer1234` or `urn:example:offers/offer1234` |

**Source file:** `schemas/_common.yml`

### 5. Array example mismatch (1 warning)

`PlacePreferenceGroup.preferences` is an `array` of `string` but has a scalar example `WINDOW` instead of an array.

| Schema | Property | Example | Fix |
|--------|----------|---------|-----|
| `PlacePreferenceGroup` | `preferences` | `WINDOW` | `[WINDOW]` |

**Source file:** `schemas/place.yml`

## Impact

These are all cosmetic issues — they don't affect API behavior or code generation. Fixing them would make the spec cleanly pass `redocly lint` with zero warnings.
