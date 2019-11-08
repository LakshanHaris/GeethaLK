package com.jcode.geetha.controller;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.enums.SessionTypeEnum;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.SessionUtil;
import com.jcode.geetha.util.ViewEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 13/10/2019
 * Time: 15:36
 * Project: geetha.
 */
@Controller
public class UserAuthorizationController {

    private final Logger logger = LoggerFactory.getLogger(UserAuthorizationController.class);

    @Autowired
    private AuthorizationService authorizationService;

    /*
    User log in/out comes here
    */
    @GetMapping(path = RequestEndPoints.GET_SIGN_IN_PAGE)
    public String getSignInPage() {
        logger.info("Sign in page requested ...");
        return ViewEndPoints.SIGN_IN_PAGE;
    }

    @PostMapping(path = RequestEndPoints.GET_SIGN_IN_PAGE)
    public ModelAndView signIn(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user/signin");
        if (Objects.nonNull(email) && Objects.nonNull(password)) {
            ResponseDTO<AuthorizeDTO> responseDTO = authorizationService.authorizeUser(email, password);
            if (Objects.nonNull(responseDTO.getData()) && responseDTO.getSuccessOrFail().equalsIgnoreCase(CommonMessages.RESPONSE_DTO_SUCCESS)) {
                mav.addObject("userDetails", responseDTO.getData().getUser());
                mav.addObject("userPrivileges", responseDTO.getData().getUserPrivilegesMap());
                SessionUtil.setAttributesToSession(session, "userData", responseDTO.getData().getUser(), SessionTypeEnum.USER_DETAILS.getNote());
                mav.setViewName("user/user_profile");
                logger.info("Response result from authorization controller : User access granted with privileges");
                return mav;
            } else {
                mav.addObject("errorResponse", responseDTO);
                logger.warn("Response result from authorization controller : Something went wrong when authorizing user");
                return mav;
            }
        }
        return mav;
    }

}
