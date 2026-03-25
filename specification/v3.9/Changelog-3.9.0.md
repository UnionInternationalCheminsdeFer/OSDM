# Changelog v3.9.0

## Modularization

The monolithic `OSDM-online-api-v3.8.0.yml` (18,112 lines) has been split into a modular multi-file structure:

- **Root hub file:** `OSDM-online-api.yml` (~150 lines) — entrypoint that assembles all modules via `$ref`
- **13 schema files** in `schemas/` — organized by domain (`_common`, `trip`, `offer`, `booking`, etc.)
- **24 path files** in `paths/` — organized by API tag/domain
- **3 component files** in `components/` — parameters, responses, security schemes

### Bundled output

For consumers who need a single file: `OSDM-online-api-v3.9.0.bundled.yml` is produced by `redocly bundle` and is structurally equivalent to the v3.8 monolith.

### No functional changes

This version contains no API changes — only the file organization has been restructured for maintainability.
