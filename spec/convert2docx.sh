#!/usr/bin/env bash

# Needs pandoc to be installed

pandoc -s \
-o OSDM-specification-V1.4.0-rc.docx \
foreword.md \
../releases/OSDM-release-notes-v1.4.md \
requirements.md \
business-capabilities.md \
common-data-structures.md \
relationship-offer-offerpart-product-and-fare.md \
technical-principles.md \
offline-model.md \
models.md \
processes.md \
getting-started.md \
non-functional-requirements.md \
catalog-of-code-lists.md \
errors-warnings.md \
pagination.md \
synchronization.md \
compliance.md \

