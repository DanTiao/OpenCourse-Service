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

	UserVO findAccountInfo(@Param("userVO") UserVO userVO);
}