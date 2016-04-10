package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album album = new Album();
        album.addSong("Fire", 3);
        album.addSong("Skinny Love", 3);
        album.addSong("Hello", 5);

        Playlist jacindaFaves = new Playlist("Jacinda Faves");
        jacindaFaves.addSong("Fire", 3);
        jacindaFaves.addSong("Skinny Love", 4);
        jacindaFaves.addSong("Hello", 5);

        executeMenu(jacindaFaves);
    }

    public static void printMenu() {
        System.out.println("\n1 - Print menu");
        System.out.println("2 - Go to next song");
        System.out.println("3 - Go to previous song");
        System.out.println("4 - Replay current song");
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
                    printNextIndex(iterator);
                    goingForward = true;
                    break;
                case '3':
                    goingForward = false;
                    currentPlaylist.previousSong(iterator);
                    printNextIndex(iterator);
                    break;
                case '4':
                    currentPlaylist.replayCurrentSong(goingForward, iterator);
                    goingForward = false;
                    printNextIndex(iterator);
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
