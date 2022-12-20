package org.example.answer1.abstractFactory;

public abstract class Deposit {
    public abstract String getFirstname();
    public abstract String getLastname();
    public abstract String getDepositType();
    public abstract Long getBalance();
    public abstract Boolean getCheckBook();
    public abstract Boolean getProfit();

    @Override
    public String toString() {
        return "\n{firstname: " + this.getFirstname() + "}\n" +
                "{lastname: " + this.getLastname() + "}\n" +
                "{deposit type: " + this.getDepositType() + "}\n" +
                "{balance: " + this.getBalance() + "}\n" +
                "{checkbook: " + this.getCheckBook() + "}\n" +
                "{profit: " + this.getProfit() + "}";
    }
}
