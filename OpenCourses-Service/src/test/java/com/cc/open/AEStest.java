package com.cc.open;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cc.open.utils.AESEncrDecrUtil;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AEStest {

	
	
	@Test
	public void testEncr() throws Exception {
		String a = "qweewqqwe";
		String encrypt = AESEncrDecrUtil.encrypt(a);
		System.out.println(encrypt);
	}
	
	
}
