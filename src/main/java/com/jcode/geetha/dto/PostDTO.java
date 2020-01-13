package com.jcode.geetha.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Lakshan harischandra
 * Date: 16/11/2019
 * Time: 14:14
 * Project: geetha.
 */
public class PostDTO implements Serializable {

    private Long postId;
    private String content;
    private String mainHeader;
    private BigInteger likes;
    private BigInteger dislikes;
    private BigInteger shares;
    private Double views;
    private String userName;
    private String songName;
    private Date datePosted;

    public PostDTO() {
    }

    public PostDTO(Long postId, String content, String mainHeader, BigInteger likes, BigInteger dislikes, BigInteger shares, Double views, Date datePosted, String userName, String songName) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
        this.views = views;
        this.userName = userName;
        this.songName = songName;
        this.datePosted = datePosted;
    }

    public PostDTO(Long postId, String content, String mainHeader, BigInteger likes, BigInteger dislikes, BigInteger shares, Double views, Date datePosted, String songName) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
        this.views = views;
        this.datePosted = datePosted;
        this.songName = songName;
    }

    public PostDTO(Long postId, String content, String mainHeader, BigInteger likes, BigInteger dislikes, BigInteger shares, Double views, Date datePosted) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
        this.views = views;
        this.datePosted = datePosted;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMainHeader() {
        return mainHeader;
    }

    public void setMainHeader(String mainHeader) {
        this.mainHeader = mainHeader;
    }

    public BigInteger getLikes() {
        return likes;
    }

    public void setLikes(BigInteger likes) {
        this.likes = likes;
    }

    public BigInteger getDislikes() {
        return dislikes;
    }

    public void setDislikes(BigInteger dislikes) {
        this.dislikes = dislikes;
    }

    public BigInteger getShares() {
        return shares;
    }

    public void setShares(BigInteger shares) {
        this.shares = shares;
    }

    public Double getViews() {
        return views;
    }

    public void setViews(Double views) {
        this.views = views;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return songName;
    }

    public void setName(String name) {
        this.songName = name;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }
}
