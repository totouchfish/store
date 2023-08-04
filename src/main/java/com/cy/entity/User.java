package com.cy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2023-08-04 11:00:21
 */
@Data
public class User extends BaseEntity implements Serializable  {
    private static final long serialVersionUID = -41445994511023034L;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐值
     */
    private String salt;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 性别：0-女，1-男
     */
    private Integer gender;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 是否删除：0-未删除,1-以删除
     */
    private Integer isDelete;

}

