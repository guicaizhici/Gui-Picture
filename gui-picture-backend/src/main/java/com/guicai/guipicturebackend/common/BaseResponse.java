package com.guicai.guipicturebackend.common;

import com.guicai.guipicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {//Serializable序列化

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}

