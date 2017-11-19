package com.takefree.pojo.query;

import java.util.ArrayList;
import java.util.List;

public class OrderShowContentQuery {
    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public OrderShowContentQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table order_show_content
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
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table order_show_content
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
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public OrderShowContentQuery limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public OrderShowContentQuery limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    public OrderShowContentQuery page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class corresponds to the database table order_show_content
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

        public Criteria andOrderShowIdIsNull() {
            addCriterion("order_show_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdIsNotNull() {
            addCriterion("order_show_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdEqualTo(Long value) {
            addCriterion("order_show_id =", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotEqualTo(Long value) {
            addCriterion("order_show_id <>", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdGreaterThan(Long value) {
            addCriterion("order_show_id >", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_show_id >=", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdLessThan(Long value) {
            addCriterion("order_show_id <", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdLessThanOrEqualTo(Long value) {
            addCriterion("order_show_id <=", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdIn(List<Long> values) {
            addCriterion("order_show_id in", values, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotIn(List<Long> values) {
            addCriterion("order_show_id not in", values, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdBetween(Long value1, Long value2) {
            addCriterion("order_show_id between", value1, value2, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotBetween(Long value1, Long value2) {
            addCriterion("order_show_id not between", value1, value2, "orderShowId");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table order_show_content
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table order_show_content
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