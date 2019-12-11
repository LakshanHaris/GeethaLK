package com.jcode.geetha.repository;

import com.jcode.geetha.model.Privilege;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 19:55
 * Project: geetha.
 */

@Repository
public interface PrivilegeRepository extends CrudRepository<Privilege, Integer> {

    @Query(value = "SELECT p.* FROM privilege AS p \n" +
            "INNER JOIN role_has_privilege AS rp\n" +
            "ON p.privilege_id=rp.privilege_id\n" +
            "WHERE rp.role_id= ?1", nativeQuery = true)
    List<Privilege> findPrivilegesByRoleId(int roleId);
}
