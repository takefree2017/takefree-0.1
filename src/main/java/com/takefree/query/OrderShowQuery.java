package com.takefree.query;


import com.takefree.common.BaseCriteria;
import com.takefree.common.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.List;

public class OrderShowQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public OrderShowQuery() {
        super();
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        super.oredCriteria.add(criteria);
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

    /**
     * This class corresponds to the database table order_show
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
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

        public Criteria anIdGreaterThan(Long value) {
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

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(LocalDateTime value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(LocalDateTime value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(LocalDateTime value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<LocalDateTime> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(LocalDateTime value1, LocalDateTime value2) {
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

        public Criteria andGmtModifiedEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(LocalDateTime value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(Long value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(Long value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Long value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Long value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Long value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Long value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Long value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLike(Long value) {
            addCriterion("receiver_id like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotLike(Long value) {
            addCriterion("receiver_id not like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Long> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Long> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Long value1, Long value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Long value1, Long value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdIsNull() {
            addCriterion("giver_id is null");
            return (Criteria) this;
        }

        public Criteria andGiverIdIsNotNull() {
            addCriterion("giver_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiverIdEqualTo(Long value) {
            addCriterion("giver_id =", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotEqualTo(Long value) {
            addCriterion("giver_id <>", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdGreaterThan(Long value) {
            addCriterion("giver_id >", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdGreaterThanOrEqualTo(Long value) {
            addCriterion("giver_id >=", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdLessThan(Long value) {
            addCriterion("giver_id <", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdLessThanOrEqualTo(Long value) {
            addCriterion("giver_id <=", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdLike(Long value) {
            addCriterion("giver_id like", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotLike(Long value) {
            addCriterion("giver_id not like", value, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdIn(List<Long> values) {
            addCriterion("giver_id in", values, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotIn(List<Long> values) {
            addCriterion("giver_id not in", values, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdBetween(Long value1, Long value2) {
            addCriterion("giver_id between", value1, value2, "giverId");
            return (Criteria) this;
        }

        public Criteria andGiverIdNotBetween(Long value1, Long value2) {
            addCriterion("giver_id not between", value1, value2, "giverId");
            return (Criteria) this;
        }

        public Criteria andMoodIdIsNull() {
            addCriterion("mood_id is null");
            return (Criteria) this;
        }

        public Criteria andMoodIdIsNotNull() {
            addCriterion("mood_id is not null");
            return (Criteria) this;
        }

        public Criteria andMoodIdEqualTo(Integer value) {
            addCriterion("mood_id =", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotEqualTo(Integer value) {
            addCriterion("mood_id <>", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdGreaterThan(Integer value) {
            addCriterion("mood_id >", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mood_id >=", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLessThan(Integer value) {
            addCriterion("mood_id <", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("mood_id <=", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdLike(Integer value) {
            addCriterion("mood_id like", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotLike(Integer value) {
            addCriterion("mood_id not like", value, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdIn(List<Integer> values) {
            addCriterion("mood_id in", values, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotIn(List<Integer> values) {
            addCriterion("mood_id not in", values, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdBetween(Integer value1, Integer value2) {
            addCriterion("mood_id between", value1, value2, "moodId");
            return (Criteria) this;
        }

        public Criteria andMoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mood_id not between", value1, value2, "moodId");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewIsNull() {
            addCriterion("show_content_preview is null");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewIsNotNull() {
            addCriterion("show_content_preview is not null");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewEqualTo(String value) {
            addCriterion("show_content_preview =", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotEqualTo(String value) {
            addCriterion("show_content_preview <>", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewGreaterThan(String value) {
            addCriterion("show_content_preview >", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewGreaterThanOrEqualTo(String value) {
            addCriterion("show_content_preview >=", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewLessThan(String value) {
            addCriterion("show_content_preview <", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewLessThanOrEqualTo(String value) {
            addCriterion("show_content_preview <=", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewLike(String value) {
            addCriterion("show_content_preview like", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotLike(String value) {
            addCriterion("show_content_preview not like", value, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewIn(List<String> values) {
            addCriterion("show_content_preview in", values, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotIn(List<String> values) {
            addCriterion("show_content_preview not in", values, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewBetween(String value1, String value2) {
            addCriterion("show_content_preview between", value1, value2, "showContentPreview");
            return (Criteria) this;
        }

        public Criteria andShowContentPreviewNotBetween(String value1, String value2) {
            addCriterion("show_content_preview not between", value1, value2, "showContentPreview");
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

        public Criteria andVersionLike(Integer value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(Integer value) {
            addCriterion("version not like", value, "version");
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
     * This class corresponds to the database table order_show
    */
    public  static class Criteria extends GeneratedCriteria{
        protected Criteria() {
            super();
        }
    }



    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
