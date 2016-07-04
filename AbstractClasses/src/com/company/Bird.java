package com.company;

/**
 * Created by jacindazhong on 6/20/16.
 */
public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("I am a bird, I am flying");
    }
}
