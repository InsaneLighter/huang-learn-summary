package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Time 2022-10-31 15:31
 * Created by Huang
 * className: JoinDemo
 * Description:
 */
@Slf4j
public class JoinDemo {
    String content = "item";

    @Test
    public void test01(){
        String join = String.join(",",content,content,content,content,content);
        log.info("join:{}",join);
        //join:item,item,item,item,item
    }

    @Test
    public void test02(){
        String[] arr = {content, content, content, content};
        String join = String.join(",",arr);
        log.info("join:{}",join);
        //join:item,item,item,item,item
    }

    @Test
    public void test03(){
        String[] arr = {content, content, content, content};
        List<String> list = Arrays.asList(arr);
        String join = String.join(",",list);
        log.info("join:{}",join);
        //join:item,item,item,item,item
    }
}
