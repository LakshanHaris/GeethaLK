package com.jcode.geetha.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 2:07 PM
 * Project: geetha.
 */

public class SongPageDTO implements Serializable {

    private List<SongDTO> latestTopTenSongList;
    private List<SongDTO> mostLikedSongsList;
    private List<SongDTO> trendingSongsList;
    private List<PostDTO> postDTOList;
    private SongDTO songDTO;

    public List<SongDTO> getLatestTopTenSongList() {
        return latestTopTenSongList;
    }

    public void setLatestTopTenSongList(List<SongDTO> latestTopTenSongList) {
        this.latestTopTenSongList = latestTopTenSongList;
    }

    public List<SongDTO> getMostLikedSongsList() {
        return mostLikedSongsList;
    }

    public void setMostLikedSongsList(List<SongDTO> mostLikedSongsList) {
        this.mostLikedSongsList = mostLikedSongsList;
    }

    public List<SongDTO> getTrendingSongsList() {
        return trendingSongsList;
    }

    public void setTrendingSongsList(List<SongDTO> trendingSongsList) {
        this.trendingSongsList = trendingSongsList;
    }

    public List<PostDTO> getPostDTOList() {
        return postDTOList;
    }

    public void setPostDTOList(List<PostDTO> postDTOList) {
        this.postDTOList = postDTOList;
    }

    public SongDTO getSongDTO() {
        return songDTO;
    }

    public void setSongDTO(SongDTO songDTO) {
        this.songDTO = songDTO;
    }
}
