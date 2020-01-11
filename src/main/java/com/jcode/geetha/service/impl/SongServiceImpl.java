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

    @Override
    public ResponseDTO<SongPageDTO> getMostLikedSongs() {
        ResponseDTO responseDTO;
        List<SongDTO> mostLikedSongs = songRepository.getMostLikedSongs(new PageRequest(0, 10));
        if (Objects.nonNull(mostLikedSongs)) {
            SongPageDTO songPageDTO = new SongPageDTO();
            songPageDTO.setMostLikedSongsList(mostLikedSongs);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.MOST_LIKED_SONGS_FETCHED_SUCCESS, songPageDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.MOST_LIKED_SONGS_FETCHED_FAILED);
        }
        return responseDTO;
    }

    @Override
    public ResponseDTO<SongPageDTO> getTrendingSongs() {
        ResponseDTO responseDTO;
        List<SongDTO> trendingSongs = songRepository.getTrendingSongs(new PageRequest(0, 10));
        if (Objects.nonNull(trendingSongs)) {
            SongPageDTO songPageDTO = new SongPageDTO();
            songPageDTO.setTrendingSongsList(trendingSongs);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.TRENDING_SONGS_FETCHED_SUCCESS, songPageDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.TRENDING_SONGS_FETCHED_FAILED);
        }
        return responseDTO;
    }

    @Override
    public ResponseDTO<SongPageDTO> getAllSongPageData() {
        ResponseDTO responseDTO;
        List<SongDTO> latestTenSongs = songRepository.getLatestTopTenSongs(new PageRequest(0, 10));
        List<SongDTO> mostLikedSongs = songRepository.getMostLikedSongs(new PageRequest(0, 10));
        List<SongDTO> trendingSongs = songRepository.getTrendingSongs(new PageRequest(0, 10));
        if (Objects.nonNull(latestTenSongs) && Objects.nonNull(mostLikedSongs) && Objects.nonNull(trendingSongs)) {
            SongPageDTO songPageDTO = new SongPageDTO();
            songPageDTO.setLatestTopTenSongList(latestTenSongs);
            songPageDTO.setMostLikedSongsList(mostLikedSongs);
            songPageDTO.setTrendingSongsList(trendingSongs);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.ALL_SONG_PAGE_DATA_FETCHED_SUCCESS, songPageDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.ALL_SONG_PAGE_DATA_FETCHED_FAILED);
        }
        return responseDTO;
    }

}
