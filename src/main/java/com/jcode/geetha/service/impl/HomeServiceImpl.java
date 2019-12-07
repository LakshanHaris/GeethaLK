package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.*;
import com.jcode.geetha.model.Song;
import com.jcode.geetha.model.User;
import com.jcode.geetha.repository.PostRepository;
import com.jcode.geetha.repository.SongRepository;
import com.jcode.geetha.repository.UserRepository;
import com.jcode.geetha.service.HomeService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 17/11/2019
 * Time: 00:21
 * Project: geetha.
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SongRepository songRepository;

    @Override
    public ResponseDTO<HomeDTO> getTopRatedData() {
        ResponseDTO responseDTO;
        List<PostDTO> topTenPosts = postRepository.getTopTenPostList(new PageRequest(0, 10));
        List<User> topTenUsers = userRepository.getTopTenUsers(new PageRequest(0, 10));
        List<SongDTO> topTenSongs = songRepository.getTopTenSongs(new PageRequest(0, 10));
        if (Objects.nonNull(topTenPosts) && Objects.nonNull(topTenUsers)) {
            HomeDTO homeDTO = new HomeDTO();
            homeDTO.setTopTenPostList(topTenPosts);
            homeDTO.setTopTenUserList(topTenUsers);
            homeDTO.setTopTenSongList(topTenSongs);
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.TOP_RATED_DATA_RETRIEVED_SUCCESS, homeDTO);
        } else {
            responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.TOP_RATED_DATA_RETRIEVED_FAILED);
        }
        return responseDTO;
    }

}
