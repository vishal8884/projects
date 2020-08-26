package com.telusko.web.model;

public class AfterLogin {
	
	private String disease;
	private String remedy1;
	private String remedy2;
	private String remedy3;
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getRemedy1() {
		return remedy1;
	}
	public void setRemedy1(String remedy1) {
		this.remedy1 = remedy1;
	}
	public String getRemedy2() {
		return remedy2;
	}
	public void setRemedy2(String remedy2) {
		this.remedy2 = remedy2;
	}
	public String getRemedy3() {
		return remedy3;
	}
	public void setRemedy3(String remedy3) {
		this.remedy3 = remedy3;
	}
	@Override
	public String toString() {
		return "AfterLogin [disease=" + disease + ", remedy1=" + remedy1 + ", remedy2=" + remedy2 + ", remedy3="
				+ remedy3 + "]";
	}
	
	

}
