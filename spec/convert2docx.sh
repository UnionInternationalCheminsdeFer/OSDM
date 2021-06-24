#!/usr/bin/env bash

# Needs pandoc to be installed

pandoc -s \
-o OSDM-specification-V1.2.0-rc.docx \
foreword.md \
OSDM-release-notes-v1.2.md \
requirements.md \
business-capabilities.md \
common-data-structures.md \
relationship-offer-offerpart-product-and-fare.md \
technical-principles.md \
offline-model.md \
models.md \
processes.md \
non-functional-requirements.md \
catalog-of-code-lists.md \
compliance.md 
