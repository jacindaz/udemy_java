package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer myInteger = 10;
        Integer mySecondInteger = 12;
        Integer myThirdInteger = 12;

        // printing 2 Integer's below
        // is an example of Java doing auto-unboxing for me
        // it is changing my Integer objects
        // and changing them to int's
        // and then adding them
        System.out.println("My Integer sums: " + (myInteger + mySecondInteger));
        System.out.println("Comparing my Interger objects: " + (myThirdInteger == mySecondInteger));
    }
}
