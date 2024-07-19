package com.oops;

public class StudentMember extends LibraryMember{
 

private int studentId;

public StudentMember(int memberId, String name, int studentId) {
	super(memberId, name);
	this.studentId = studentId;
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}
@Override
void borrowItem(LibraryItem item) {
	System.out.println("Student  id : "+ getStudentId());
	System.out.println("Student  name : "+getName());
	System.out.println("Member Id : "+ getMemberId());
	
}
  
  
}
