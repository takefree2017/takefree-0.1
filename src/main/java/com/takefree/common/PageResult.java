package com.takefree.common;

import java.io.Serializable;
import java.util.List;

public class PageResult<X> implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<X> result;
    private int pageNo;
    private int totalCount;
    private int pageSize;

    public PageResult() {
        this.pageNo = BaseQuery.DEFAULT_PAGE;
        this.pageSize = BaseQuery.DEFAULT_PAGE_SIZE;
    }

    public List<X> getResult() {
        return this.result;
    }

    public void setResult(List<X> result) {
        this.result = result;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalPage() {
        if (this.pageNo < 1) {
            this.pageNo = BaseQuery.DEFAULT_PAGE;
        }

        return this.totalCount / this.pageSize + (this.totalCount % this.pageSize == 0 ? 0 : 1);
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
