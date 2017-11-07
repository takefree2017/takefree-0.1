package com.takefree.query;


import com.takefree.common.BaseCriteria;
import com.takefree.common.BaseQuery;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.List;

public class ShareLbsQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;

    public ShareLbsQuery() {
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
     * This class corresponds to the database table share_lbs
     */
         protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
        }

        public Criteria andShareIdIsNull() {
            addCriterion("share_id is null");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNotNull() {
            addCriterion("share_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualTo(Long value) {
            addCriterion("share_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdNotEqualTo(Long value) {
            addCriterion("share_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria anShareIdGreaterThan(Long value) {
            addCriterion("share_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanOrEqualTo(Long value) {
            addCriterion("share_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThan(Long value) {
            addCriterion("share_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanOrEqualTo(Long value) {
            addCriterion("share_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdIn(List<Long> values) {
            addCriterion("share_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdNotIn(List<Long> values) {
            addCriterion("share_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdBetween(Long value1, Long value2) {
            addCriterion("share_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShareIdNotBetween(Long value1, Long value2) {
            addCriterion("share_id not between", value1, value2, "id");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(java.math.BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(java.math.BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(java.math.BigDecimal value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(java.math.BigDecimal value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<java.math.BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<java.math.BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(java.math.BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(java.math.BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(java.math.BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(java.math.BigDecimal value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(java.math.BigDecimal value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<java.math.BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<java.math.BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionIsNull() {
            addCriterion("lbs_description is null");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionIsNotNull() {
            addCriterion("lbs_description is not null");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionEqualTo(String value) {
            addCriterion("lbs_description =", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionNotEqualTo(String value) {
            addCriterion("lbs_description <>", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionGreaterThan(String value) {
            addCriterion("lbs_description >", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("lbs_description >=", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionLessThan(String value) {
            addCriterion("lbs_description <", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("lbs_description <=", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionLike(String value) {
            addCriterion("lbs_description like", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionNotLike(String value) {
            addCriterion("lbs_description not like", value, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionIn(List<String> values) {
            addCriterion("lbs_description in", values, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionNotIn(List<String> values) {
            addCriterion("lbs_description not in", values, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionBetween(String value1, String value2) {
            addCriterion("lbs_description between", value1, value2, "lbsDescription");
            return (Criteria) this;
        }

        public Criteria andLbsDescriptionNotBetween(String value1, String value2) {
            addCriterion("lbs_description not between", value1, value2, "lbsDescription");
            return (Criteria) this;
        }

    }

    /**
     * This class corresponds to the database table share_lbs
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
