package com.telusko.web.model;

public class ClientNewUser {
	
	private String newusername;
	private String newpasswprd;
	public String getNewusername() {
		return newusername;
	}
	public void setNewusername(String newusername) {
		this.newusername = newusername;
	}
	public String getNewpasswprd() {
		return newpasswprd;
	}
	public void setNewpasswprd(String newpasswprd) {
		this.newpasswprd = newpasswprd;
	}
	@Override
	public String toString() {
		return "ClientNewUser [newusername=" + newusername + ", newpasswprd=" + newpasswprd + "]";
	}
	

}
