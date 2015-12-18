package com.company;

/**
 * Created by jacindazhong on 12/17/15.
 */
public class PC {
    private Case theCase; // have to use theCase, because case is now a keyword
    private Monitor monitor;
    private Motherboard motherboard;

    // Composition:
    //  - has a case, a monitor, and a motherboard
    //  - saying this class has properties of various objects
    //  - of other classes
    //
    // Use composition here because
    // Java can only inherit 1 class at a time

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Fancy graphics
        // Instructor says you could use the getter, instead of accessing the variable directly
        // For example: getMonitor().drawPixelAt(1, 1, "red");
        // but not necessary, in this case
        // different from Rails, where Adam told us that it's better
        // to use the getter in case you have some logic in there
        // that changes the instance variable in some way, outside
        // of the constructor
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
