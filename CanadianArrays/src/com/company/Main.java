package com.company;
import java.util.Arrays;

public class Main {

    static int iterations = 0;

    public static void main(String[] args) {

//        int n = 60000;
//        int[] arry = new int[n];
//
//        for (int i = 0; i < arry.length; i++) {
//            arry[i] = i;
//        }

//        int[] arry = { 55, 100, 9876, 10, 26 };

        int[] arry = { 1,2,3,4,5 };

        sort(arry);

        // System.out.println(Arrays.toString(arry));
        // System.out.println(Arrays.toString(sort(arry)));
        // System.out.println("len = " + arry.length + " iterations = " + iterations + " i/n = " +(double)iterations/n);
    }


    public static int[] sort(int[] a) {

        int maxIndex = 0;
        for(int i = 0; i < a.length; i++) {
            System.out.println("\n==================");

            maxIndex = maxArray(a, i);

            System.out.println("\nInside sort method, maxIndex is: \t  " + maxIndex);
            System.out.println("Array is now: \t\t\t\t\t\t " + Arrays.toString(a));

            // maxIndex is the source, i is the destination
            swap(a, maxIndex, i);
            System.out.println("After swap method, array is now: \t " + Arrays.toString(a));
            iterations++;
            if(iterations%1000 == 0) {
                System.out.println(iterations);
            }
        }
        return a;

    }

    public static int maxArray(int[] a, int sub) {

        int max = -1;
        int maxIndex = 0;
        for (int i = sub; i < a.length; i++) {

            // why do you need the loop here ?
            // can you figure it out from the array length ?
            if(a[i]>max) {
                System.out.println("a[i] > max: " + a[i] + " > " + max);
                System.out.println("maxIndex is: " + maxIndex);

                max = a[i];
                maxIndex = i;
                iterations++;
            }
        }
        return maxIndex;

    }
    public static void swap(int[] a, int src, int dst) {

        int x = a[dst];
        a[dst] = a[src];
        a[src] = x;
    }
}