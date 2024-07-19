package com.basic;

public class HelloWorld {
		
	void oprations(int a, int b) {
		
		int sum = a+b;
		System.out.println(sum);
	}
	
	void area(int a ,int b) {
		int areaRec = a*b;
		System.out.println(areaRec);
	}
	void areaCircle(int r) {
		double area = 3.14 *r*r;
		System.out.println(area);
	}
	

	public static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld p = new HelloWorld();
		p.oprations(10,20);
		p.area(30,40);
		p.areaCircle(4);
	}

}
