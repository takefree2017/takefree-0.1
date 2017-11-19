package com.takefree.dto.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShareDTOQuery {
    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    protected Integer offset;

    /**
     * This field corresponds to the database table share
     * @mbg.generated
     */
    protected Integer rows;

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public ShareDTOQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table share
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
     * This method corresponds to the database table share
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table share
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
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public ShareDTOQuery limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public ShareDTOQuery limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    /**
     * This method corresponds to the database table share
     * @mbg.generated
     */
    public ShareDTOQuery page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    /**
     * This class corresponds to the database table share
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
            addCriterion("share.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("share.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("share.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("share.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("share.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("share.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("share.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("share.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("share.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("share.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("share.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("share.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("share.owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("share.owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("share.owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("share.owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("share.owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("share.owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("share.owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("share.owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("share.owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("share.owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("share.owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("share.owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andPicHomepageIsNull() {
            addCriterion("share.pic_homepage is null");
            return (Criteria) this;
        }

        public Criteria andPicHomepageIsNotNull() {
            addCriterion("share.pic_homepage is not null");
            return (Criteria) this;
        }

        public Criteria andPicHomepageEqualTo(String value) {
            addCriterion("share.pic_homepage =", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotEqualTo(String value) {
            addCriterion("share.pic_homepage <>", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageGreaterThan(String value) {
            addCriterion("share.pic_homepage >", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageGreaterThanOrEqualTo(String value) {
            addCriterion("share.pic_homepage >=", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageLessThan(String value) {
            addCriterion("share.pic_homepage <", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageLessThanOrEqualTo(String value) {
            addCriterion("share.pic_homepage <=", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageLike(String value) {
            addCriterion("share.pic_homepage like", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotLike(String value) {
            addCriterion("share.pic_homepage not like", value, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageIn(List<String> values) {
            addCriterion("share.pic_homepage in", values, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotIn(List<String> values) {
            addCriterion("share.pic_homepage not in", values, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageBetween(String value1, String value2) {
            addCriterion("share.pic_homepage between", value1, value2, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andPicHomepageNotBetween(String value1, String value2) {
            addCriterion("share.pic_homepage not between", value1, value2, "picHomepage");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("share.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("share.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("share.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("share.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("share.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("share.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("share.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("share.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("share.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("share.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("share.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("share.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("share.title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewIsNull() {
            addCriterion("share.share_desc_preview is null");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewIsNotNull() {
            addCriterion("share.share_desc_preview is not null");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewEqualTo(String value) {
            addCriterion("share.share_desc_preview =", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewNotEqualTo(String value) {
            addCriterion("share.share_desc_preview <>", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewGreaterThan(String value) {
            addCriterion("share.share_desc_preview >", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewGreaterThanOrEqualTo(String value) {
            addCriterion("share.share_desc_preview >=", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewLessThan(String value) {
            addCriterion("share.share_desc_preview <", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewLessThanOrEqualTo(String value) {
            addCriterion("share.share_desc_preview <=", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewLike(String value) {
            addCriterion("share.share_desc_preview like", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewNotLike(String value) {
            addCriterion("share.share_desc_preview not like", value, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewIn(List<String> values) {
            addCriterion("share.share_desc_preview in", values, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewNotIn(List<String> values) {
            addCriterion("share.share_desc_preview not in", values, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewBetween(String value1, String value2) {
            addCriterion("share.share_desc_preview between", value1, value2, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andShareDescPreviewNotBetween(String value1, String value2) {
            addCriterion("share.share_desc_preview not between", value1, value2, "shareDescPreview");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("share.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("share.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("share.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("share.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("share.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("share.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("share.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("share.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("share.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("share.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("share.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("share.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("share.publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("share.publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("share.publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("share.publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("share.publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("share.publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("share.publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("share.publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("share.publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("share.publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("share.publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("share.publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andTakerIdIsNull() {
            addCriterion("share.taker_id is null");
            return (Criteria) this;
        }

        public Criteria andTakerIdIsNotNull() {
            addCriterion("share.taker_id is not null");
            return (Criteria) this;
        }

        public Criteria andTakerIdEqualTo(Long value) {
            addCriterion("share.taker_id =", value, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdNotEqualTo(Long value) {
            addCriterion("share.taker_id <>", value, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdGreaterThan(Long value) {
            addCriterion("share.taker_id >", value, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("share.taker_id >=", value, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdLessThan(Long value) {
            addCriterion("share.taker_id <", value, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdLessThanOrEqualTo(Long value) {
            addCriterion("share.taker_id <=", value, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdIn(List<Long> values) {
            addCriterion("share.taker_id in", values, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdNotIn(List<Long> values) {
            addCriterion("share.taker_id not in", values, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdBetween(Long value1, Long value2) {
            addCriterion("share.taker_id between", value1, value2, "takerId");
            return (Criteria) this;
        }

        public Criteria andTakerIdNotBetween(Long value1, Long value2) {
            addCriterion("share.taker_id not between", value1, value2, "takerId");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("share.gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("share.gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("share.gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("share.gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("share.gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("share.gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("share.gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("share.gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("share.gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("share.gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("share.gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("share.gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("share.gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("share.gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("share.gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("share.gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("share.gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("share.gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("share.gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("share.gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("share.gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("share.gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("share.gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("share.gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("share.version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("share.version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("share.version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("share.version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("share.version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("share.version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("share.version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("share.version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("share.version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("share.version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("share.version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("share.version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andLikeUserEqualTo(Long value) {
            addCriterion("share_like.user_id =", value, "version");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(Long value) {
            addCriterion("take_application.applicant_id =", value, "version");
            return (Criteria) this;
        }

        public Criteria andReceivedUserEqualTo(Long value) {
            addCriterion("take_application.applicant_id =", value, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table share
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table share
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