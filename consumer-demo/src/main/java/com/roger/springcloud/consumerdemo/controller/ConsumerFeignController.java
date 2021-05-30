package com.roger.springcloud.consumerdemo.controller;

import com.roger.springcloud.consumerdemo.client.UserClient;
import com.roger.springcloud.consumerdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roger
 * @since 2021/3/27
 */
@RestController
@RequestMapping("/feign")
public class ConsumerFeignController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Integer id){
        /*if (id == 1) {
            System.out.println("bbbb");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //throw new RuntimeException("太忙了");
        }*/
        return userClient.queryById(id);
    }
}
