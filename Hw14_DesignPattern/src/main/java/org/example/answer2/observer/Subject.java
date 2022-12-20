package org.example.answer2.observer;

public interface Subject {
    void addCustomer(Observer observer);
    void notifyCustomers(String message);
}
