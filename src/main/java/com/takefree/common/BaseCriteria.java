package com.takefree.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseCriteria implements Serializable {
    private static final long serialVersionUID = 1L;
    protected List<Criterion> criteria = new ArrayList();

    protected BaseCriteria() {
    }

    public boolean isValid() {
        return this.criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
        return this.criteria;
    }

    public List<Criterion> getCriteria() {
        return this.criteria;
    }

    protected void addCriterion(String condition) {
        if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
        } else {
            this.criteria.add(new Criterion(condition));
        }
    }

    protected void addCriterion(String condition, Object value, String property) {
        if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
        } else {
            this.criteria.add(new Criterion(condition, value));
        }
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
        if (value1 != null && value2 != null) {
            this.criteria.add(new Criterion(condition, value1, value2));
        } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
        }
    }
}
