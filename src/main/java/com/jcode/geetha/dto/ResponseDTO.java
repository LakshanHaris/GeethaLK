package com.jcode.geetha.dto;

import java.io.Serializable;

/**
 * Created by Lakshan harischandra
 * Date: 08/11/2019
 * Time: 15:01
 * Project: geetha.
 */
public class ResponseDTO<T> implements Serializable {

    private String message;
    private String successOrFail;
    private T data;

    public ResponseDTO() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccessOrFail() {
        return successOrFail;
    }

    public void setSuccessOrFail(String successOrFail) {
        this.successOrFail = successOrFail;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
