package org.example.answer1.factoryMethod;

public class CurrentDeposit extends Deposit {
    private final String firstname;
    private final String lastname;
    private final String depositType;
    private final Long balance;
    private final Boolean checkbook;
    private final Boolean profit;

    public CurrentDeposit(String firstname, String lastname, String depositType, Long balance, Boolean checkbook, Boolean profit) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.depositType = depositType;
        this.balance = balance;
        this.checkbook = checkbook;
        this.profit = profit;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public String getDepositType() {
        return this.depositType;
    }

    @Override
    public Long getBalance() {
        return this.balance;
    }

    @Override
    public Boolean getCheckBook() {
        return this.checkbook;
    }

    @Override
    public Boolean getProfit() {
        return this.profit;
    }
}
