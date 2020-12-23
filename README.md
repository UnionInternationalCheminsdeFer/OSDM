# OSDM Specification

Projects related to the **Open Sales &amp; Distribution Model (OSDM)** for rail (UIC IRS 90918-10).

## Adding Content or Fixing Typos

The pages uses [GitHub Pages](https://pages.github.com/) and thus is automatically generated at every commit to the `gh-pages` branch.

The easiest way to change a pages' content is to edit the Markdown files
 directly on the Github repository in the [Git Hub page branch](https://github.com/UnionInternationalCheminsdeFer/OSDM/tree/gh-pages). There you can add content and preview it directly online. If your ok with commit it and it should appear within seconds on the page.

## Contributing

Contributions are welcome. Feel free to open a pull request with changes.

### Running it Locally

#### Directory Structure

The following self explanatory file layout is used:

```text
├── 404.html
├── Gemfile
├── Gemfile.lock
├── README.md
├── TODO.md
├── _config.yml
├── _data
│   └── navigation.yml
├── _posts
│   ├── 2020-10-22-OSDM-Offline- V1.0-released.md
│   └── 2020-12-17-OSDM-Online-V-1.0-released.md
├── assets
│   └── css
├── docs
│   ├── IRS-90918-10-V2020.docx
│   └── IRS-90918-10-V2020.pdf
├── favicon.png
├── images
│   ├── fare-data-structure
│   ├── logo
│   ├── models
│   ├── organization
│   └── processes
├── about.md
├── catalog-of-code-lists.md
├── common-data-structures.md
├── index.md
├── models.md
├── offline-model.md
├── organization.md
├── processes.md
├── specification-structure.md
├── team.md
└── technical-principles.md
```

### Site Generation

*OSDM* uses the [Jekyll static site generator](http://jekyllrb.com/).
After forking or cloning the repository, perform the following steps to generate the site and preview it:

- Make sure you have ruby installed on your computer. See [https://www.ruby-lang.org/en/downloads/](https://www.ruby-lang.org/en/downloads/)
- `bundle install`
- `bundle exec jekyll serve --livereload`
- Point your browser at [http://127.0.0.1:4000/OSDM](http://127.0.0.1:4000/OSDM)

## License

This documentation copyrighted by [UIC](https://www.uic.org) is published
under the [Apache-2.0](https://www.apache.org/licenses/LICENSE-2.0.html)
Open Source Licence.
