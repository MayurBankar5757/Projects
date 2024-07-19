package com.learn.packageStruc.entity;


public class StudentInfo {
	int stno;
	String stNa ;
	
	public StudentInfo(int stno, String stNa) {
		super();
		this.stno = stno;
		this.stNa = stNa;
	}
	
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStno() {
		return stno;
	}
	public void setStno(int stno) {
		this.stno = stno;
	}
	public String getStNa() {
		return stNa;
	}
	public void setStNa(String stNa) {
		this.stNa = stNa;
	}
	@Override
	public String toString() {
		return "StudentInfo [No =" + stno + ", Name =" + stNa + "]";
	}
	
}
