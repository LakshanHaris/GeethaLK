package com.jcode.geetha.controller;


import com.jcode.geetha.dto.PostingDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.model.Post;
import com.jcode.geetha.service.PostService;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.RequestEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@CrossOrigin(RequestEndPoints.REACT_CROSS_ORIGIN)
public class PostController {

    private final Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @ResponseBody
    @PostMapping(path = RequestEndPoints.POST_A_REVIEW)
    public ResponseDTO postAReviewForSong(@ModelAttribute("postingDTO") PostingDTO postingDTO) {
        ResponseDTO<Post> responseDTO = postService.savePostingForTheSong(postingDTO);
        if (Objects.nonNull(responseDTO)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), responseDTO.getMessage()));
        }
        return responseDTO;
    }

}
