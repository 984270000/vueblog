package com.xinyu.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * 封装类
 * 用户Id 用户名 等一些非私密信息
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
