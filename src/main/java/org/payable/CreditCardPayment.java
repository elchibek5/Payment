package org.payable;

public class CreditCardPayment implements Payable {
    private final String cardNumber;
    private final String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Processing credit card payment of $%.2f with card ending in %s for %s\n",
                amount, cardNumber.substring(cardNumber.length() - 4), cardHolderName);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refunding $%.2f to the card ending in %s for %s\n",
                amount, cardNumber.substring(cardNumber.length() - 4), cardHolderName);
    }
}
