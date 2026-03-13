# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with
code in this repository.

## Project Overview

**OSDM** (Open Sales and Distribution Model) is an open-source specification for
a REST API that standardizes rail ticket distribution in Europe. The project is
maintained by Union Internationale des Chemins de Fer (UIC) and released as
IRS-90918-10 Leaflet.

The API specification exists in two main parts:

- **Online API** – REST endpoints for booking, offers, tickets, after-sales
  (YAML format)
- **Offline Model** – Data structures for priced segments and fare information
  (JSON schema)

The Online API operates in two modes:

- **Retailer Mode** – distributes admissions, reservations, and ancillaries
- **Distributor Mode** – adds fares (priced segments) as bookable items

## Repository Structure

```
specification/
  v1.4.0/           # Legacy versions
  v2.0.0/           # Major version 2
  v3.0/ to v3.8/    # Current major version with patch releases
  v4.0/             # Next major version (in development)

  vX.Y/
    OSDM-online-api-vX.Y.Z.yml       # REST API specification
    OSDM-online-webhook-vX.Y.Z.yml   # Webhook specification
    OSDM-offline-model-vX.Y.Z.json   # Offline data model (JSON Schema)
    Changelog-X.Y.Z.md               # What changed in this release
    BreakingChanges.md               # Breaking changes vs previous version
    IRS-90918-10-vX.Y.Z.pdf          # Official UIC document
    README.md                        # Version-specific documentation

mock/
  *.postman_collection.json          # Postman collections for API testing
  *.postman_environment.json         # Postman environments

demo-app/
  src/                              # Empty placeholder for demo applications

test-scenarios/
  OSDM_schema_3.0.0.json           # Schema validation test data
  README.md                         # Test scenario documentation

.redocly.lint-ignore.yaml          # Linting rule exceptions for Redocly
.github/workflows/
  validate-openapi.yml             # CI/CD workflow
```

## Commands for Common Tasks

### Validate OpenAPI Specifications

All specification files are validated using Redocly CLI. The validation runs
automatically on pull requests to `master`.

**Install Redocly CLI:**

```bash
npm install -g @redocly/cli@latest
```

**Validate all specifications:**

```bash
redocly lint --format=github-actions specification/**/*.yml
```

**Validate a single file:**

```bash
redocly lint specification/v3.8/OSDM-online-api-v3.8.0.yml
```

**Validate with detailed output:**

```bash
redocly lint specification/v3.8/OSDM-online-api-v3.8.0.yml --format=stylish
```

### Preview API Documentation

Redocly can generate HTML documentation from the YAML specs:

```bash
redocly build-docs specification/v3.8/OSDM-online-api-v3.8.0.yml -o index.html
```

Then open `index.html` in a browser.

## Key Architectural Patterns

### Versioning Strategy

- Versions follow semantic versioning: `vX.Y.Z` where X=major, Y=minor, Z=patch
- Each version is in its own directory under `specification/`
- Pre-release versions use `-pre` suffix (e.g., `v3.0.8-pre.yml`)
- Current stable version is v3.8.0; v4.0 is in development

### Specification File Naming

For each version directory, you'll find:

- **API spec**: `OSDM-online-api-vX.Y.Z.yml` – Main REST API endpoints
- **Webhooks**: `OSDM-online-webhook-vX.Y.Z.yml` – Webhook event definitions
- **Offline model**: `OSDM-offline-model-vX.Y.Z.json` – JSON Schema for data
  exchange

Multiple patch versions may exist in the same directory (e.g., `v3.0.0` through
`v3.0.8`).

### Redocly Linting

The `.redocly.lint-ignore.yaml` file contains exceptions to standard OpenAPI
validation rules. These are intentional deviations documented for each spec
version. When adding new specs or modifying existing ones:

1. Run `redocly lint` to identify all linting issues
2. For intentional violations, document them in `.redocly.lint-ignore.yaml` with
   the spec path and rule
3. Include a comment explaining why the exception exists
4. Get team review before adding new exceptions

### OpenAPI Structure

