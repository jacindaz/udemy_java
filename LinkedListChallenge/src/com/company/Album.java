package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by jacindazhong on 2/14/16.
 */
public class Album {
    private LinkedList<Song> songs;

    public void addSong(Song song) {
        if(hasSong(song) == false) {
            songs.add(song);
        }

        System.out.println("\n===============");
        System.out.println("Added song with title: " + song.getTitle());
        System.out.println("===============\n");
    }

    public Album() {
        this.songs = new LinkedList<Song>();
    }

    private boolean hasSong(Song song) {
        // does the songs LinkedList already have this song?
        ListIterator<Song> iterator = songs.listIterator();

        while(iterator.hasNext()) {
            if(song.equals(iterator.next())) {
                System.out.println("Song already exists in Album.");
                return true;
            }
        }

        return false;
    }
}
