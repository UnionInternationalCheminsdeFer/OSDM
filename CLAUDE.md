# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Overview

This is the **OSDM (Open Sales and Distribution Model)** specification repository maintained by UIC (Union Internationale des Chemins de fer). OSDM is an open standard for simplifying rail and public transport ticket distribution across Europe. The repository is a Jekyll-based documentation website hosted on GitHub Pages (gh-pages branch) at https://osdm.io.

**License**: Apache-2.0 (copyrighted by UIC)

## Architecture

### Repository Structure

The repository follows a documentation-first architecture with three main components:

1. **Jekyll Website** (root level)
   - Built using Jekyll static site generator with bulma-clean-theme
   - Content files are Markdown with YAML front matter
   - Navigation defined in `_data/navigation.yml`
   - Blog posts in `_posts/` follow Jekyll naming convention: `YYYY-MM-DD-title.md`

2. **Specification Documents** (`spec/` directory)
   - Complete OSDM specification broken into modular Markdown files
   - Topics include: authentication, business capabilities, models, processes, after-sales, compliance, etc.
   - Can be compiled into single DOCX using `spec/convert2docx.sh` (requires Pandoc)
   - Compiled specifications also available as PDF/DOCX in `spec/` (e.g., IRS-90918-10-v3.6.0.pdf)

3. **Diagrams and Images** (`images/` directory)
   - PlantUML files (`.puml`) for sequence diagrams, state models, and architectural diagrams
   - Draw.io files (`.drawio`) for business use cases and deployment diagrams
   - Organized by topic: authentication, business-capabilities, compliance, fare-data-structure, models, on-demand-services, organization, processes, reservations, synchronization

### Key Concepts

OSDM defines three roles in rail distribution:
- **Fare Provider**: Defines fares and rules, provides them to distributors
- **Distributor**: Combines fares, manages bookings and ticket security
- **Retailer**: Sells tickets from distributors to customers

The API operates in two modes:
- **Retailer Mode**: Books admissions (tickets), reservations, and ancillaries
- **Distributor Mode**: Additionally handles fares (priced segments)

## Common Development Tasks

### Running the Site Locally

```bash
# Install Ruby dependencies
bundle install

# Start Jekyll development server with live reload
bundle exec jekyll serve --livereload
```

Access the site at http://127.0.0.1:4000/

### Converting Specification to DOCX

From the `spec/` directory:

```bash
./convert2docx.sh
```

This requires [Pandoc](https://pandoc.org) installed. The script concatenates all specification Markdown files in the correct order into a single DOCX document.

### Working with Diagrams

**PlantUML diagrams** (`.puml` files):
- Located in `images/` subdirectories
- Used for sequence diagrams, state models, and process flows
- Can be rendered using PlantUML tools or editors

**Draw.io diagrams** (`.drawio` files):
- Located in `images/` subdirectories
- Used for business use cases and deployment diagrams
- Edit using draw.io or diagrams.net

### Content Organization

**Adding/Editing Pages**:
- Main pages (e.g., `about.md`, `organization.md`, `tools.md`) are in the root
- Specification content is in `spec/`
- All pages use Jekyll front matter with `layout`, `title`, and `permalink`

**Adding Blog Posts**:
- Create files in `_posts/` following naming: `YYYY-MM-DD-title.md`
- Include front matter with `layout: post`, `title`, `date`, `categories`
- Posts automatically appear on `/blog/` (paginated, 3 per page)

**Updating Navigation**:
- Edit `_data/navigation.yml` to modify the site navigation menu
- Structure supports dropdowns for APIs, Specification, Deep Dives, Tools, and Organization

### Site Configuration

**Jekyll Config** (`_config.yml`):
- Site metadata, theme settings, and plugin configuration
- Uses remote theme: `chrisrhymes/bulma-clean-theme@v1.3.0`
- Plugins: jekyll-feed, jekyll-sitemap, jekyll-paginate, jekyll-seo-tag, jekyll-remote-theme, kramdown-parser-gfm
- Google Analytics tracking configured
- Markdown processor: kramdown with GFM (GitHub Flavored Markdown) parser

### Search Integration

The site uses **Algolia DocSearch** for semantic search across all documentation:

**Current Status**: Fully integrated and configured with Algolia credentials
- App ID: 8KEBFKR571
- Search bar appears in top-right of navbar
- Covers all specifications, documentation pages, and blog posts

**Setup** (see `DOCSEARCH_SETUP.md` for full guide if reconfiguring):
1. Credentials already configured in `_includes/docsearch.html`
2. Algolia crawls the site automatically (weekly by default)
3. Custom header overrides theme navbar at `_includes/header.html`

**Configuration files**:
- `_includes/docsearch.html`: Search widget and initialization (credentials configured)
- `_includes/search-bar.html`: Search bar component for navbar
- `_includes/head-scripts.html`: Includes DocSearch scripts in page head
- `_includes/header.html`: Custom navbar with search bar integrated
- `docsearch-config.json`: Crawler configuration (what/how to index)

**Customization**:
- Edit selectors in `docsearch-config.json` to adjust what content is indexed
- Modify styling in `_includes/docsearch.html` to match site theme
- Configure search behavior (filters, ranking) in the DocSearch initialization

### Branch Strategy

- **gh-pages**: Production branch, automatically deployed to GitHub Pages
- **master**: Contains API specification files (OpenAPI/Swagger YAML) referenced from the site
- Direct edits can be made on GitHub in the gh-pages branch with preview before commit

## Important File Paths

- Site configuration: `_config.yml`
- Navigation menu: `_data/navigation.yml`
- Main specification files: `spec/*.md`
- Specification compilation script: `spec/convert2docx.sh`
- Release notes: `releases/OSDM-release-notes-v*.md`
- Blog posts: `_posts/*.md`
- Custom styles: `assets/css/app.scss`
- Search integration: `_includes/docsearch.html`, `docsearch-config.json`
- Search setup guide: `DOCSEARCH_SETUP.md`

## Working with the Specification

When editing specification content:
1. Update the relevant Markdown file in `spec/`
2. If adding diagrams, place source files (`.puml`, `.drawio`) in appropriate `images/` subdirectory
3. Export diagrams to PNG/SVG and reference them in Markdown
4. Update `spec/convert2docx.sh` if adding new specification sections
5. Consider updating navigation in `_data/navigation.yml` if adding major sections

## External Resources

The site navigation links to external resources:
- OpenAPI specifications on GitHub master branch (various versions)
- Swagger/Redoc viewers for API documentation
- UIC GitHub repository and wiki
- OSDM tools (sandboxes, demo app, converters)
