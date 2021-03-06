package com.takefree.pojo.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderShowQuery {
    /**
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field corresponds to the database table order_show
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public OrderShowQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table order_show
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
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table order_show
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
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public OrderShowQuery limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public OrderShowQuery limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table order_show
     * @mbg.generated
     */
    public OrderShowQuery page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class corresponds to the database table order_show
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
            addCriterion("order_show.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("order_show.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("order_show.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("order_show.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("order_show.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_show.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("order_show.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("order_show.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("order_show.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("order_show.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("order_show.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("order_show.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_show.order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_show.order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_show.order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_show.order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_show.order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_show.order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_show.order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_show.order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_show.order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_show.order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_show.order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_show.order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("order_show.receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("order_show.receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Long value) {
            addCriterion("order_show.receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Long value) {
            addCriterion("order_show.receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Long value) {
            addCriterion("order_show.receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_show.receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Long value) {
            addCriterion("order_show.receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Long value) {
            addCriterion("order_show.receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Long> values) {
            addCriterion("order_show.receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Long> values) {
            addCriterion("order_show.receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Long value1, Long value2) {
            addCriterion("order_show.receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Long value1, Long value2) {
            addCriterion("order_show.receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdIsNull() {
            addCriterion("order_show.giver_id is null");
            return (Criteria) this;
        }

        public Criteria andGiverIdIsNotNull() {
            addCriterion("order_show.giver_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiverIdEqualTo(Long value) {
            addCriterion("order_show.giver_id =", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotEqualTo(Long value) {
            addCriterion("order_show.giver_id <>", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdGreaterThan(Long value) {
            addCriterion("order_show.giver_id >", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_show.giver_id >=", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdLessThan(Long value) {
            addCriterion("order_show.giver_id <", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdLessThanOrEqualTo(Long value) {
            addCriterion("order_show.giver_id <=", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdIn(List<Long> values) {
            addCriterion("order_show.giver_id in", values, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotIn(List<Long> values) {
            addCriterion("order_show.giver_id not in", values, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdBetween(Long value1, Long value2) {
            addCriterion("order_show.giver_id between", value1, value2, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotBetween(Long value1, Long value2) {
            addCriterion("order_show.giver_id not between", value1, value2, "giverId");
            return (Criteria) this;
        }

        public Criteria andMoodIdIsNull() {
            addCriterion("order_show.mood_id is null");
            return (Criteria) this;
        }

        public Criteria andMoodIdIsNotNull() {
            addCriterion("order_show.mood_id is not null");
            return (Criteria) this;
        }

        public Criteria andMoodIdEqualTo(Integer value) {
            addCriterion("order_show.mood_id =", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotEqualTo(Integer value) {
            addCriterion("order_show.mood_id <>", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdGreaterThan(Integer value) {
            addCriterion("order_show.mood_id >", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_show.mood_id >=", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLessThan(Integer value) {
            addCriterion("order_show.mood_id <", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_show.mood_id <=", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdIn(List<Integer> values) {
            addCriterion("order_show.mood_id in", values, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotIn(List<Integer> values) {
            addCriterion("order_show.mood_id not in", values, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdBetween(Integer value1, Integer value2) {
            addCriterion("order_show.mood_id between", value1, value2, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_show.mood_id not between", value1, value2, "moodId");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewIsNull() {
            addCriterion("order_show.show_content_preview is null");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewIsNotNull() {
            addCriterion("order_show.show_content_preview is not null");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewEqualTo(String value) {
            addCriterion("order_show.show_content_preview =", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotEqualTo(String value) {
            addCriterion("order_show.show_content_preview <>", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewGreaterThan(String value) {
            addCriterion("order_show.show_content_preview >", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewGreaterThanOrEqualTo(String value) {
            addCriterion("order_show.show_content_preview >=", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewLessThan(String value) {
            addCriterion("order_show.show_content_preview <", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewLessThanOrEqualTo(String value) {
            addCriterion("order_show.show_content_preview <=", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewLike(String value) {
            addCriterion("order_show.show_content_preview like", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotLike(String value) {
            addCriterion("order_show.show_content_preview not like", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewIn(List<String> values) {
            addCriterion("order_show.show_content_preview in", values, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotIn(List<String> values) {
            addCriterion("order_show.show_content_preview not in", values, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewBetween(String value1, String value2) {
            addCriterion("order_show.show_content_preview between", value1, value2, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotBetween(String value1, String value2) {
            addCriterion("order_show.show_content_preview not between", value1, value2, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("order_show.gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("order_show.gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("order_show.gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("order_show.gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("order_show.gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_show.gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("order_show.gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("order_show.gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("order_show.gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("order_show.gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("order_show.gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("order_show.gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("order_show.gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("order_show.gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("order_show.gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("order_show.gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("order_show.gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("order_show.gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("order_show.gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("order_show.gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("order_show.gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("order_show.gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("order_show.gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("order_show.gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("order_show.version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("order_show.version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("order_show.version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("order_show.version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("order_show.version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_show.version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("order_show.version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("order_show.version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("order_show.version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("order_show.version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("order_show.version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("order_show.version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPicHomepageIsNull() {
            addCriterion("order_show.pic_homepage is null");
            return (Criteria) this;
        }

        public Criteria andPicHomepageIsNotNull() {
            addCriterion("order_show.pic_homepage is not null");
            return (Criteria) this;
        }

        public Criteria andPicHomepageEqualTo(String value) {
            addCriterion("order_show.pic_homepage =", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotEqualTo(String value) {
            addCriterion("order_show.pic_homepage <>", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageGreaterThan(String value) {
            addCriterion("order_show.pic_homepage >", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("order_show.pic_homepage >=", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageLessThan(String value) {
            addCriterion("order_show.pic_homepage <", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageLessThanOrEqualTo(String value) {
            addCriterion("order_show.pic_homepage <=", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageLike(String value) {
            addCriterion("order_show.pic_homepage like", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotLike(String value) {
            addCriterion("order_show.pic_homepage not like", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageIn(List<String> values) {
            addCriterion("order_show.pic_homepage in", values, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotIn(List<String> values) {
            addCriterion("order_show.pic_homepage not in", values, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageBetween(String value1, String value2) {
            addCriterion("order_show.pic_homepage between", value1, value2, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotBetween(String value1, String value2) {
            addCriterion("order_show.pic_homepage not between", value1, value2, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualTo(Long value) {
            addCriterion("take_order.share_id =", value, "version");
            return (Criteria) this;
        }

        public Criteria andShareIdIn(List<Long> values) {
            addCriterion("take_order.share_id in", values, "version");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table order_show
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table order_show
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
