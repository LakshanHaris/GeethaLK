package com.jcode.geetha.dto;

import java.io.Serializable;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 12:09 PM
 * Project: geetha.
 */

public class SongDTO implements Serializable {

    private String artist;
    private String name;
    private String type;
    private String mp3;
    private String musicBy;
    private String lyricsBy;
    private int numOfPosts;

    public SongDTO() {
    }

    public SongDTO(String artist, String name, String type, String mp3, String musicBy, String lyricsBy, int numOfPosts) {
        this.artist = artist;
        this.name = name;
        this.type = type;
        this.mp3 = mp3;
        this.musicBy = musicBy;
        this.lyricsBy = lyricsBy;
        this.numOfPosts = numOfPosts;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMp3() {
        return mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = mp3;
    }

    public String getMusicBy() {
        return musicBy;
    }

    public void setMusicBy(String musicBy) {
        this.musicBy = musicBy;
    }

    public String getLyricsBy() {
        return lyricsBy;
    }

    public void setLyricsBy(String lyricsBy) {
        this.lyricsBy = lyricsBy;
    }

    public int getNumOfPosts() {
        return numOfPosts;
    }

    public void setNumOfPosts(int numOfPosts) {
        this.numOfPosts = numOfPosts;
    }
}
