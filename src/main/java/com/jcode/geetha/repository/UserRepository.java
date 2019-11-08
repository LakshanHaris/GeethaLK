package com.jcode.geetha.repository;

import com.jcode.geetha.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
Created by Lakshan on 2019.04.17
For Geetha.lk
*/

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}
