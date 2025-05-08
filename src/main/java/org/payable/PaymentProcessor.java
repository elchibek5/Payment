package org.payable;

import java.util.Random;

public class PaymentProcessor {
    public static void processPayments(Payable[] payments) {
        Random random = new Random();

        for (Payable payment : payments) {
            double amount = 1 + random.nextDouble() + 99;
            payment.pay(amount);
        }
    }
}
