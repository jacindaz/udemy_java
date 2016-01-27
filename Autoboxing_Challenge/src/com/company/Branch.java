package com.company;

import java.util.ArrayList;

/**
 * Created by jacindazhong on 1/23/16.
 */
public class Branch {
    // need to be able to add a new customer and initial transaction amount
    // also needs to add additional transactions for that customer/branch
    // each branch should have an arraylist of customers

    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int initialTransactionAmount;
    private String location;

    public Branch(ArrayList<Customer> customers, String location) {
        this.customers = addCustomers(customers);
        this.initialTransactionAmount = 0;
        this.location = location;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public int getInitialTransactionAmount() {
        return initialTransactionAmount;
    }
    public String getLocation() {
        return location;
    }

    public void setInitialTransactionAmount(int initialTransactionAmount) {
        this.initialTransactionAmount = initialTransactionAmount;
    }

    private ArrayList<Customer> addCustomers(ArrayList<Customer> newCustomers) {
        for(Customer c : newCustomers) {
            if(newCustomer(c)) {
                customers.add(c);
            }
        }
        return customers;
    }

    private void addCustomer(Customer newCustomer, int startingAmount) {
        customers.add(newCustomer);
        setInitialTransactionAmount(startingAmount);
    }

    public static void printBranchInfo(Branch branch) {
        System.out.println("Branch name: " + branch.getLocation() + "\nInitial transaction amount: " + branch.getInitialTransactionAmount());
    }

    public boolean newCustomer(Customer newCustomer) {
        if(getCustomers().size() > 0) {
            for(Customer c : getCustomers()) {
                if(c.getName().equals(newCustomer.getName())) {
                    return false;
                }
            }
        }

        return true;
    }
}
