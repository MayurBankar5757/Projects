package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int stud_id ;
	private String stud_name;
	private String city;
	private int age;
	
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int stud_id, String stud_name, String city, int age) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.city = city;
		this.age = age;
	}
	public Student() {
        // Initialize default values or perform other setup if needed
    }
	
	
}
