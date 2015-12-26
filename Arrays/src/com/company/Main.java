package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(3);
        printArray(myArray);
    }

    // what does the static mean ???
    public static int[] getIntegers(int numberOfValues) {
        System.out.println("Enter " + numberOfValues + " number of values:");

        int[] myNumbers = new int[numberOfValues];
        for(int i = 0; i < numberOfValues; i++) {
            myNumbers[i] = scanner.nextInt();
        }

        return myNumbers;
    }

    public int[] sortIntegers(int[] unsortedArray){
        // returns sorted version of the unsortedArray
        int[] someArray = new int[0];
        return someArray;
    }
}
