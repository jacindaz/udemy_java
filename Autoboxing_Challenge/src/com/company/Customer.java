package com.company;

import java.util.ArrayList;

/**
 * Created by jacindazhong on 1/23/16.
 */
public class Customer {
    // should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(initialAmount);
    }

    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    // don't I need to add which branch this customer belongs to ???
    // nope, because then there's an infinite dependency loop
    // branch consists of list of customers, customer requires a branch

    public Customer(String name) {
        this.name = name;
    }

    public static void printCustomer(Customer customer) {
        System.out.println("Name: " + customer.getName() + ", Transactions: " + customer.getTransactions());
    }
}
