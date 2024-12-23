# Languages specifications and usage in OSDM

## General elements:
- For reference data (including places), we specifically have a translation structure, so no need for language element there.
- Errors and warnings are not translated.

## Interface language
- For interface language, we rely on the accept-language header. Note however that the header is only available in calls where it is relevant.
- Language mismatch between requested languages and available languages does not lead to an error. Instead the provider will provide localized content in english, or if not available, one of the official languages of the issuing country, with a warning in the response.

## Communication language (emails etc)
- For communication language (emails etc), we refer to the purchaser preferred language, or the passenger language if possible and applicable.
- Language mismatch between requested languages and available languages does not lead to an error. Instead the provider will provide localized content in english, or if not available, one of the official languages of the issuing country, with a warning in the response.

## Fulfillment language
- To specify the desired language for generating the fulfillment, a specific "issuingLanguage" field is available in the verbs leading to generation. This field is optional.

- If omitted or not available, (one of) the language(s) of the issuing country is used as default.

- In case a language was specified but could not be satisfied, fallback to one of the languages of the issuing country and add a warning to the response.

- Fulfillment resources receive a "issuingLanguage" attribute that indicates which language was used to generate that fulfillment.
