package com.jcode.geetha.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 1/12/2020
 * Time: 12:38 PM
 * Project: geetha.
 */

public class UserDetailPageDTO implements Serializable {
    private List<PostDTO> postDTOList;

    public List<PostDTO> getPostDTOList() {
        return postDTOList;
    }

    public void setPostDTOList(List<PostDTO> postDTOList) {
        this.postDTOList = postDTOList;
    }

}
