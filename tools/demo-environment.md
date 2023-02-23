---
layout: page
title: OSDM
permalink: /tools/demo-environment/
---

## Aim

**Tim: please revise**

The aim of the **OSDM Demo Environment** is to provide implementing or
interesting parties access to a _working prototype_ to study the behavior and
semantics of the OSDM API.

The sandbox is kindly provided by [Sqills](https://www.sqills.com) and is open
to _any party_ interested in implementing OSDM.

## Available Network and Services

Currently the **OSDM sandbox** implemented with _S3 Passengers_ supports the
following virtual routes and services:

- First Route: _Amsterdam_ - _Paris_

  The service simulated is a high speed IRT train where the products _admission
  with included reservation_ as well as the ancillary services _luggage_ and
  _bike_ are available.

- Second Route: _Amsterdam_ - _Köln_ - _Frankfurt (Main) Hbf_ - _Basel SBB_ -
  _Thun_

  The service simulated is a high speed train where the products _admission_ as
  well as a _monthly pass_ are available. Additionally a _bus ticket_ to a
  commuting bus is available.

- Third Route: _Basel SBB_ - _Chur_ - _Brig_

  The service simulated is a ICE train that travels from _Basel_ to _Chur_ with
  an optional seat reservation on the first leg. On the second leg there is a
  touristic train running with a included seat reservation as well as mandatory
  ancillaries such as 3 course menu.

If sensible, upon request Sqills will provide additional routes and services.

## Contact

All API activity via the OSDM API takes place with a so-called “agent”. Upon
request, an agent account can be set up for OSDM project partners and a welcome
email message will distribute a username and password combination which is
required to obtain a OAuth2 JWT token with which the actual OSDM calls can be
performed on the API.

To register an account, please send an email including your name, role, company
and a brief explanation of your interest in OSDM to
[support-osdm@sqills.com ](mailto:support-osdm@sqills.com).

![Sqills](../images/logo/Sqills-logo.png)
