package com.cg.entity;

public class SBU {
	private int subId;
	private String subName;
	private String subHead;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	@Override
	public String toString() {
		return "SBU [subId=" + subId + ", subName=" + subName + ", subHead="
				+ subHead + "]";
	}
	

}
