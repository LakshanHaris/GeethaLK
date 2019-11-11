package com.jcode.geetha.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 14:44
 * Project: geetha.
 */
public class AuthorizeDTO implements Serializable {

    private UserDTO userDTO;
    private Map<Integer, String> userPrivilegesMap;

    public AuthorizeDTO() {
    }

    public AuthorizeDTO(UserDTO userDTO, Map<Integer, String> userPrivilegesMap) {
        this.userDTO = userDTO;
        this.userPrivilegesMap = userPrivilegesMap;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public Map<Integer, String> getUserPrivilegesMap() {
        return userPrivilegesMap;
    }

    public void setUserPrivilegesMap(Map<Integer, String> userPrivilegesMap) {
        this.userPrivilegesMap = userPrivilegesMap;
    }

}
