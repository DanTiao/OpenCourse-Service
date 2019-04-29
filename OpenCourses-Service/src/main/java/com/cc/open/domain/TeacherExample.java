package com.cc.open.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTeacherUuidIsNull() {
            addCriterion("teacher_uuid is null");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidIsNotNull() {
            addCriterion("teacher_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidEqualTo(String value) {
            addCriterion("teacher_uuid =", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidNotEqualTo(String value) {
            addCriterion("teacher_uuid <>", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidGreaterThan(String value) {
            addCriterion("teacher_uuid >", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_uuid >=", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidLessThan(String value) {
            addCriterion("teacher_uuid <", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidLessThanOrEqualTo(String value) {
            addCriterion("teacher_uuid <=", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidLike(String value) {
            addCriterion("teacher_uuid like", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidNotLike(String value) {
            addCriterion("teacher_uuid not like", value, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidIn(List<String> values) {
            addCriterion("teacher_uuid in", values, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidNotIn(List<String> values) {
            addCriterion("teacher_uuid not in", values, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidBetween(String value1, String value2) {
            addCriterion("teacher_uuid between", value1, value2, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andTeacherUuidNotBetween(String value1, String value2) {
            addCriterion("teacher_uuid not between", value1, value2, "teacherUuid");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNull() {
            addCriterion("teacher_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("teacher_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(String value) {
            addCriterion("teacher_sex =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(String value) {
            addCriterion("teacher_sex <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(String value) {
            addCriterion("teacher_sex >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_sex >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(String value) {
            addCriterion("teacher_sex <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(String value) {
            addCriterion("teacher_sex <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLike(String value) {
            addCriterion("teacher_sex like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotLike(String value) {
            addCriterion("teacher_sex not like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<String> values) {
            addCriterion("teacher_sex in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<String> values) {
            addCriterion("teacher_sex not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(String value1, String value2) {
            addCriterion("teacher_sex between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(String value1, String value2) {
            addCriterion("teacher_sex not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayIsNull() {
            addCriterion("teacher_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayIsNotNull() {
            addCriterion("teacher_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayEqualTo(Date value) {
            addCriterion("teacher_birthday =", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayNotEqualTo(Date value) {
            addCriterion("teacher_birthday <>", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayGreaterThan(Date value) {
            addCriterion("teacher_birthday >", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("teacher_birthday >=", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayLessThan(Date value) {
            addCriterion("teacher_birthday <", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("teacher_birthday <=", value, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayIn(List<Date> values) {
            addCriterion("teacher_birthday in", values, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayNotIn(List<Date> values) {
            addCriterion("teacher_birthday not in", values, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayBetween(Date value1, Date value2) {
            addCriterion("teacher_birthday between", value1, value2, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("teacher_birthday not between", value1, value2, "teacherBirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationIsNull() {
            addCriterion("teacher_education is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationIsNotNull() {
            addCriterion("teacher_education is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationEqualTo(String value) {
            addCriterion("teacher_education =", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotEqualTo(String value) {
            addCriterion("teacher_education <>", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationGreaterThan(String value) {
            addCriterion("teacher_education >", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_education >=", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationLessThan(String value) {
            addCriterion("teacher_education <", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationLessThanOrEqualTo(String value) {
            addCriterion("teacher_education <=", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationLike(String value) {
            addCriterion("teacher_education like", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotLike(String value) {
            addCriterion("teacher_education not like", value, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationIn(List<String> values) {
            addCriterion("teacher_education in", values, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotIn(List<String> values) {
            addCriterion("teacher_education not in", values, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationBetween(String value1, String value2) {
            addCriterion("teacher_education between", value1, value2, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherEducationNotBetween(String value1, String value2) {
            addCriterion("teacher_education not between", value1, value2, "teacherEducation");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIsNull() {
            addCriterion("teacher_degree is null");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIsNotNull() {
            addCriterion("teacher_degree is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeEqualTo(String value) {
            addCriterion("teacher_degree =", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotEqualTo(String value) {
            addCriterion("teacher_degree <>", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeGreaterThan(String value) {
            addCriterion("teacher_degree >", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_degree >=", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLessThan(String value) {
            addCriterion("teacher_degree <", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLessThanOrEqualTo(String value) {
            addCriterion("teacher_degree <=", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeLike(String value) {
            addCriterion("teacher_degree like", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotLike(String value) {
            addCriterion("teacher_degree not like", value, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeIn(List<String> values) {
            addCriterion("teacher_degree in", values, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotIn(List<String> values) {
            addCriterion("teacher_degree not in", values, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeBetween(String value1, String value2) {
            addCriterion("teacher_degree between", value1, value2, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherDegreeNotBetween(String value1, String value2) {
            addCriterion("teacher_degree not between", value1, value2, "teacherDegree");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorIsNull() {
            addCriterion("teacher_major is null");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorIsNotNull() {
            addCriterion("teacher_major is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorEqualTo(String value) {
            addCriterion("teacher_major =", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorNotEqualTo(String value) {
            addCriterion("teacher_major <>", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorGreaterThan(String value) {
            addCriterion("teacher_major >", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_major >=", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorLessThan(String value) {
            addCriterion("teacher_major <", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorLessThanOrEqualTo(String value) {
            addCriterion("teacher_major <=", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorLike(String value) {
            addCriterion("teacher_major like", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorNotLike(String value) {
            addCriterion("teacher_major not like", value, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorIn(List<String> values) {
            addCriterion("teacher_major in", values, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorNotIn(List<String> values) {
            addCriterion("teacher_major not in", values, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorBetween(String value1, String value2) {
            addCriterion("teacher_major between", value1, value2, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherMajorNotBetween(String value1, String value2) {
            addCriterion("teacher_major not between", value1, value2, "teacherMajor");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNull() {
            addCriterion("teacher_title is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIsNotNull() {
            addCriterion("teacher_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleEqualTo(String value) {
            addCriterion("teacher_title =", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotEqualTo(String value) {
            addCriterion("teacher_title <>", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThan(String value) {
            addCriterion("teacher_title >", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_title >=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThan(String value) {
            addCriterion("teacher_title <", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLessThanOrEqualTo(String value) {
            addCriterion("teacher_title <=", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleLike(String value) {
            addCriterion("teacher_title like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotLike(String value) {
            addCriterion("teacher_title not like", value, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleIn(List<String> values) {
            addCriterion("teacher_title in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotIn(List<String> values) {
            addCriterion("teacher_title not in", values, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleBetween(String value1, String value2) {
            addCriterion("teacher_title between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andTeacherTitleNotBetween(String value1, String value2) {
            addCriterion("teacher_title not between", value1, value2, "teacherTitle");
            return (Criteria) this;
        }

        public Criteria andAcademyIdIsNull() {
            addCriterion("academy_id is null");
            return (Criteria) this;
        }

        public Criteria andAcademyIdIsNotNull() {
            addCriterion("academy_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyIdEqualTo(String value) {
            addCriterion("academy_id =", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotEqualTo(String value) {
            addCriterion("academy_id <>", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdGreaterThan(String value) {
            addCriterion("academy_id >", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdGreaterThanOrEqualTo(String value) {
            addCriterion("academy_id >=", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdLessThan(String value) {
            addCriterion("academy_id <", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdLessThanOrEqualTo(String value) {
            addCriterion("academy_id <=", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdLike(String value) {
            addCriterion("academy_id like", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotLike(String value) {
            addCriterion("academy_id not like", value, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdIn(List<String> values) {
            addCriterion("academy_id in", values, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotIn(List<String> values) {
            addCriterion("academy_id not in", values, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdBetween(String value1, String value2) {
            addCriterion("academy_id between", value1, value2, "academyId");
            return (Criteria) this;
        }

        public Criteria andAcademyIdNotBetween(String value1, String value2) {
            addCriterion("academy_id not between", value1, value2, "academyId");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionIsNull() {
            addCriterion("teacher_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionIsNotNull() {
            addCriterion("teacher_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionEqualTo(String value) {
            addCriterion("teacher_introduction =", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionNotEqualTo(String value) {
            addCriterion("teacher_introduction <>", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionGreaterThan(String value) {
            addCriterion("teacher_introduction >", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_introduction >=", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionLessThan(String value) {
            addCriterion("teacher_introduction <", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionLessThanOrEqualTo(String value) {
            addCriterion("teacher_introduction <=", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionLike(String value) {
            addCriterion("teacher_introduction like", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionNotLike(String value) {
            addCriterion("teacher_introduction not like", value, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionIn(List<String> values) {
            addCriterion("teacher_introduction in", values, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionNotIn(List<String> values) {
            addCriterion("teacher_introduction not in", values, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionBetween(String value1, String value2) {
            addCriterion("teacher_introduction between", value1, value2, "teacherIntroduction");
            return (Criteria) this;
        }

        public Criteria andTeacherIntroductionNotBetween(String value1, String value2) {
            addCriterion("teacher_introduction not between", value1, value2, "teacherIntroduction");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}