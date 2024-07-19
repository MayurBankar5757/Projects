package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accident {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int aid;
	String aplace;
	public Accident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accident(String aplace) {
		super();
		this.aplace = aplace;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAplace() {
		return aplace;
	}
	public void setAplace(String aplace) {
		this.aplace = aplace;
	}
	@Override
	public String toString() {
		return "Accident [aid=" + aid + ", aplace=" + aplace + "]";
	}
	
	

}
