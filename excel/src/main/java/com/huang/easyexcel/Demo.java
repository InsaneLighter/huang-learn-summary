package com.huang.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Time 2022-10-26 15:37
 * Created by Huang
 * className: Demo
 * Description:
 */
@Slf4j
public class Demo {
    @Test
    public void read01(){
        ExcelReaderBuilder excelReaderBuilder = EasyExcel.read();
    }
}
