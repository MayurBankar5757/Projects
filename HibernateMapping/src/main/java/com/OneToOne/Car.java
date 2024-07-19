package com.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

int cid;
String cnm;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="aid")
Accident a;

public Accident getA() {
	return a;
}

public void setA(Accident a) {
	this.a = a;
}

public Car() {
	super();
	// TODO Auto-generated constructor stub
}

public Car(String cnm) {
	super();
	this.cnm = cnm;
}

public Car(String cnm, int accid) {
	super();
	this.cnm = cnm;
	
}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCnm() {
	return cnm;
}
public void setCnm(String cnm) {
	this.cnm = cnm;
}

@Override
public String toString() {
	return "Car [cid=" + cid + ", cnm=" + cnm + ", a=" + a + "]";
}


}


