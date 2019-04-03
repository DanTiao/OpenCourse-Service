package com.cc.open.testDao;

import java.util.UUID;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cc.open.dao.UserInfoMapper;
import com.cc.open.domain.UserInfo;
import com.cc.open.domain.UserInfoExample;

@SpringBootTest
@RunWith(SpringRunner.class)
public class testUserInfoDao {

	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Test
	public void testInsert()
	{
		UserInfo user = new UserInfo();
		String uuid = UUID.randomUUID().toString();
		String password = "ccwx20190328";
		password = "273du621cx9lks7s7a9fkjhf71";
		user.setUserUuid(uuid);
		user.setUserAccount("admin20190328");
		user.setUserPassword(password);
		user.setUserType(0);
		System.out.println(userInfoMapper.insert(user));
	}
	
	@Test
	public void testSelect()
	{
		System.out.println(userInfoMapper.selectByExample(new UserInfoExample()));
	}
}
