package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer myPrinter = new Printer(0, false);
        myPrinter.fillToner(50);
        myPrinter.printPage("Hello, world!", 0);
    }
}
