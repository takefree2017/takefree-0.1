package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table configuration
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class Configuration implements Serializable {
    /**
     * @mbg.generated
     */
    private String configItem;

    /**
     * @mbg.generated
     */
    private String configValue;

    /**
     * This field corresponds to the database table configuration
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table configuration
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configItem=").append(configItem);
        sb.append(", configValue=").append(configValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
