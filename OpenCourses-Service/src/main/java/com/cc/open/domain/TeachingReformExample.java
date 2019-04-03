package com.cc.open.domain;

import java.util.ArrayList;
import java.util.List;

public class TeachingReformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachingReformExample() {
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

        public Criteria andTeachingReformUuidIsNull() {
            addCriterion("teaching_reform_uuid is null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidIsNotNull() {
            addCriterion("teaching_reform_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidEqualTo(String value) {
            addCriterion("teaching_reform_uuid =", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidNotEqualTo(String value) {
            addCriterion("teaching_reform_uuid <>", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidGreaterThan(String value) {
            addCriterion("teaching_reform_uuid >", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_reform_uuid >=", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidLessThan(String value) {
            addCriterion("teaching_reform_uuid <", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidLessThanOrEqualTo(String value) {
            addCriterion("teaching_reform_uuid <=", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidLike(String value) {
            addCriterion("teaching_reform_uuid like", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidNotLike(String value) {
            addCriterion("teaching_reform_uuid not like", value, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidIn(List<String> values) {
            addCriterion("teaching_reform_uuid in", values, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidNotIn(List<String> values) {
            addCriterion("teaching_reform_uuid not in", values, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidBetween(String value1, String value2) {
            addCriterion("teaching_reform_uuid between", value1, value2, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUuidNotBetween(String value1, String value2) {
            addCriterion("teaching_reform_uuid not between", value1, value2, "teachingReformUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleIsNull() {
            addCriterion("teaching_reform_title is null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleIsNotNull() {
            addCriterion("teaching_reform_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleEqualTo(String value) {
            addCriterion("teaching_reform_title =", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleNotEqualTo(String value) {
            addCriterion("teaching_reform_title <>", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleGreaterThan(String value) {
            addCriterion("teaching_reform_title >", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_reform_title >=", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleLessThan(String value) {
            addCriterion("teaching_reform_title <", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleLessThanOrEqualTo(String value) {
            addCriterion("teaching_reform_title <=", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleLike(String value) {
            addCriterion("teaching_reform_title like", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleNotLike(String value) {
            addCriterion("teaching_reform_title not like", value, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleIn(List<String> values) {
            addCriterion("teaching_reform_title in", values, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleNotIn(List<String> values) {
            addCriterion("teaching_reform_title not in", values, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleBetween(String value1, String value2) {
            addCriterion("teaching_reform_title between", value1, value2, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformTitleNotBetween(String value1, String value2) {
            addCriterion("teaching_reform_title not between", value1, value2, "teachingReformTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedIsNull() {
            addCriterion("teaching_reform_published is null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedIsNotNull() {
            addCriterion("teaching_reform_published is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedEqualTo(String value) {
            addCriterion("teaching_reform_published =", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedNotEqualTo(String value) {
            addCriterion("teaching_reform_published <>", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedGreaterThan(String value) {
            addCriterion("teaching_reform_published >", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_reform_published >=", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedLessThan(String value) {
            addCriterion("teaching_reform_published <", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedLessThanOrEqualTo(String value) {
            addCriterion("teaching_reform_published <=", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedLike(String value) {
            addCriterion("teaching_reform_published like", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedNotLike(String value) {
            addCriterion("teaching_reform_published not like", value, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedIn(List<String> values) {
            addCriterion("teaching_reform_published in", values, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedNotIn(List<String> values) {
            addCriterion("teaching_reform_published not in", values, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedBetween(String value1, String value2) {
            addCriterion("teaching_reform_published between", value1, value2, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformPublishedNotBetween(String value1, String value2) {
            addCriterion("teaching_reform_published not between", value1, value2, "teachingReformPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlIsNull() {
            addCriterion("teaching_reform_url is null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlIsNotNull() {
            addCriterion("teaching_reform_url is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlEqualTo(String value) {
            addCriterion("teaching_reform_url =", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlNotEqualTo(String value) {
            addCriterion("teaching_reform_url <>", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlGreaterThan(String value) {
            addCriterion("teaching_reform_url >", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_reform_url >=", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlLessThan(String value) {
            addCriterion("teaching_reform_url <", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlLessThanOrEqualTo(String value) {
            addCriterion("teaching_reform_url <=", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlLike(String value) {
            addCriterion("teaching_reform_url like", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlNotLike(String value) {
            addCriterion("teaching_reform_url not like", value, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlIn(List<String> values) {
            addCriterion("teaching_reform_url in", values, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlNotIn(List<String> values) {
            addCriterion("teaching_reform_url not in", values, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlBetween(String value1, String value2) {
            addCriterion("teaching_reform_url between", value1, value2, "teachingReformUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingReformUrlNotBetween(String value1, String value2) {
            addCriterion("teaching_reform_url not between", value1, value2, "teachingReformUrl");
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