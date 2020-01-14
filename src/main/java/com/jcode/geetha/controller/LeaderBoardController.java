package com.jcode.geetha.controller;

import com.jcode.geetha.dto.LeaderBoardDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.service.LeaderBoardService;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class LeaderBoardController {

    private final Logger logger = LoggerFactory.getLogger(LeaderBoardController.class);

    @Autowired
    private LeaderBoardService leaderBoardService;

    @ResponseBody
    @GetMapping(path = RequestEndPoints.GET_LEADERBOARD_DATA)
    public ResponseDTO getDataForLeaderBoard() {
        ResponseDTO<LeaderBoardDTO> responseDTO = leaderBoardService.getLeaderBoardData();
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

}
