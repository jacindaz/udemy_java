package com.company;

public class Main {

    public static void main(String[] args) {
        Song song = new Song("Fire", 3);

        Album album = new Album();
        album.addSong(song);
    }
}
