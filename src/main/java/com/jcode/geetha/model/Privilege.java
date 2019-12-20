package com.jcode.geetha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 18/10/2019
 * Time: 22:01
 * Project: geetha.
 */
@Entity
@Table(name = "privilege")
public class Privilege implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "privilege_id")
    private Integer privilegeId;
    @Size(max = 45, message = "Maximum character length exceeded for privilege name - 45")
    @Column(name = "privilege_name")
    @Basic(optional = false)
    private String privilegeName;
    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "role_has_privilege", joinColumns = {
            @JoinColumn(name = "privilege_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "role_id",
                    nullable = false, updatable = false)})
    private List<Role> roleList;

    public Privilege() {
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
