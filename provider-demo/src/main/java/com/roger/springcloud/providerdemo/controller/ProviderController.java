package com.roger.springcloud.providerdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.roger.springcloud.providerdemo.config.OrderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Roger
 * @since 2021/2/27
 */

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private OrderProperties orderProperties;

    /**
     * 测试 @ConfigurationProperties 注解的配置属性类
     */
    @GetMapping("/test01")
    public Map<String, Object> test01() {
        return new JSONObject().fluentPut("payTimeoutSeconds", orderProperties.getPayTimeoutSeconds())
                .fluentPut("createFrequencySeconds", orderProperties.getCreateFrequencySeconds());
    }

    @GetMapping("/echo")
    public String echo(String name) {
        return "provider:" + name;
    }
}
