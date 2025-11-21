# Algolia DocSearch Integration Setup Guide

This guide explains how to set up Algolia DocSearch for semantic search on the OSDM website.

## Overview

Algolia DocSearch is a free hosted search service for open-source documentation. It provides:
- AI-powered semantic search
- Fast, typo-tolerant search
- Beautiful pre-built UI
- Automatic indexing via web crawler
- No infrastructure to maintain

## Application Process

### Step 1: Apply for DocSearch

1. Visit the DocSearch application page: https://docsearch.algolia.com/apply/
2. Fill out the application form with:
   - **Website URL**: `https://osdm.io`
   - **Email**: Use the maintainer email from `_config.yml` or a project email
   - **Repository URL**: `https://github.com/UnionInternationalCheminsdeFer/OSDM`
   - **Description**: "OSDM (Open Sales and Distribution Model) is an open standard for rail and public transport ticket distribution, maintained by UIC (Union Internationale des Chemins de fer)."

3. Confirm that:
   - ✅ You are the owner of the website
   - ✅ The website is publicly available
   - ✅ The website is technical documentation (open source project)
   - ✅ You can modify the website's codebase

4. Submit the application

### Step 2: Wait for Approval

- Algolia typically responds within a few days
- They will verify that your project meets the free tier requirements (open source, public documentation)
- Once approved, you'll receive:
  - `appId`: Your application ID
  - `apiKey`: Your search-only API key (public, safe to commit)
  - `indexName`: The name of your search index

### Step 3: Configure DocSearch

Once you receive credentials from Algolia:

1. **Update `_includes/docsearch.html`**:
   ```javascript
   docsearch({
     appId: 'YOUR_APP_ID',        // Replace with your actual appId
     apiKey: 'YOUR_SEARCH_API_KEY', // Replace with your actual apiKey
     indexName: 'YOUR_INDEX_NAME',  // Replace with your actual indexName
     // ... rest of config
   });
   ```

2. **Verify the crawler configuration**:
   - The file `docsearch-config.json` contains the configuration for Algolia's web crawler
   - This tells the crawler what to index and how to structure the search results
   - Algolia will use this configuration (or you can share it with them)
   - You may need to provide this file to Algolia support to customize the crawling behavior

3. **Integrate into theme**:

   The bulma-clean-theme you're using may need customization to show the search bar. You have two options:

   **Option A: Override the theme's navbar** (recommended)

   Create `_includes/header.html` and copy the header from the theme, then add:
   ```html
   {% include search-bar.html %}
   ```

   **Option B: Add to existing layout**

   If the theme supports custom includes, add to your layout files where you want the search to appear.

4. **Test locally**:
   ```bash
   bundle exec jekyll serve
   ```

   Visit http://127.0.0.1:4000/ and verify the search widget appears (it won't work until credentials are added).

### Step 4: Initial Crawl

After configuration:
1. Algolia will run their first crawl of your website
2. The crawl runs automatically on a schedule (typically once per week)
3. You can request manual re-indexing through the Algolia dashboard if needed

## Customization Options

### Search Behavior

Edit `_includes/docsearch.html` to customize:

```javascript
docsearch({
  // ... credentials ...

  searchParameters: {
    facetFilters: [],           // Filter results by category
    hitsPerPage: 10,            // Results per page
  },

  placeholder: 'Search OSDM documentation...',

  // Customize result display
  transformItems(items) {
    return items.map(item => {
      // Customize result items here
      return item;
    });
  }
});
```

### Styling

Customize the appearance in `_includes/docsearch.html` within the `<style>` block:

```css
/* Modal customization */
.DocSearch-Modal {
  /* Your custom styles */
}

/* Button customization */
.DocSearch-Button {
  /* Your custom styles */
}
```

### Crawler Configuration

Edit `docsearch-config.json` to adjust:
- **start_urls**: Prioritize important sections
- **selectors**: Customize how content is extracted from HTML
- **stop_urls**: Exclude specific pages (PDFs, etc.)
- **page_rank**: Set importance of different sections

## Troubleshooting

### Search widget doesn't appear
- Check browser console for errors
- Verify the `#docsearch` div exists in your HTML
- Ensure scripts are loaded (check Network tab)

### No search results
- Wait for initial crawl to complete (can take 24-48 hours after approval)
- Check Algolia dashboard to verify index has records
- Verify credentials are correct

### Wrong content indexed
- Update `docsearch-config.json` with better selectors
- Contact Algolia support to update crawler configuration
- Request a manual re-crawl

## Additional Resources

- [DocSearch Documentation](https://docsearch.algolia.com/docs/what-is-docsearch)
- [Crawler Configuration Reference](https://docsearch.algolia.com/docs/legacy/config-file)
- [DocSearch React/JS API](https://docsearch.algolia.com/docs/api)
- [Algolia Dashboard](https://www.algolia.com/dashboard) (after approval)

## Support

If you encounter issues:
1. Check the [DocSearch FAQ](https://docsearch.algolia.com/docs/legacy/faq)
2. Visit the [DocSearch Discord](https://discord.gg/algolia)
3. Email DocSearch support: support@algolia.com
