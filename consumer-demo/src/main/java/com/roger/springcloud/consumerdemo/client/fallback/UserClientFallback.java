package com.roger.springcloud.consumerdemo.client.fallback;

import com.roger.springcloud.consumerdemo.client.UserClient;
import com.roger.springcloud.consumerdemo.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author Roger
 * @since 2021/3/27
 */

@Component
public class UserClientFallback implements UserClient {
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("用户异常");
        return user;
    }
}
