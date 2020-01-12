package com.jcode.geetha.dto;

import java.io.Serializable;
import java.math.BigInteger;

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
    private String name;

    public PostDTO() {
    }

    public PostDTO(Long postId, String content, String mainHeader, BigInteger likes, BigInteger dislikes, BigInteger shares, Double views, String userName, String name) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
        this.views = views;
        this.userName = userName;
        this.name = name;
    }

    public PostDTO(Long postId, String content, String mainHeader, BigInteger likes, BigInteger dislikes, BigInteger shares, Double views, String name) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
        this.views = views;
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
