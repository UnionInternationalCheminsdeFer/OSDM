/** @type {import('tailwindcss').Config} */
export default {
  content: ['./index.html', './src/**/*.{vue,js,ts,jsx,tsx}'],
  theme: {
    extend: {
      colors: {
        'osdm-accent': 'var(--sbb-color-red)',
        'osdm-gray': '#e5e5e5',
        'osdm-text-secondary': '#5a5a5a',
        'osdm-accent-dark': 'var(--sbb-color-red150)',
        'osdm-bg-primary': 'var(--osdm-bg-primary)',
        'osdm-bg-secondary': 'var(--osdm-gray)',
        'osdm-bg-white': '#FFFFFF',
        'osdm-text-inverted': '#FFFFFF',
      },
    },
  },
  plugins: [],
}
