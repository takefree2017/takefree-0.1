package com.takefree.pojo.query;

import java.util.ArrayList;
import java.util.List;

public class ShareModeQuery {
    /**
     * This field corresponds to the database table share_mode
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table share_mode
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table share_mode
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field corresponds to the database table share_mode
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field corresponds to the database table share_mode
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public ShareModeQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table share_mode
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
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table share_mode
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
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public ShareModeQuery limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public ShareModeQuery limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    public ShareModeQuery page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class corresponds to the database table share_mode
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTransferableIsNull() {
            addCriterion("transferable is null");
            return (Criteria) this;
        }

        public Criteria andTransferableIsNotNull() {
            addCriterion("transferable is not null");
            return (Criteria) this;
        }

        public Criteria andTransferableEqualTo(Integer value) {
            addCriterion("transferable =", value, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableNotEqualTo(Integer value) {
            addCriterion("transferable <>", value, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableGreaterThan(Integer value) {
            addCriterion("transferable >", value, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableGreaterThanOrEqualTo(Integer value) {
            addCriterion("transferable >=", value, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableLessThan(Integer value) {
            addCriterion("transferable <", value, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableLessThanOrEqualTo(Integer value) {
            addCriterion("transferable <=", value, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableIn(List<Integer> values) {
            addCriterion("transferable in", values, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableNotIn(List<Integer> values) {
            addCriterion("transferable not in", values, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableBetween(Integer value1, Integer value2) {
            addCriterion("transferable between", value1, value2, "transferable");
            return (Criteria) this;
        }

        public Criteria andTransferableNotBetween(Integer value1, Integer value2) {
            addCriterion("transferable not between", value1, value2, "transferable");
            return (Criteria) this;
        }

        public Criteria andParticipatoryIsNull() {
            addCriterion("participatory is null");
            return (Criteria) this;
        }

        public Criteria andParticipatoryIsNotNull() {
            addCriterion("participatory is not null");
            return (Criteria) this;
        }

        public Criteria andParticipatoryEqualTo(Integer value) {
            addCriterion("participatory =", value, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryNotEqualTo(Integer value) {
            addCriterion("participatory <>", value, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryGreaterThan(Integer value) {
            addCriterion("participatory >", value, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("participatory >=", value, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryLessThan(Integer value) {
            addCriterion("participatory <", value, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryLessThanOrEqualTo(Integer value) {
            addCriterion("participatory <=", value, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryIn(List<Integer> values) {
            addCriterion("participatory in", values, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryNotIn(List<Integer> values) {
            addCriterion("participatory not in", values, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryBetween(Integer value1, Integer value2) {
            addCriterion("participatory between", value1, value2, "participatory");
            return (Criteria) this;
        }

        public Criteria andParticipatoryNotBetween(Integer value1, Integer value2) {
            addCriterion("participatory not between", value1, value2, "participatory");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlIsNull() {
            addCriterion("small_pic_url is null");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlIsNotNull() {
            addCriterion("small_pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlEqualTo(String value) {
            addCriterion("small_pic_url =", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlNotEqualTo(String value) {
            addCriterion("small_pic_url <>", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlGreaterThan(String value) {
            addCriterion("small_pic_url >", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic_url >=", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlLessThan(String value) {
            addCriterion("small_pic_url <", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlLessThanOrEqualTo(String value) {
            addCriterion("small_pic_url <=", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlLike(String value) {
            addCriterion("small_pic_url like", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlNotLike(String value) {
            addCriterion("small_pic_url not like", value, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlIn(List<String> values) {
            addCriterion("small_pic_url in", values, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlNotIn(List<String> values) {
            addCriterion("small_pic_url not in", values, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlBetween(String value1, String value2) {
            addCriterion("small_pic_url between", value1, value2, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andSmallPicUrlNotBetween(String value1, String value2) {
            addCriterion("small_pic_url not between", value1, value2, "smallPicUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table share_mode
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table share_mode
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