package com.example.springboot_test_3.entity;

public class Netsuserinfo {
	private Integer uitID;
	private String uitName;

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

	@Override
	public String toString() {
		return "Netsuserinfo [uitID=" + uitID + ", uitName=" + uitName + "]";
	}
	
}
