package org.example.answer2.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    protected List<Observer> observers = new ArrayList<>();
    protected String productName;

    public Product(String productName) {
        super();
        this.productName = productName;
    }

    public void becomeAvailable() {
        notifyCustomers("; the " + "\"" + productName + "\"" + " is available");
    }

    public void applyNewDiscount() {
        notifyCustomers("; " + "\"" + productName + "\"" + " were discounted");
    }

    @Override
    public synchronized void addCustomer(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyCustomers(String message) {
        observers.forEach(observer -> observer.notification(message));
    }
}
