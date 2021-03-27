package com.roger.springcloud.consumerdemo.client;

import com.roger.springcloud.consumerdemo.client.fallback.UserClientFallback;
import com.roger.springcloud.consumerdemo.config.FeignConfig;
import com.roger.springcloud.consumerdemo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Roger
 * @since 2021/3/27
 */
//声明当前类是一个Feign客户端，指定服务名为user-service
@FeignClient(value = "demo-provider", fallback = UserClientFallback.class,configuration = FeignConfig.class)
public interface UserClient {

    //http://demo-provider/provider/user/123
    //@GetMapping("/user/{id}")
    @RequestMapping(value = "/provider/user/{id}",method = RequestMethod.GET)
    User queryById(@PathVariable(value = "id")  Long id);
}
