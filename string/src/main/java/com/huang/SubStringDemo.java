package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Time 2022-10-31 15:19
 * Created by Huang
 * className: SubString
 * Description:
 */

@Slf4j
public class SubStringDemo {
    String content = "1234567890";

    @Test
    public void test01(){
        String substring = content.substring(1);
        log.info("substring:{}",substring);
        //substring:234567890
    }

    @Test
    public void test02(){
        //包前不包后
        String substring = content.substring(1,2);
        log.info("substring:{}",substring);
        //substring:2
    }
}
