package com.company;

import java.util.ArrayList;

/**
 * Created by jacindazhong on 1/23/16.
 */
public class Bank {
    // should have an arraylist of Branches

    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally
    //    a list of their transactions

    // is it ok to initialize an empty ArrayList here?
    // i don't want to deal w/ null pointer errors
    // because i'm trying to look at the size of the array in the newBranch() method
    private ArrayList<Branch> mBranches = new ArrayList<Branch>();
    private String mName;

    public Bank(ArrayList<Branch> branches) {
        this.mBranches = addBranches(branches);
        mName = "Jacinda's Bank";
    }
    public Bank() {
        mName = "Jacinda's Bank";
    }

    public ArrayList<Branch> getmBranches() {
        return mBranches;
    }

    private ArrayList<Branch> addBranches(ArrayList<Branch> branches) {
        for(Branch b : branches) {
            if(newBranch(b)) {
                mBranches.add(b);
            }
        }
        return branches;
    }

    public void addBranch(Customer customer, int initialTransactionAmount, String location) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);

        Branch newBranch = new Branch(customers, location);
        mBranches.add(newBranch);
    }
    public void addBranch(Branch branch) { mBranches.add(branch); }

    // is it a Java convention, to return null if something does not exist?
    // that's what the instructor did
    private boolean newBranch(Branch branch) {
        ArrayList<Branch> existingBranches = getmBranches();
        if(existingBranches.size() > 0) {
            for(Branch b : existingBranches) {
                if(branch.getLocation().equals(b.getLocation())) {
                    return false;
                }
            }
        }

        return true;
    }

    public void displayCustomers(Branch branch) {
        ArrayList<Customer> customers = branch.getCustomers();
        for(Customer c : customers) {
            c.printCustomer(c);
        }
    }
}
