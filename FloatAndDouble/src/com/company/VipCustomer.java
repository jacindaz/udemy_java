package com.company;

/**
 * Created by jacindazhong on 12/13/15.
 */
public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    VipCustomer() {
        this("jz", 10, "asd@email.com");
    }

    VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    VipCustomer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
