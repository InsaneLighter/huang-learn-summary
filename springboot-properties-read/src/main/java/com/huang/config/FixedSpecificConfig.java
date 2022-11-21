package com.huang.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Time 2022-11-17 16:08
 * Created by Huang
 * className: FixedSpecificConfig
 * Description:
 */
@Slf4j
@Data
@Component
@ConfigurationProperties(prefix ="my")
@PropertySource(value ={"classpath:config/my.properties" })
public class FixedSpecificConfig {
    private String key;
    private String name;
}
