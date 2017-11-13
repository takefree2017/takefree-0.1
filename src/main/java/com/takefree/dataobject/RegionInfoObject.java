package com.takefree.dataobject;

public class RegionInfoObject {
//	private static final long serialVersionUID = 1L;
	private long id;
	private int layer;
	private String regionName;
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}


}
