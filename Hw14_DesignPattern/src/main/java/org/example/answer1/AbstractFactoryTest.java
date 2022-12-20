package org.example.answer1;

import org.example.answer1.abstractFactory.CurrentDepositFactory;
import org.example.answer1.abstractFactory.Deposit;
import org.example.answer1.abstractFactory.DepositFactory;
import org.example.answer1.abstractFactory.ShortTermDepositFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        try {
            Deposit shortTerm = DepositFactory.getDeposit(new ShortTermDepositFactory("ali", "hosseiny", 50_000L));
            System.out.println("The deposit was successfully opened with the following information: " + shortTerm);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------------------------------------------------------------");

        try {
            Deposit current = DepositFactory.getDeposit(new CurrentDepositFactory("mohammad", "mohammadi", 100_000L));
            System.out.println("The deposit was successfully opened with the following information: " + current);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
