package com.roger.springcloud.nacosconfigdemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Roger
 * @since 2021/2/26
 */
@RefreshScope
@Data
@Configuration
// @NacosConfigurationProperties(prefix = "order", dataId = "${nacos.config.data-id}", type = ConfigType.YAML)
public class OrderProperties {

    /**
     * 订单支付超时时长，单位：秒。
     */
    @Value(value = "${order.pay-timeout-seconds}")
    private Integer payTimeoutSeconds;

    /**
     * 订单创建频率，单位：秒
     */
    @Value(value = "${order.create-frequency-seconds}")
    private Integer createFrequencySeconds;

    // ... 省略 setter/getter 方法

}