package com.company;

/**
 * Created by jacindazhong on 6/20/16.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Penguin is eating!! nom nom\n");
    }

    public void breathe() {
        System.out.println("Penguin is breathing!! yay!\n");
    }

    @Override
    public void fly() {
    }
}
