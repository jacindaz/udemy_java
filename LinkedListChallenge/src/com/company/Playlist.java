package com.company;

import java.util.ArrayList;

/**
 * Created by jacindazhong on 2/14/16.
 */
public class Playlist {
    private ArrayList<Song> songs;
    private String name;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        // if song already exists in its albums
        // add it to the Playlist songs ArrayList
        if(song.getHasAlbum() == true){
            songs.add(song);
            System.out.println(song.getTitle() + " added to playlist " + this.getName());
        } else {
            System.out.println("\n");
            System.out.println("Song cannot be added, must be part of an album.");
        }
    }
}
