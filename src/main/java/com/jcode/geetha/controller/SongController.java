package com.jcode.geetha.controller;

import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.SongPageDTO;
import com.jcode.geetha.service.SongService;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.ResponseUtil;
import com.jcode.geetha.util.ViewEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 11:13 AM
 * Project: geetha.
 */
@Controller
public class SongController {

    private final Logger logger = LoggerFactory.getLogger(SongController.class);

    @Autowired
    SongService songService;

    /*
    Song page actions comes here
    */
    @GetMapping(path = RequestEndPoints.GET_SONGS_PAGE)
    public ModelAndView getSongPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ViewEndPoints.SONGS_PAGE);
        ResponseDTO<SongPageDTO> responseDTO = songService.getLatestTopTenSongs();
        if (Objects.nonNull(responseDTO)) {
            mav.addObject(ResponseUtil.RESPONSE_DATA, responseDTO);
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        } else {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return mav;
    }

}
