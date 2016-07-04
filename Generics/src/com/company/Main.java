package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer nicole = new FootballPlayer("Nicole");
        BaseballPlayer bob = new BaseballPlayer("Bob");

        Team<FootballPlayer> jacinda = new Team<>("Team Jacinda");
        jacinda.addPlayer(nicole);

        Team<BaseballPlayer> baseball = new Team<>("Team baseball");
        baseball.addPlayer(bob);
    }
}
