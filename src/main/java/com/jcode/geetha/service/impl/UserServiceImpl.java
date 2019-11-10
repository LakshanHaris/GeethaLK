package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.model.Role;
import com.jcode.geetha.model.User;
import com.jcode.geetha.repository.UserRepository;
import com.jcode.geetha.service.UserService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.ResponseUtil;
import com.jcode.geetha.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Objects;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseDTO<UserDTO> saveUser(UserDTO user) {
        ResponseDTO responseDTO;
        UserDTO savedUser = getUserDTOFromUser(userRepository.save(getUserFromUserDTO(user)));
        if(Objects.nonNull(savedUser)){
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS,CommonMessages.USER_SAVED_SUCCESSFULLY,savedUser);
        }else{
            responseDTO=ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED,CommonMessages.USER_SAVED_FAILED);
        }
        return responseDTO;
    }

    private User getUserFromUserDTO(UserDTO user) {
        if(Objects.nonNull(user)){
            User newUser = new User();
            newUser.setUserName(user.getUserName());
            newUser.setFirstName(user.getFirstName());
            newUser.setLastName(user.getLastName());
            newUser.setEmail(user.getEmail());
            newUser.setDob(Date.valueOf(user.getDob()));
            newUser.setMobile(user.getMobile());
            newUser.setGender(user.getGender());
            newUser.setRoleId(new Role(3));
            newUser.setPassword(SecurityUtil.hashPassword(user.getPassword()));
            return newUser;
        }
        return null;
    }

    private UserDTO getUserDTOFromUser(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(user.getUserName());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setDob(user.getDob().toString());
        userDTO.setEmail(user.getEmail());
        userDTO.setGender(user.getGender());
        userDTO.setMobile(user.getMobile());
        userDTO.setRole(user.getRoleId().getRoleName());
        return userDTO;


    }

}
