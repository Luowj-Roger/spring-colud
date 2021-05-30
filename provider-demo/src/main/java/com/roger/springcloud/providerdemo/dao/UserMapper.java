package com.roger.springcloud.providerdemo.dao;

import com.roger.springcloud.providerdemo.entity.po.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User getUser(Integer id);
}