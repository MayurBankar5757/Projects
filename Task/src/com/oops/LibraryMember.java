package com.oops;

public abstract class LibraryMember {
	int memberId ;
	String name;
	
	public LibraryMember(int memberId, String name) {
		
		this.memberId = memberId;
		this.name = name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void borrowItem (LibraryItem item);
}