package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FacultySubject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int subId;
	String subName;
	
	public FacultySubject(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}
	public FacultySubject(String subName) {
		super();
		this.subName = subName;
	}
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "FacultySubject [subId=" + subId + ", subName=" + subName + "]";
	}
	

}
