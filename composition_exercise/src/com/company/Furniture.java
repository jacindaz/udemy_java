package com.company;

/**
 * Created by jacindazhong on 12/17/15.
 */
public class Furniture {
    private String name;
    private String location;

    public Furniture(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getNameAndLocation() {
        return getName() + "\nLocation: " + getLocation();
    }

    private String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    private String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
