package com.huang.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Time 2022-11-17 16:02
 * Created by Huang
 * className: ValueConfig
 * Description:
 */
@Slf4j
@Data
@Component
public class ValueConfig {
    @Value("${item.key}")
    public String key;

    @Value("${item.name}")
    public String name;

    @Value("${item.name1}")
    public String key1;

    @Value("${item.key}")
    public String name1;
}
