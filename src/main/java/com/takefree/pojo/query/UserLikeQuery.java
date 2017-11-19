package com.takefree.pojo.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLikeQuery {
    /**
     * This field corresponds to the database table user_like
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table user_like
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table user_like
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field corresponds to the database table user_like
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field corresponds to the database table user_like
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public UserLikeQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public UserLikeQuery limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public UserLikeQuery limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table user_like
     * @mbg.generated
     */
    public UserLikeQuery page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class corresponds to the database table user_like
     * @mbg.generated
     */
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdIsNull() {
            addCriterion("user_followee_id is null");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdIsNotNull() {
            addCriterion("user_followee_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdEqualTo(Long value) {
            addCriterion("user_followee_id =", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdNotEqualTo(Long value) {
            addCriterion("user_followee_id <>", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdGreaterThan(Long value) {
            addCriterion("user_followee_id >", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_followee_id >=", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdLessThan(Long value) {
            addCriterion("user_followee_id <", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdLessThanOrEqualTo(Long value) {
            addCriterion("user_followee_id <=", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdIn(List<Long> values) {
            addCriterion("user_followee_id in", values, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdNotIn(List<Long> values) {
            addCriterion("user_followee_id not in", values, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdBetween(Long value1, Long value2) {
            addCriterion("user_followee_id between", value1, value2, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdNotBetween(Long value1, Long value2) {
            addCriterion("user_followee_id not between", value1, value2, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdIsNull() {
            addCriterion("user_follower_id is null");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdIsNotNull() {
            addCriterion("user_follower_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdEqualTo(Long value) {
            addCriterion("user_follower_id =", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdNotEqualTo(Long value) {
            addCriterion("user_follower_id <>", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdGreaterThan(Long value) {
            addCriterion("user_follower_id >", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_follower_id >=", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdLessThan(Long value) {
            addCriterion("user_follower_id <", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdLessThanOrEqualTo(Long value) {
            addCriterion("user_follower_id <=", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdIn(List<Long> values) {
            addCriterion("user_follower_id in", values, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdNotIn(List<Long> values) {
            addCriterion("user_follower_id not in", values, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdBetween(Long value1, Long value2) {
            addCriterion("user_follower_id between", value1, value2, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdNotBetween(Long value1, Long value2) {
            addCriterion("user_follower_id not between", value1, value2, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table user_like
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table user_like
     * @mbg.generated
     */
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