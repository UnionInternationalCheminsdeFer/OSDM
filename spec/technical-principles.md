---
layout: page
title: Technical Principles
hide_hero: true
permalink: /spec/technical-principles/
---

## Design Guidelines

- **Do not reinvent the wheel** - Use existing concepts whenever possible (e.g.
  type system of OpenAPI, Problem details,...).
- Strive for a Level 3 of
  [REST maturity](https://martinfowler.com/articles/richardsonMaturityModel.html).
- Use [semantic versioning](https://semver.org).

## Derived Guidelines

- Whenever a resource returned in a response can contain embedded resources, the
  request must allow specifying whether and which embedded resources should be
  returned in full or as references.
- Follow
  [Zalando RESTful API and Event Scheme guidelines](https://opensource.zalando.com/restful-api-guidelines/)
- Use of the JSON Problem element [RFC9457](https://tools.ietf.org/html/rfc9457).
  See also [Errors and Problems](../errors-problems/).
- Standard Patch operations ([RFC7396](https://datatracker.ietf.org/doc/html/rfc7396)) - not JSON PATCH ([RFC6902](https://datatracker.ietf.org/doc/html/rfc6902))
- A resource is either represented in full or as a reference. The reference
  element has the name of the resource post-fixed with "Ref". References
  normally only contains the URL to the referenced resource and a title element
  allowing to summarize the resource in one short string
- Although examples or recommendations are provided as to which information
  should best be represented in the title string, each implementor as the
  freedom to modify it to best suit his needs.
- Enumerations for very stable entities with limited set only, otherwise code
  lists. Stations codes are code lists.
  See also [Catalog of code lists](../catalog-of-code-lists/).
- Where possible, existing UIC code lists should be favored.
- Creation/ modification calls return the created/modified resource (not just an
  ok code)

## Versioning

[Semantic Versioning](https://semver.org/) is used to mark the OSDM releases. OSDM strictly adheres to the semantics as deviation may hinder implementation project schedules for carriers or distributors.

* **Major** version is increased for any breaking change provided it is not a bug fix of an error that could not be implemented as valid behavior yet. All planned breaking changes are accumulated and a major version is usually developed each 2-3 years unless there is a industry or legal need for immediate breaking change, e.g. change in related open standards, change in technical regulation or change in consumer protection regulation.
* **Minor** version is increased for any planned release that doesn't contain any breaking changes. Usually, there are 3-4 minor versions anually. Minor version doesn't remove or changes API in incompatible way, it may only add new capabilities or mark current capabilities as deprecated.
* **Patch** version is increased for any bug fix of minor version, or backport of a feature from higher major/minor versions. Changes in patch versions retain all capabilities of the minor version and provides backport or bug fix. In terms of testing/certification, all patch versions may be treated as equal provided you check for the features that were corrected by the bug fix/added as backport from higher minor versions.

### Backporting

Implementers may require to receive a newly requested feature to a lower version when there is project schedule in consideration. In such case, the backport is always provided as a new patch version of selected track. New patch versions are released for all minor version between the version where the feature was introduced and version to which it was requested by the implementers to be back-ported.

Backport is never applied to already released patch versions.

### Versioning

All versions are tracked in the `master` branch of the git repository. Each major.minor version has its own folder where all patch versions of that minor version are stored.

### Development

A pull request is expected to contain changes to the currently developed version.

If a backport is expected, pull request must provide files for a new patch version of all versions being patched.

### Release

The openapi file is considered final when there is git tag and github release for given version that marks a respective commit where the final version of that file was saved.

## Implementation principles

Implementations must follow the tolerant reader pattern. Schema validations must allow new attributes and objects. All extensible enums must not fail on items not proposed from the openapi or specification.

## Authentication

The following three design principles are binding for each implementor:

1. Don't reinvent crypto, thus we are using **OAuth2**.

2. The JWTs in use for the authentication should be **short-lived** (think of
   timeout duration single-digit multiples)

3. The JWTs sent by the consumer, regardless of where they are generated, must
   be **digitally signed** using a private key for which the provider is able to
   find the matching public key

These principles can be implemented as follows:

- A **registration service** allows a consumer to register the necessary data
  (like: organization, technical admin, commercial admin, support line, other
  non-functional requirements like throttling limits) for approvement by the
  team providing access. any registered consumer will be approved or rejected if
  approved a unique, technical "ClientId" results and will be passed to the
  consumer

- A **login service** allows to request a valid token (for e.g. OAuth2) by the
  registered ClientId and related secret per configuration the validity duration
  of the token may be set (for e.g. 10min.), after that the token must be
  renewed by the consumer optionally the token might be revoked (for e.g. if
  your devOps realizes the consumer does not behave as expected)

In multi-environments (like DEV, TEST, INT, PROD) consumers might register for
each environment separately.

The detailed flow for machine-to-machine authentication can be found in
[Authentication](../authentication/).

### User Lookup

From a devOps perspective it might by hard to control who uses your API (for
e.g. `ClientId` and secret might by passed around or hacked).

The following issues should be defined outside of OSDM:

- Additional legal contracts with consumer
- IP white listing
- Mapping of related user properties to the technical `ClientId`
