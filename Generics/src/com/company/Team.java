package com.company;

import java.util.ArrayList;

/**
 * Created by jacindazhong on 7/3/16.
 */

/** the T is a bounded type parameter
 * so I can restrict the kinds of types allowed to be passed into a type parameter
 * for example: in a method, if you only wanted a method to accept
 * instances of Number
*/

// Here, you can extend a class, and also extend multiple interfaces
// <T extends Player & Interface1 & Interface2>
// but remember you can only extend 1 class, but can extend/implement multiple interfaces
public class Team<T extends Player> implements Comparable<Team<T>> {
    // what is the difference between implements Comparable<Team<T>> and Comparable<Team> ???
    // public class Team<T extends Player> implements Comparable<Team<T>>
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) { this.name = name; }
    public String getName() {return name; }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;

        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
