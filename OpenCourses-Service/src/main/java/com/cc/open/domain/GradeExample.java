package com.cc.open.domain;

import java.util.ArrayList;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
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

        public Criteria andGradeUuidIsNull() {
            addCriterion("grade_uuid is null");
            return (Criteria) this;
        }

        public Criteria andGradeUuidIsNotNull() {
            addCriterion("grade_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andGradeUuidEqualTo(String value) {
            addCriterion("grade_uuid =", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidNotEqualTo(String value) {
            addCriterion("grade_uuid <>", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidGreaterThan(String value) {
            addCriterion("grade_uuid >", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidGreaterThanOrEqualTo(String value) {
            addCriterion("grade_uuid >=", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidLessThan(String value) {
            addCriterion("grade_uuid <", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidLessThanOrEqualTo(String value) {
            addCriterion("grade_uuid <=", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidLike(String value) {
            addCriterion("grade_uuid like", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidNotLike(String value) {
            addCriterion("grade_uuid not like", value, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidIn(List<String> values) {
            addCriterion("grade_uuid in", values, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidNotIn(List<String> values) {
            addCriterion("grade_uuid not in", values, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidBetween(String value1, String value2) {
            addCriterion("grade_uuid between", value1, value2, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andGradeUuidNotBetween(String value1, String value2) {
            addCriterion("grade_uuid not between", value1, value2, "gradeUuid");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNull() {
            addCriterion("school_year is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNotNull() {
            addCriterion("school_year is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearEqualTo(String value) {
            addCriterion("school_year =", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotEqualTo(String value) {
            addCriterion("school_year <>", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThan(String value) {
            addCriterion("school_year >", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThanOrEqualTo(String value) {
            addCriterion("school_year >=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThan(String value) {
            addCriterion("school_year <", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThanOrEqualTo(String value) {
            addCriterion("school_year <=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLike(String value) {
            addCriterion("school_year like", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotLike(String value) {
            addCriterion("school_year not like", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIn(List<String> values) {
            addCriterion("school_year in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotIn(List<String> values) {
            addCriterion("school_year not in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearBetween(String value1, String value2) {
            addCriterion("school_year between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotBetween(String value1, String value2) {
            addCriterion("school_year not between", value1, value2, "schoolYear");
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

        public Criteria andTeacherAccountIsNull() {
            addCriterion("teacher_account is null");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountIsNotNull() {
            addCriterion("teacher_account is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountEqualTo(String value) {
            addCriterion("teacher_account =", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotEqualTo(String value) {
            addCriterion("teacher_account <>", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountGreaterThan(String value) {
            addCriterion("teacher_account >", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_account >=", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountLessThan(String value) {
            addCriterion("teacher_account <", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountLessThanOrEqualTo(String value) {
            addCriterion("teacher_account <=", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountLike(String value) {
            addCriterion("teacher_account like", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotLike(String value) {
            addCriterion("teacher_account not like", value, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountIn(List<String> values) {
            addCriterion("teacher_account in", values, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotIn(List<String> values) {
            addCriterion("teacher_account not in", values, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountBetween(String value1, String value2) {
            addCriterion("teacher_account between", value1, value2, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andTeacherAccountNotBetween(String value1, String value2) {
            addCriterion("teacher_account not between", value1, value2, "teacherAccount");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Long value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Long value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Long value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Long value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Long value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Long> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Long> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Long value1, Long value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Long value1, Long value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesIsNull() {
            addCriterion("ordinary_grades is null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesIsNotNull() {
            addCriterion("ordinary_grades is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesEqualTo(Float value) {
            addCriterion("ordinary_grades =", value, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesNotEqualTo(Float value) {
            addCriterion("ordinary_grades <>", value, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesGreaterThan(Float value) {
            addCriterion("ordinary_grades >", value, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesGreaterThanOrEqualTo(Float value) {
            addCriterion("ordinary_grades >=", value, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesLessThan(Float value) {
            addCriterion("ordinary_grades <", value, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesLessThanOrEqualTo(Float value) {
            addCriterion("ordinary_grades <=", value, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesIn(List<Float> values) {
            addCriterion("ordinary_grades in", values, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesNotIn(List<Float> values) {
            addCriterion("ordinary_grades not in", values, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesBetween(Float value1, Float value2) {
            addCriterion("ordinary_grades between", value1, value2, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andOrdinaryGradesNotBetween(Float value1, Float value2) {
            addCriterion("ordinary_grades not between", value1, value2, "ordinaryGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesIsNull() {
            addCriterion("mid_grades is null");
            return (Criteria) this;
        }

        public Criteria andMidGradesIsNotNull() {
            addCriterion("mid_grades is not null");
            return (Criteria) this;
        }

        public Criteria andMidGradesEqualTo(Float value) {
            addCriterion("mid_grades =", value, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesNotEqualTo(Float value) {
            addCriterion("mid_grades <>", value, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesGreaterThan(Float value) {
            addCriterion("mid_grades >", value, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesGreaterThanOrEqualTo(Float value) {
            addCriterion("mid_grades >=", value, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesLessThan(Float value) {
            addCriterion("mid_grades <", value, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesLessThanOrEqualTo(Float value) {
            addCriterion("mid_grades <=", value, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesIn(List<Float> values) {
            addCriterion("mid_grades in", values, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesNotIn(List<Float> values) {
            addCriterion("mid_grades not in", values, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesBetween(Float value1, Float value2) {
            addCriterion("mid_grades between", value1, value2, "midGrades");
            return (Criteria) this;
        }

        public Criteria andMidGradesNotBetween(Float value1, Float value2) {
            addCriterion("mid_grades not between", value1, value2, "midGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesIsNull() {
            addCriterion("final_grades is null");
            return (Criteria) this;
        }

        public Criteria andFinalGradesIsNotNull() {
            addCriterion("final_grades is not null");
            return (Criteria) this;
        }

        public Criteria andFinalGradesEqualTo(Float value) {
            addCriterion("final_grades =", value, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesNotEqualTo(Float value) {
            addCriterion("final_grades <>", value, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesGreaterThan(Float value) {
            addCriterion("final_grades >", value, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesGreaterThanOrEqualTo(Float value) {
            addCriterion("final_grades >=", value, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesLessThan(Float value) {
            addCriterion("final_grades <", value, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesLessThanOrEqualTo(Float value) {
            addCriterion("final_grades <=", value, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesIn(List<Float> values) {
            addCriterion("final_grades in", values, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesNotIn(List<Float> values) {
            addCriterion("final_grades not in", values, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesBetween(Float value1, Float value2) {
            addCriterion("final_grades between", value1, value2, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andFinalGradesNotBetween(Float value1, Float value2) {
            addCriterion("final_grades not between", value1, value2, "finalGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesIsNull() {
            addCriterion("homework_grades is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesIsNotNull() {
            addCriterion("homework_grades is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesEqualTo(Float value) {
            addCriterion("homework_grades =", value, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesNotEqualTo(Float value) {
            addCriterion("homework_grades <>", value, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesGreaterThan(Float value) {
            addCriterion("homework_grades >", value, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesGreaterThanOrEqualTo(Float value) {
            addCriterion("homework_grades >=", value, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesLessThan(Float value) {
            addCriterion("homework_grades <", value, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesLessThanOrEqualTo(Float value) {
            addCriterion("homework_grades <=", value, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesIn(List<Float> values) {
            addCriterion("homework_grades in", values, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesNotIn(List<Float> values) {
            addCriterion("homework_grades not in", values, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesBetween(Float value1, Float value2) {
            addCriterion("homework_grades between", value1, value2, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andHomeworkGradesNotBetween(Float value1, Float value2) {
            addCriterion("homework_grades not between", value1, value2, "homeworkGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesIsNull() {
            addCriterion("overall_grades is null");
            return (Criteria) this;
        }

        public Criteria andOverallGradesIsNotNull() {
            addCriterion("overall_grades is not null");
            return (Criteria) this;
        }

        public Criteria andOverallGradesEqualTo(Float value) {
            addCriterion("overall_grades =", value, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesNotEqualTo(Float value) {
            addCriterion("overall_grades <>", value, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesGreaterThan(Float value) {
            addCriterion("overall_grades >", value, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesGreaterThanOrEqualTo(Float value) {
            addCriterion("overall_grades >=", value, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesLessThan(Float value) {
            addCriterion("overall_grades <", value, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesLessThanOrEqualTo(Float value) {
            addCriterion("overall_grades <=", value, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesIn(List<Float> values) {
            addCriterion("overall_grades in", values, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesNotIn(List<Float> values) {
            addCriterion("overall_grades not in", values, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesBetween(Float value1, Float value2) {
            addCriterion("overall_grades between", value1, value2, "overallGrades");
            return (Criteria) this;
        }

        public Criteria andOverallGradesNotBetween(Float value1, Float value2) {
            addCriterion("overall_grades not between", value1, value2, "overallGrades");
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