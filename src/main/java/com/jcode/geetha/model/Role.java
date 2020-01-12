package com.jcode.geetha.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 18/10/2019
 * Time: 21:49
 * Project: geetha.
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_id")
    private Integer roleId;
    @Size(max = 45, message = "Maximum character length exceeded for role name - 45")
    @Column(name = "role_name")
    @Basic(optional = false)
    private String roleName;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roleId",fetch = FetchType.EAGER)
    private List<User> userList;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roleList")
    private List<Privilege> privilegeList;

    public Role() {
    }

    public Role(int roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Privilege> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(List<Privilege> privilegeList) {
        this.privilegeList = privilegeList;
    }

}
