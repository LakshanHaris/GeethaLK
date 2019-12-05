package com.jcode.geetha.dto;

import com.jcode.geetha.model.User;

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
    private List<User> topTenUserList;

    public List<PostDTO> getTopTenPostList() {
        return topTenPostList;
    }

    public void setTopTenPostList(List<PostDTO> topTenPostList) {
        this.topTenPostList = topTenPostList;
    }

    public List<User> getTopTenUserList() {
        return topTenUserList;
    }

    public void setTopTenUserList(List<User> topTenUserList) {
        this.topTenUserList = topTenUserList;
    }
}
