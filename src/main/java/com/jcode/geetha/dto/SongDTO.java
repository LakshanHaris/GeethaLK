package com.jcode.geetha.dto;

import java.io.Serializable;
import java.util.Date;

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
    private Date dateOfAdded;
    private int likes;
    private int dislikes;

    public SongDTO() {
    }

    public SongDTO(String artist, String name, String type, String mp3, String musicBy, String lyricsBy, int numOfPosts, Date dateOfAdded, int likes, int dislikes) {
        this.artist = artist;
        this.name = name;
        this.type = type;
        this.mp3 = mp3;
        this.musicBy = musicBy;
        this.lyricsBy = lyricsBy;
        this.numOfPosts = numOfPosts;
        this.dateOfAdded = dateOfAdded;
        this.likes = likes;
        this.dislikes = dislikes;
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

    public Date getDateOfAdded() {
        return dateOfAdded;
    }

    public void setDateOfAdded(Date dateOfAdded) {
        this.dateOfAdded = dateOfAdded;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }
}
