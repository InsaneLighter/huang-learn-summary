package com.huang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time 2022-11-23 9:09
 * Created by Huang
 * className: App
 * Description:
 */
@SpringBootApplication
@RestController
@RequestMapping
public class App {
    @Value("${key}")
    private String key;

    @GetMapping
    public String propertyTest(){
        return key;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
