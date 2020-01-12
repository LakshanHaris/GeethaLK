package com.jcode.geetha.controller;

import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.SongPageDTO;
import com.jcode.geetha.service.SongService;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 11:13 AM
 * Project: geetha.
 */
@RestController
@CrossOrigin(RequestEndPoints.REACT_CROSS_ORIGIN)
public class SongController {

    private final Logger logger = LoggerFactory.getLogger(SongController.class);

    @Autowired
    SongService songService;

    /*
    Song page actions comes here
    */
    @ResponseBody
    @GetMapping(path = RequestEndPoints.GET_SONGS_PAGE)
    public ResponseDTO getAllSongPage() {
        ResponseDTO<SongPageDTO> responseDTO = songService.getAllSongPageData();
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

    @ResponseBody
    @GetMapping(path = RequestEndPoints.GET_TOP_TEN_POSTS)
    public ResponseDTO getLatestTopTenSongs() {
        ResponseDTO<SongPageDTO> responseDTO = songService.getLatestTopTenSongs();
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

    @ResponseBody
    @GetMapping(path = RequestEndPoints.GET_MOST_LIKED_SONGS)
    public ResponseDTO getMostLikedSongs() {
        ResponseDTO<SongPageDTO> responseDTO = songService.getMostLikedSongs();
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

    @ResponseBody
    @GetMapping(path = RequestEndPoints.GET_TRENDING_SONGS)
    public ResponseDTO getTrendingSongs() {
        ResponseDTO<SongPageDTO> responseDTO = songService.getTrendingSongs();
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

    @ResponseBody
    @PostMapping(path = RequestEndPoints.GET_POSTS_FOR_SONG)
    public ResponseDTO getDataForSong(@RequestParam("songId") int songId) {
        ResponseDTO<SongPageDTO> responseDTO = songService.getSongData(songId);
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

    @ResponseBody
    @GetMapping(path = RequestEndPoints.UPDATE_SONG_LIKES)
    public ResponseDTO likeForSong(@RequestParam("songId") int songId) {
        ResponseDTO responseDTO = songService.updateSongLikeCount(songId);
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

}
