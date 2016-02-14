package com.company;

/**
 * Created by jacindazhong on 2/14/16.
 */
public class Song {
    private String title;
    private int durationMinutes;

    public Song(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }
}
