package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Time 2022-11-17 15:57
 * Created by Huang
 * className: com.huang.App
 * Description: File Encoding -> 打勾 Transparent native-to-ascii conversion
 *              properties文件默认是ascii编码 需要变更为utf8
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
