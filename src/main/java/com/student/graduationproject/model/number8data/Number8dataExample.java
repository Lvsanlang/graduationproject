package com.student.graduationproject.model.number8data;

import java.util.ArrayList;
import java.util.List;

public class Number8dataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Number8dataExample() {
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

        public Criteria andTeamAbbreviationIsNull() {
            addCriterion("team_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationIsNotNull() {
            addCriterion("team_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationEqualTo(String value) {
            addCriterion("team_abbreviation =", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationNotEqualTo(String value) {
            addCriterion("team_abbreviation <>", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationGreaterThan(String value) {
            addCriterion("team_abbreviation >", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("team_abbreviation >=", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationLessThan(String value) {
            addCriterion("team_abbreviation <", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("team_abbreviation <=", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationLike(String value) {
            addCriterion("team_abbreviation like", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationNotLike(String value) {
            addCriterion("team_abbreviation not like", value, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationIn(List<String> values) {
            addCriterion("team_abbreviation in", values, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationNotIn(List<String> values) {
            addCriterion("team_abbreviation not in", values, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationBetween(String value1, String value2) {
            addCriterion("team_abbreviation between", value1, value2, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTeamAbbreviationNotBetween(String value1, String value2) {
            addCriterion("team_abbreviation not between", value1, value2, "teamAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNetRatingIsNull() {
            addCriterion("net_rating is null");
            return (Criteria) this;
        }

        public Criteria andNetRatingIsNotNull() {
            addCriterion("net_rating is not null");
            return (Criteria) this;
        }

        public Criteria andNetRatingEqualTo(Double value) {
            addCriterion("net_rating =", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotEqualTo(Double value) {
            addCriterion("net_rating <>", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingGreaterThan(Double value) {
            addCriterion("net_rating >", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingGreaterThanOrEqualTo(Double value) {
            addCriterion("net_rating >=", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingLessThan(Double value) {
            addCriterion("net_rating <", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingLessThanOrEqualTo(Double value) {
            addCriterion("net_rating <=", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingIn(List<Double> values) {
            addCriterion("net_rating in", values, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotIn(List<Double> values) {
            addCriterion("net_rating not in", values, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingBetween(Double value1, Double value2) {
            addCriterion("net_rating between", value1, value2, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotBetween(Double value1, Double value2) {
            addCriterion("net_rating not between", value1, value2, "netRating");
            return (Criteria) this;
        }

        public Criteria andOrebPctIsNull() {
            addCriterion("oreb_pct is null");
            return (Criteria) this;
        }

        public Criteria andOrebPctIsNotNull() {
            addCriterion("oreb_pct is not null");
            return (Criteria) this;
        }

        public Criteria andOrebPctEqualTo(Float value) {
            addCriterion("oreb_pct =", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotEqualTo(Float value) {
            addCriterion("oreb_pct <>", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctGreaterThan(Float value) {
            addCriterion("oreb_pct >", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctGreaterThanOrEqualTo(Float value) {
            addCriterion("oreb_pct >=", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctLessThan(Float value) {
            addCriterion("oreb_pct <", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctLessThanOrEqualTo(Float value) {
            addCriterion("oreb_pct <=", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctIn(List<Float> values) {
            addCriterion("oreb_pct in", values, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotIn(List<Float> values) {
            addCriterion("oreb_pct not in", values, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctBetween(Float value1, Float value2) {
            addCriterion("oreb_pct between", value1, value2, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotBetween(Float value1, Float value2) {
            addCriterion("oreb_pct not between", value1, value2, "orebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctIsNull() {
            addCriterion("dreb_pct is null");
            return (Criteria) this;
        }

        public Criteria andDrebPctIsNotNull() {
            addCriterion("dreb_pct is not null");
            return (Criteria) this;
        }

        public Criteria andDrebPctEqualTo(Float value) {
            addCriterion("dreb_pct =", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotEqualTo(Float value) {
            addCriterion("dreb_pct <>", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctGreaterThan(Float value) {
            addCriterion("dreb_pct >", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctGreaterThanOrEqualTo(Float value) {
            addCriterion("dreb_pct >=", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctLessThan(Float value) {
            addCriterion("dreb_pct <", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctLessThanOrEqualTo(Float value) {
            addCriterion("dreb_pct <=", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctIn(List<Float> values) {
            addCriterion("dreb_pct in", values, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotIn(List<Float> values) {
            addCriterion("dreb_pct not in", values, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctBetween(Float value1, Float value2) {
            addCriterion("dreb_pct between", value1, value2, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotBetween(Float value1, Float value2) {
            addCriterion("dreb_pct not between", value1, value2, "drebPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctIsNull() {
            addCriterion("usg_pct is null");
            return (Criteria) this;
        }

        public Criteria andUsgPctIsNotNull() {
            addCriterion("usg_pct is not null");
            return (Criteria) this;
        }

        public Criteria andUsgPctEqualTo(Float value) {
            addCriterion("usg_pct =", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotEqualTo(Float value) {
            addCriterion("usg_pct <>", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctGreaterThan(Float value) {
            addCriterion("usg_pct >", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctGreaterThanOrEqualTo(Float value) {
            addCriterion("usg_pct >=", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctLessThan(Float value) {
            addCriterion("usg_pct <", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctLessThanOrEqualTo(Float value) {
            addCriterion("usg_pct <=", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctIn(List<Float> values) {
            addCriterion("usg_pct in", values, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotIn(List<Float> values) {
            addCriterion("usg_pct not in", values, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctBetween(Float value1, Float value2) {
            addCriterion("usg_pct between", value1, value2, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotBetween(Float value1, Float value2) {
            addCriterion("usg_pct not between", value1, value2, "usgPct");
            return (Criteria) this;
        }

        public Criteria andTsPctIsNull() {
            addCriterion("ts_pct is null");
            return (Criteria) this;
        }

        public Criteria andTsPctIsNotNull() {
            addCriterion("ts_pct is not null");
            return (Criteria) this;
        }

        public Criteria andTsPctEqualTo(Float value) {
            addCriterion("ts_pct =", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotEqualTo(Float value) {
            addCriterion("ts_pct <>", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctGreaterThan(Float value) {
            addCriterion("ts_pct >", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctGreaterThanOrEqualTo(Float value) {
            addCriterion("ts_pct >=", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctLessThan(Float value) {
            addCriterion("ts_pct <", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctLessThanOrEqualTo(Float value) {
            addCriterion("ts_pct <=", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctIn(List<Float> values) {
            addCriterion("ts_pct in", values, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotIn(List<Float> values) {
            addCriterion("ts_pct not in", values, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctBetween(Float value1, Float value2) {
            addCriterion("ts_pct between", value1, value2, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotBetween(Float value1, Float value2) {
            addCriterion("ts_pct not between", value1, value2, "tsPct");
            return (Criteria) this;
        }

        public Criteria andAstPctIsNull() {
            addCriterion("ast_pct is null");
            return (Criteria) this;
        }

        public Criteria andAstPctIsNotNull() {
            addCriterion("ast_pct is not null");
            return (Criteria) this;
        }

        public Criteria andAstPctEqualTo(Float value) {
            addCriterion("ast_pct =", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotEqualTo(Float value) {
            addCriterion("ast_pct <>", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctGreaterThan(Float value) {
            addCriterion("ast_pct >", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctGreaterThanOrEqualTo(Float value) {
            addCriterion("ast_pct >=", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctLessThan(Float value) {
            addCriterion("ast_pct <", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctLessThanOrEqualTo(Float value) {
            addCriterion("ast_pct <=", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctIn(List<Float> values) {
            addCriterion("ast_pct in", values, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotIn(List<Float> values) {
            addCriterion("ast_pct not in", values, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctBetween(Float value1, Float value2) {
            addCriterion("ast_pct between", value1, value2, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotBetween(Float value1, Float value2) {
            addCriterion("ast_pct not between", value1, value2, "astPct");
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