package com.company;

public class Main {

    public static void main(String[] args) {

        // You need to right click on the project name
        // go to module settings
        // and make sure you can Java 8 selected
        // otherwise the underscores are not supported in older versions

        // usually choose int by default
        // Int has width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // More efficient if you need a smaller number
        // Byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        // surprisingly, this returns an error
        // because Java automatically converts expressions to an integer
        // so it poops saying "Found int, require byte"
        byte myNewByteValue = (myMinByteValue/2);

        // here, myMinShortValue is not defined yet, so it will poop
        // error is "Cannot resolve symbol myMinShortValue"
        System.out.println("My min short value: " + myMinShortValue);

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        // instead, you must case the value
        // also, you can only use a variable in a line after it has been defined
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);

        // long has a width of 64
        // need an "L" at the end of the number
        // can use lowercase of uppercase, but Udemy instructor
        // thinks uppercase is more readable
        long myMinLongValue = 100L;
    }
}
