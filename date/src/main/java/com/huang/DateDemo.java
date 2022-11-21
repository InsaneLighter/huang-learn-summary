package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Time 2022-11-15 10:41
 * Created by Huang
 * className: DateDemo
 * Description:
 */
@Slf4j
public class DateDemo {
    @Test
    public void currentWeek(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        log.info("当前星期(日期): {}", sdf.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK, 2);
        log.info("当前星期第一天(日期): {}", sdf.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getActualMaximum(Calendar.DAY_OF_WEEK));
        calendar.add(Calendar.DAY_OF_WEEK, 1);
        log.info("当前星期最后一天(日期): {}", sdf.format(calendar.getTime()));
    }
}
