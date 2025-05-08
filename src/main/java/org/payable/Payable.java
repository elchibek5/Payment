package org.payable;

public interface Payable {
    void pay(double amount);
    void refund(double amount);

}
