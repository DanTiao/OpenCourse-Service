package com.cc.open.domain;

public class Grade {
    private String gradeUuid;

    private String schoolYear;

    private String courseNum;

    private String teacherAccount;

    private Long stuId;

    private Float ordinaryGrades;

    private Float midGrades;

    private Float finalGrades;

    private Float homeworkGrades;

    private Float overallGrades;

    public String getGradeUuid() {
        return gradeUuid;
    }

    public void setGradeUuid(String gradeUuid) {
        this.gradeUuid = gradeUuid;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getTeacherAccount() {
        return teacherAccount;
    }

    public void setTeacherAccount(String teacherAccount) {
        this.teacherAccount = teacherAccount;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Float getOrdinaryGrades() {
        return ordinaryGrades;
    }

    public void setOrdinaryGrades(Float ordinaryGrades) {
        this.ordinaryGrades = ordinaryGrades;
    }

    public Float getMidGrades() {
        return midGrades;
    }

    public void setMidGrades(Float midGrades) {
        this.midGrades = midGrades;
    }

    public Float getFinalGrades() {
        return finalGrades;
    }

    public void setFinalGrades(Float finalGrades) {
        this.finalGrades = finalGrades;
    }

    public Float getHomeworkGrades() {
        return homeworkGrades;
    }

    public void setHomeworkGrades(Float homeworkGrades) {
        this.homeworkGrades = homeworkGrades;
    }

    public Float getOverallGrades() {
        return overallGrades;
    }

    public void setOverallGrades(Float overallGrades) {
        this.overallGrades = overallGrades;
    }
}