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

    // Music interface methods

    @Override
    public void addSong(String songName) {
        this.playlist.add(songName);
    }

    @Override
    public void playSong(String songName) {
        System.out.println("My song name is: " + songName);
    }
}
