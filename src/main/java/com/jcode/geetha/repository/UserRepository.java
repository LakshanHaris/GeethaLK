package com.jcode.geetha.repository;

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

    @Query(value = "select u.* from user AS u order by rank DESC", nativeQuery = true)
    List<User> getTopTenUsers(PageRequest pageRequest);

    User findByUserId(Long userId);

}
