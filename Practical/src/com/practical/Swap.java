package com.practical;

public class Swap {
	int a = 20;
	int b = 10;
	
	void swap() {
		System.out.println("Before swap");
		System.out.println("a = "+a+ " b = "+ b);
		a = a+b;
		b= a-b;
		a =a-b;
		System.out.println("after swap");

		System.out.println("a = "+a+ " b = "+ b);
		
	}
	public static void main(String [] args) {
		Swap a = new Swap();
		a.swap();
	}
	
}
