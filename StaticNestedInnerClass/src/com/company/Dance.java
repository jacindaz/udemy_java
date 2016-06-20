package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jacindazhong on 4/10/16.
 */
public class Dance {
    private Step danceStep;
    private Spin danceSpin;

    private List<String> testList;

    public Dance() {
        this.danceStep = new Step();
        this.danceSpin = new Spin();
    }

    public Step getDanceStep() {
        return danceStep;
    }
    public Spin getDanceSpin() {
        return danceSpin;
    }

    public void startDancing() {
        danceStep.takeStep();
        danceStep.takeStep();
        danceStep.takeStep();
        danceStep.takeStep();
    }

    public void freestyle(String freestyleMove) {
        Step newStep = new Step();
    }

    private class Step {
        String anchorStep;
        String forward;
        String backward;
        ArrayList<String> steps;


        public Step() {
            this.anchorStep = "Take an anchor step";
            this.forward = "Step forward";
            this.backward = "Step backward";
            this.steps = new ArrayList<String>();
        }

        public String getAnchorStep() {
            return anchorStep;
        }
        public String getForward() {
            return forward;
        }
        public String getBackward() {
            return backward;
        }
        public ArrayList<String> getSteps() {
            return steps;
        }

        private void takeStep() {
            ArrayList<String> allPossibleSteps = new ArrayList<String>();
            allPossibleSteps.add(this.getAnchorStep());
            allPossibleSteps.add(this.getForward());
            allPossibleSteps.add(this.getBackward());

            Random randomGenerator = new Random();
            Integer randomNumber = randomGenerator.nextInt(allPossibleSteps.size());
            System.out.println(allPossibleSteps.get(randomNumber));
        }

        private void takeStepsDebug(Integer randomNumber, ArrayList<String> allPossibleSteps) {
            System.out.println("\n===============");
            System.out.println("Randomly generated number: " + randomNumber);
            System.out.println("Length of array: " + allPossibleSteps.size());
            System.out.println("===============\n");
        }
    }

    private class Spin {
        String doubleSpin;
        String fingerSpin;
        String outerDouble;
        String innerDouble;
        String pivot;
    }
}
