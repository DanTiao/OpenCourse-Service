package com.cc.open.domain;

public class CourseInfo {
    private String courseUuid;

    private String courseNum;

    private String courseName;

    private String courseCredit;

    private String courseHour;

    private String academyId;

    public String getCourseUuid() {
        return courseUuid;
    }

    public void setCourseUuid(String courseUuid) {
        this.courseUuid = courseUuid;
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

    public String getAcademyId() {
        return academyId;
    }

    public void setAcademyId(String academyId) {
        this.academyId = academyId;
    }
}