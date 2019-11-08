package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.model.Role;
import com.jcode.geetha.model.User;
import com.jcode.geetha.repository.UserRepository;
import com.jcode.geetha.service.UserService;
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
    public boolean saveUser(UserDTO user) {
        return Objects.nonNull(userRepository.save(getUserFromUserDTO(user)));
    }

    private User getUserFromUserDTO(UserDTO user) {
        User newUser = new User();
        newUser.setUserName(user.getUserName());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setDob(Date.valueOf(user.getDob()));
        newUser.setMobile(user.getMobile());
        newUser.setGender(user.getGender());
        newUser.setRoleId(new Role(Integer.parseInt(user.getRole())));
        newUser.setPassword(SecurityUtil.hashPassword(user.getPassword()));
        return newUser;
    }

}
