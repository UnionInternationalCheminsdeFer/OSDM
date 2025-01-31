import type { components } from '@/schemas/schema'

const getCurrencySymbol = (currency: string) => {
  if (currency === 'EUR') {
    return '€'
  } else if (currency === 'CHF') {
    return 'CHF'
  } else if (currency === 'GBP') {
    return '£'
  } else if (currency === 'SEK') {
    return 'kr'
  } else if (currency === 'CZK') {
    return 'Kč'
  } else if (currency === 'BGN') {
    return 'lv'
  } else if (currency === 'DKK') {
    return 'dkr'
  } else if (currency === 'HRK') {
    return 'kn'
  } else if (currency === 'PLN') {
    return 'zł'
  } else {
    return '€'
  }
}

export const displayPrice = (
  price: components['schemas']['Price'],
  added: components['schemas']['Price'][] = [],
) => {
  const totalPrice =
    price.amount +
    added.reduce((p, c) => {
      if (c.currency == price.currency) {
        return p + c.amount
      } else {
        console.warn('Currency mismatch!')
      }
      return p
    }, 0)
  const priceInCurrency = (totalPrice / Math.pow(10, price.scale)).toFixed(price.scale)
  return `${priceInCurrency}${getCurrencySymbol(price.currency)}`
}
