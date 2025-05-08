package org.payable;

public class CashPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.printf("Accepting cash payment of $%.2f\n", amount);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Getting cash refund of $%.2f\n", amount);
    }
}
