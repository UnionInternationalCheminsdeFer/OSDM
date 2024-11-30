/** @type {import('tailwindcss').Config} */
export default {
  content: ['./index.html', './src/**/*.{vue,js,ts,jsx,tsx}'],
  theme: {
    extend: {
      colors: {
        'osdm-accent': 'var(--sbb-color-red)',
        'osdm-accent-dark': 'var(--sbb-color-red150)',
        'osdm-bg-primary': '#FFFFFF',
        'osdm-bg-secondary': 'var(--osdm-gray)',
        'osdm-text-inverted': '#FFFFFF',
      },
    },
  },
  plugins: [],
}
