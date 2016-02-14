package com.company;

public class Main {

    public static void main(String[] args) {
        Song fire = new Song("Fire", 3);
        Song skinnyLove = new Song("Skinny Love", 3);

        Album album = new Album();
        album.addSong(fire);

        Playlist jacindaFaves = new Playlist("Jacinda Faves");
        jacindaFaves.addSong(fire);
        jacindaFaves.addSong(skinnyLove);
    }
}
