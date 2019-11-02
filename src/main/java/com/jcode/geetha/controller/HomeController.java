package com.jcode.geetha.controller;

import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.ViewEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Lakshan harischandra
 * Date: 18/10/2019
 * Time: 22:40
 * Project: geetha.
 */
@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /*
    Home page actions comes here
    */
    @GetMapping(path = RequestEndPoints.GET_HOME_PAGE)
    public String getHomePage() {
        logger.info("Home page page requested ...");
        return ViewEndPoints.HOME_PAGE;
    }

    @GetMapping(path = RequestEndPoints.GET_SONGS_PAGE)
    public String getSongsPage() {
        logger.info("Songs page page requested ...");
        return ViewEndPoints.SONGS_PAGE;
    }

    @GetMapping(path = RequestEndPoints.GET_LEADER_BOARD_PAGE)
    public String getLeaderBoardPage() {
        logger.info("Leader board page page requested ...");
        return ViewEndPoints.LEADER_BOARD_PAGE;
    }

    @GetMapping(path = RequestEndPoints.GET_ABOUT_US_PAGE)
    public String getAboutUsPage() {
        logger.info("About us page page requested ...");
        return ViewEndPoints.ABOUT_US;
    }

}
