package com.cc.open.dao;

import com.cc.open.domain.ReformInfo;
import com.cc.open.domain.ReformInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReformInfoMapper {
    long countByExample(ReformInfoExample example);

    int deleteByExample(ReformInfoExample example);

    int deleteByPrimaryKey(String reformId);

    int insert(ReformInfo record);

    int insertSelective(ReformInfo record);

    List<ReformInfo> selectByExample(ReformInfoExample example);

    ReformInfo selectByPrimaryKey(String reformId);

    int updateByExampleSelective(@Param("record") ReformInfo record, @Param("example") ReformInfoExample example);

    int updateByExample(@Param("record") ReformInfo record, @Param("example") ReformInfoExample example);

    int updateByPrimaryKeySelective(ReformInfo record);

    int updateByPrimaryKey(ReformInfo record);
}