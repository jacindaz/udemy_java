package com.company;

/**
 * Created by jacindazhong on 2/14/16.
 */
public class Song {
    private String title;
    private int durationMinutes;
    private boolean hasAlbum;

    public Song(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.hasAlbum = false;
    }

    public String getTitle() {
        return title;
    }

    public void setHasAlbum(boolean hasAlbum) {
        this.hasAlbum = hasAlbum;
    }

    public boolean getHasAlbum() {
        return hasAlbum;
    }
}
