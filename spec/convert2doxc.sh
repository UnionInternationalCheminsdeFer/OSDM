#!/usr/bin/env bash

# Needs pandoc to be installed

# for file in *.md; do
#   base=${file%.md}
#   pandoc -V geometry:margin=1in ${base}.md -t docx -o ${base}.docx
# done

pandoc -o OSDM-specification.docx \
-t docx \
specification-structure.md \
common-data-structures.md \
technical-principles.md