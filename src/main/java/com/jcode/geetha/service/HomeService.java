package com.jcode.geetha.service;

import com.jcode.geetha.dto.HomeDTO;
import com.jcode.geetha.dto.ResponseDTO;

/**
 * Created by Lakshan harischandra
 * Date: 17/11/2019
 * Time: 00:20
 * Project: geetha.
 */

public interface HomeService {
    ResponseDTO<HomeDTO> getTopRatedData();
}
