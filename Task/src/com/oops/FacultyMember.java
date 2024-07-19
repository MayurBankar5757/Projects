package com.oops;
public class FacultyMember extends LibraryMember {
	
	private int facultyId;

	
	public FacultyMember(int memberId, String name, int facultyId) {
		super(memberId, name);
		this.facultyId = facultyId;
	}
	


	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	
	

	@Override
	void borrowItem(LibraryItem item) {
		System.out.println("Faculty id : "+ getFacultyId());
		System.out.println("Faculty name : "+getName());
		System.out.println("Member Id : "+ getMemberId());
		
	}
}
