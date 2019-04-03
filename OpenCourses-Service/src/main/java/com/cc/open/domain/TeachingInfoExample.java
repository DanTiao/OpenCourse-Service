package com.cc.open.domain;

import java.util.ArrayList;
import java.util.List;

public class TeachingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachingInfoExample() {
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

        public Criteria andTeachingInfoUuidIsNull() {
            addCriterion("teaching_info_uuid is null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidIsNotNull() {
            addCriterion("teaching_info_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidEqualTo(String value) {
            addCriterion("teaching_info_uuid =", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidNotEqualTo(String value) {
            addCriterion("teaching_info_uuid <>", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidGreaterThan(String value) {
            addCriterion("teaching_info_uuid >", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_info_uuid >=", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidLessThan(String value) {
            addCriterion("teaching_info_uuid <", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidLessThanOrEqualTo(String value) {
            addCriterion("teaching_info_uuid <=", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidLike(String value) {
            addCriterion("teaching_info_uuid like", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidNotLike(String value) {
            addCriterion("teaching_info_uuid not like", value, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidIn(List<String> values) {
            addCriterion("teaching_info_uuid in", values, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidNotIn(List<String> values) {
            addCriterion("teaching_info_uuid not in", values, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidBetween(String value1, String value2) {
            addCriterion("teaching_info_uuid between", value1, value2, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoUuidNotBetween(String value1, String value2) {
            addCriterion("teaching_info_uuid not between", value1, value2, "teachingInfoUuid");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleIsNull() {
            addCriterion("teaching_info_title is null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleIsNotNull() {
            addCriterion("teaching_info_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleEqualTo(String value) {
            addCriterion("teaching_info_title =", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleNotEqualTo(String value) {
            addCriterion("teaching_info_title <>", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleGreaterThan(String value) {
            addCriterion("teaching_info_title >", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_info_title >=", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleLessThan(String value) {
            addCriterion("teaching_info_title <", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleLessThanOrEqualTo(String value) {
            addCriterion("teaching_info_title <=", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleLike(String value) {
            addCriterion("teaching_info_title like", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleNotLike(String value) {
            addCriterion("teaching_info_title not like", value, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleIn(List<String> values) {
            addCriterion("teaching_info_title in", values, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleNotIn(List<String> values) {
            addCriterion("teaching_info_title not in", values, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleBetween(String value1, String value2) {
            addCriterion("teaching_info_title between", value1, value2, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoTitleNotBetween(String value1, String value2) {
            addCriterion("teaching_info_title not between", value1, value2, "teachingInfoTitle");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedIsNull() {
            addCriterion("teaching_info_published is null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedIsNotNull() {
            addCriterion("teaching_info_published is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedEqualTo(String value) {
            addCriterion("teaching_info_published =", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedNotEqualTo(String value) {
            addCriterion("teaching_info_published <>", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedGreaterThan(String value) {
            addCriterion("teaching_info_published >", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_info_published >=", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedLessThan(String value) {
            addCriterion("teaching_info_published <", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedLessThanOrEqualTo(String value) {
            addCriterion("teaching_info_published <=", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedLike(String value) {
            addCriterion("teaching_info_published like", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedNotLike(String value) {
            addCriterion("teaching_info_published not like", value, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedIn(List<String> values) {
            addCriterion("teaching_info_published in", values, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedNotIn(List<String> values) {
            addCriterion("teaching_info_published not in", values, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedBetween(String value1, String value2) {
            addCriterion("teaching_info_published between", value1, value2, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoPublishedNotBetween(String value1, String value2) {
            addCriterion("teaching_info_published not between", value1, value2, "teachingInfoPublished");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentIsNull() {
            addCriterion("teaching_info_content is null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentIsNotNull() {
            addCriterion("teaching_info_content is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentEqualTo(String value) {
            addCriterion("teaching_info_content =", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentNotEqualTo(String value) {
            addCriterion("teaching_info_content <>", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentGreaterThan(String value) {
            addCriterion("teaching_info_content >", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_info_content >=", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentLessThan(String value) {
            addCriterion("teaching_info_content <", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentLessThanOrEqualTo(String value) {
            addCriterion("teaching_info_content <=", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentLike(String value) {
            addCriterion("teaching_info_content like", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentNotLike(String value) {
            addCriterion("teaching_info_content not like", value, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentIn(List<String> values) {
            addCriterion("teaching_info_content in", values, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentNotIn(List<String> values) {
            addCriterion("teaching_info_content not in", values, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentBetween(String value1, String value2) {
            addCriterion("teaching_info_content between", value1, value2, "teachingInfoContent");
            return (Criteria) this;
        }

        public Criteria andTeachingInfoContentNotBetween(String value1, String value2) {
            addCriterion("teaching_info_content not between", value1, value2, "teachingInfoContent");
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