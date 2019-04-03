package com.cc.open.domain;

public class Student {
    private String stuUuid;

    private Long stuId;

    private String stuName;

    private String stuSex;

    private String stuBirthday;

    private String stuBirthplace;

    private String stuMail;

    private String stuTel;

    private String classId;

    private String academyId;

    public String getStuUuid() {
        return stuUuid;
    }

    public void setStuUuid(String stuUuid) {
        this.stuUuid = stuUuid;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public String getStuBirthplace() {
        return stuBirthplace;
    }

    public void setStuBirthplace(String stuBirthplace) {
        this.stuBirthplace = stuBirthplace;
    }

    public String getStuMail() {
        return stuMail;
    }

    public void setStuMail(String stuMail) {
        this.stuMail = stuMail;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getAcademyId() {
        return academyId;
    }

    public void setAcademyId(String academyId) {
        this.academyId = academyId;
    }
}