---
layout: page
title: Organization
permalink: /organization/
---

## Evolution Process

As customer and business **needs change**, the specification needs to evolve
continuously. To address the need for improvement the project has been setup in
an **agile manner**.

### Basic Concepts

A specification as a **product** which is managed as follows:

- We have a backlog of improvements where everybody can contribute.
- An improvement addresses a need and solves a problem, thus producing **value**.
- The **OSDM executive committee** (Chair: [Marc Guigon](https://www.linkedin.com/in/marcguigon/) & [Vittorio Carta](https://www.linkedin.com/in/vittorio-carta-mba-0b90b728/)) prioritizes the backlog based on the value
  for the **railway customer** and the **railway sector** as a whole.
- The **OSDM executive committee** is a **fair representation** of the parties
  involved, thus railways and distributors and others.
- The **OSDM technical working group** (Chair: [Clemens Gantert](https://www.linkedin.com/in/clemens-g-88783725/) & [Andreas Schlapbach](https://www.linkedin.com/in/andreas-schlapbach-09b095ab/)) designs and implements improvements to
  the standard. To stay focused, the work in progress should not be larger than
  five items.
- The **OSDM technical working group** takes special care not to break
  existing implementations, thus **securing investments** made by all the
  parties.

Illustration of the concepts:

![Organization](../images/organization/organization.svg)

### Structure of an Improvement

An improvement is structured similar to an [epic](https://www.scaledagileframework.com/epic/)
in the [SAFe](https://www.scaledagileframework.com/) framework as follows:

- **Name**: Short name for the improvement
- **Owner**: Name of the owner
- **Description**
  "For *customers* who *do something* the *solution*  is a *improvement*
  that *provides this value* unlike *current solution or non-existing solution*
  our solution *does something better*."

- **Business Value**: The business value which is generated after the improvement
  has been implemented (low/middle/high).

### State of an Improvement

An improvement takes the following steps:

- An improvement is in the initial state **proposed**.
- The steering board then decides which improvements to analyze based on their
  business value → state **accepted for analysis**.
- The technical experts then analyses the improvement and determine its
  complexity (low/middle/high). After their work the improvement is in state
**analyzed**.
- The steering board decides which improvements are to be implemented based on
  a **transparent** prioritization model (e.g. Weighted Shortest Job First) →
state **accepted for design**.
- The technical experts then design the solution, thus the API, the
  documentation and the test sets. After their work the improvement is in state
**designed**.
- The steering board releases **major, i.e. breaking changes** → the
  improvement is **published**.

## Working Mode

The technical working group meets online every Friday from 9:00 to 11:00.
Participation is open to everybody and highly encouraged. If you wish to join, please contact
[Schlapbach Andreas](https://www.linkedin.com/in/andreas-schlapbach-09b095ab/).

## Road Map

The specification, i.e., the product is improved in fixed-length time boxes similar to
a [program increment](https://www.scaledagileframework.com/program-increment/)
in the [SAFe](https://www.scaledagileframework.com/) framework.

The following increments are planned:

| Product Increment | End Date   | Improvements in Scope |
|------|:----------:|------------|
| `PI-0` | 17.12.2020 | Reduce the complexity of the online model (I-0), Add support for round trips (I-11), Add support for Universal Rail Ticket (I-12), Let the customer choose offers per segments independently (I-14), & Add support for stock control numbers (I-15) |
| `PI-1` | 11.02.2021 | Support for stateless offers/booking processes (I-2), Add support for a fee (I-5), Enable combination rules between offers (I-1), Add binary in fulfillment messages (I-9) |
| `PI-2` | 24.06.2021 |
| `PI-3` | 28.10.2021 |
