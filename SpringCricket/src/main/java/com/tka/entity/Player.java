package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/* 
 * 
 * @Entity
Purpose: Indicates that a class is a JPA entity. This class represents a table in a relational database.
Usage: Used in the context of persistence, specifically with JPA (Java Persistence API).
Package: Typically from javax.persistence or jakarta.persistence.
Features:
Maps the class to a database table.
Requires a primary key, usually specified with @Id.
Can include additional annotations for column mapping, relationships, etc.
 * 
 * @Component (Assumed as @SpringAnnotation)
Purpose: Indicates that a class is a Spring component. It is a generic stereotype for any Spring-managed component.
Usage: Used to denote a Spring bean. Spring will detect and register it as a bean during component scanning.
Package: From org.springframework.stereotype.
Features:
Allows for automatic detection and registration of beans.
Can be used with other stereotype annotations such as @Service, @Repository, and @Controller.
 * 
 * 
 * */

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String pName;
    private int age;
    private int noofyrs;
    String team;

    // Default constructor
    public Player() {}
    

	public Player(int pid, String pName, int age, int noofyrs, String team) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.age = age;
		this.noofyrs = noofyrs;
		this.team = team;
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoofyrs() {
		return noofyrs;
	}

	public void setNoofyrs(int noofyrs) {
		this.noofyrs = noofyrs;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}

   
