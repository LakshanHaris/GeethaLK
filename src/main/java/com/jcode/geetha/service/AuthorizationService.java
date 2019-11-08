package com.jcode.geetha.service;

        import com.jcode.geetha.dto.AuthorizeDTO;
        import com.jcode.geetha.dto.ResponseDTO;

/**
 * Created by Lakshan harischandra
 * Date: 02/11/2019
 * Time: 20:14
 * Project: geetha.
 */

public interface AuthorizationService {
    ResponseDTO<AuthorizeDTO> authorizeUser(String email, String password);
}
