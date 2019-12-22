package com.jcode.geetha.repository;

import com.jcode.geetha.dto.SongDTO;
import com.jcode.geetha.model.Song;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 12:03 PM
 * Project: geetha.
 */
@Repository
public interface SongRepository extends JpaRepository<Song,Integer> {

    @Query(value = "SELECT new com.jcode.geetha.dto.SongDTO(s.artist,s.name,s.type,s.mp3,s.musicBy,s.lyricsBy,s.numOfPosts,s.dateOfAdded,s.likes,s.dislikes) " +
            "FROM Song AS s ORDER BY s.numOfPosts DESC")
    List<SongDTO> getTopTenSongs(PageRequest pageRequest);

    @Query(value = "SELECT new com.jcode.geetha.dto.SongDTO(s.artist,s.name,s.type,s.mp3,s.musicBy,s.lyricsBy,s.numOfPosts,s.dateOfAdded,s.likes,s.dislikes) " +
            "FROM Song AS s ORDER BY s.dateOfAdded DESC")
    List<SongDTO> getLatestTopTenSongs(PageRequest pageRequest);

    @Query(value = "SELECT new com.jcode.geetha.dto.SongDTO(s.artist,s.name,s.type,s.mp3,s.musicBy,s.lyricsBy,s.numOfPosts,s.dateOfAdded,s.likes,s.dislikes) " +
            "FROM Song AS s ORDER BY s.likes DESC")
    List<SongDTO> getMostLikedSongs(PageRequest pageRequest);

    @Query(value = "SELECT new com.jcode.geetha.dto.SongDTO(s.artist,s.name,s.type,s.mp3,s.musicBy,s.lyricsBy,s.numOfPosts,s.dateOfAdded,s.likes,s.dislikes) " +
            "FROM Song AS s ORDER BY s.numOfPosts DESC , s.likes DESC")
    List<SongDTO> getTrendingSongs(PageRequest pageRequest);
}
