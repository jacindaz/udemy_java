package com.company;

/**
 * Created by jacindazhong on 7/3/16.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}
