package com.company;

public class Main {

    public static void main(String[] args) {
        Furniture myStandingDesk = new Furniture("The Desk", "living room");
        House myHouse = new House(myStandingDesk, 5, "30 Norfolk St.");

        Furniture myChair = new Furniture("Bar stool", "living room");
        myStandingDesk.name = "my standing desk name";

        myHouse.getHouseInformation();
    }
}
