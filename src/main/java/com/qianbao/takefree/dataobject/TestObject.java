package com.qianbao.takefree.dataobject;

import java.sql.Timestamp;

public class TestObject {
    private int id;
    private String caller;
    private String provinceCode;
    private String areaCode;
    private String areaName;
    private String parentAreaCode;
    private Timestamp createTime;
    private Timestamp modifyTime;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the caller
     */
    public String getCaller() {
        return caller;
    }
    /**
     * @param caller the caller to set
     */
    public void setCaller(String caller) {
        this.caller = caller;
    }
    /**
     * @return the provinceCode
     */
    public String getProvinceCode() {
        return provinceCode;
    }
    /**
     * @param provinceCode the provinceCode to set
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    /**
     * @return the areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }
    /**
     * @param areaCode the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    /**
     * @return the areaName
     */
    public String getAreaName() {
        return areaName;
    }
    /**
     * @param areaName the areaName to set
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    /**
     * @return the parentAreaCode
     */
    public String getParentAreaCode() {
        return parentAreaCode;
    }
    /**
     * @param parentAreaCode the parentAreaCode to set
     */
    public void setParentAreaCode(String parentAreaCode) {
        this.parentAreaCode = parentAreaCode;
    }
    /**
     * @return the createTime
     */
    public Timestamp getCreateTime() {
        return createTime;
    }
    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    /**
     * @return the modifyTime
     */
    public Timestamp getModifyTime() {
        return modifyTime;
    }
    /**
     * @param modifyTime the modifyTime to set
     */
    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }
    
}
