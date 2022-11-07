/*
package com.huang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

*/
/**
 * @Time 2022-10-31 16:43
 * Created by Huang
 * className: SpringbootLoggerDemo
 * Description:如果想使用XML配置Logback，则需要在 resources 路径下创建 logback-spring.xml文件，
 *             如果Spring Boot使用了Log4j2 ，则需要创建 log4j2-spring.xml 。
 *             Spring Boot 想使用Log4j2 ，则需要修改 Maven 依赖
 *
 *             Spring Boot 默认使用Logback作为日志记录工具。日志默认输出到控制台但也能输出到文件中。
 *             我们通过spring-boot-starter-logging 加入Logback依赖，其实只要我们加入任意的Spring Boot starter
 *             都会默认引入spring-boot-starter-logging，因此 我们不需要分开加入他们
 *//*


@SpringBootApplication
public class SpringbootLoggerDemo {
    static Logger logger = LoggerFactory.getLogger(SpringbootLoggerDemo.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLoggerDemo.class, args);
        logger.trace("SpringbootLoggerDemo trace");
        logger.debug("SpringbootLoggerDemo debug");
        logger.info("SpringbootLoggerDemo info");
        logger.warn("SpringbootLoggerDemo warn");
        logger.error("SpringbootLoggerDemo error");
    }
}

*/
