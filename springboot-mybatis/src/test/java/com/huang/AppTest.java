package com.huang;

import cn.hutool.core.util.RandomUtil;
import com.huang.entity.User;
import com.huang.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Time 2022-10-24 16:43
 * Created by Huang
 * className: AppTest
 * Description:
 */
@SpringBootTest(classes = App.class)
public class AppTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void startTest(){
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setName(RandomUtil.randomString(10));
            user.setAge(RandomUtil.randomInt(100));
            user.setId(RandomUtil.randomInt(1000000000));
            int insert = userMapper.insert(user);
            System.out.println(insert);
        }
    }

    @Test
    void testSql(){
        List<User> users = userMapper.testSql(1);
        users.forEach(System.out::println);
        System.out.println(users.size());
    }
}
