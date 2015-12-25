package com.company;

/**
 * Created by jacindazhong on 12/24/15.
 */
public class HealthyBurger extends Hamburger {
    private String topping1;
    private String topping2;
    private Integer numToppings;
    private Integer basePrice;

    // The constructor version that the Instructor wrote
    // public HealthBurger(String meat, double price) {
    //      super("Healthy", meat, price, "Brown rye")
    // }

    public HealthyBurger() {
//        super(breadRollType, meat, topping1, topping2, topping3, topping4);
        super("brown rye bread roll", "ground beef");

        this.topping1 = null;
        this.topping2 = null;
        this.numToppings = 0;
        this.basePrice = 6;
    }

    private String getTopping1() { return this.topping1; }
    private String getTopping2() { return this.topping2; }
    private Integer getNumToppings() { return this.numToppings; }

    private void setTopping1(String newTopping1) { this.topping1 = newTopping1; }
    private void setTopping2(String newTopping2) { this.topping2= newTopping2; }

    private void incrementNumToppings() {
        System.out.println("Number of toppings is " + getNumToppings());
        this.numToppings += 1;
        System.out.println("Number of toppings is now: " + getNumToppings());
    }

    public void aboutMyHealthyBurger() {
        if(getNumToppings() == 0) {
            System.out.println("My healthy burger does not have any toppings, \nand it's on a " + getBreadRollType() + " with " + getMeat() + ".");
        } else if(getTopping1() != null && getTopping2() != null) {
            System.out.println("My healthy burger has " + getTopping1() + " and " + getTopping2() + ", and it's on a " + getBreadRollType() + " with " + getMeat() + ".");
        } else if(getTopping1() != null && getTopping2() == null) {
            System.out.println("\nMy healthy burger has 1 topping (" + getTopping1() + "), \nand it's on a " + getBreadRollType() + " with " + getMeat() + ".");
        }
    }

    public void addTopping(String toppingName) {
        if(numToppings >= 2) {
            System.out.println("You can only add 2 toppings.");
        } else {
            if(getTopping1() == null) {
                setTopping1(toppingName);
                incrementNumToppings();
            } else if(getTopping2() == null) {
                setTopping2(toppingName);
                incrementNumToppings();
            }
        }
    }

    public void displayTotalPrice() {
//        double basePrice = (double) getBasePrice();
        double totalPrice = calculateToppings() + (double) getBasePrice();
        System.out.println("\n=======================");
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Toppings (" + getNumToppings() + "): " + calculateToppings() + " (50 cents x " + getNumToppings() + ")");
        System.out.println("Total price: " + totalPrice);
        System.out.println("=======================");
    }

    private double calculateToppings() {
        double toppingsPrice = 0;
        if(numToppings > 0) {
            toppingsPrice += (.5 * numToppings);
        }
        return toppingsPrice;
    }

    @Override
    public void displayBasePrice() {
        System.out.println("Base price for the healthy burger is: " + getBasePrice());
    }
}
