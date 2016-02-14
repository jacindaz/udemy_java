package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Song fire = new Song("Fire", 3);
        Song skinnyLove = new Song("Skinny Love", 3);
        Song hello = new Song("Hello", 4);

        Album album = new Album();
        album.addSong(fire);
        album.addSong(skinnyLove);
        album.addSong(hello);

        Playlist jacindaFaves = new Playlist("Jacinda Faves");
        jacindaFaves.addSong(fire);
        jacindaFaves.addSong(skinnyLove);
        jacindaFaves.addSong(hello);

        executeMenu(jacindaFaves);
    }

    public static void printMenu() {
        System.out.println("\n1 - Print menu");
        System.out.println("2 - Go to next song");
        System.out.println("3 - Go to previous song");
        System.out.println("4 - Reply current song");
        System.out.println("5 - List the songs in a playlist");
        System.out.println("6 - Quit\n");
    }

    public static void executeMenu(Playlist currentPlaylist) {
        boolean done = false;
        boolean goingForward = true;
        ListIterator<Song> iterator = currentPlaylist.getSongs().listIterator();
        printMenu();

        while(done == false) {
            String selection = scanner.next();
            char charSelection = selection.charAt(0);

            switch (charSelection) {
                case '1':
                    printMenu();
                    break;
                case '2':
                    if(goingForward == false) {
                        iterator.next();
                    }
                    currentPlaylist.nextSong(iterator);
                    goingForward = true;
                    break;
                case '3':
                    goingForward = false;
                    currentPlaylist.previousSong(iterator);
                    break;
                case '4':
                    System.out.println("Reply current song");
                    break;
                case '5':
                    currentPlaylist.printPlaylistSongs();
                    break;
                case '6':
                    System.out.println("Quitting program");
                    done = true;
            }
            System.out.println();
        }
    }

    public static void printNextIndex(ListIterator<Song> iterator) {
        System.out.println("This is the next index: " + iterator.nextIndex());
    }
}
