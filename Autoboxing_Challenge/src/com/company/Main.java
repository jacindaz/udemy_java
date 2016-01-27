package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Demonstration autoboxing and unboxing
        // Hint: Transactions
        // Add data validation
        // e.g. check if exists, or does not exist, etc.

        Customer customer1 = new Customer("Jacinda");
        Customer customer2 = new Customer("Yvan");
        // is there a way to create an array and add something to it, on the same line ???
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(customer1);
        customers.add(customer2);

        System.out.println();
        Branch branch1 = new Branch(customers, "Cambridge");
        Branch branch2 = new Branch(customers, "Cambridge");

        ArrayList<Branch> branches = new ArrayList<Branch>();
        branches.add(branch1);
        Bank bank = new Bank(branches);

        Branch.printBranchInfo(branch1);

        System.out.println();
        bank.displayCustomers(branch1);
    }
}


// You job is to create simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)

// Customer:
// Name, and the ArrayList of doubles.

// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
