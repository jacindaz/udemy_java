package com.company;

/**
 * Created by jacindazhong on 6/20/16.
 */
public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = "some animal name";
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() { return name; }
}
