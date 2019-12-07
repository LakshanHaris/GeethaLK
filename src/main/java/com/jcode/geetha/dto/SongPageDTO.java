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

    public List<SongDTO> getLatestTopTenSongList() {
        return latestTopTenSongList;
    }

    public void setLatestTopTenSongList(List<SongDTO> latestTopTenSongList) {
        this.latestTopTenSongList = latestTopTenSongList;
    }
}
