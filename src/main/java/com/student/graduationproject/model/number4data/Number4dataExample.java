package com.student.graduationproject.model.number4data;

import java.util.ArrayList;
import java.util.List;

public class Number4dataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Number4dataExample() {
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

        public Criteria andBimIsNull() {
            addCriterion("BIM is null");
            return (Criteria) this;
        }

        public Criteria andBimIsNotNull() {
            addCriterion("BIM is not null");
            return (Criteria) this;
        }

        public Criteria andBimEqualTo(Float value) {
            addCriterion("BIM =", value, "bim");
            return (Criteria) this;
        }

        public Criteria andBimNotEqualTo(Float value) {
            addCriterion("BIM <>", value, "bim");
            return (Criteria) this;
        }

        public Criteria andBimGreaterThan(Float value) {
            addCriterion("BIM >", value, "bim");
            return (Criteria) this;
        }

        public Criteria andBimGreaterThanOrEqualTo(Float value) {
            addCriterion("BIM >=", value, "bim");
            return (Criteria) this;
        }

        public Criteria andBimLessThan(Float value) {
            addCriterion("BIM <", value, "bim");
            return (Criteria) this;
        }

        public Criteria andBimLessThanOrEqualTo(Float value) {
            addCriterion("BIM <=", value, "bim");
            return (Criteria) this;
        }

        public Criteria andBimIn(List<Float> values) {
            addCriterion("BIM in", values, "bim");
            return (Criteria) this;
        }

        public Criteria andBimNotIn(List<Float> values) {
            addCriterion("BIM not in", values, "bim");
            return (Criteria) this;
        }

        public Criteria andBimBetween(Float value1, Float value2) {
            addCriterion("BIM between", value1, value2, "bim");
            return (Criteria) this;
        }

        public Criteria andBimNotBetween(Float value1, Float value2) {
            addCriterion("BIM not between", value1, value2, "bim");
            return (Criteria) this;
        }

        public Criteria andGpIsNull() {
            addCriterion("gp is null");
            return (Criteria) this;
        }

        public Criteria andGpIsNotNull() {
            addCriterion("gp is not null");
            return (Criteria) this;
        }

        public Criteria andGpEqualTo(Integer value) {
            addCriterion("gp =", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotEqualTo(Integer value) {
            addCriterion("gp <>", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpGreaterThan(Integer value) {
            addCriterion("gp >", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpGreaterThanOrEqualTo(Integer value) {
            addCriterion("gp >=", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLessThan(Integer value) {
            addCriterion("gp <", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLessThanOrEqualTo(Integer value) {
            addCriterion("gp <=", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpIn(List<Integer> values) {
            addCriterion("gp in", values, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotIn(List<Integer> values) {
            addCriterion("gp not in", values, "gp");
            return (Criteria) this;
        }

        public Criteria andGpBetween(Integer value1, Integer value2) {
            addCriterion("gp between", value1, value2, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotBetween(Integer value1, Integer value2) {
            addCriterion("gp not between", value1, value2, "gp");
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