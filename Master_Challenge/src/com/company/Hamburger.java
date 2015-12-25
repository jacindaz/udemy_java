package com.company;

/**
 * Created by jacindazhong on 12/24/15.
 */
public class Hamburger {
    private String breadRollType;
    private String meat;
    private Integer basePrice;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = "white bread roll";
        this.meat = "ground beef";
        this.basePrice = 6;
    }

    public Hamburger() {
        this.breadRollType = "white bread roll";
        this.meat = "ground beef";
        this.basePrice = 6;
    }

    public String getBreadRollType() { return this.breadRollType; }
    public String getMeat() { return this.meat; }
    public Integer getBasePrice() { return this.basePrice; }

    public void aboutMyHamburger() {
        System.out.println("My hamburger is on a " + getBreadRollType() + " with " + getMeat());
    }

    public void displayBasePrice() {
        System.out.println("Base price for the Hamburger is: " + getBasePrice());
    }
}
