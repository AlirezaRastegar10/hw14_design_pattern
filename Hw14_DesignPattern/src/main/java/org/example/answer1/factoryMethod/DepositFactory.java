package org.example.answer1.factoryMethod;

public class DepositFactory {
    public static Deposit getDeposit(String depositType, String firstname, String lastname, Long balance) {
        if (depositType.equalsIgnoreCase("Short Term")) {
            if (balance >= 50_000) {
                return new ShortTermDeposit(firstname, lastname, depositType, balance, false, true);
            } else {
                throw new RuntimeException("The amount to create an account is below 50,000 tomans");
            }
        } else if (depositType.equalsIgnoreCase("Long Term")) {
            if (balance >= 100_000) {
                return new LongTermDeposit(firstname, lastname, depositType, balance, false, false);
            } else {
                throw new RuntimeException("The amount to create an account is below 100,000 tomans");
            }
        } else if (depositType.equalsIgnoreCase("Current")) {
            if (balance >= 100_000) {
                return new CurrentDeposit(firstname, lastname, depositType, balance, true, false);
            } else {
                throw new RuntimeException("The amount to create an account is below 100,000 tomans");
            }
        }
        return null;
    }
}
