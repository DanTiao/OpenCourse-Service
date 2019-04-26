package com.cc.open.dao;

import com.cc.open.domain.UserInfo;
import com.cc.open.domain.UserInfoExample;
import com.cc.open.vo.UserVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String userUuid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(String userUuid);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    

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

	/**
	 * 根据id查用户信息
	 * @param userId
	 * @return
	 */
	UserVO findUserById(@Param("userId") String userId);

	void deleteUserById(@Param("userId") String userId);

	/**
	 * 批量删除
	 * @param ids
	 */
	void deleteUsersByIds(List<String> ids);
}