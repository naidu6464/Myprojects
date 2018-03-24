package com.vidvaan.spring.mvc.bean;

public class Employee {
	private Integer eid;
	public Employee(Integer eid, String ename, Double esal, String ecompany) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.ecompany = ecompany;
	}

	private String ename;
	private Double esal;
	private String ecompany;

	public String getEcompany() {
		return ecompany;
	}

	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
