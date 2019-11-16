package com.jcode.geetha.dto;

import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 17/11/2019
 * Time: 00:23
 * Project: geetha.
 */
public class HomeDTO implements Serializable {

    private List<PostDTO> topTenPostList;

    public List<PostDTO> getTopTenPostList() {
        return topTenPostList;
    }

    public void setTopTenPostList(List<PostDTO> topTenPostList) {
        this.topTenPostList = topTenPostList;
    }
}
