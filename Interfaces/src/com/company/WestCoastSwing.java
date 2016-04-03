package com.company;

import java.util.ArrayList;

/**
 * Created by jacinda on 4/1/16.
 */
public class WestCoastSwing implements Dance, Music {
    ArrayList<String> playlist = new ArrayList<String>();

    public WestCoastSwing(ArrayList playlist) { this.playlist = playlist; }
    public WestCoastSwing() { this.playlist = new ArrayList(); }
    public ArrayList getPlaylist() { return this.playlist; }

    @Override
    public void spin(int numSpins) {
        System.out.println("I am spinning " + numSpins + " times!");
    }

    @Override
    public void basic(int numBasics) {
        // for(int i : numBasics)
        // how to implement Ruby .times method here ???
        // for now, just prints out this one line,
        // doesn't use passed in argument
        System.out.println("Back to (anchor) basics, yo");
    }

    // Music interface methods

    @Override
    public void addSong(String songName) {
        this.playlist.add(songName);
    }

    @Override
    public void playSong(String songName) {
        System.out.println("My song name is: " + songName);
    }

    public void toString(ArrayList<String> list) {
        System.out.println("\n==========");

        for (String item : list) {
            System.out.println("Song number " + (list.indexOf(item) + 1) + ": " + item + "");
        }
        System.out.println("==========\n");
    }
}
