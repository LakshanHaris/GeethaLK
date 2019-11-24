package com.jcode.geetha.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author Lakshan harischandra
 */
@Entity
@Table(name = "post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "post_id")
    private Long postId;
    @Basic(optional = false)
    @NotNull(message = "Post content should not be null")
    @Size(min = 1, max = 200, message = "Maximum character length exceeded for post content - 200")
    @Column(name = "content")
    private String content;
    @Basic(optional = false)
    @NotNull(message = "Post main header should not be null")
    @Size(min = 1, max = 45, message = "Maximum character length exceeded for post main header - 45")
    @Column(name = "main_header")
    private String mainHeader;
    @Column(name = "likes")
    private BigInteger likes;
    @Column(name = "dislikes")
    private BigInteger dislikes;
    @Column(name = "shares")
    private BigInteger shares;
    @Column(name = "views")
    private Double views;
    @JoinColumn(name = "post_approval_id", referencedColumnName = "approval_id")
    @ManyToOne(optional = false)
    private Approval approvalId;
    @JoinColumn(name = "post_song_id", referencedColumnName = "song_id")
    @ManyToOne(optional = false)
    private Song songId;
    @JoinColumn(name = "post_user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User userId;

    public Post() {
    }

    public Post(Long postId) {
        this.postId = postId;
    }

    public Post(Long postId, String content, String mainHeader) {
        this.postId = postId;
        this.content = content;
        this.mainHeader = mainHeader;
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

    public Approval getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Approval approvalId) {
        this.approvalId = approvalId;
    }

    public Song getSongId() {
        return songId;
    }

    public void setSongId(Song songId) {
        this.songId = songId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postId != null ? postId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.postId == null && other.postId != null) || (this.postId != null && !this.postId.equals(other.postId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Post[ postId=" + postId + " ]";
    }

}
