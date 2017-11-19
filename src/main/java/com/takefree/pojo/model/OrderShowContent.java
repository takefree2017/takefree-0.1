package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table order_show_content
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class OrderShowContent implements Serializable {
    /**
     * 显摆id, 主键
     * @mbg.generated
     */
    private Long orderShowId;

    /**
     * 显摆详情
     * @mbg.generated
     */
    private String content;

    /**
     * This field corresponds to the database table order_show_content
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table order_show_content
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderShowId=").append(orderShowId);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
