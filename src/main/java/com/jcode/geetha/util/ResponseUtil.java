package com.jcode.geetha.util;

import com.jcode.geetha.dto.ResponseDTO;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 15:12
 * Project: geetha.
 */
public class ResponseUtil {

    /*
    Response attributes declare here
    */
    public static final String RESPONSE_DATA = "data";
    public static final String ERROR_RESPONSE = "errorResponse";



    public static ResponseDTO getResponseDto(String isSuccessOrFail, String message, Object data) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setSuccessOrFail(isSuccessOrFail);
        responseDTO.setMessage(message);
        responseDTO.setData(data);
        return responseDTO;
    }

    public static ResponseDTO getResponseDto(String isSuccessOrFail, String message) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setSuccessOrFail(isSuccessOrFail);
        responseDTO.setMessage(message);
        return responseDTO;
    }

}
