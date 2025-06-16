#!/usr/bin/env bash

# Needs pandoc to be installed

pandoc -s \
-o OSDM-specification-V3.6-rc.docx \
foreword.md \
../releases/OSDM-release-notes-v3.6.md \
requirements.md \
business-capabilities.md \
common-data-structures.md \
relationship-offer-offerpart-product-and-fare.md \
technical-principles.md \
authentication.md \
offline-model.md \
roles.md \
models.md \
processes.md \
after-sales-processes.md \
account-based-ticketing.md \
getting-started.md \
non-functional-requirements.md \
catalog-of-code-lists.md \
errors-problems.md \
pagination.md \
synchronization.md \
compliance.md \


