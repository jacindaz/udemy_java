package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Comparing a and z: " + "a".compareTo("z"));
        System.out.println("Comparing z and a: " + "z".compareTo("a"));

        System.out.println("\nComparing zach and adam: " + "zach".compareTo("adam"));
        System.out.println("Comparing adam and zach: " + "adam".compareTo("zach") + "\n");

        System.out.println("Comparing Jacinda and Jacin: " + "Jacinda".compareTo("Jacin"));
        System.out.println("Comparing Jacinda and Yvan: " + "Jacinda".compareTo("Yvan"));

        System.out.println();

        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("apple");
        placesToVisit.add("bob");
        placesToVisit.add("dog");

        addInOrder(placesToVisit, "cat");
        printList(placesToVisit);
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        System.out.println("\n=======================");
        System.out.println("This is i: " + i);
        int index = 0;

        while(i.hasNext()) {
            // .next() is moving to the next entry
            // kinda like i++
            System.out.println("(" + index + ") " + i.next());
            index++;
        }
        System.out.println("=======================\n");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String nextItem) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            // gives us a number
            // if 0, equals nextItem

            // by design, the compareTo method
            // compares by alpha order
            int comparison = stringListIterator.next().compareTo(nextItem);

            if(comparison == 0) {
                // equal, do not add
                System.out.println(nextItem + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new city should appear before this one
                // Brisbane  => Adelaide
                stringListIterator.previous(); // ListIterator allows us to go to a previous item
                stringListIterator.add(nextItem);
                return true;
            } else if(comparison < 0) {
                // move on to the next city
            }
        }

        stringListIterator.add(nextItem);
        return true;
    }

}
