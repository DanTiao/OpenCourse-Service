package com.cc.open.service;

import java.util.List;

import com.cc.open.domain.Teacher;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.TeacherVO;
import com.cc.open.vo.UserVO;

public interface ITeacherService {

	void createTeacherInfo(UserVO data);

	ResponVO<Teacher> getTeacherInfo();

	ResponVO<String> updateTeacherInfo(Teacher teacher);

	ResponVO<List<TeacherVO>> getTeacherData(String courseId);

}
