package com.student.graduationproject.model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNull() {
            addCriterion("player_name is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNotNull() {
            addCriterion("player_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameEqualTo(String value) {
            addCriterion("player_name =", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotEqualTo(String value) {
            addCriterion("player_name <>", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThan(String value) {
            addCriterion("player_name >", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("player_name >=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThan(String value) {
            addCriterion("player_name <", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThanOrEqualTo(String value) {
            addCriterion("player_name <=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLike(String value) {
            addCriterion("player_name like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotLike(String value) {
            addCriterion("player_name not like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIn(List<String> values) {
            addCriterion("player_name in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotIn(List<String> values) {
            addCriterion("player_name not in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameBetween(String value1, String value2) {
            addCriterion("player_name between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotBetween(String value1, String value2) {
            addCriterion("player_name not between", value1, value2, "playerName");
            return (Criteria) this;
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightIsNull() {
            addCriterion("player_height is null");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightIsNotNull() {
            addCriterion("player_height is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightEqualTo(String value) {
            addCriterion("player_height =", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightNotEqualTo(String value) {
            addCriterion("player_height <>", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightGreaterThan(String value) {
            addCriterion("player_height >", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightGreaterThanOrEqualTo(String value) {
            addCriterion("player_height >=", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightLessThan(String value) {
            addCriterion("player_height <", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightLessThanOrEqualTo(String value) {
            addCriterion("player_height <=", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightLike(String value) {
            addCriterion("player_height like", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightNotLike(String value) {
            addCriterion("player_height not like", value, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightIn(List<String> values) {
            addCriterion("player_height in", values, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightNotIn(List<String> values) {
            addCriterion("player_height not in", values, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightBetween(String value1, String value2) {
            addCriterion("player_height between", value1, value2, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerHeightNotBetween(String value1, String value2) {
            addCriterion("player_height not between", value1, value2, "playerHeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightIsNull() {
            addCriterion("player_weight is null");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightIsNotNull() {
            addCriterion("player_weight is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightEqualTo(String value) {
            addCriterion("player_weight =", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightNotEqualTo(String value) {
            addCriterion("player_weight <>", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightGreaterThan(String value) {
            addCriterion("player_weight >", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightGreaterThanOrEqualTo(String value) {
            addCriterion("player_weight >=", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightLessThan(String value) {
            addCriterion("player_weight <", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightLessThanOrEqualTo(String value) {
            addCriterion("player_weight <=", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightLike(String value) {
            addCriterion("player_weight like", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightNotLike(String value) {
            addCriterion("player_weight not like", value, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightIn(List<String> values) {
            addCriterion("player_weight in", values, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightNotIn(List<String> values) {
            addCriterion("player_weight not in", values, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightBetween(String value1, String value2) {
            addCriterion("player_weight between", value1, value2, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andPlayerWeightNotBetween(String value1, String value2) {
            addCriterion("player_weight not between", value1, value2, "playerWeight");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andDraftYearIsNull() {
            addCriterion("draft_year is null");
            return (Criteria) this;
        }

        public Criteria andDraftYearIsNotNull() {
            addCriterion("draft_year is not null");
            return (Criteria) this;
        }

        public Criteria andDraftYearEqualTo(String value) {
            addCriterion("draft_year =", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearNotEqualTo(String value) {
            addCriterion("draft_year <>", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearGreaterThan(String value) {
            addCriterion("draft_year >", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearGreaterThanOrEqualTo(String value) {
            addCriterion("draft_year >=", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearLessThan(String value) {
            addCriterion("draft_year <", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearLessThanOrEqualTo(String value) {
            addCriterion("draft_year <=", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearLike(String value) {
            addCriterion("draft_year like", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearNotLike(String value) {
            addCriterion("draft_year not like", value, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearIn(List<String> values) {
            addCriterion("draft_year in", values, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearNotIn(List<String> values) {
            addCriterion("draft_year not in", values, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearBetween(String value1, String value2) {
            addCriterion("draft_year between", value1, value2, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftYearNotBetween(String value1, String value2) {
            addCriterion("draft_year not between", value1, value2, "draftYear");
            return (Criteria) this;
        }

        public Criteria andDraftRoundIsNull() {
            addCriterion("draft_round is null");
            return (Criteria) this;
        }

        public Criteria andDraftRoundIsNotNull() {
            addCriterion("draft_round is not null");
            return (Criteria) this;
        }

        public Criteria andDraftRoundEqualTo(String value) {
            addCriterion("draft_round =", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundNotEqualTo(String value) {
            addCriterion("draft_round <>", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundGreaterThan(String value) {
            addCriterion("draft_round >", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundGreaterThanOrEqualTo(String value) {
            addCriterion("draft_round >=", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundLessThan(String value) {
            addCriterion("draft_round <", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundLessThanOrEqualTo(String value) {
            addCriterion("draft_round <=", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundLike(String value) {
            addCriterion("draft_round like", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundNotLike(String value) {
            addCriterion("draft_round not like", value, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundIn(List<String> values) {
            addCriterion("draft_round in", values, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundNotIn(List<String> values) {
            addCriterion("draft_round not in", values, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundBetween(String value1, String value2) {
            addCriterion("draft_round between", value1, value2, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftRoundNotBetween(String value1, String value2) {
            addCriterion("draft_round not between", value1, value2, "draftRound");
            return (Criteria) this;
        }

        public Criteria andDraftNumberIsNull() {
            addCriterion("draft_number is null");
            return (Criteria) this;
        }

        public Criteria andDraftNumberIsNotNull() {
            addCriterion("draft_number is not null");
            return (Criteria) this;
        }

        public Criteria andDraftNumberEqualTo(String value) {
            addCriterion("draft_number =", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberNotEqualTo(String value) {
            addCriterion("draft_number <>", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberGreaterThan(String value) {
            addCriterion("draft_number >", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberGreaterThanOrEqualTo(String value) {
            addCriterion("draft_number >=", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberLessThan(String value) {
            addCriterion("draft_number <", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberLessThanOrEqualTo(String value) {
            addCriterion("draft_number <=", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberLike(String value) {
            addCriterion("draft_number like", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberNotLike(String value) {
            addCriterion("draft_number not like", value, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberIn(List<String> values) {
            addCriterion("draft_number in", values, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberNotIn(List<String> values) {
            addCriterion("draft_number not in", values, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberBetween(String value1, String value2) {
            addCriterion("draft_number between", value1, value2, "draftNumber");
            return (Criteria) this;
        }

        public Criteria andDraftNumberNotBetween(String value1, String value2) {
            addCriterion("draft_number not between", value1, value2, "draftNumber");
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

        public Criteria andGpEqualTo(String value) {
            addCriterion("gp =", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotEqualTo(String value) {
            addCriterion("gp <>", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpGreaterThan(String value) {
            addCriterion("gp >", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpGreaterThanOrEqualTo(String value) {
            addCriterion("gp >=", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLessThan(String value) {
            addCriterion("gp <", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLessThanOrEqualTo(String value) {
            addCriterion("gp <=", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLike(String value) {
            addCriterion("gp like", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotLike(String value) {
            addCriterion("gp not like", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpIn(List<String> values) {
            addCriterion("gp in", values, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotIn(List<String> values) {
            addCriterion("gp not in", values, "gp");
            return (Criteria) this;
        }

        public Criteria andGpBetween(String value1, String value2) {
            addCriterion("gp between", value1, value2, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotBetween(String value1, String value2) {
            addCriterion("gp not between", value1, value2, "gp");
            return (Criteria) this;
        }

        public Criteria andPtsIsNull() {
            addCriterion("pts is null");
            return (Criteria) this;
        }

        public Criteria andPtsIsNotNull() {
            addCriterion("pts is not null");
            return (Criteria) this;
        }

        public Criteria andPtsEqualTo(String value) {
            addCriterion("pts =", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsNotEqualTo(String value) {
            addCriterion("pts <>", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsGreaterThan(String value) {
            addCriterion("pts >", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsGreaterThanOrEqualTo(String value) {
            addCriterion("pts >=", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsLessThan(String value) {
            addCriterion("pts <", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsLessThanOrEqualTo(String value) {
            addCriterion("pts <=", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsLike(String value) {
            addCriterion("pts like", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsNotLike(String value) {
            addCriterion("pts not like", value, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsIn(List<String> values) {
            addCriterion("pts in", values, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsNotIn(List<String> values) {
            addCriterion("pts not in", values, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsBetween(String value1, String value2) {
            addCriterion("pts between", value1, value2, "pts");
            return (Criteria) this;
        }

        public Criteria andPtsNotBetween(String value1, String value2) {
            addCriterion("pts not between", value1, value2, "pts");
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

        public Criteria andRebEqualTo(String value) {
            addCriterion("reb =", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotEqualTo(String value) {
            addCriterion("reb <>", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebGreaterThan(String value) {
            addCriterion("reb >", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebGreaterThanOrEqualTo(String value) {
            addCriterion("reb >=", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebLessThan(String value) {
            addCriterion("reb <", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebLessThanOrEqualTo(String value) {
            addCriterion("reb <=", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebLike(String value) {
            addCriterion("reb like", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotLike(String value) {
            addCriterion("reb not like", value, "reb");
            return (Criteria) this;
        }

        public Criteria andRebIn(List<String> values) {
            addCriterion("reb in", values, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotIn(List<String> values) {
            addCriterion("reb not in", values, "reb");
            return (Criteria) this;
        }

        public Criteria andRebBetween(String value1, String value2) {
            addCriterion("reb between", value1, value2, "reb");
            return (Criteria) this;
        }

        public Criteria andRebNotBetween(String value1, String value2) {
            addCriterion("reb not between", value1, value2, "reb");
            return (Criteria) this;
        }

        public Criteria andAstIsNull() {
            addCriterion("ast is null");
            return (Criteria) this;
        }

        public Criteria andAstIsNotNull() {
            addCriterion("ast is not null");
            return (Criteria) this;
        }

        public Criteria andAstEqualTo(String value) {
            addCriterion("ast =", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotEqualTo(String value) {
            addCriterion("ast <>", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstGreaterThan(String value) {
            addCriterion("ast >", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstGreaterThanOrEqualTo(String value) {
            addCriterion("ast >=", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstLessThan(String value) {
            addCriterion("ast <", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstLessThanOrEqualTo(String value) {
            addCriterion("ast <=", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstLike(String value) {
            addCriterion("ast like", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotLike(String value) {
            addCriterion("ast not like", value, "ast");
            return (Criteria) this;
        }

        public Criteria andAstIn(List<String> values) {
            addCriterion("ast in", values, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotIn(List<String> values) {
            addCriterion("ast not in", values, "ast");
            return (Criteria) this;
        }

        public Criteria andAstBetween(String value1, String value2) {
            addCriterion("ast between", value1, value2, "ast");
            return (Criteria) this;
        }

        public Criteria andAstNotBetween(String value1, String value2) {
            addCriterion("ast not between", value1, value2, "ast");
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

        public Criteria andNetRatingEqualTo(String value) {
            addCriterion("net_rating =", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotEqualTo(String value) {
            addCriterion("net_rating <>", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingGreaterThan(String value) {
            addCriterion("net_rating >", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingGreaterThanOrEqualTo(String value) {
            addCriterion("net_rating >=", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingLessThan(String value) {
            addCriterion("net_rating <", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingLessThanOrEqualTo(String value) {
            addCriterion("net_rating <=", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingLike(String value) {
            addCriterion("net_rating like", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotLike(String value) {
            addCriterion("net_rating not like", value, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingIn(List<String> values) {
            addCriterion("net_rating in", values, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotIn(List<String> values) {
            addCriterion("net_rating not in", values, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingBetween(String value1, String value2) {
            addCriterion("net_rating between", value1, value2, "netRating");
            return (Criteria) this;
        }

        public Criteria andNetRatingNotBetween(String value1, String value2) {
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

        public Criteria andOrebPctEqualTo(String value) {
            addCriterion("oreb_pct =", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotEqualTo(String value) {
            addCriterion("oreb_pct <>", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctGreaterThan(String value) {
            addCriterion("oreb_pct >", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctGreaterThanOrEqualTo(String value) {
            addCriterion("oreb_pct >=", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctLessThan(String value) {
            addCriterion("oreb_pct <", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctLessThanOrEqualTo(String value) {
            addCriterion("oreb_pct <=", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctLike(String value) {
            addCriterion("oreb_pct like", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotLike(String value) {
            addCriterion("oreb_pct not like", value, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctIn(List<String> values) {
            addCriterion("oreb_pct in", values, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotIn(List<String> values) {
            addCriterion("oreb_pct not in", values, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctBetween(String value1, String value2) {
            addCriterion("oreb_pct between", value1, value2, "orebPct");
            return (Criteria) this;
        }

        public Criteria andOrebPctNotBetween(String value1, String value2) {
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

        public Criteria andDrebPctEqualTo(String value) {
            addCriterion("dreb_pct =", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotEqualTo(String value) {
            addCriterion("dreb_pct <>", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctGreaterThan(String value) {
            addCriterion("dreb_pct >", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctGreaterThanOrEqualTo(String value) {
            addCriterion("dreb_pct >=", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctLessThan(String value) {
            addCriterion("dreb_pct <", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctLessThanOrEqualTo(String value) {
            addCriterion("dreb_pct <=", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctLike(String value) {
            addCriterion("dreb_pct like", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotLike(String value) {
            addCriterion("dreb_pct not like", value, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctIn(List<String> values) {
            addCriterion("dreb_pct in", values, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotIn(List<String> values) {
            addCriterion("dreb_pct not in", values, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctBetween(String value1, String value2) {
            addCriterion("dreb_pct between", value1, value2, "drebPct");
            return (Criteria) this;
        }

        public Criteria andDrebPctNotBetween(String value1, String value2) {
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

        public Criteria andUsgPctEqualTo(String value) {
            addCriterion("usg_pct =", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotEqualTo(String value) {
            addCriterion("usg_pct <>", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctGreaterThan(String value) {
            addCriterion("usg_pct >", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctGreaterThanOrEqualTo(String value) {
            addCriterion("usg_pct >=", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctLessThan(String value) {
            addCriterion("usg_pct <", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctLessThanOrEqualTo(String value) {
            addCriterion("usg_pct <=", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctLike(String value) {
            addCriterion("usg_pct like", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotLike(String value) {
            addCriterion("usg_pct not like", value, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctIn(List<String> values) {
            addCriterion("usg_pct in", values, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotIn(List<String> values) {
            addCriterion("usg_pct not in", values, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctBetween(String value1, String value2) {
            addCriterion("usg_pct between", value1, value2, "usgPct");
            return (Criteria) this;
        }

        public Criteria andUsgPctNotBetween(String value1, String value2) {
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

        public Criteria andTsPctEqualTo(String value) {
            addCriterion("ts_pct =", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotEqualTo(String value) {
            addCriterion("ts_pct <>", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctGreaterThan(String value) {
            addCriterion("ts_pct >", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctGreaterThanOrEqualTo(String value) {
            addCriterion("ts_pct >=", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctLessThan(String value) {
            addCriterion("ts_pct <", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctLessThanOrEqualTo(String value) {
            addCriterion("ts_pct <=", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctLike(String value) {
            addCriterion("ts_pct like", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotLike(String value) {
            addCriterion("ts_pct not like", value, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctIn(List<String> values) {
            addCriterion("ts_pct in", values, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotIn(List<String> values) {
            addCriterion("ts_pct not in", values, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctBetween(String value1, String value2) {
            addCriterion("ts_pct between", value1, value2, "tsPct");
            return (Criteria) this;
        }

        public Criteria andTsPctNotBetween(String value1, String value2) {
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

        public Criteria andAstPctEqualTo(String value) {
            addCriterion("ast_pct =", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotEqualTo(String value) {
            addCriterion("ast_pct <>", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctGreaterThan(String value) {
            addCriterion("ast_pct >", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctGreaterThanOrEqualTo(String value) {
            addCriterion("ast_pct >=", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctLessThan(String value) {
            addCriterion("ast_pct <", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctLessThanOrEqualTo(String value) {
            addCriterion("ast_pct <=", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctLike(String value) {
            addCriterion("ast_pct like", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotLike(String value) {
            addCriterion("ast_pct not like", value, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctIn(List<String> values) {
            addCriterion("ast_pct in", values, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotIn(List<String> values) {
            addCriterion("ast_pct not in", values, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctBetween(String value1, String value2) {
            addCriterion("ast_pct between", value1, value2, "astPct");
            return (Criteria) this;
        }

        public Criteria andAstPctNotBetween(String value1, String value2) {
            addCriterion("ast_pct not between", value1, value2, "astPct");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("season not between", value1, value2, "season");
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