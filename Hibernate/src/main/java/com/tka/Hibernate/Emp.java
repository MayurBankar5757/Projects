package com.tka.Hibernate;

public class Emp {

   int empId;
   String empName;
   int empSalary;
   public Emp(int empId, String empName, int empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}

}
