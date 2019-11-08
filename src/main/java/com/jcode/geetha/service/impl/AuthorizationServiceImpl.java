package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.AuthorizeDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.model.User;
import com.jcode.geetha.repository.PrivilegeRepository;
import com.jcode.geetha.repository.UserRepository;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.ResponseUtil;
import com.jcode.geetha.util.SecurityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Lakshan harischandra
 * Date: 02/11/2019
 * Time: 20:25
 * Project: geetha.
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    private final Logger logger = LoggerFactory.getLogger(AuthorizationServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Override
    public ResponseDTO<AuthorizeDTO> authorizeUser(String email, String password) {
        User searchedUserWithEmail = userRepository.findByEmail(email);
        ResponseDTO responseDTO;
        if (Objects.isNull(searchedUserWithEmail)) {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.USER_NOT_FOUND_FOR_EMAIL);
            logger.warn("Response result from authorization service : " + CommonMessages.USER_NOT_FOUND_FOR_EMAIL);
        } else {
            if (SecurityUtil.matchHashedPassword(password, searchedUserWithEmail.getPassword())) {
                AuthorizeDTO authorizeData = new AuthorizeDTO();
                Map<Integer, String> userPrivilegesMap = privilegeRepository.findPrivilegesByRoleId(searchedUserWithEmail.getRoleId().getRoleId())
                        .stream()
                        .collect(Collectors.toMap(privilege -> privilege.getPrivilegeId(), privilege -> privilege.getPrivilegeName()));
                authorizeData.setUser(searchedUserWithEmail);
                authorizeData.setUserPrivilegesMap(userPrivilegesMap);
                responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.USER_AUTHORIZED_AND_PRIVILEGES_GRANTED, authorizeData);
                logger.info("Response result from authorization service : " + CommonMessages.USER_AUTHORIZED_AND_PRIVILEGES_GRANTED);
                return responseDTO;
            } else {
                responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.EMAIL_AND_PASSWORD_NOT_MATCHED);
                logger.warn("Response result from authorization service : " + CommonMessages.EMAIL_AND_PASSWORD_NOT_MATCHED);
            }
        }
        return responseDTO;
    }

}
