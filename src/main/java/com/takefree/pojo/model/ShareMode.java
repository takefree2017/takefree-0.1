package com.takefree.pojo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * This class corresponds to the database table share_mode
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class ShareMode implements Serializable {
    /**
     * @mbg.generated
     */
    private Integer id;

    /**
     * @mbg.generated
     */
    private String name;

    /**
     * 是否需要交接。0,否。1，是
     * @mbg.generated
     */
    private Integer transferable;

    /**
     * 是否可参与。0,否。1，是
     * @mbg.generated
     */
    private Integer participatory;

    /**
     * @mbg.generated
     */
    private String smallPicUrl;

    /**
     * @mbg.generated
     */
    private String picUrl;

    /**
     * This field corresponds to the database table share_mode
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method corresponds to the database table share_mode
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", transferable=").append(transferable);
        sb.append(", participatory=").append(participatory);
        sb.append(", smallPicUrl=").append(smallPicUrl);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
