package org.example.answer1.abstractFactory;

public class DepositFactory {
    public static Deposit getDeposit(DepositAbstractFactory factory) {
        return factory.openDeposit();
    }
}
