package com.company;

public class Main {

    public static void main(String[] args) {
        Dance someDance = new WestCoastSwing();
        Music someMusic = new WestCoastSwing();

        someDance.spin(3);
        someMusic.playSong("Sorry");
    }
}
