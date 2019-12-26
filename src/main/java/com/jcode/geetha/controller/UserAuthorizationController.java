package com.jcode.geetha.controller;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.enums.SessionTypeEnum;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 13/10/2019
 * Time: 15:36
 * Project: geetha.
 */
@RestController
@CrossOrigin(RequestEndPoints.REACT_CROSS_ORIGIN)
public class UserAuthorizationController {

    private final Logger logger = LoggerFactory.getLogger(UserAuthorizationController.class);

    @Autowired
    private AuthorizationService authorizationService;

    /*
    User log in/out comes here
    */
    @GetMapping(path = RequestEndPoints.GET_SIGN_IN_PAGE)
    public String getSignInPage() {
        logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), "Sign in page requested"));
        return ViewEndPoints.SIGN_IN_PAGE;
    }

    @ResponseBody
    @PostMapping(path = RequestEndPoints.GET_SIGN_IN_PAGE)
    public ResponseDTO signIn(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password, HttpSession session) {
        ResponseDTO<AuthorizeDTO> responseDTO = new ResponseDTO<>();
        if (Objects.nonNull(email) && Objects.nonNull(password)) {
            responseDTO = authorizationService.authorizeUser(email, password);
            if (Objects.nonNull(responseDTO.getData()) && responseDTO.getSuccessOrFail().equalsIgnoreCase(CommonMessages.RESPONSE_DTO_SUCCESS)) {
                SessionUtil.setAttributesToSession(session, SessionUtil.USER_DATA, responseDTO.getData().getUserDTO(), SessionTypeEnum.USER_DETAILS.getNote());
                logger.info(LoggerUtil.setLoggerInfo(responseDTO.getData().getUserDTO().getUserName(), this.getClass().toString(), responseDTO.getMessage()));
            } else {
                logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
            }
        }
        return responseDTO;
    }

    @PostMapping(path = RequestEndPoints.VERIFY_EMAIL)
    @ResponseBody
    public ResponseDTO verifyEmail(@RequestParam(name = "email") String email) {
        ResponseDTO<AuthorizeDTO> responseDTO = authorizationService.verifyEmail(email);
        logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        return responseDTO;
    }

}
