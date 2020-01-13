package com.jcode.geetha.service.impl;

import com.jcode.geetha.dto.PostingDTO;
import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.model.Approval;
import com.jcode.geetha.model.Post;
import com.jcode.geetha.model.User;
import com.jcode.geetha.repository.ApprovalRepository;
import com.jcode.geetha.repository.PostRepository;
import com.jcode.geetha.service.PostService;
import com.jcode.geetha.util.CommonMessages;
import com.jcode.geetha.util.CommonUtil;
import com.jcode.geetha.util.LoggerUtil;
import com.jcode.geetha.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 11:55 AM
 * Project: geetha.
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private ApprovalRepository approvalRepository;

    private final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);

    @Override
    public ResponseDTO<Post> savePostingForTheSong(PostingDTO postingDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        if (Objects.nonNull(postingDTO)) {
            postingDTO.setApprovalId(generateApprovalDummyData().getApprovalId());
            Post newPosting = CommonUtil.getPostFromPostingDTO(postingDTO);
            Post newlyAddedPost = postRepository.saveAndFlush(newPosting);
            if (Objects.nonNull(newlyAddedPost)) {
                responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_SUCCESS, CommonMessages.NEW_POST_HAVE_ADDED_SUCCESSFULLY, newlyAddedPost);
            } else {
                responseDTO = ResponseUtil.getResponseDto(CommonMessages.RESPONSE_DTO_FAILED, CommonMessages.NEW_POST_HAVE_ADDED_FAILED);
            }
        }
        return responseDTO;
    }

    public Approval generateApprovalDummyData() {
        Approval newApproval = new Approval();
        newApproval.setAdminId(new User((long) 1));
        newApproval.setDatePosted(new Date());
        newApproval.setStatus("0");
        Approval approval = approvalRepository.saveAndFlush(newApproval);
        if (Objects.nonNull(approval)) {
            logger.info(LoggerUtil.setLoggerInfoWithoutUser(this.getClass().toString(), CommonMessages.NEW_APPROVAL_DATA_ADDED_FOR_THE_POST));
        }
        return approval;
    }

}
