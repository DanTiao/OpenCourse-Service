package com.cc.open.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CourseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String courseId;

    private String courseNum;

    private String courseName;

    private String courseCredit;

    private String courseHour;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;

    private Date creatTime;

    private String academyId;

    private String isEnable;

    private String userId;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(String courseCredit) {
		this.courseCredit = courseCredit;
	}

	public String getCourseHour() {
		return courseHour;
	}

	public void setCourseHour(String courseHour) {
		this.courseHour = courseHour;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getAcademyId() {
		return academyId;
	}

	public void setAcademyId(String academyId) {
		this.academyId = academyId;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    

}
