package com.company;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Integer is a class (command + click in IntelliJ to see the Integer class code)
        // int is not a class
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++ ){
            // this is an example of autoboxing
            // where converting a primitive (int)
            // to be an instance of the Integer class
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            // this is unboxing
            // intValue() converts an instance of Integer back to int
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        // These are shorter/faster ways of doing autoboxing and unboxing:
        //
        // autoboxing
        // at compile time, the code below turns into this:
        // Integer.valueOf(56);
        Integer myIntValue = 56;

        // unboxing
        // at compile time, Java is doing this for me:
        // myIntValue.intValue();
        int myInt = myIntValue;


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            // boxing
            // this is the long way:
            // myDoubleValues.add(Double.valueOf(dbl));

            // short way:
            myDoubleValues.add(dbl);
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            // unboxing
            // long way:
            // double value = myDoubleValues.get(i).doubleValue();

            // short way:
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }

    }
}
