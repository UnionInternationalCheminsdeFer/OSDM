---
layout: page
title: Fulfillment on Wallets and Chip Cards
hide_hero: true
permalink: /spec/fulfillment-wallet-chip-card/
---

## Table of contents

1. [Introduction](#introduction)
2. [Use Cases](#usecases)


## Introduction <a name="introduction">

The fulfillment on wallets and chip cards is supported by OSDM. The fulfillment options available on the client side need to be indicated in the offer request. The resulting fulfillments 
at the end of the booking process need to indicate clearly how the fulfillment needs to be handled by the client.

The fulfillment on wallets and chip cards have some similarities as in both cases the fulfillment requires additional components on the client side.

## Use Cases <a name="usecases">

### Fulfillment on wallets

A fulfillment on wallets requires an installed wallet on the traveler side. 

If a wallet is available the offer request indicates this by:

 - FulfillmentType: ETICKET
 - FulFillmentMediaType: WALLET  (or PKPASS in older versions, PKPASS is deprecated with v3.8)

With version 3.8 it is possible to provide a dedicated applications provider (GOOGLE, APPLE, ..) for specific wallets, however it is recommended to always provide fulfillment documents for both the Apple and Google wallets.

There are multiple options to provide the fulfillment:

**Option 1: providing the wallet file**:

  FulfillmentDocument:
    FulFillmentMediaType: WALLET  (or PKPASS in older versions, PKPASS is deprecated with v3.8)
    DocumentMedia: application/vnd.apple.pkpass
    applicationProvider: might be empty. .pkpass files are supported by multiple wallets including google and apple wallets. 
    content: file content of the pkpassfile
    or
    downloadLink: direct download link of the file content

  FulfillmentDocument:
    FulFillmentMediaType: WALLET  (or PKPASS in older versions, PKPASS is deprecated with v3.8)
    DocumentMedia: application/json
    applicationProvider: GOOGLE    the application provider is needed as there is no dedicated media type for google wallet files, they are provided as JWT.
    content: file content of the google walet file
    or
    downloadLink: direct download link of the file content
 
**Option 2: providing a download site**

  Fulfillment:
     _links: download links for the customer or traveler to download the wallet files and if needed the wallet applications. This could be a common link for multiple wallet file formats.
    

### Fulfillment on chip cards

A fulfillment on chip cards requires additional software on the client side to handle the chip card. This is usually provided by the distributor or is a common chip card module for dedicated cards.

Whether such an application is available must be indicated in the offer request:

  - FulfillmentType: PASS_CHIP
  - FulFillmentMediaType: DISTRIBUTOR_APP

  With version 3.8 there are additional options to indicate the available modules to handle cards:

  - applications: a list of applications supported
  - specifications: a list of card sepcifications in case any implementation of the specification is acceptable

  It is recommended to request the application and card names to be published in an OSDM code list.

  The data for the card depend on the proprietary solution that handles the card. This might just be the fulfillmentDocument.controlNumber in case the local DISTRUBUTOR_APP module 
  internally accesses the distributor or additional data provided as content.

  **Using controlNumber only:**
  - DocumentMedia: any
  - applicationProvider: XYZ-LIB: 
  - controlNumber: ticketId 
    content: empty
    downloadLink: empty

  **Using additional content:**
  - DocumentMedia: application/json
  - applicationProvider: XYZ-LIB
    content: content needed by the local application to write the card
    or
    downloadLink: direct download link of the file content


