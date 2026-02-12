---
layout: page
title: Technical Principles
hide_hero: true
permalink: /spec/technical-principles/
---

## Table of contents

1. [Design Guidelines](#DesignGuidelines)
2. [Derived Guidelines](#DerivedGuidelines)
3. [Versioning](#Versioning)
   1. [Backporting](#Backporting)
   2. [Version tracking](#VersionTracking)
   3. [Development](#Development)
   4. [Release](#Release)
   5. [Negotiating versions](#versionNegotiation)
4. [Version Support](#VersionSupport)
5. [Implementation principles](#Implementationprinciples)
6. [HTTP headers](#httpHeaders)
7. [Caching](#Caching)
8. [Idempotency](#Idempotency) 
9. [Identify Caller](#IdentifyCaller)
10. [Namespaces](#Namespaces)
11. [PATCH behaviour](#PatchBehaviour)
12. [Error Handling](#ErrorHandling)
13. [Functional Errors and Error Codes](#FunctionalErrorsandErrorCodes)
14. [Tracing across systems](#Tracing)
15. [Authentication](#Authentication)
   1. [User Lookup](#UserLookup)


## Design Guidelines <a name="DesignGuidelines">

- **Do not reinvent the wheel** - Use existing concepts whenever possible (e.g.
  type system of OpenAPI, Problem details,...).
- Strive for a Level 3 of
  [REST maturity](https://martinfowler.com/articles/richardsonMaturityModel.html).
- Use [semantic versioning](https://semver.org).

## Derived Guidelines <a name="DerivedGuidelines">

- Whenever a resource returned in a response can contain embedded resources, the
  request must allow specifying whether and which embedded resources should be
  returned in full or as references.
- Follow
  [Zalando RESTful API and Event Scheme guidelines](https://opensource.zalando.com/restful-api-guidelines/)
- Use of the JSON Problem element [RFC9457](https://tools.ietf.org/html/rfc9457).
  See also [Errors and Problems](../errors-problems/).
- Standard Patch operations ([RFC7396](https://datatracker.ietf.org/doc/html/rfc7396)) - not JSON PATCH ([RFC6902](https://datatracker.ietf.org/doc/html/rfc6902)) (see [PATCH behaviour](#PatchBehaviour))
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

## Versioning <a name="Versioning">

[Semantic Versioning](https://semver.org/) is used to mark the OSDM releases. OSDM strictly adheres to the semantics as deviation may hinder implementation project schedules for carriers or distributors.

* **Major** version is increased for any breaking change provided it is not a bug fix of an error that could not be implemented as valid behavior yet. All planned breaking changes are accumulated and a major version is usually developed each 2-3 years unless there is a industry or legal need for immediate breaking change, e.g. change in related open standards, change in technical regulation or change in consumer protection regulation.
* **Minor** version is increased for any planned release that doesn't contain any breaking changes. Usually, there are 3-4 minor versions anually. Minor version doesn't remove or changes API in incompatible way, it may only add new capabilities or mark current capabilities as deprecated.
* **Patch** version is increased for any bug fix of minor version, or backport of a feature from higher major/minor versions. Changes in patch versions retain all capabilities of the minor version and provides backport or bug fix. In terms of testing/certification, all patch versions may be treated as equal provided you check for the features that were corrected by the bug fix/added as backport from higher minor versions.

### Backporting <a name="Backporting">

Implementers may require to receive a newly requested feature to a lower version when there is project schedule in consideration. In such case, the backport is always provided as a new patch version of selected track. New patch versions are released for all minor version between the version where the feature was introduced and version to which it was requested by the implementers to be back-ported.

Backport is never applied to already released patch versions.

### Version tracking <a name="VersionTracking">

All versions are tracked in the `master` branch of the git repository. Each major.minor version has its own folder where all patch versions of that minor version are stored.

### Negotiating versions <a name="versionNegotiation">

A consumer can request a specific version of the API by providing the `Accept` header with the following syntax:
`Accept: application/vnd.uic.osdm+json; version=3.5`.

All messages which contain a payload (both request and response payloads) should indicate the version of the
API used by providing a header `Content-Type: application/vnd.uic.osdm+json; version=3.5.0`

The version indicated in the request (`accept` and/or `Content-Type` header) is typically a minor version (i.e. it has 
two fields, e.g. 3.5). The version indicated in the `Content-Type` header of a response typically gives the full patch 
version (i.e. it has all three fields, e.g. 3.5.0).

### Development <a name="Development">

A pull request is expected to contain changes to the currently developed version.

If a backport is expected, pull request must provide files for a new patch version of all versions being patched.

### Release <a name="Release">

The openapi file is considered final when there is git tag and github release for given version that marks a respective commit where the final version of that file was saved.

## Version Support <a name="VersionSupport">

The OSDM Team supports the following version:

| Version | Remark |
| ----    | ------ |
| 1.x     | no support |
| 2.x     | no support |
| 3.x     | supported  |
| 3.9     | in developement, publication planned for June 2026 |
| 4.x     | in developement, no publication date yet |

## Implementation principles <a name="Implementationprinciples">

Implementations must follow the tolerant reader pattern. Schema validations must allow new attributes and objects. All extensible enums must not fail on items not proposed from the openapi or specification.

## HTTP headers <a name="httpHeaders">

In general, HTTP headers are used as specified in the relevant RFCs and as defined as the
[relevant section](https://opensource.zalando.com/restful-api-guidelines/#using-headers) of the 
[Zalando RESTful API and Event Scheme guidelines](https://opensource.zalando.com/restful-api-guidelines/).

Specifically, within the OSDM API definition, the following headers are used:

| Header name        | Reference                                               | Description                                                   |
|--------------------|---------------------------------------------------------|---------------------------------------------------------------|
| Accept             | [Negotiating versions](#versionNegotiation)             | Select the API version                                        |
| AcceptLanguage     | [Interface language](../language#Interfacelanguage)     | Select the language(s) of the response                        |
| Authorization      | [Authentication](../authentication)                     | Authenticate and authorize the user of the API                |
| Cache-Control      | [Caching](#Caching)                                     | Caching control                                               |
| Content-Language   | [Interface language](../language#Interfacelanguage)     | Language of translatable strings in the payload               |
| Content-Type       | [Negotiating versions](#versionNegotiation)             | Describes the API version of the payload (from 3.6)           |
| ETag               | [Large datasets](#LargeDatasets)                        | Version tag for caching response filed                        |
| Expires            | [Caching](#Caching)                                     | Expiration timestamp for caching                              |
| IdempotencyKey     | [Idempotency](#Idempotency)                             | Add idempotency to endpoints which require this               | 
| If-None-Match      | [Large datasets](#LargeDatasets)                        | Check against the ETag value given                            |
| Location           | [Large datasets](#LargeDatasets)                        | Location (URN) of the dataset within the "See other" response |
| Requestor          | [Identify caller](#IdentifyCaller)                      | Distinguish between sales channels on the consumer side       |
| TraceParent        | [Tracing across systems](#Tracing)                      | Used for tracing - see W3C specification                      |
| TraceState         | [Tracing across systems](#Tracing)                      | Used for tracing - see W3C specification                      |
| x-accept-namespace | [Namespaces](#Namespaces)                               | Negotiate (potentially proprietary) namespaces                |

## Caching <a name="Caching">

Some endpoints may give hints to the invoker on how long the retrieved data may be cached. They use the `Cache-Control` and 
`Expires` headers for this purpose according to the relevant http standards.

This feature is primarily used for master data retrieval.

## Large data sets <a name="LargeDatasets">

Some master data endpoints can return extremely large datasets. As this is impractical for a synchrounous http response, these endpoints
can return `303 See other` instead of `200 OK` and the data.

This is optional and has currently (as of OSDM Version 3.5) only been defined for `GET /places`.

The behaviour is as described in the various HTTP standards and uses the headers `ETag`, `if-None-Match`, `Location`

This could be extended to other large and cacheable master data sets, e.g. products and coach layouts.

## Idempotency <a name="Idempotency">

To add idempotency to endpoints which do not naturally have it. Endpoints with the HTTP verbs `GET` and `PUT` do not need this, as they
are naturally idempotent.

The idempotency header is generally added to endpoints with the `POST` verb, and to endpoints with the `PATCH` verb which change
state of underlying objects.

The [IETF Draft](https://datatracker.ietf.org/doc/draft-ietf-httpapi-idempotency-key-header/) is the relevant normative reference.

The general recommended behaviour is as follows:

1. The consumer of the interface sets the value of the idempotency key header to a unique value, ideally a UUID
2. Should the consumer perform a retry, the same value must be repeated in the idempotency key
3. When the provider receives the same request with a repeated idempotency key, 

   a. it **must not** repeat the changes to internal states of objects

   b. it **must** return the identical answer as for the original request

4. The provider needs to retain the idempotency key for a sufficient time, typically as long as the original request is allowed

## Identify caller <a name="IdentifyCaller">

Some providers offer certain tariffs only to online channels or to staffed sales channels. For this purpose, providers and consumers
can bilaterally agree on strings transported in the `Requestor` header to identify the sales channel to the provider.

## PATCH behaviour<a name="PatchBehaviour">

As specified above, PATCH within OSDM is consistent with JSON Merge Patch ([RFC7396](https://datatracker.ietf.org/doc/html/rfc7396)). This means
- absent attributes are ignored (i.e. the attribute retains its previous value/state)
- null attributes will be removed
- present attributes will be updated
- new attributes will be added

## Error Handling <a name="ErrorHandling">

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

## Functional Errors and Error Codes <a name="FunctionalErrorsandErrorCodes">

In order that OSDM implementations behave consistently in error situations, a
list of [error codes and problem codes](../errors-problems/) have been defined that
must be supported in case of functional errors by all implementations.

## Tracing across systems <a name="Tracing">

To allow tracing across systems, the W3C has specified the 
[trace context](https://www.w3.org/TR/trace-context/). This functionality uses
the `traceparent` and `tracestate` headers to transport the relevant information.

In a chained implementation, each member of the chain needs to add their own 
tracing information to the left of the incoming `tracestate` value before sending
it further down the line.

The values transported here **should** be logged locally, so that when debugging across
systems is required, log entries concerning the same invocation can be retrieved from
both systems.

## Authentication <a name="Authentication">

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

### User Lookup <a name="UserLookup">

From a devOps perspective it might by hard to control who uses your API (for
e.g. `ClientId` and secret might by passed around or hacked).

The following issues should be defined outside of OSDM:

- Additional legal contracts with consumer
- IP white listing
- Mapping of related user properties to the technical `ClientId`
