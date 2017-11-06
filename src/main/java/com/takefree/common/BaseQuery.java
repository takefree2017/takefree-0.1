package com.takefree.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    public static int DEFAULT_PAGE_SIZE = 20;
    public static int MAX_PAGE_SIZE = 100;
    public static int DEFAULT_PAGE = 1;
    protected String orderByClause;
    protected boolean distinct;
    protected List<BaseCriteria> oredCriteria = new ArrayList();
    protected Integer pageOffset;
    protected Integer pageNo;
    protected Integer pageSize;

    public BaseQuery() {
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<BaseCriteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(BaseCriteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }

    public void clearPage() {
        this.pageSize = null;
        this.pageNo = null;
        this.pageOffset = null;
    }

    protected void calPageOffset() {
        if (null != this.pageSize && null != this.pageNo) {
            this.pageOffset = (this.pageNo.intValue() - 1) * this.pageSize.intValue();
        } else {
            this.pageOffset = null;
        }

    }

    public boolean isValid() {
        for(int i = 0; i < this.oredCriteria.size(); ++i) {
            if (((BaseCriteria)this.oredCriteria.get(i)).isValid()) {
                return true;
            }
        }

        return false;
    }

    public void setPageOffset(Integer pageOffset) {
        this.pageOffset = pageOffset;
    }

    public Integer getPageOffset() {
        return this.pageOffset;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize != null && pageSize.intValue() > 0) {
            if (pageSize.intValue() > MAX_PAGE_SIZE) {
                this.pageSize = MAX_PAGE_SIZE;
            } else {
                this.pageSize = pageSize;
            }
        } else {
            this.clearPage();
        }

        this.calPageOffset();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Integer pageNo) {
        if (pageNo != null && pageNo.intValue() >= DEFAULT_PAGE) {
            this.pageNo = pageNo;
        } else {
            this.clearPage();
        }

        this.calPageOffset();
    }
}
