package com.cc.open.dao;

import com.cc.open.domain.Teacher;
import com.cc.open.domain.TeacherExample;
import com.cc.open.vo.UserVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacherUuid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacherUuid);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

	Teacher getTeacherInfoByUserId(String userId);

	void updateTeacherInfoByUserId(Teacher teacher);

	void createTeacherInfo(UserVO data);
}