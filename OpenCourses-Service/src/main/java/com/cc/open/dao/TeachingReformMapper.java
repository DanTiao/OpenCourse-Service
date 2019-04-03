package com.cc.open.dao;

import com.cc.open.domain.TeachingReform;
import com.cc.open.domain.TeachingReformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeachingReformMapper {
    long countByExample(TeachingReformExample example);

    int deleteByExample(TeachingReformExample example);

    int insert(TeachingReform record);

    int insertSelective(TeachingReform record);

    List<TeachingReform> selectByExample(TeachingReformExample example);

    int updateByExampleSelective(@Param("record") TeachingReform record, @Param("example") TeachingReformExample example);

    int updateByExample(@Param("record") TeachingReform record, @Param("example") TeachingReformExample example);
}