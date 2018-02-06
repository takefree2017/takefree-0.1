package com.takefree.dto.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class IndexDTO implements Serializable {
    private Integer sequence;

    private Integer type;

    private ShareDTO share;

    private OrderShowDTO show;

    /**
     * This field corresponds to the database table take_order
     */
    private static final long serialVersionUID = 1L;

}
