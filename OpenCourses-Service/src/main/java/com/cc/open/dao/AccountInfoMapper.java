package com.cc.open.dao;

import com.cc.open.domain.AccountInfo;
import com.cc.open.domain.AccountInfoExample;
import com.cc.open.vo.UserVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountInfoMapper {
    long countByExample(AccountInfoExample example);

    int deleteByExample(AccountInfoExample example);

    int deleteByPrimaryKey(String userUuid);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    List<AccountInfo> selectByExample(AccountInfoExample example);

    AccountInfo selectByPrimaryKey(String userUuid);

    int updateByExampleSelective(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

    int updateByExample(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

    int updateByPrimaryKeySelective(AccountInfo record);

    int updateByPrimaryKey(AccountInfo record);

   /**
    * 根据用户名查找登录密码
    * @param userVO
    * @return
    */
	UserVO findAccountInfo(@Param("userVO") UserVO userVO);

	/**
	 * 增加新用户
	 * @param userVO
	 * @return
	 */
	int createUser(UserVO userVO);

	/**
	 * 通过用户名找用户信息
	 * @param userAccount
	 * @return
	 */
	UserVO findAccountByAccount(@Param("userAccount") String userAccount);

	/**
	 * 分页查询
	 * @return
	 */
	List<UserVO> findAllUser();
}