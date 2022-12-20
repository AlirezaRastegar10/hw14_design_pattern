package org.example.answer1.abstractFactory;

public class LongTermDepositFactory implements DepositAbstractFactory {
    private final String firstname;
    private final String lastname;
    private final Long balance;

    public LongTermDepositFactory(String firstname, String lastname, Long balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public Deposit openDeposit() {
        if (balance >= 100_000) {
            return new LongTermDeposit(firstname, lastname, "Long Term", balance, false, false);
        } else {
            throw new RuntimeException("The amount to create an account is below 100,000 tomans");
        }
    }
}
