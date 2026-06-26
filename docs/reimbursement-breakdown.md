# Reviewer note — #1369 reimbursement breakdown

> **Temporary.** This file documents the diff for reviewers and will be **deleted
> before merge**. It is not meant to ship.

Issue [#1369](https://github.com/UnionInternationalCheminsdeFer/OSDM/issues/1369) ·
branch `1369-reimbursement-breakdown` · **purely additive, non-breaking.**

## Why

A refund/exchange today can't say **how** money comes back to the passenger *with
amounts*: `ReimbursementMethod.paymentMethod` is a single value (no split) and
`issuedVouchers` carries issuer+code but **no amount**. So neither "€80 voucher +
€40 to card" nor "several vouchers re-credited individually" is expressible.

## What changed

| File | Change |
|---|---|
| `schemas/aftersales.yml` | New `ReimbursementBreakdownItem` (`additionalProperties:false`; required `type` → `PaymentType`; optional `reimbursementAmount` → `Price`, `voucherInformation`). New `reimbursementBreakdown` array on `RefundOffer`, `ExchangeOperation`, `ExchangeOffer`. New `usedPaymentMethods` (array of `PaymentMethod`) on `ExchangeOperationPatchRequest`. |
| `OSDM-online-api.yml` | Hub `$ref` for `ReimbursementBreakdownItem`. |

Nothing is deprecated, renamed, or removed. `ReimbursementMethod`, `issuedVouchers`
and `complaint.yml` are **untouched**.

## Review notes

- **`reimbursementBreakdown` = the realized per-channel split.** Per-item `type`
  (one entry per channel) is what lets it express a mix; single-channel is a
  one-element array.
- **`reimbursementAmount` is optional on purpose.** It's authoritative for the
  `VOUCHER` channel (system knows the credited amount, like `appliedVoucherAmount`
  on `PaymentMethod`); for other channels it's declarative and may be omitted. So
  "sum of items = total" holds only when every item carries an amount.
- **No new voucher-issuance flag.** A voucher in `issuedVouchers` is newly issued;
  one in the breakdown but not in `issuedVouchers` is a re-credit — membership
  already encodes it. The breakdown's `voucherInformation` is just the key to
  attach a per-voucher amount.
- **`usedPaymentMethods` on the exchange PATCH** settles the exchange surcharge
  (`ExchangeOffer.amountToBePaid`), mirroring `BookingPatchRequest`. The exchange
  PATCH is idempotency-key protected, so payment is retry-safe.

## Scope / out of scope

Voucher consolidation (`issuedVoucherRefs`/`VoucherRef` already on `dev-osdm-v4`),
target-instrument identity for non-voucher items, and first-class
eligible-methods + customer choice (EU Reg 2021/782) are **deferred to the v4
payment module** — not introduced here.

Ships identically to **3.8, 3.9 and master** (three additive PRs).

## Validation

`redocly lint specification/OSDM-online-api.yml` — passes (only pre-existing
`houseNumber` example warnings). Don't commit `OSDM-online-api.bundled.yml` (CI
regenerates it).