The OSDM API specs follow OpenAPI 3.0 structure with these key sections:

- **servers** – API endpoints (different for retailers vs allocators)
- **paths** – REST endpoints organized by resource (journeys, offers, bookings,
  etc.)
- **components/schemas** – Reusable data model definitions
- **components/responses** – Standard response objects
- **components/parameters** – Query/path parameters used across endpoints

## Making Changes to Specifications

### When Modifying a Patch Version

1. Update the specific YAML/JSON file (e.g., `OSDM-online-api-v3.0.5.yml`)
2. Create a new numbered patch file if releasing (e.g.,
   `OSDM-online-api-v3.0.6.yml`)
3. Update `Changelog-X.Y.Z.md` documenting what changed
4. Run `redocly lint` to validate the changes
5. Update `.redocly.lint-ignore.yaml` if any new linting exceptions are needed

### When Creating a New Version

1. Create new directory: `specification/vX.Y/`
2. Copy the previous version's YAML/JSON files as a template
3. Make semantic changes appropriate for the version bump
4. Create `Changelog-X.Y.0.md` documenting all changes from previous version
5. Create `BreakingChanges.md` if upgrading major or minor version
6. Add corresponding webhook spec file
7. Run `redocly lint` to validate

### Offline Model (JSON Schema)

The offline model is a JSON Schema that describes data structures for priced
segments and fare information. When updating:

1. Edit `OSDM-offline-model-vX.Y.Z.json`
2. Ensure schema validity (proper JSON schema syntax)
3. Update corresponding online API spec if adding/modifying shared types
4. Test against sample data in `test-scenarios/` if available

## Common Schema Patterns in OSDM

### Discriminated Unions

Many OSDM responses use discriminated unions (e.g., different `ReductionGranted`
types). Look for `oneOf` with `discriminator` in the spec:

```yaml
discriminator:
  propertyName: type
oneOf:
  - $ref: '#/components/schemas/FixedReduction'
  - $ref: '#/components/schemas/PercentageReduction'
```

### Deprecated Fields

When deprecating API fields, mark them in the schema with `deprecated: true` and
document the replacement in `Changelog-X.Y.Z.md`.

### Extensibility Points

Several schema objects use `additionalProperties` to allow custom fields. This
is intentional for extensibility. Document any commonly-used custom properties
in the changelog.

## Testing and Validation

### JSON Schema Validation

Test data files use the offline model JSON schema. Validate with:

```bash
npm install -g ajv-cli
ajv validate -s specification/v3.0/OSDM-offline-model-v3.0.0.json -d test-scenarios/OSDM_schema_3.0.0.json
```

### Postman Collections

Mock request/response examples exist in `mock/` as Postman collections. These
can be imported into Postman for manual testing against API implementations.

## CI/CD Pipeline

GitHub Actions automatically validates all push and pull requests to `master`:

**Workflow location:** `.github/workflows/validate-openapi.yml`

**What it does:**

1. Checks out the repository
2. Installs Node.js and Redocly CLI
3. Runs `redocly lint --format=github-actions specification/**/*.yml`
4. Reports results as GitHub Actions annotations

**To run locally:**

```bash
npm install -g @redocly/cli@latest
redocly lint --format=github-actions specification/**/*.yml
```

## Important Notes

- **Offline vs Online**: The offline model is for static data exchange (files,
  batch processing). The online API is for real-time interactions (HTTP
  requests).
- **Retailer vs Allocator**: Allocator mode adds fare complexity. Always check
  which mode applies when implementing.
- **UIC IRS-90918-10**: This is the official standard document. When in doubt
  about business requirements, consult the PDF in the version directory.
- **Backward Compatibility**: Breaking changes should only happen in major
  versions. Document carefully in `BreakingChanges.md`.

## Resources

- **Official Specification**: https://osdm.io/
- **GitHub Repository**: https://github.com/UnionInternationalCheminsdeFer/OSDM
- **Documentation Branch**: `gh-pages` (contains rendered HTML docs)
- **Redocly Documentation**: https://redocly.com/docs/cli/
