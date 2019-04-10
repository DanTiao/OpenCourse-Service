package com.cc.open.testDao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cc.open.dao.AccountInfoMapper;
import com.cc.open.domain.AccountInfo;
import com.cc.open.domain.AccountInfoExample;

@SpringBootTest
@RunWith(SpringRunner.class)
public class testUserInfoDao {

	@Autowired
	private AccountInfoMapper userInfoMapper;
	
	private final static String ADMIN = "c6zZpZchMLdQZsgllaH64w";
	private final static String NOMAL = "HiOFKCC5FUMWx8BuK3ugUQ";
	private final static String TEACHER = "0naS0fton6o77mtyYCTCrA";
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void testInsert() throws NoSuchAlgorithmException
	{
		
		AccountInfo user = new AccountInfo();
		String uuid = UUID.randomUUID().toString();
		String password = "ccwx20190407";
		password = "273du621cx9lks7s7a9fkjhf71";
		user.setUserUuid(uuid);
		user.setUserAccount("admin20190328");
		user.setUserPassword(password);
		user.setUserName("Admin");
		Date date = new Date();
		user.setCreateTime(date);
		user.setLastLogin(date);
		user.setUserType(ADMIN);
		logger.info(date.toGMTString());
		logger.info(date.toLocaleString());
		logger.info(date.toString());
		userInfoMapper.insert(user);
	}
	
	@Test
	public void testSelect()
	{
		System.out.println(userInfoMapper.selectByExample(new AccountInfoExample()));
	}
	
	@Test
	public void getType() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		Base64.Encoder encoder = Base64.getEncoder();
		String admin = encoder.encodeToString(md5.digest("ADMIN".getBytes("utf-8")));
		String normal = encoder.encodeToString(md5.digest("NORMAL".getBytes("utf-8")));
		String teacher = encoder.encodeToString(md5.digest("TEACHER".getBytes("utf-8")));
		
		logger.info("admin:"+admin);
		logger.info("normal:"+normal);
		logger.info("teacher:"+teacher);
	}
}
