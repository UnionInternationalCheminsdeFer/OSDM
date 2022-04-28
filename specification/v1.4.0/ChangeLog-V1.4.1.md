# Change Log for V1.4.1

- Proper using of discriminator, property, required, oneOf, allOf
- Fix links to always support arrays
- Specific error types
- Complete OAuth2
- Remove this 'additionalProperties' from the AccommodationSubType schema.
- Rename situationFullRef to situationFullRefs.
- Redundancy in information in LegBoard (and some other schemas): remove name
- Fix inconsistency in naming of OJP for Alight/Board/Intermediate
- Remove 'default: xxx' from enums in all schemas.
- Rename "abstract" to "summary" as abstract is a keyword in Java and other languages
- Resolve recursion in regional validity - back port of v.1.5 fix (#266)
- Add "PurchaserSpecification" to BookingRequest - back port of v1.5 fix (#267)
