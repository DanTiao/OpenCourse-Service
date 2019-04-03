package com.cc.open.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuUuidIsNull() {
            addCriterion("stu_uuid is null");
            return (Criteria) this;
        }

        public Criteria andStuUuidIsNotNull() {
            addCriterion("stu_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andStuUuidEqualTo(String value) {
            addCriterion("stu_uuid =", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidNotEqualTo(String value) {
            addCriterion("stu_uuid <>", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidGreaterThan(String value) {
            addCriterion("stu_uuid >", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidGreaterThanOrEqualTo(String value) {
            addCriterion("stu_uuid >=", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidLessThan(String value) {
            addCriterion("stu_uuid <", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidLessThanOrEqualTo(String value) {
            addCriterion("stu_uuid <=", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidLike(String value) {
            addCriterion("stu_uuid like", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidNotLike(String value) {
            addCriterion("stu_uuid not like", value, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidIn(List<String> values) {
            addCriterion("stu_uuid in", values, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidNotIn(List<String> values) {
            addCriterion("stu_uuid not in", values, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidBetween(String value1, String value2) {
            addCriterion("stu_uuid between", value1, value2, "stuUuid");
            return (Criteria) this;
        }

        public Criteria andStuUuidNotBetween(String value1, String value2) {
            addCriterion("stu_uuid not between", value1, value2, "stuUuid");
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

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("stu_sex is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("stu_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("stu_sex =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("stu_sex <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("stu_sex >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("stu_sex >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("stu_sex <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("stu_sex <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("stu_sex like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("stu_sex not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("stu_sex in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("stu_sex not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("stu_sex between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("stu_sex not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNull() {
            addCriterion("stu_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIsNotNull() {
            addCriterion("stu_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayEqualTo(String value) {
            addCriterion("stu_birthday =", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotEqualTo(String value) {
            addCriterion("stu_birthday <>", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThan(String value) {
            addCriterion("stu_birthday >", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("stu_birthday >=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThan(String value) {
            addCriterion("stu_birthday <", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLessThanOrEqualTo(String value) {
            addCriterion("stu_birthday <=", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayLike(String value) {
            addCriterion("stu_birthday like", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotLike(String value) {
            addCriterion("stu_birthday not like", value, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayIn(List<String> values) {
            addCriterion("stu_birthday in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotIn(List<String> values) {
            addCriterion("stu_birthday not in", values, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayBetween(String value1, String value2) {
            addCriterion("stu_birthday between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthdayNotBetween(String value1, String value2) {
            addCriterion("stu_birthday not between", value1, value2, "stuBirthday");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceIsNull() {
            addCriterion("stu_birthplace is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceIsNotNull() {
            addCriterion("stu_birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceEqualTo(String value) {
            addCriterion("stu_birthplace =", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceNotEqualTo(String value) {
            addCriterion("stu_birthplace <>", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceGreaterThan(String value) {
            addCriterion("stu_birthplace >", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("stu_birthplace >=", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceLessThan(String value) {
            addCriterion("stu_birthplace <", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("stu_birthplace <=", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceLike(String value) {
            addCriterion("stu_birthplace like", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceNotLike(String value) {
            addCriterion("stu_birthplace not like", value, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceIn(List<String> values) {
            addCriterion("stu_birthplace in", values, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceNotIn(List<String> values) {
            addCriterion("stu_birthplace not in", values, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceBetween(String value1, String value2) {
            addCriterion("stu_birthplace between", value1, value2, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuBirthplaceNotBetween(String value1, String value2) {
            addCriterion("stu_birthplace not between", value1, value2, "stuBirthplace");
            return (Criteria) this;
        }

        public Criteria andStuMailIsNull() {
            addCriterion("stu_mail is null");
            return (Criteria) this;
        }

        public Criteria andStuMailIsNotNull() {
            addCriterion("stu_mail is not null");
            return (Criteria) this;
        }

        public Criteria andStuMailEqualTo(String value) {
            addCriterion("stu_mail =", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotEqualTo(String value) {
            addCriterion("stu_mail <>", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailGreaterThan(String value) {
            addCriterion("stu_mail >", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailGreaterThanOrEqualTo(String value) {
            addCriterion("stu_mail >=", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailLessThan(String value) {
            addCriterion("stu_mail <", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailLessThanOrEqualTo(String value) {
            addCriterion("stu_mail <=", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailLike(String value) {
            addCriterion("stu_mail like", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotLike(String value) {
            addCriterion("stu_mail not like", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailIn(List<String> values) {
            addCriterion("stu_mail in", values, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotIn(List<String> values) {
            addCriterion("stu_mail not in", values, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailBetween(String value1, String value2) {
            addCriterion("stu_mail between", value1, value2, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotBetween(String value1, String value2) {
            addCriterion("stu_mail not between", value1, value2, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNull() {
            addCriterion("stu_tel is null");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNotNull() {
            addCriterion("stu_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStuTelEqualTo(String value) {
            addCriterion("stu_tel =", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotEqualTo(String value) {
            addCriterion("stu_tel <>", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThan(String value) {
            addCriterion("stu_tel >", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThanOrEqualTo(String value) {
            addCriterion("stu_tel >=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThan(String value) {
            addCriterion("stu_tel <", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThanOrEqualTo(String value) {
            addCriterion("stu_tel <=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLike(String value) {
            addCriterion("stu_tel like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotLike(String value) {
            addCriterion("stu_tel not like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelIn(List<String> values) {
            addCriterion("stu_tel in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotIn(List<String> values) {
            addCriterion("stu_tel not in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelBetween(String value1, String value2) {
            addCriterion("stu_tel between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotBetween(String value1, String value2) {
            addCriterion("stu_tel not between", value1, value2, "stuTel");
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