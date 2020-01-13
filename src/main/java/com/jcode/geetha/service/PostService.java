package com.jcode.geetha.service;

import com.jcode.geetha.dto.PostingDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.model.Post;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 11:55 AM
 * Project: geetha.
 */
public interface PostService {
    ResponseDTO<Post> savePostingForTheSong(PostingDTO postingDTO);
}
