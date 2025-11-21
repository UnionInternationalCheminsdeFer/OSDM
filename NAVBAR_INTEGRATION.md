# Integrating Search into the Navbar

Since this site uses the remote `bulma-clean-theme`, you need to override the navbar to include the search widget.

## Option 1: Create Custom Header (Recommended)

Create a custom header that includes the search bar:

1. **Check the theme's header structure**:
   Visit: https://github.com/chrisrhymes/bulma-clean-theme/blob/master/_includes/header.html

2. **Create `_includes/header.html`**:
   Copy the entire header content from the theme and add the search bar include where you want it to appear (typically in the navbar-end section):

   ```html
   <div class="navbar-end">
     <!-- Add search bar before other navbar items -->
     {% include search-bar.html %}

     <!-- Existing navbar items will follow -->
     ...
   </div>
   ```

3. **Rebuild the site**:
   ```bash
   bundle exec jekyll serve --livereload
   ```

## Option 2: Use Theme Customization Features

Check if bulma-clean-theme supports custom navbar includes:

1. Review the theme documentation: https://github.com/chrisrhymes/bulma-clean-theme
2. Look for configuration options in `_config.yml` that allow custom navbar content
3. If supported, reference `search-bar.html` through the config

## Option 3: JavaScript Injection

If you can't override the header easily, inject the search dynamically:

1. **Create `assets/js/inject-search.js`**:
   ```javascript
   document.addEventListener('DOMContentLoaded', function() {
     // Find the navbar-end element
     var navbarEnd = document.querySelector('.navbar-end');

     if (navbarEnd) {
       // Create search container
       var searchItem = document.createElement('div');
       searchItem.className = 'navbar-item';
       searchItem.innerHTML = '<div id="docsearch"></div>';

       // Insert as first item in navbar-end
       navbarEnd.insertBefore(searchItem, navbarEnd.firstChild);
     }
   });
   ```

2. **Include the script in `_includes/head-custom.html`**:
   ```html
   <script src="{{ '/assets/js/inject-search.js' | relative_url }}"></script>
   ```

## Testing the Integration

After implementing one of the options above:

1. Start the Jekyll server:
   ```bash
   bundle exec jekyll serve --livereload
   ```

2. Visit http://127.0.0.1:4000/

3. Check that:
   - The `#docsearch` div appears in the navbar
   - No JavaScript errors in console
   - The search button/input is visible (though it won't function until credentials are added)

## Verifying Search Widget Placement

Open browser DevTools and check:

```javascript
// Should return the search container
document.querySelector('#docsearch')

// Should return the DocSearch button (after credentials added)
document.querySelector('.DocSearch-Button')
```

## Styling Adjustments

You may need to adjust spacing and styling to match the theme. Edit `_includes/docsearch.html`:

```css
/* Adjust for bulma-clean-theme navbar */
.navbar-item #docsearch {
  padding: 0;
}

.DocSearch-Button {
  height: 2.5rem;  /* Match navbar height */
  /* Add other adjustments as needed */
}
```

## Next Steps After Navbar Integration

1. Apply for Algolia DocSearch (see `DOCSEARCH_SETUP.md`)
2. Wait for approval and credentials
3. Update credentials in `_includes/docsearch.html`
4. Test search functionality
5. Customize search behavior and styling as needed
