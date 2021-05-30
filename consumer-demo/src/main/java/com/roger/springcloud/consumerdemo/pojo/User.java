package com.roger.springcloud.consumerdemo.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String loginname;

    private String password;

}