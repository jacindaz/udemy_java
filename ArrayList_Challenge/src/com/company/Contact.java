package com.company;

/**
 * Created by jacindazhong on 1/16/16.
 */
public class Contact {
    // name
    // phone number

    // methods:
    //  - quit
    //  - print list of contacts
    //  - add new contact
    //  - update existing contact
    //  - remove contact
    //  - search/find contact


    // Instance vars
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
