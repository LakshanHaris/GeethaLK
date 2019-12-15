package com.jcode.geetha.controller;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.enums.SessionTypeEnum;
import com.jcode.geetha.service.UserService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /*
    User actions comes here
    */
    @ResponseBody
    @PostMapping(path = RequestEndPoints.SAVE_USER)
    public ResponseDTO saveUser(@ModelAttribute("user") UserDTO user, ModelAndView mav, HttpSession session) {
        ResponseDTO<AuthorizeDTO> responseDTO = new ResponseDTO<>();
        try {
            responseDTO = userService.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Objects.nonNull(responseDTO.getData().getUserDTO()) && responseDTO.getSuccessOrFail().equalsIgnoreCase(CommonMessages.RESPONSE_DTO_SUCCESS)) {
            SessionUtil.setAttributesToSession(session, SessionUtil.USER_DATA, responseDTO.getData().getUserDTO(), SessionTypeEnum.USER_DETAILS.getNote());
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        } else {
            logger.warn(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

}
