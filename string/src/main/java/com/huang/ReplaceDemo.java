package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Time 2022-10-31 15:25
 * Created by Huang
 * className: ReplaceDemo
 * Description:
 */
@Slf4j
public class ReplaceDemo {
    String content = "aa,bb*cc$dd^ee%cc";

    @Test
    public void test01(){
        String replace = content.replace("a","X");
        log.info("replace:{}",replace);
        //replace:XX,bb*cc$dd^ee%cc
    }

    @Test
    public void test02(){
        String replace = content.replaceFirst("a","X");
        log.info("replace:{}",replace);
        //replace:Xa,bb*cc$dd^ee%cc
    }

    @Test
    public void test03(){
        String replace = content.replaceAll("a","X");
        log.info("replace:{}",replace);
        //replace:XX,bb*cc$dd^ee%cc
    }
}
