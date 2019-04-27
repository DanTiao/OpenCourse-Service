package com.cc.open.dao;

import com.cc.open.domain.UserCourse;
import com.cc.open.domain.UserCourseExample;
import com.cc.open.vo.UserCourseVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCourseMapper {
    long countByExample(UserCourseExample example);

    int deleteByExample(UserCourseExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserCourse record);

    int insertSelective(UserCourse record);

    List<UserCourse> selectByExample(UserCourseExample example);

    UserCourse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    int updateByExample(@Param("record") UserCourse record, @Param("example") UserCourseExample example);

    int updateByPrimaryKeySelective(UserCourse record);

    int updateByPrimaryKey(UserCourse record);

	void setUserCourseRelation(@Param("userCourseVO") UserCourseVO userCourseVO);

	List<UserCourseVO> findCourseManager(@Param("courseId")String courseId);

	UserCourseVO findRelationshipByUser(@Param("userCourseVO") UserCourseVO userCourseVO);

	void deleteCourseManager(@Param("userCourseVO") UserCourseVO userCourseVO);
}