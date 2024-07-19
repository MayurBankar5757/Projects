package com.oops;

public class Test{
	public static void main(String []args) {
		
		Book b1= new Book("java Programming", 1,"sharad tadale");
		//.displayInfo();
		StudentMember s1 = new StudentMember(1,"Ma",1);
		s1.borrowItem(b1);
	}
}
