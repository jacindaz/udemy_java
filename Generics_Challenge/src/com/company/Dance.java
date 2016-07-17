package com.company;

/**
 * Created by jacindazhong on 7/17/16.
 */
public class Dance<T extends DanceType> {
    private String name;

    public Dance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
