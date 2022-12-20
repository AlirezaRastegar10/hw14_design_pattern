package org.example.answer2;

import org.example.answer2.observer.Customer;
import org.example.answer2.observer.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product("smart tv 60 inch");
        Product product1 = new Product("sport shoes");

        Customer customer1 = new Customer("alireza");
        Customer customer2 = new Customer("omid");
        Customer customer3 = new Customer("nima");
        Customer customer4 = new Customer("hamid");
        Customer customer5 = new Customer("reza");

        product.addCustomer(customer1);
        product.addCustomer(customer2);
        product.addCustomer(customer3);
        product.addCustomer(customer4);
        product.addCustomer(customer5);

        product.becomeAvailable();
        System.out.println("-------------------------------------------------------------------");

        product1.addCustomer(customer1);
        product1.addCustomer(customer2);
        product1.addCustomer(customer3);
        product1.addCustomer(customer4);
        product1.addCustomer(customer5);

        product1.applyNewDiscount();
    }
}
