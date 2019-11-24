package com.jcode.geetha.controller;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import com.jcode.geetha.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by Lakshan harischandra
 * Date: 23/11/2019
 * Time: 00:15
 * Project: geetha.
 */
@RestController
public class RestServiceController {

    private final Logger logger = LoggerFactory.getLogger(RestServiceController.class);

    @Autowired
    private AuthorizationService authorizationService;

    @PostMapping(path = RequestEndPoints.VERIFY_EMAIL)
    @ResponseBody
    public String verifyEmail(@RequestParam(name = "email") String email) {
        ResponseDTO<AuthorizeDTO> responseDTO = authorizationService.verifyEmail(email);
        String responseAsJson = "";
        try {
            responseAsJson = ResponseUtil.getAsJsonStringResponse(responseDTO);
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseAsJson;
    }

}
