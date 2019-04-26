package com.cc.open.dao;

import com.cc.open.domain.Course;
import com.cc.open.domain.CourseExample;
import com.cc.open.vo.CourseVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String courseUuid);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(String courseUuid);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

	CourseVO findCourseByName(@Param("courseVO") CourseVO courseVO);

	int createCourse(CourseVO courseVO);
}