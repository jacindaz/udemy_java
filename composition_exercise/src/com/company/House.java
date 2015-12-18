package com.company;

/**
 * Created by jacindazhong on 12/17/15.
 */
public class House {
    private Furniture myFurniture;
    private int numRooms;
    private String address;

    public House(Furniture myFurniture, int numRooms, String address) {
        this.myFurniture = myFurniture;
        this.numRooms = numRooms;
        this.address = address;
    }

    public void getHouseInformation(){
        String furnitureInfo = getMyFurniture().getNameAndLocation();
        System.out.println("Address: " + this.address + "\nFurniture name: " + furnitureInfo);
    }

    public Furniture getMyFurniture() {
        return myFurniture;
    }
    public void setMyFurniture(Furniture myFurniture) {
        this.myFurniture = myFurniture;
    }
    public int getNumRooms() {
        return numRooms;
    }
    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }
    public void setAddress(String address) { this.address = address; }
}
