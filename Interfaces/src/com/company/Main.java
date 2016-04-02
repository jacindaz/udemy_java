package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        WestCoastSwing someDance = new WestCoastSwing();
//        WestCoastSwing someMusic = new WestCoastSwing();

        someDance.spin(3);
        someDance.playSong("Sorry");
        printArrayList(someDance.getPlaylist());
    }

    public static void printArrayList(ArrayList<String> list) {
        for(String item : list){
            System.out.println(item + "\n");
        }
    }
}
