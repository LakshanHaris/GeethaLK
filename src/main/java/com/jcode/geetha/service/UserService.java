package com.jcode.geetha.service;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.UserDTO;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/

public interface UserService {
    ResponseDTO<AuthorizeDTO> saveUser(UserDTO user);
}
