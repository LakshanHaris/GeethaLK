package com.jcode.geetha.service;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;

import java.util.Map;

/**
 * Created by Lakshan harischandra
 * Date: 02/11/2019
 * Time: 20:14
 * Project: geetha.
 */

public interface AuthorizationService {
    ResponseDTO<AuthorizeDTO> authorizeUser(String email, String password);
    ResponseDTO<AuthorizeDTO> verifyEmail(String email);
    Map<Integer, String> getUserPrivileges(int roleId);
}
