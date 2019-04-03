package com.cc.open.dao;

import com.cc.open.domain.TeachingInfo;
import com.cc.open.domain.TeachingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingInfoMapper {
    long countByExample(TeachingInfoExample example);

    int deleteByExample(TeachingInfoExample example);

    int deleteByPrimaryKey(String teachingInfoUuid);

    int insert(TeachingInfo record);

    int insertSelective(TeachingInfo record);

    List<TeachingInfo> selectByExample(TeachingInfoExample example);

    TeachingInfo selectByPrimaryKey(String teachingInfoUuid);

    int updateByExampleSelective(@Param("record") TeachingInfo record, @Param("example") TeachingInfoExample example);

    int updateByExample(@Param("record") TeachingInfo record, @Param("example") TeachingInfoExample example);

    int updateByPrimaryKeySelective(TeachingInfo record);

    int updateByPrimaryKey(TeachingInfo record);
}