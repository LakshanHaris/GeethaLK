package com.jcode.geetha.service;

import com.jcode.geetha.dto.*;
import com.jcode.geetha.model.Post;
import com.jcode.geetha.model.User;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/

public interface UserService {
    ResponseDTO<AuthorizeDTO> saveUser(UserDTO user) throws Exception;

    ResponseDTO<UserDTO> updateUser(User updateUser);

    ResponseDTO<UserDetailPageDTO> getUserPosts(Long userId);

    ResponseDTO<PostDTO> updateUserPost(PostDTO postDTO);
}
