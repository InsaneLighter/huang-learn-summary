package com.huang;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Arrays;

/**
 * @Time 2022-12-27 9:05
 * Created by Huang
 * className: MailTest
 * Description:
 */
@Slf4j
public class MailTest {
    @Test
    public void parse() throws AddressException {
        String srcEmail = "1@qq.com,2.qq.com";
        InternetAddress[] addresses = InternetAddress.parse(srcEmail);
        Arrays.stream(addresses).forEach(System.out::println);
    }
}
