package com.example.springboot_test_3.entity;

public class Netsuserinfo {
	private Integer uitID;
	private String uitName;
	
	private Integer uictID;
	private String uictIndexID;
	private String uictContent;

	public Integer getUitID() {
		return uitID;
	}

	public void setUitID(Integer uitID) {
		this.uitID = uitID;
	}

	public String getUitName() {
		return uitName;
	}

	public void setName(String name) {
		this.uitName = uitName;
	}

	

	public Integer getUictID() {
		return uictID;
	}
	public void setUictID(Integer uictID) {
		this.uictID = uictID;
	}

	public String getUictIndexID() {
		return uictIndexID;
	}
	public void setUictIndexID(String IndexID) {
		this.uictIndexID = IndexID;
	}

	public String getUictContent() {
		return uictContent;
	}
	public void setUictContent(String Content) {
		this.uictContent = Content;
	}

	
	
	@Override
	public String toString() {
		return "Netsuserinfo [uitID=" + uitID + ", uitName=" + uitName + "]";
	}
	
}
