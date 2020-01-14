package com.jcode.geetha.dto;

import com.jcode.geetha.model.LeaderBoard;

import java.io.Serializable;
import java.util.List;

public class LeaderBoardDTO implements Serializable {

    private List<LeaderBoard> leaderBoardList;

    public List<LeaderBoard> getLeaderBoardList() {
        return leaderBoardList;
    }

    public void setLeaderBoardList(List<LeaderBoard> leaderBoardList) {
        this.leaderBoardList = leaderBoardList;
    }

}
