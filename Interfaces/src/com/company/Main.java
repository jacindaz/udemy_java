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
        someDance.toString(someDance.getPlaylist());

        someDance.basic(2);
    }
}
