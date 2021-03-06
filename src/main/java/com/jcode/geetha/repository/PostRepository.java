package com.jcode.geetha.repository;

import com.jcode.geetha.dto.PostDTO;
import com.jcode.geetha.model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 16/11/2019
 * Time: 14:18
 * Project: geetha.
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT new com.jcode.geetha.dto.PostDTO(p.postId,p.content,p.mainHeader,p.likes,p.dislikes,p.shares,p.views,p.datePosted,u.userName,s.name) from Post  AS p\n" +
            "    LEFT JOIN User AS u\n" +
            "    ON  p.userId.userId = u.userId\n" +
            "    LEFT JOIN Song AS s\n" +
            "    ON p.songId.songId=s.songId\n" +
            "    ORDER BY p.likes DESC")
    List<PostDTO> getTopTenPostList(Pageable pageable);

    @Query(value = "SELECT new com.jcode.geetha.dto.PostDTO(p.postId,p.content,p.mainHeader,p.likes,p.dislikes,p.shares,p.views,p.datePosted,s.name) from Post  AS p " +
            "LEFT JOIN Song AS s " +
            "ON p.songId.songId=s.songId " +
            "WHERE p.userId.userId=?1 " +
            "ORDER BY p.postId DESC")
    List<PostDTO> getUserPosts(Long userId, Pageable pageable);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "UPDATE post SET content=:content,main_header=:mainHeader WHERE post_id=:postId", nativeQuery = true)
    int updateUserPost(@Param("content") String content, @Param("mainHeader") String mainHeader, @Param("postId") Long postId);

    @Query(value = "SELECT new com.jcode.geetha.dto.PostDTO(p.postId,p.content,p.mainHeader,p.likes,p.dislikes,p.shares,p.views,p.datePosted,s.name) from Post AS p " +
            "LEFT JOIN Song AS s " +
            "ON p.songId.songId=s.songId " +
            "WHERE p.postId = ?1 ")
    PostDTO findUserPostDTOWithPostId(Long postId);

    @Query(value = "SELECT new com.jcode.geetha.dto.PostDTO(p.postId,p.content,p.mainHeader,p.likes,p.dislikes,p.shares,p.views,p.datePosted) from Post AS p " +
            "WHERE p.songId.songId = ?1 ")
    List<PostDTO> findPostsForSong(int songId, Pageable pageable);
}
