package com.company;

/**
 * Created by jacindazhong on 12/20/15.
 */
public class Printer {
    private Integer tonerLevel;
    private Integer numPagesPrinted;
    private Boolean duplexPrinter;

    public Printer(Integer tonerLevel, Boolean duplexPrinter) {
        if(validateTonerLevel(tonerLevel)) {
            this.tonerLevel = tonerLevel;
        } else {
            // This is a convention, to return -1
            // if something doesn't pass validations
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.numPagesPrinted = 0;
    }

    private boolean validateTonerLevel(int tonerLevel) {
        return (tonerLevel < 0 || tonerLevel > 100);
    }

    public void fillToner(int amount) {
        if(getTonerLevel() == 100) {
            System.out.println("Toner is already completely filled.");
        } else {
            setTonerLevel(amount);
            System.out.println("Toner is now at " + getTonerLevel() + "%.");
        }
    }

    public void printPage(String pageContent, int numPages) {
        System.out.println("Printing page content: " + pageContent);
        setNumPagesPrinted(numPages);
        if(getNumPagesPrinted() == 1) {
            System.out.println("Printed " + getNumPagesPrinted() + " page.");
        } else {
            System.out.println("Printed " + getNumPagesPrinted() + " pages.");
        }
    }

    private int getTonerLevel() { return this.tonerLevel; }
    private int getNumPagesPrinted() { return this.numPagesPrinted; }

    private void setTonerLevel(int tonerLevel) { this.tonerLevel = tonerLevel; }
    private void setNumPagesPrinted(int numPagesPrinted) { this.numPagesPrinted = numPagesPrinted; }
}
