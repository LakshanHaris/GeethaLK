package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.repository.UserRepository;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.service.UserService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.CommonUtil;
import com.jcode.geetha.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public ResponseDTO<AuthorizeDTO> saveUser(UserDTO user) {
        ResponseDTO responseDTO;
        UserDTO savedUser = CommonUtil.getUserDTOFromUser(userRepository.save(CommonUtil.getUserFromUserDTO(user)));
        if (Objects.nonNull(savedUser)) {
            AuthorizeDTO authorizeDTO = new AuthorizeDTO();
            authorizeDTO.setUserDTO(savedUser);
            authorizeDTO.setUserPrivilegesMap(authorizationService.getUserPrivileges(savedUser.getRole()));
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.USER_SAVED_SUCCESSFULLY, authorizeDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.USER_SAVED_FAILED);
        }
        return responseDTO;
    }

}
