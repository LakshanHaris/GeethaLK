package com.jcode.geetha.controller;

import com.jcode.geetha.dto.HomeDTO;
import com.jcode.geetha.dto.PostDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.service.HomeService;
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
 * Date: 18/10/2019
 * Time: 22:40
 * Project: geetha.
 */
@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private HomeService homeService;

    /*
    Home page actions comes here
    */
    @GetMapping(path = RequestEndPoints.GET_HOME_PAGE)
    public ModelAndView getTopTenPosts() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ViewEndPoints.HOME_PAGE);
        ResponseDTO<HomeDTO> responseDTO = homeService.getTopTenPostList();
        if(Objects.nonNull(responseDTO)){
            mav.addObject(ResponseUtil.RESPONSE_DATA, responseDTO);
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return mav;
    }

    @GetMapping(path = RequestEndPoints.GET_SONGS_PAGE)
    public String getSongsPage() {
        logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), "Songs page page requested ..."));
        return ViewEndPoints.SONGS_PAGE;
    }

    @GetMapping(path = RequestEndPoints.GET_LEADER_BOARD_PAGE)
    public String getLeaderBoardPage() {
        logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), "Leader board page page requested ..."));
        return ViewEndPoints.LEADER_BOARD_PAGE;
    }

    @GetMapping(path = RequestEndPoints.GET_ABOUT_US_PAGE)
    public String getAboutUsPage() {
        logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), "About us page page requested ..."));
        return ViewEndPoints.ABOUT_US;
    }

}
