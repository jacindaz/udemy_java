package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by jacindazhong on 2/14/16.
 */
public class Playlist {
    private LinkedList<Song> songs;
    private String name;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }
    public LinkedList<Song> getSongs() { return songs; }

    public void addSong(String name, int duration) {
        // if song already exists in its albums
        // add it to the Playlist songs ArrayList
        Song song = new Song(name, duration);

        if(song.getHasAlbum() == true){
            songs.add(song);
            System.out.println(song.getTitle() + " added to playlist " + this.getName());
        } else {
            System.out.println("\n");
            System.out.println("Song cannot be added, must be part of an album.");
        }
    }

    public void nextSong(ListIterator<Song> iterator) {
        if(iterator.hasNext()) {
            System.out.println("Playing the next song: " + iterator.next().getTitle());
//            printNextIndex(iterator);
        } else {
            System.out.println("You are playing the last song in the playlist.");
        }
    }

    public Song previousSong(ListIterator<Song> iterator) {
        Song previousSong;

        if(iterator.hasPrevious() && iterator.previousIndex() != 0) {
            iterator.previous();
            previousSong = iterator.previous();
            System.out.println("Playing the previous song: " + previousSong.getTitle());
        } else if(iterator.previousIndex() == 0) {
            previousSong = iterator.previous();
            System.out.println("Playing the previous song: " + previousSong.getTitle());
        } else {
            iterator.next();
            previousSong = iterator.previous();
            System.out.println("You are already playing the first song in the playlist.");
        }

        return previousSong;
    }

    public void printPlaylistSongs() {
        System.out.println("Printing " + this.getName() + "'s songs:");

        for(Song s : this.songs) {
            System.out.println(s.getTitle());
        }
    }

    public void replayCurrentSong(boolean goingForward, ListIterator<Song> iterator) {
        if(goingForward == true && iterator.hasPrevious()) {
            iterator.previous();
            System.out.println("Current song: " + iterator.next().getTitle());
        } else {
            iterator.next();
            System.out.println("Current song: " + iterator.previous().getTitle());
        }
    }

    private void printNextIndex(ListIterator<Song> iterator) {
        System.out.println("Next index: " + iterator.nextIndex() + "\n");
    }
}
