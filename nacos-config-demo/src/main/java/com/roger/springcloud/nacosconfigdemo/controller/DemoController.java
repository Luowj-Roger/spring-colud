package com.roger.springcloud.nacosconfigdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.roger.springcloud.nacosconfigdemo.config.OrderProperties;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Roger
 * @since 2021/2/27
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private OrderProperties orderProperties;

    @Autowired
    private StringEncryptor encryptor;

    /**
     * 测试 @ConfigurationProperties 注解的配置属性类
     */
    @GetMapping("/test01")
    public Map<String, Object> test01() {
        return new JSONObject().fluentPut("payTimeoutSeconds", orderProperties.getPayTimeoutSeconds())
                .fluentPut("createFrequencySeconds", orderProperties.getCreateFrequencySeconds());
    }

    @Value(value = "${order.pay-timeout-seconds}") // @NacosValue(value = "${order.pay-timeout-seconds}")
    private Integer payTimeoutSeconds;
    @Value(value = "${order.create-frequency-seconds}") // @NacosValue(value = "${order.create-frequency-seconds}")
    private Integer createFrequencySeconds;

    /**
     * 测试 @Value 注解的属性
     */
    @GetMapping("/test02")
    public Map<String, Object> test02() {
        return new JSONObject().fluentPut("payTimeoutSeconds", payTimeoutSeconds)
                .fluentPut("createFrequencySeconds", createFrequencySeconds);
    }

    @Value("${xxx-password:}")
    private String xxxPassword;

    @GetMapping("/password")
    public String test() {
        return xxxPassword;
    }

    @GetMapping("/encrypt")
    public void encrypt(){

        // 第一个加密
        String password = "woshimima";
        System.out.println(encryptor.encrypt(password));

        // 第二个加密
        password = "bushimima";
        System.out.println(encryptor.encrypt(password));
    }
}
