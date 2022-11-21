package com.huang.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Time 2022-11-17 16:06
 * Created by Huang
 * className: SpecificFileConfig
 * Description:
 */
@Slf4j
@Data
@Component
@PropertySource(value ={"classpath:config/my.properties" })
public class SpecificFileConfig {
    @Value("${my.key}")
    private String key;
    @Value("${my.name}")
    private String name;
}
