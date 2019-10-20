package com.jcode.geetha.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author Lakshan harischandra
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Long userId;
    @Size(max = 45, message = "Maximum character length exceeded for user first name - 45")
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45, message = "Maximum character length exceeded for user last name - 45")
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @NotNull(message = "User name cannot be null")
    @Size(min = 1, max = 45, message = "Maximum character length exceeded for user user_name - 45")
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @Email
    @NotNull(message = "User email cannot be null")
    @Size(min = 1, max = 45, message = "Maximum character length exceeded for user email - 45")
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull(message = "User password cannot be null")
    @Size(min = 1, max = 80, message = "Maximum character length exceeded for user password - 80")
    @Column(name = "password")
    private String password;
    @Lob
    @Column(name = "picture")
    private byte[] picture;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Size(max = 15, message = "Maximum character length exceeded for user mobile - 15")
    @Column(name = "mobile")
    private String mobile;
    @Size(max = 6, message = "Maximum character length exceeded for user gender - 6")
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull(message = "User role cannot be null")
    @Size(min = 1, max = 21, message = "Maximum character length exceeded for user role - 21")
    @Column(name = "role")
    private String role;
    @Basic(optional = false)
    @NotNull(message = "User rank cannot be null")
    @Column(name = "rank")
    private int rank = 0;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Post> postCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adminId")
    private List<Approval> approvalCollection;
    @JoinColumn(name = "user_role_id", referencedColumnName = "role_id")
    @ManyToOne(optional = false)
    private Role roleId;

    public User() {
    }

    public User(Long userId) {
        this.userId = userId;
    }

    public User(Long userId, String userName, String email, String password, String role, int rank) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.rank = rank;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Collection<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(List<Post> postCollection) {
        this.postCollection = postCollection;
    }

    public List<Approval> getApprovalCollection() {
        return approvalCollection;
    }

    public void setApprovalCollection(List<Approval> approvalCollection) {
        this.approvalCollection = approvalCollection;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.User[ userId=" + userId + " ]";
    }
}
