package com.roger.springcloud.providerdemo.service;

import com.roger.springcloud.providerdemo.entity.po.User;
import com.roger.springcloud.providerdemo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Roger
 * @since 2021/5/30
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(Integer id){
        return userMapper.getUser(id);
    }

}
