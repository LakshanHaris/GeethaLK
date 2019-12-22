package com.jcode.geetha.controller;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.enums.SessionTypeEnum;
import com.jcode.geetha.model.User;
import com.jcode.geetha.service.UserService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.SessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
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
    public ResponseDTO saveUser(@ModelAttribute("user") UserDTO user, HttpSession session) {
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

    @ResponseBody
    @PostMapping(path = RequestEndPoints.UPDATE_USER_DETAILS)
    public ResponseDTO updateUser(@RequestParam("userId") Long userId, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
                                  @RequestParam("mobile") String mobile, @RequestParam("email") String email, @RequestParam("picture") MultipartFile picture, HttpSession session) {

        if (Objects.nonNull(userId) && Objects.nonNull(firstName) && Objects.nonNull(lastName) && Objects.nonNull(mobile) && Objects.nonNull(email) && Objects.nonNull(picture)) {
            try {
                byte[] avator = picture.getBytes();
                User updateUser = new User();
                updateUser.setUserId(userId);
                updateUser.setFirstName(firstName);
                updateUser.setLastName(lastName);
                updateUser.setMobile(mobile);
                updateUser.setEmail(email);
                updateUser.setPicture(avator);
                ResponseDTO<UserDTO> responseDTO = userService.updateUser(updateUser);
                if (Objects.nonNull(responseDTO)) {
                    SessionUtil.setAttributesToSession(session, SessionUtil.USER_DATA, responseDTO.getData(), SessionTypeEnum.USER_DETAILS.getNote());
                    logger.info(LoggerUtil.setLoggerInfo(responseDTO.getData().getUserName(), this.getClass().toString(), SessionUtil.USER_DETAILS_DATA_UPDATED_TO_SESSION));
                }
                return responseDTO;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
