package com.jcode.geetha.repository;

import com.jcode.geetha.dto.PostDTO;
import com.jcode.geetha.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 16/11/2019
 * Time: 14:18
 * Project: geetha.
 */

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    @Query(value = "select new com.jcode.geetha.dto.PostDTO(p.postId,p.content,p.mainHeader,p.likes,p.dislikes,p.shares,p.views,u.userName,s.name) from Post  as p\n" +
            "    LEFT JOIN User as u\n" +
            "    ON  p.userId.userId = u.userId\n" +
            "    LEFT JOIN Song as s\n" +
            "    ON p.songId.songId=s.songId\n" +
            "    ORDER BY p.likes DESC")
    List<PostDTO> getTopTenPostList(Pageable pageable);

}
