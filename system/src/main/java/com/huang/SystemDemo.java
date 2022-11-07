package com.huang;

import cn.hutool.core.io.IoUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Time 2022-11-04 13:53
 * Created by Huang
 * className: SystemDemo
 * Description:
 */
@Slf4j
public class SystemDemo {
    @Test
    public void javaSystemApi(){
        //currentTimeMillis
        //currentTimeMillis返回的是系统当前时间和1970-01-01之前间隔时间的毫秒数，如果系统时间固定则方法返回值也是一定的
        long currentTimeMillis = System.currentTimeMillis();
        log.info("currentTimeMillis:{}",currentTimeMillis);

        log.info("=========================================================================================================================");

        //system properties 系统配置信息
        System.getProperties().forEach((key, value) -> log.info("key:{} value:{}", key, value));

        //key:user.home value:C:\Users\Huang
        String userHome = System.getProperty("user.home");
        log.info("userHome:{}",userHome);
        //key:user.dir value:H:\personal\project\huang-learn-summary\system
        String userDir = System.getProperty("user.dir");
        log.info("userDir:{}",userDir);
        //key:java.io.tmpdir value:C:\Users\Huang\AppData\Local\Temp\
        String tempDir = System.getProperty("java.io.tmpdir");
        log.info("tempDir:{}",tempDir);
        //key:sun.desktop value:windows
        //key:user.language value:zh
        //key:file.encoding value:UTF-8
        //key:os.name value:Windows 10


        log.info("=========================================================================================================================");

        //system env 系统环境变量
        System.getenv().forEach((key, value) -> log.info("key:{} value:{}", key, value));

        //加载本地lib
        //System.loadLibrary("");
    }


    @Test
    public void classpath(){
        //resources 目录获取 springboot 前缀必须加上/
        InputStream in = this.getClass().getResourceAsStream("/classpath.properties");
        List<String> contentList = IoUtil.readUtf8Lines(in, new ArrayList<>());
        log.info("contentList:{}",contentList);

        //文件名不能加/前缀
        String path = Objects.requireNonNull(this.getClass().getClassLoader().getResource("classpath:classpath.properties")).getPath();
        log.info("path:{}",path);
    }

}
