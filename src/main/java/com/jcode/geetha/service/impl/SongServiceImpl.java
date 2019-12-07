package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.SongDTO;
import com.jcode.geetha.dto.SongPageDTO;
import com.jcode.geetha.repository.SongRepository;
import com.jcode.geetha.service.SongService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 11:55 AM
 * Project: geetha.
 */
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public ResponseDTO<SongPageDTO> getLatestTopTenSongs() {
        ResponseDTO responseDTO;
        List<SongDTO> latestTenSongs = songRepository.getLatestTopTenSongs(new PageRequest(0, 10));
        if (Objects.nonNull(latestTenSongs)) {
            SongPageDTO songPageDTO = new SongPageDTO();
            songPageDTO.setLatestTopTenSongList(latestTenSongs);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.LATEST_TOP_TEN_SONGS_FETCHED_SUCCESS, songPageDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.LATEST_TOP_TEN_SONGS_FETCHED_FAILED);
        }
        return responseDTO;
    }

}
