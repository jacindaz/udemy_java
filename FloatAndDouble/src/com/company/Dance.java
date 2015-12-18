package com.company;

/**
 * Created by jacindazhong on 12/14/15.
 */
public class Dance {
    private Integer numDancers;
    private String city;
    private String nameOfDance;

    public Integer getNumDancers() {
        return numDancers;
    }
    public void setNumDancers(Integer numDancers) {
        this.numDancers = numDancers;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getNameOfDance() {
        return nameOfDance;
    }
    public void setNameOfDance(String nameOfDance) {
        this.nameOfDance = nameOfDance;
    }

    public Dance(Integer numDancers, String city, String nameOfDance){
        this.numDancers = numDancers;
        this.city = city;
        this.nameOfDance = nameOfDance;
    }
    public Dance() {}


    public void startDancing() {
        System.out.println("You are now dancing!");
    }
    public void danceSummary() {
        System.out.println("There are " + getNumDancers() + " dancers dancing.");
        System.out.println("They are dancing in " + getCity() + ".");
    }
}
