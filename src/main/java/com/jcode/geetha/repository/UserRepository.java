package com.jcode.geetha.repository;

import com.jcode.geetha.dto.UserDTO;
import com.jcode.geetha.model.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    @Query(value = "SELECT new com.jcode.geetha.dto.UserDTO(u.userName,u.firstName,u.lastName,u.dob,u.gender,u.mobile,u.email,u.password,u.rank,u.roleId.roleId)" +
            " FROM User AS u " +
            "ORDER BY u.rank DESC ")
    List<UserDTO> getTopTenUsers(PageRequest pageRequest);

}
