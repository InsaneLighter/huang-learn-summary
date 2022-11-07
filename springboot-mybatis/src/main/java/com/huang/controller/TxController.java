package com.huang.controller;

import cn.hutool.core.util.RandomUtil;
import com.huang.entity.User;
import com.huang.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @Time 2022-10-25 10:12
 * Created by Huang
 * className: TxController
 * Description:
 */
@RestController
@RequestMapping("/")
public class TxController {
    @Resource
    UserMapper userMapper;

    @GetMapping(value = {"","/"})
    @Transactional
    public long exec(){
        long start = System.currentTimeMillis();
        System.out.println("start: "+ LocalDateTime.now());
        userMapper.delete();

        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName(RandomUtil.randomString(10));
            user.setAge(RandomUtil.randomInt(100));
            user.setId(RandomUtil.randomInt(1000000000));
            int insert = userMapper.insert(user);
            System.out.println(insert);
        }

        userMapper.updateFid(1);
        System.out.println("end: "+ LocalDateTime.now());
        return System.currentTimeMillis()-start;
    }
}
