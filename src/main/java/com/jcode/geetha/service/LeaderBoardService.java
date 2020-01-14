package com.jcode.geetha.service;

import com.jcode.geetha.dto.LeaderBoardDTO;
import com.jcode.geetha.dto.ResponseDTO;

public interface LeaderBoardService {
    ResponseDTO<LeaderBoardDTO> getLeaderBoardData();
}
