package org.example.answer1.abstractFactory;

public class ShortTermDepositFactory implements DepositAbstractFactory {
    private final String firstname;
    private final String lastname;
    private final Long balance;

    public ShortTermDepositFactory(String firstname, String lastname, Long balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public Deposit openDeposit() {
        if (balance >= 50_000) {
            return new ShortTermDeposit(firstname, lastname, "Short Term", balance, false, true);
        } else {
            throw new RuntimeException("The amount to create an account is below 50,000 tomans");
        }
    }
}
