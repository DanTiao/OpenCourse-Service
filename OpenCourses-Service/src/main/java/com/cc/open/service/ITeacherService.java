package com.cc.open.service;

import com.cc.open.domain.Teacher;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;

public interface ITeacherService {

	void createTeacherInfo(UserVO data);

	ResponVO<Teacher> getTeacherInfo();

	ResponVO<String> updateTeacherInfo(Teacher teacher);

}
