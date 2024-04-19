# Languages specifications and usage in OSDM

## General elements:
- for reference data (including places), we specifically have a translation structure, so no need for language element there
- we do not translate errors & warnings

## Interface language
- For interface language, we rely on the accept-language header. Note however that the header is only available in calls where it is relevant.
- Language mismatch between requested languages and available languages does not lead to an error. Instead the provider will provide localized content in english, or if not available, one of the official languages of the issuing country, with a warning in the response

## Communication language (emails etc)
- For communication language (emails etc), we refer to the purchaser preferred language, or the passenger language if possible and applicable.
- Language mismatch between requested languages and available languages does not lead to an error. Instead the provider will provide localized content in english, or if not available, one of the official languages of the issuing country, with a warning in the response

## Fulfillment language
- To specify the desired language for generating the fulfillment, a specific field "fulfillmentLanguage" is available in the verbs leading to generation. That field is optional.

- If omitted or not available, (one of) the language(s) of the issuing country is used as default in case a language was specified but could not be satisfied (fallback to one of the languages of the issuing country, a warning is added to the response.

- Fulfillment resources receive a fulfillmentLanguage attribute that indicates which language was used to generate that fulfillmentFor fulfillment language,  Add an issue language field on the fulfillment
      