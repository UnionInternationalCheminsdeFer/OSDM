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
- Use of the JSON Problem element
- Standard Patch operations (not JSON PATCH)
- A resource is either represented in full or as a reference. The reference
  element has the name of the resource post-fixed with "Ref". References
  normally only contains the URL to the referenced resource and a title element
  allowing to summarize the resource in one short string
- Although examples or recommendations are provided as to which information
  should best be represented in the title string, each implementor as the
  freedom to modify it to best suit his needs.
- Enumerations for very stable entities with limited set only, otherwise code
  lists. Stations codes are code lists.
- Where possible, existing UIC code lists should be favored.
- Creation/ modification calls return the created/modified resource (not just an
  ok code)

## Versioning

[Semantic Versioning](https://semver.org/) is used to mark OSDM releases. OSDM strictly adheres to the semantics as deviation may hinder implementation project schedules for carriers or distributors.

* **Major** version is increased for any breaking change provided it is not a bug fix of an error that could not be implemented as valid behavior yet. All planned breaking changes are accumulated and a major version is usually developed each 2-3 year unless there is industry or legal need for immediate breaking change, e.g. change in related open standards, change in technical regulation or change in consumer protection regulation.
* **Minor** version is increased for any planned release that doesn't contain breaking changes. Usually, there are 3-4 minor versions anually. Minor version doesn't remove or changes API in incompatible way, it may only add new capabilities or mark current capabilities as deprecated.
* **Patch** version is increased for any bug fix of minor version, or backport of features from higher major/minor versions. Changes in patch versions retains all capabilities of the minor version and provides backport or bug fix. In terms of testing/certification, all patch versions may be treated as equal version provided you check for the features that were corrected by the bug fix/added as backport from higher minor versions.

### Backporting

Vendors may require to receive a newly requested feature to an lower version when there is project schedule in consideration. In such case, the backport is always provided as a new patch version of selected track. New patch versions are released for all minor version between the version where the feature was introduced and version where it was requested by the vendor.

Backport is never applied to already released patch versions.

### Versioning

All versions are tracked in the `master` branch of the git repository. Each major.minor version has its own folder where all patch versions of that minor version are stored.

### Development

A pull request is expected to contain changes to the currently developed version.

If a backport is expected, pull request must provide files for a new patch version in any version being patched.

### Release

The openapi file is considered final when there is git tag and github release for given version and marks a respective commit where the final version of that file was saved.

## Implementation principles

Implementations must follow the tolerant reader pattern. Schma validations must allow new attributes and objects.

## Error Handling

In order to communicate errors to a consumer we support
[RFC 9457](https://tools.ietf.org/html/rfc9457).

This RFC defines a "problem detail" as a way to carry machine- readable details
of errors in a HTTP response to avoid the need to define new error response
formats for HTTP APIs.

A problem details object can have the following members:

- `type`: A URI reference [RFC3986](https://tools.ietf.org/html/rfc3986) that
  identifies the problem type. This specification encourages that, when
  dereferenced, it provide human-readable documentation for the problem type
  (e.g., using HTML [W3C.REC-html5-20141028]). When this member is not present,
  its value is assumed to be "about:blank".
- `title`: A short, human-readable summary of the problem type. It SHOULD NOT
  change from occurrence to occurrence of the problem, except for purposes of
  localization (e.g., using proactive content negotiation; see
  [RFC7231](https://tools.ietf.org/html/rfc7231), Section 3.4).
- `status`: The HTTP status code
  ([RFC7231](https://tools.ietf.org/html/rfc7231), Section 6) generated by the
  origin server for this occurrence of the problem.
- `detail`: A human-readable explanation specific to this occurrence of the
  problem.
- `instance`: A URI reference that identifies the specific occurrence of the
  problem. It may or may not yield further information if dereferenced.

Consumers MUST use the `type` string as the primary identifier for the problem
type; the `title` string is advisory and included only for users who are not
aware of the semantics of the URI and do not have the ability to discover them
(e.g., offline log analysis). Consumers SHOULD NOT automatically dereference the
type URI.

## Functional Errors and Error Codes

In order that OSDM implementations behave consistently in error situations, a
list of [error codes and warnings](../errors-warnings/) have been defined that
must be supported in case of functional errors by all implementations.

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
