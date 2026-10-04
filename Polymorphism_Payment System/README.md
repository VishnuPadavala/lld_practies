
Polymorphism: Payment System
Problem

Design a payment system where Cash, CreditCard, and UPI all implement the same Payment interface but behave differently. A Checkout class should process any payment without knowing which type it is — that's runtime polymorphism.

Requirements

Payment interface with: pay(amount), refund(amount), getPaymentType()
CashPayment: no refund (returns cash physically), pay() just records
CreditCardPayment: pay() charges card, refund() reverses charge, has card details
UPIPayment: pay() sends UPI request, refund() initiates reversal, has VPA
Checkout.processPayment(Payment p, amount) — works with any Payment
Checkout.refundPayment(Payment p, amount) — same interface
Constraints

–
Checkout must NOT use instanceof or type-checking
–
Adding a new payment method (e.g. Wallet) should NOT require changes to Checkout
