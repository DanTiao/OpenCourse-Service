package com.cc.open.dao;

import com.cc.open.domain.CourseData;
import com.cc.open.domain.CourseDataExample;
import com.cc.open.vo.CourseDataVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseDataMapper {
    long countByExample(CourseDataExample example);

    int deleteByExample(CourseDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseData record);

    int insertSelective(CourseData record);

    List<CourseData> selectByExample(CourseDataExample example);

    CourseData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CourseData record, @Param("example") CourseDataExample example);

    int updateByExample(@Param("record") CourseData record, @Param("example") CourseDataExample example);

    int updateByPrimaryKeySelective(CourseData record);

    int updateByPrimaryKey(CourseData record);

	void createCourseData(@Param("courseDataVO") CourseDataVO courseDataVO);

	void updateCourseData(@Param("courseDataVO") CourseDataVO courseDataVO);

	CourseDataVO findCourseDataByCourseId(@Param("courseId") String courseId);

	void deleteCourseDataUrl(@Param("courseDataVO") CourseDataVO courseDataVO);

	List<CourseDataVO> findAllVideos();

	List<CourseDataVO> findAllFiles();
}