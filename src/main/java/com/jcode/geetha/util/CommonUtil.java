package com.jcode.geetha.util;

import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.model.Role;
import com.jcode.geetha.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 11/11/2019
 * Time: 22:32
 * Project: geetha.
 */
public class CommonUtil {

    public static User getUserFromUserDTO(UserDTO user) throws Exception {
        if (Objects.nonNull(user)) {
            User newUser = new User();
            newUser.setUserName(user.getUserName());
            newUser.setFirstName(user.getFirstName());
            newUser.setLastName(user.getLastName());
            newUser.setEmail(user.getEmail());
            newUser.setDob(convertStringToDate(user.getDob()));
            newUser.setMobile(user.getMobile());
            newUser.setGender(user.getGender());
            newUser.setPicture(user.getPicture());
            newUser.setRoleId(new Role(3));
            newUser.setPassword(SecurityUtil.hashPassword(user.getPassword()));
            return newUser;
        }
        return null;
    }

    public static UserDTO getUserDTOFromUser(User user) {
        if (Objects.nonNull(user)) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserName(user.getUserName());
            userDTO.setFirstName(user.getFirstName());
            userDTO.setLastName(user.getLastName());
            userDTO.setDob(user.getDob().toString());
            userDTO.setEmail(user.getEmail());
            userDTO.setGender(user.getGender());
            userDTO.setMobile(user.getMobile());
            userDTO.setPicture(user.getPicture());
            userDTO.setRole(user.getRoleId().getRoleId());
            return userDTO;
        }
        return null;
    }

    public static Date convertStringToDate(String date) throws Exception {
        Date dateObj = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return dateObj;
    }

}
