package com.cc.open;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cc.open.utils.AESUtil;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AEStest {

	@Test
	public void testAES() {
		String a = "2019公开课网站www.OpenCourse.com";
		String encrypt = AESUtil.encrypt(a);
		System.out.println(encrypt);
		String str = AESUtil.decrypt("7ADE6B3DE3FEA6E6E9486A3E49205453");
		System.out.println(str);
	}
	
	
}
