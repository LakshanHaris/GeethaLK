package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.*;
import com.jcode.geetha.model.Post;
import com.jcode.geetha.model.User;
import com.jcode.geetha.repository.PostRepository;
import com.jcode.geetha.repository.UserRepository;
import com.jcode.geetha.service.AuthorizationService;
import com.jcode.geetha.service.UserService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.CommonUtil;
import com.jcode.geetha.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Autowired
    private PostRepository postRepository;

    @Override
    public ResponseDTO<AuthorizeDTO> saveUser(UserDTO user) throws Exception {
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

    @Override
    public ResponseDTO<UserDTO> updateUser(User updateUser) {
        ResponseDTO responseDTO;
        User existingUser = userRepository.findByUserId(updateUser.getUserId());
        if (Objects.nonNull(existingUser)) {
            updateUser.setDob(existingUser.getDob());
            updateUser.setGender(existingUser.getGender());
            updateUser.setUserName(existingUser.getUserName());
            updateUser.setPassword(existingUser.getPassword());
            updateUser.setRank(existingUser.getRank());
            updateUser.setRoleId(existingUser.getRoleId());
            UserDTO updatedUserDTO = CommonUtil.getUserDTOFromUser(userRepository.saveAndFlush(updateUser));
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.USER_UPDATED_SUCCESSFULLY, updatedUserDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.USER_UPDATED_FAILED);
        }
        return responseDTO;
    }

    @Override
    public ResponseDTO<UserDetailPageDTO> getUserPosts(Long userId) {
        ResponseDTO responseDTO;
        List<PostDTO> postDTOList = postRepository.getUserPosts(userId, new PageRequest(0, 10));
        if (Objects.nonNull(postDTOList)) {
            UserDetailPageDTO userDetailPageDTO = new UserDetailPageDTO();
            userDetailPageDTO.setPostDTOList(postDTOList);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.POSTS_FETCHED_SUCCESS_FOR_USER_DETAIL_PAGE, userDetailPageDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.POSTS_FETCHED_FAILED_FOR_USER_DETAIL_PAGE);
        }
        return responseDTO;
    }

    @Override
    public ResponseDTO<PostDTO> updateUserPost(PostDTO postDTO) {
        ResponseDTO responseDTO;
            int updatedPost = postRepository.updateUserPost(postDTO.getContent(),postDTO.getMainHeader(),postDTO.getPostId());
            if (updatedPost>0) {
                PostDTO updatedPostDTO = postRepository.findUserPostDTOWithPostId(postDTO.getPostId());
                responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.USER_POST_SUCCESSFULLY_UPDATED, updatedPostDTO);
            } else {
                responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.USER_POST_UPDATE_FAILED);
            }

        return responseDTO;
    }

}
