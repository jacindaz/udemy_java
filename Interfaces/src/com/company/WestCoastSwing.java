package com.company;

/**
 * Created by jacinda on 4/1/16.
 */
public class WestCoastSwing implements Dance, Music {
    @Override
    public void spin(int numSpins) {
        System.out.println("I am spinning " + numSpins + " times!");
    }

    @Override
    public void playSong(String songName) {
        System.out.println("My song name is: " + songName);
    }
}
