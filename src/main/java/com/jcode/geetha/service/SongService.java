package com.jcode.geetha.service;

import com.jcode.geetha.dto.ResponseDTO;
import com.jcode.geetha.dto.SongPageDTO;

/**
 * Created by Lakshan harischandra
 * Date: 12/7/2019
 * Time: 11:55 AM
 * Project: geetha.
 */

public interface SongService {
    ResponseDTO<SongPageDTO> getLatestTopTenSongs();

    ResponseDTO<SongPageDTO> getMostLikedSongs();

    ResponseDTO<SongPageDTO> getTrendingSongs();
}
