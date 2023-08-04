package com.cy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TAddress)实体类
 *
 * @author makejava
 * @since 2023-08-04 11:00:34
 */
@Data
public class Address implements Serializable {
    private static final long serialVersionUID = -98645536053712053L;
    /**
     * 收货地址id
     */
    private Integer aid;
    /**
     * 归属的用户id
     */
    private Integer uid;
    /**
     * 收货人姓名
     */
    private String name;
    /**
     * 省-名称
     */
    private String provinceName;
    /**
     * 省-行政代号
     */
    private String provinceCode;
    /**
     * 市-名称
     */
    private String cityName;
    /**
     * 市-行政代号
     */
    private String cityCode;
    /**
     * 区-名称
     */
    private String areaName;
    /**
     * 区-行政代号
     */
    private String areaCode;
    /**
     * 邮政编码
     */
    private String zip;
    /**
     * 详情地址
     */
    private String address;
    /**
     * 手机
     */
    private String phone;
    /**
     * 固话
     */
    private String tel;
    /**
     * 标签
     */
    private String tag;
    /**
     * 是否默认：0-不默认，1-默认
     */
    private Integer isDefault;
}

