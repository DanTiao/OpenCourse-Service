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
		String str = AESUtil.decrypt(encrypt);
		System.out.println(str);
	}
	
	
}
