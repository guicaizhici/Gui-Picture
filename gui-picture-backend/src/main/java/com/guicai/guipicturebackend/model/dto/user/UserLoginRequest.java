package com.guicai.guipicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 */
@Data
public class UserLoginRequest implements Serializable {

    //定义了一个序列化版本号
    private static final long serialVersionUID = -8394832988441928992L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

}
