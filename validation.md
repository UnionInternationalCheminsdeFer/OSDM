# Validation & Verification Process (Draft)

## Vision

We are envisioning a level of compatibility of the OSDM implementations that allows to connect to each other with **no technical modification** needed on both parties end, thus neither for the provider nor the consumer.

Connecting to another party is thus reduced to commercial negotiations on the contractual terms and no longer needs a lengthy and costly implementation phase.

## Requirements

To reach this vision we need an **exhaustive and automated test set**. Exhaustive because we want to assure a high level of compliance and automated as a frequent and thorough testing can not be done manually.

This set will be used to **guarantee compliance**.

This set of tests can also be used as **consumer driven contracts** for each party to test its implementation.

In a first estimation, a test set containing more than 100 test sets will be needed based on the current.

## Process

1. A party test the implementation with the consumer driven contracts.
2. To acquire the statement of compliance the implementation is provided to an independent entity for verification.
3. The independent entity tests the implementation and verifies the compliance.

## Roles

We need an **independent entity** with the **right technical skills** to validate the correctness of the implementation.

This entity is in charge to **maintain the test sets** needed for a party to test.

This entity is also authorized to issue a **statement of compliance**.

## Todo

- Assign entity with the correct skills.
- Order the entity to set up test sets and test automation. This will also imply having mocks.
- Build a representative test set. Proposal: Every party shares their test set with all the parties.