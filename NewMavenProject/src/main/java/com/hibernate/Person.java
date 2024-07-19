package com.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "person_info")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	@Column(name="person_name",length=20,nullable=false)
	private String pname;
	@Transient
	private int age ;
	@Temporal(TemporalType.DATE)
	private Date jdate;
	private int salary;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public int getSalary() {
		return salary;
	}
	public Person(String pname, int age, Date jdate, int salary) {
		super();
		
		this.pname = pname;
		this.age = age;
		this.jdate = jdate;
		this.salary = salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
