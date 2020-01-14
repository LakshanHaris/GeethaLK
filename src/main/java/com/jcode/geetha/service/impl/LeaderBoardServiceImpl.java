package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.LeaderBoardDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.model.LeaderBoard;
import com.jcode.geetha.repository.LeaderBoardRepository;
import com.jcode.geetha.service.LeaderBoardService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LeaderBoardServiceImpl implements LeaderBoardService {

    @Autowired
    private LeaderBoardRepository leaderBoardRepository;

    @Override
    public ResponseDTO<LeaderBoardDTO> getLeaderBoardData() {
        ResponseDTO responseDTO;
        List<LeaderBoard> leaderBoardDTOList = leaderBoardRepository.getLeaderBoardData(new PageRequest(0, 10));
        if (Objects.nonNull(leaderBoardDTOList)) {
            LeaderBoardDTO leaderBoardDTO = new LeaderBoardDTO();
            leaderBoardDTO.setLeaderBoardList(leaderBoardDTOList);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.LEADERBOARD_DATA_FETCHED_SUCCESSFULLY, leaderBoardDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.LEADERBOARD_DATA_FETCHED_FAILED);
        }
        return responseDTO;
    }

}
