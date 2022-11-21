package com.huang.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Time 2022-11-17 16:04
 * Created by Huang
 * className: ConfigurationPropertiesConfig
 * Description:
 */
@Slf4j
@Data
@Component
@ConfigurationProperties(prefix ="item")
public class ConfigurationPropertiesConfig {
    public String key;
    public String name;
    public String key1;
    public String name1;
}
