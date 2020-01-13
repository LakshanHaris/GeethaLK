package com.jcode.geetha.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class PostingDTO implements Serializable {

    private Long postId;
    private String content;
    private String mainHeader;
    private BigInteger likes;
    private BigInteger dislikes;
    private BigInteger shares;
    private Double views;
    private String userName;
    private int songId;
    private Long userId;
    private int approvalId;

    public PostingDTO(Long postId, String content, String mainHeader, BigInteger likes, BigInteger dislikes, BigInteger shares, Double views, String userName, int songId, Long userId, int approvalId) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
        this.likes = likes;
        this.dislikes = dislikes;
        this.shares = shares;
        this.views = views;
        this.userName = userName;
        this.songId = songId;
        this.userId = userId;
        this.approvalId = approvalId;
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

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(int approvalId) {
        this.approvalId = approvalId;
    }
}
