package com.jcode.geetha.controller;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.enums.SessionTypeEnum;
import com.jcode.geetha.service.UserService;
import com.jcode.geetha.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/

@Controller
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /*
    User actions comes here
    */
    @PostMapping(path = RequestEndPoints.SAVE_USER)
    public ModelAndView saveUser(@ModelAttribute("user") UserDTO user, ModelAndView mav, HttpSession session) {
        ResponseDTO<AuthorizeDTO> responseDTO = userService.saveUser(user);
        if (Objects.nonNull(responseDTO.getData().getUserDTO()) && responseDTO.getSuccessOrFail().equalsIgnoreCase(CommonMessages.RESPONSE_DTO_SUCCESS)) {
            mav.addObject(ResponseUtil.RESPONSE_DATA, responseDTO);
            SessionUtil.setAttributesToSession(session, SessionUtil.USER_DATA, responseDTO.getData().getUserDTO(), SessionTypeEnum.USER_DETAILS.getNote());
            mav.setViewName(ViewEndPoints.USER_PROFILE);
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
            return mav;
        } else {
            mav.setViewName(ViewEndPoints.SIGN_UP_PAGE);
            logger.warn(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
            return mav;
        }
    }

}
