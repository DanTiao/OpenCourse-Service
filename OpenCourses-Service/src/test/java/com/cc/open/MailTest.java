package com.cc.open;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import com.cc.open.tool.EmailTool;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MailTest {

	@Autowired
    private EmailTool emailTool;
	
	@Autowired
    private JavaMailSender mailSender;

    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1101898397@qq.com");
        message.setTo("568339967@qq.com");
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");

        mailSender.send(message);
    }
    
}
