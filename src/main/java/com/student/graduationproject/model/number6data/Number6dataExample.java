package com.student.graduationproject.model.number6data;

import java.util.ArrayList;
import java.util.List;

public class Number6dataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Number6dataExample() {
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

        public Criteria andBmiIsNull() {
            addCriterion("BMI is null");
            return (Criteria) this;
        }

        public Criteria andBmiIsNotNull() {
            addCriterion("BMI is not null");
            return (Criteria) this;
        }

        public Criteria andBmiEqualTo(Float value) {
            addCriterion("BMI =", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotEqualTo(Float value) {
            addCriterion("BMI <>", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThan(Float value) {
            addCriterion("BMI >", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiGreaterThanOrEqualTo(Float value) {
            addCriterion("BMI >=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThan(Float value) {
            addCriterion("BMI <", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiLessThanOrEqualTo(Float value) {
            addCriterion("BMI <=", value, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiIn(List<Float> values) {
            addCriterion("BMI in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotIn(List<Float> values) {
            addCriterion("BMI not in", values, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiBetween(Float value1, Float value2) {
            addCriterion("BMI between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andBmiNotBetween(Float value1, Float value2) {
            addCriterion("BMI not between", value1, value2, "bmi");
            return (Criteria) this;
        }

        public Criteria andRebIsNull() {
            addCriterion("reb is null");
            return (Criteria) this;
        }

        public Criteria andRebIsNotNull() {
            addCriterion("reb is not null");
            return (Criteria) this;
        }

        public Criteria andRebEqualTo(Float value) {
            addCriterion("reb =", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotEqualTo(Float value) {
            addCriterion("reb <>", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebGreaterThan(Float value) {
            addCriterion("reb >", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebGreaterThanOrEqualTo(Float value) {
            addCriterion("reb >=", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebLessThan(Float value) {
            addCriterion("reb <", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebLessThanOrEqualTo(Float value) {
            addCriterion("reb <=", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebIn(List<Float> values) {
            addCriterion("reb in", values, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotIn(List<Float> values) {
            addCriterion("reb not in", values, "reb");
            return (Criteria) this;
        }

        public Criteria andRebBetween(Float value1, Float value2) {
            addCriterion("reb between", value1, value2, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotBetween(Float value1, Float value2) {
            addCriterion("reb not between", value1, value2, "reb");
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