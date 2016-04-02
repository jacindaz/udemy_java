package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<String>();
        playlist.add("Sorry");
        playlist.add("The Other");

        WestCoastSwing someDance = new WestCoastSwing(playlist);

        someDance.spin(3);
        someDance.playSong("Sorry");
        printPlaylist(someDance.getPlaylist());
    }

    public static void printPlaylist(ArrayList<String> list) {
        System.out.println("\n==========");

        for(String item : list){
            System.out.println("Song number " +(list.indexOf(item) + 1) + ": "  + item + "");
        }
        System.out.println("==========\n");
    }
}
