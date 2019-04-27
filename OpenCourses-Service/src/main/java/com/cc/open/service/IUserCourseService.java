package com.cc.open.service;

import java.util.List;

import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserCourseVO;
import com.cc.open.vo.UserVO;

public interface IUserCourseService {

	ResponVO<String> setUserCourseRelation(UserCourseVO userCourseVO);

	ResponVO<List<UserCourseVO>> findCourseManager(String courseId);

	ResponVO<UserVO> findUserByAccount(UserCourseVO userCourseVO);

	ResponVO<String> deleteCourseManager(UserCourseVO userCourseVO);

}
