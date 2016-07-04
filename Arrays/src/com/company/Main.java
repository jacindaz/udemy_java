package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);

        int[] sortedArray = sortIntegers(myArray);
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

    public static String printArray(int[] array){
        String printedArray = "";
        // print contents of the array
        for(int i = 0; i < array.length; i++) {
            if(i == 0) {
                printedArray += "\n[" + array[i] + ", ";
            } else if(i == array.length - 1) {
                printedArray += array[i] + "]";
            } else if(i != array.length) {
                printedArray += array[i] + ", ";
            } else {
                printedArray += array[i] + "\n";
            }
        }

        return printedArray;
    }

    public static int[] sortIntegers(int[] unsortedArray){
        int arrayLength = unsortedArray.length;

        // what's the difference between doing .clone()
        // and just doing arrayCopy = originalArray ???
//        int[] unsortedArrayCopy = unsortedArray.clone();

//        int[] sortedArray = new int[arrayLength];
        int[] sortedArray = unsortedArray.clone();
        int numIterations = 0;
        int maxIndexToCheck = arrayLength - 1;

        // implement using bubble sort, then try quicksort


        // Bubble sort
//        for(int j = 0; j < arrayLength; j++ ){
        for(int j = 0; j <= maxIndexToCheck; j++ ){
            // don't need to check the last element
            System.out.println("\n===============================");
            System.out.println("This is the max index to check:" + maxIndexToCheck);
            System.out.println("This is the value of the outer loop, j: " + j);


           for(int i = 0; i < arrayLength; i++) {
//             for(int i = 0; i <= maxIndexToCheck; i++) {
                numIterations += 1;
                // [3,2,1]
                // => [2,3,1]
                // i = 0

//                System.out.println("This is the state of the sorted array, at the beginning of the loop: " + printArray(sortedArray));

                if(i == (arrayLength - 1)) {
                    break;
                } else {
                    int firstElement = sortedArray[i];
                    int secondElement = sortedArray[i + 1];

                    if(sortedArray[i] > sortedArray[i + 1]) {
                        System.out.println("\nQuick sort should swap here: " + sortedArray[i] + "(" + i + ")" + " is greater than " + sortedArray[i + 1] + "(" + (i + 1) + ")");

                        sortedArray[i] = secondElement;
                        sortedArray[i + 1] = firstElement;

                         System.out.println("This is sorted array: " + printArray(sortedArray) + "\n");
                    } else {
                        sortedArray[i] = firstElement;
                        sortedArray[i + 1] = secondElement;
                    }
                }
            }
//            numIterations += 1;
            System.out.println("This is the max index to check before decrementing: " + maxIndexToCheck);
            maxIndexToCheck -= 1;
            System.out.println("This is the max index to check after decrementing: " + maxIndexToCheck);

        }
        System.out.println(printArray(sortedArray));
        System.out.println("Number of iterations is: " + numIterations);

        return sortedArray;
    }
}