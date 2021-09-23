package com.plasmit.icare.model;


public class Patient {
	
	
	private int pid;
	private String pname;
	private String disease;
	private String address;
	


	public Patient() {
		super();
	}
	
	
	public Patient(int pid, String pname, String disease, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.disease = disease;
		this.address = address;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
