package com.cc.open.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseInfoExample() {
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

        public Criteria andCourseUuidIsNull() {
            addCriterion("course_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCourseUuidIsNotNull() {
            addCriterion("course_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseUuidEqualTo(String value) {
            addCriterion("course_uuid =", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidNotEqualTo(String value) {
            addCriterion("course_uuid <>", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidGreaterThan(String value) {
            addCriterion("course_uuid >", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidGreaterThanOrEqualTo(String value) {
            addCriterion("course_uuid >=", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidLessThan(String value) {
            addCriterion("course_uuid <", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidLessThanOrEqualTo(String value) {
            addCriterion("course_uuid <=", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidLike(String value) {
            addCriterion("course_uuid like", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidNotLike(String value) {
            addCriterion("course_uuid not like", value, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidIn(List<String> values) {
            addCriterion("course_uuid in", values, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidNotIn(List<String> values) {
            addCriterion("course_uuid not in", values, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidBetween(String value1, String value2) {
            addCriterion("course_uuid between", value1, value2, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseUuidNotBetween(String value1, String value2) {
            addCriterion("course_uuid not between", value1, value2, "courseUuid");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNull() {
            addCriterion("course_num is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNotNull() {
            addCriterion("course_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumEqualTo(String value) {
            addCriterion("course_num =", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotEqualTo(String value) {
            addCriterion("course_num <>", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThan(String value) {
            addCriterion("course_num >", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThanOrEqualTo(String value) {
            addCriterion("course_num >=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThan(String value) {
            addCriterion("course_num <", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThanOrEqualTo(String value) {
            addCriterion("course_num <=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLike(String value) {
            addCriterion("course_num like", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotLike(String value) {
            addCriterion("course_num not like", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIn(List<String> values) {
            addCriterion("course_num in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotIn(List<String> values) {
            addCriterion("course_num not in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumBetween(String value1, String value2) {
            addCriterion("course_num between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotBetween(String value1, String value2) {
            addCriterion("course_num not between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNull() {
            addCriterion("course_credit is null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIsNotNull() {
            addCriterion("course_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCreditEqualTo(String value) {
            addCriterion("course_credit =", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotEqualTo(String value) {
            addCriterion("course_credit <>", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThan(String value) {
            addCriterion("course_credit >", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditGreaterThanOrEqualTo(String value) {
            addCriterion("course_credit >=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThan(String value) {
            addCriterion("course_credit <", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLessThanOrEqualTo(String value) {
            addCriterion("course_credit <=", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditLike(String value) {
            addCriterion("course_credit like", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotLike(String value) {
            addCriterion("course_credit not like", value, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditIn(List<String> values) {
            addCriterion("course_credit in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotIn(List<String> values) {
            addCriterion("course_credit not in", values, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditBetween(String value1, String value2) {
            addCriterion("course_credit between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseCreditNotBetween(String value1, String value2) {
            addCriterion("course_credit not between", value1, value2, "courseCredit");
            return (Criteria) this;
        }

        public Criteria andCourseHourIsNull() {
            addCriterion("course_hour is null");
            return (Criteria) this;
        }

        public Criteria andCourseHourIsNotNull() {
            addCriterion("course_hour is not null");
            return (Criteria) this;
        }

        public Criteria andCourseHourEqualTo(String value) {
            addCriterion("course_hour =", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotEqualTo(String value) {
            addCriterion("course_hour <>", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourGreaterThan(String value) {
            addCriterion("course_hour >", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourGreaterThanOrEqualTo(String value) {
            addCriterion("course_hour >=", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLessThan(String value) {
            addCriterion("course_hour <", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLessThanOrEqualTo(String value) {
            addCriterion("course_hour <=", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourLike(String value) {
            addCriterion("course_hour like", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotLike(String value) {
            addCriterion("course_hour not like", value, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourIn(List<String> values) {
            addCriterion("course_hour in", values, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotIn(List<String> values) {
            addCriterion("course_hour not in", values, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourBetween(String value1, String value2) {
            addCriterion("course_hour between", value1, value2, "courseHour");
            return (Criteria) this;
        }

        public Criteria andCourseHourNotBetween(String value1, String value2) {
            addCriterion("course_hour not between", value1, value2, "courseHour");
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