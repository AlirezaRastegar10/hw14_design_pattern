package org.example.answer1;

import org.example.answer1.factoryMethod.Deposit;
import org.example.answer1.factoryMethod.DepositFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    private static void testFactoryMethod() {
        try {
            Deposit shortTerm = DepositFactory.getDeposit("Short Term","ali", "hosseiny", 50_000L);
            System.out.println("The deposit was successfully opened with the following information: " + shortTerm);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------------------------------------------------------------");

        try {
            Deposit current = DepositFactory.getDeposit("Current", "mohammad", "mohammadi", 100_000L);
            System.out.println("The deposit was successfully opened with the following information: " + current);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
