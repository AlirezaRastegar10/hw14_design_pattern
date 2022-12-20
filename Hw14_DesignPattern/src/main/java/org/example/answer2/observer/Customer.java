package org.example.answer2.observer;

public class Customer implements Observer{
    protected String customerName;

    public Customer(String name) {
        super();
        this.customerName = name;
    }

    @Override
    public void notification(String message) {
        System.out.println("Hi " + customerName + message);
    }
}
