package com.jcode.geetha.dto;

import java.io.Serializable;
import java.util.Date;

/*
Created by Lakshan on 2019.10.11
For Geetha.lk
*/
public class UserDTO implements Serializable {
    private String userName;
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;
    private String mobile;
    private String email;
    private String password;
    private int rank;
    private Integer role;

    public UserDTO() {
    }

    public UserDTO(String userName, String firstName, String lastName, Date dob, String gender, String mobile, String email, String password, int rank, Integer role) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.rank = rank;
        this.role = role;
    }

    public UserDTO(String userName, String email, String password, Integer role) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
