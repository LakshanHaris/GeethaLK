package com.jcode.geetha.controller;

import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.ViewEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Lakshan harischandra
 * Date: 13/10/2019
 * Time: 15:36
 * Project: geetha.
 */
@Controller
public class UserAuthorizationController {

    private final Logger logger = LoggerFactory.getLogger(UserAuthorizationController.class);

    /*
    User log in/out comes here
    */
    @GetMapping(path = RequestEndPoints.GET_SIGN_IN_PAGE)
    public String getSignInPage() {
        logger.info("Sign in page requested ...");
        return ViewEndPoints.SIGN_IN_PAGE;
    }

}
