package com.takefree.query;

import com.takefree.common.BaseCriteria;
import com.takefree.common.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.List;

public class UserLikeQuery extends BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    public UserLikeQuery() {
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
     * This class corresponds to the database table user_like
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

        public Criteria andUserFolloweeIdLike(Long value) {
            addCriterion("user_followee_id like", value, "userFolloweeId");
            return (Criteria) this;
        }

        public Criteria andUserFolloweeIdNotLike(Long value) {
            addCriterion("user_followee_id not like", value, "userFolloweeId");
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

        public Criteria andUserFollowerIdLike(Long value) {
            addCriterion("user_follower_id like", value, "userFollowerId");
            return (Criteria) this;
        }

        public Criteria andUserFollowerIdNotLike(Long value) {
            addCriterion("user_follower_id not like", value, "userFollowerId");
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

        public Criteria andStatusLike(Integer value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(Integer value) {
            addCriterion("status not like", value, "status");
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


        public Criteria andGmtUpdateEqualTo(LocalDateTime value) {
            addCriterion("gmt_update =", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_update <>", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThan(LocalDateTime value) {
            addCriterion("gmt_update >", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_update >=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThan(LocalDateTime value) {
            addCriterion("gmt_update <", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_update <=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLike(LocalDateTime value) {
            addCriterion("gmt_update like", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotLike(LocalDateTime value) {
            addCriterion("gmt_update not like", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIn(List<LocalDateTime> values) {
            addCriterion("gmt_update in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_update not in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_update between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_update not between", value1, value2, "gmtUpdate");
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
     * This class corresponds to the database table user_like
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
