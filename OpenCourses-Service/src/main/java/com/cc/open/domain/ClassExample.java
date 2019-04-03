package com.cc.open.domain;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassUuidIsNull() {
            addCriterion("class_uuid is null");
            return (Criteria) this;
        }

        public Criteria andClassUuidIsNotNull() {
            addCriterion("class_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andClassUuidEqualTo(String value) {
            addCriterion("class_uuid =", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidNotEqualTo(String value) {
            addCriterion("class_uuid <>", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidGreaterThan(String value) {
            addCriterion("class_uuid >", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidGreaterThanOrEqualTo(String value) {
            addCriterion("class_uuid >=", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidLessThan(String value) {
            addCriterion("class_uuid <", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidLessThanOrEqualTo(String value) {
            addCriterion("class_uuid <=", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidLike(String value) {
            addCriterion("class_uuid like", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidNotLike(String value) {
            addCriterion("class_uuid not like", value, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidIn(List<String> values) {
            addCriterion("class_uuid in", values, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidNotIn(List<String> values) {
            addCriterion("class_uuid not in", values, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidBetween(String value1, String value2) {
            addCriterion("class_uuid between", value1, value2, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassUuidNotBetween(String value1, String value2) {
            addCriterion("class_uuid not between", value1, value2, "classUuid");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNull() {
            addCriterion("class_grade is null");
            return (Criteria) this;
        }

        public Criteria andClassGradeIsNotNull() {
            addCriterion("class_grade is not null");
            return (Criteria) this;
        }

        public Criteria andClassGradeEqualTo(String value) {
            addCriterion("class_grade =", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotEqualTo(String value) {
            addCriterion("class_grade <>", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThan(String value) {
            addCriterion("class_grade >", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeGreaterThanOrEqualTo(String value) {
            addCriterion("class_grade >=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThan(String value) {
            addCriterion("class_grade <", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLessThanOrEqualTo(String value) {
            addCriterion("class_grade <=", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeLike(String value) {
            addCriterion("class_grade like", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotLike(String value) {
            addCriterion("class_grade not like", value, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeIn(List<String> values) {
            addCriterion("class_grade in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotIn(List<String> values) {
            addCriterion("class_grade not in", values, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeBetween(String value1, String value2) {
            addCriterion("class_grade between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassGradeNotBetween(String value1, String value2) {
            addCriterion("class_grade not between", value1, value2, "classGrade");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNull() {
            addCriterion("class_major is null");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNotNull() {
            addCriterion("class_major is not null");
            return (Criteria) this;
        }

        public Criteria andClassMajorEqualTo(String value) {
            addCriterion("class_major =", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotEqualTo(String value) {
            addCriterion("class_major <>", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThan(String value) {
            addCriterion("class_major >", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThanOrEqualTo(String value) {
            addCriterion("class_major >=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThan(String value) {
            addCriterion("class_major <", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThanOrEqualTo(String value) {
            addCriterion("class_major <=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLike(String value) {
            addCriterion("class_major like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotLike(String value) {
            addCriterion("class_major not like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorIn(List<String> values) {
            addCriterion("class_major in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotIn(List<String> values) {
            addCriterion("class_major not in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorBetween(String value1, String value2) {
            addCriterion("class_major between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotBetween(String value1, String value2) {
            addCriterion("class_major not between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(Integer value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(Integer value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(Integer value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(Integer value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(Integer value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<Integer> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<Integer> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(Integer value1, Integer value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(Integer value1, Integer value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
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