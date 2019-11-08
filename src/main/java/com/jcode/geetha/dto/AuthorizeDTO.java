package com.jcode.geetha.dto;

import com.jcode.geetha.model.User;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 14:44
 * Project: geetha.
 */
public class AuthorizeDTO implements Serializable {

    private User user;
    private Map<Integer, String> userPrivilegesMap;

    public AuthorizeDTO() {
    }

    public AuthorizeDTO(User user, Map<Integer, String> userPrivilegesMap) {
        this.user = user;
        this.userPrivilegesMap = userPrivilegesMap;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<Integer, String> getUserPrivilegesMap() {
        return userPrivilegesMap;
    }

    public void setUserPrivilegesMap(Map<Integer, String> userPrivilegesMap) {
        this.userPrivilegesMap = userPrivilegesMap;
    }

}
