package com.huang;

import com.huang.config.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Time 2022-11-17 16:10
 * Created by Huang
 * className: AppTest
 * Description:
 */
@SpringBootTest(classes = App.class)
public class AppTest {
    @Autowired
    private ValueConfig valueConfig;
    @Autowired
    private SpecificFileConfig specificFileConfig;
    @Autowired
    private ConfigurationPropertiesConfig configurationPropertiesConfig;
    @Autowired
    private FixedSpecificConfig fixedSpecificConfig;

    @Test
    void valueConfig(){
        String key = valueConfig.getKey();
        String name = valueConfig.getName(); //获取中文乱码
        String key1 = valueConfig.getKey1();
        String name1 = valueConfig.getName1();
    }

    @Test
    void specificFileConfig(){
        String key = specificFileConfig.getKey();
        String name = specificFileConfig.getName(); //获取中文乱码
    }

    @Test
    void configurationPropertiesConfig(){
        String key = configurationPropertiesConfig.getKey();
        String name = configurationPropertiesConfig.getName(); //获取中文乱码
        String key1 = configurationPropertiesConfig.getKey1();
        String name1 = configurationPropertiesConfig.getName1();
    }

    @Test
    void fixedSpecificConfig(){
        String key = fixedSpecificConfig.getKey();
        String name = fixedSpecificConfig.getName(); //获取中文乱码
    }

    @Test
    void envConstant(){
        System.out.println(EnvConstant.applicationName);
    }
}
