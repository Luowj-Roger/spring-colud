package com.roger.springcloud.consumerdemo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Roger
 * @since 2021/3/27
 */
@Data
public class User {

    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    private Date birthday;

    // 创建时间
    private Date created;

    // 更新时间
    private Date updated;

    // 备注
    private String note;
}
