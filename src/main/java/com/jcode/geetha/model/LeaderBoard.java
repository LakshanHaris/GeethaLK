package com.jcode.geetha.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Lakshan harischandra
 */
@Entity
@Table(name = "leaderboard")
public class LeaderBoard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "leader_board_id")
    private Integer leaderBoardId;
    @Size(max = 55, message = "Maximum character size exceeded for userName remark - 55")
    @Column(name = "user_name")
    @Basic(optional = false)
    private String userName;
    @Column(name = "rank")
    @Basic(optional = false)
    private Integer rank;
    @Column(name = "likes_count")
    @Basic(optional = false)
    private Long likesCount;
    @Column(name = "post_count")
    @Basic(optional = false)
    private Long postCount;

    public LeaderBoard() {
    }

    public Integer getLeaderBoardId() {
        return leaderBoardId;
    }

    public void setLeaderBoardId(Integer leaderBoardId) {
        this.leaderBoardId = leaderBoardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Long getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Long likesCount) {
        this.likesCount = likesCount;
    }

    public Long getPostCount() {
        return postCount;
    }

    public void setPostCount(Long postCount) {
        this.postCount = postCount;
    }

}
