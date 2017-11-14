package com.takefree.query;

import java.util.ArrayList;
import java.util.List;

public class MoodInfoQuery {
    /**
     * This field corresponds to the database table mood_info
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table mood_info
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table mood_info
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field corresponds to the database table mood_info
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field corresponds to the database table mood_info
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public MoodInfoQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table mood_info
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
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table mood_info
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
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public MoodInfoQuery limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public MoodInfoQuery limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table mood_info
     * @mbg.generated
     */
    public MoodInfoQuery page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class corresponds to the database table mood_info
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMoodNameIsNull() {
            addCriterion("mood_name is null");
            return (Criteria) this;
        }

        public Criteria andMoodNameIsNotNull() {
            addCriterion("mood_name is not null");
            return (Criteria) this;
        }

        public Criteria andMoodNameEqualTo(String value) {
            addCriterion("mood_name =", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameNotEqualTo(String value) {
            addCriterion("mood_name <>", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameGreaterThan(String value) {
            addCriterion("mood_name >", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("mood_name >=", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameLessThan(String value) {
            addCriterion("mood_name <", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameLessThanOrEqualTo(String value) {
            addCriterion("mood_name <=", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameLike(String value) {
            addCriterion("mood_name like", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameNotLike(String value) {
            addCriterion("mood_name not like", value, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameIn(List<String> values) {
            addCriterion("mood_name in", values, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameNotIn(List<String> values) {
            addCriterion("mood_name not in", values, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameBetween(String value1, String value2) {
            addCriterion("mood_name between", value1, value2, "moodName");
            return (Criteria) this;
        }

        public Criteria andMoodNameNotBetween(String value1, String value2) {
            addCriterion("mood_name not between", value1, value2, "moodName");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table mood_info
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table mood_info
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