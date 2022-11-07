package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Time 2022-10-31 15:36
 * Created by Huang
 * className: SplitDemo
 * Description:
 */
@Slf4j
public class SplitDemo {
    String content = "aa,bb*cc$dd^ee%cc";

    @Test
    public void test01(){
        String[] split = content.split(",|\\*|\\$|\\^|%");
        log.info("split:{}", Arrays.toString(split));
        //replace:[aa, bb, cc, dd, ee, cc]
    }

    @Test
    public void test02(){
        String[] split = content.split("[,*$^%]");
        log.info("split:{}", Arrays.toString(split));
        //replace:[aa, bb, cc, dd, ee, cc]
    }

    @Test
    public void test03(){
        String[] split = content.split("[,*$^%]",3);
        log.info("split:{}", Arrays.toString(split));
        //replace:[aa, bb, cc$dd^ee%cc]
    }
}
