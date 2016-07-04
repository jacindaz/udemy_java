package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        linkedListExample();

        System.out.println("\n");

    }

    public static void linkedListExample(){
        LinkedList<String> navigationCases = new LinkedList<String>();

        navigationCases.add("page1");
        navigationCases.add("page2");
        navigationCases.add("page3");
        navigationCases.add("page4");

        ListIterator navigationItr = navigationCases.listIterator();

        Object something = "none";
        System.out.println("\nInitial cursor position");
        printIndex(navigationItr, something);

        Object nextItem = navigationItr.next(); // Returns page1
        System.out.println("\nCalling listIterator.next()");
        printIndex(navigationItr, nextItem);
        
        Object nextItemAgain = navigationItr.next(); // Returns page2
        System.out.println("\nCalling listIterator .next()");
        printIndex(navigationItr, nextItemAgain);

        Object previousItem = navigationItr.previous(); //Returns page2 again
        System.out.println("\nCalling listIterator .previous()");
        printIndex(navigationItr, previousItem);

        Object nextItemAgainAgain = navigationItr.next(); //Returns page2 again
        System.out.println("\nCalling listIterator .next()");
        printIndex(navigationItr, nextItemAgainAgain);

    }

    public static void printIndex(ListIterator listIterator, Object nextItem) {
        System.out.println("index: " + listIterator.nextIndex() + ", previous index: " + listIterator.previousIndex() + ", value: " + nextItem);
    }

    public static void linkedListExample2(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        arrayList.add("Item 4");
        arrayList.add("Item 5");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println("\nThis is the iterator: " + iterator);
            System.out.println("iterator.next(): " + iterator.next() + "\n");

            iterator.remove();
        }
    }

}
//import java.util.*;
//
//public class HelloWorld{
//
//    public static void main(String []args){
//        LinkedList<String> navigationCases = new LinkedList<String>();
//
//        navigationCases.add("page1");
//        navigationCases.add("page2");
//        navigationCases.add("page3");
//        navigationCases.add("page4");
//
//        ListIterator navigationItr = navigationCases.listIterator();
//        Object nextItem = navigationItr.next(); // Returns page1
//        Object nextItem = navigationItr.next(); // Returns page2
//        navigationItr.previous(); //Returns page2 again
//        Object nextItem = navigationItr.next(); //Returns page2 again
//    }
//
//    public static void printList(LinkedList<String> list) {
//        for(String i: list) {
//            System.out.println("List item: " + i);
//        }
//    }
//}

// for (int i = 0; i < linkedList.size(); i++) {
// 	            System.out.println(linkedList.get(i));
// 	        }