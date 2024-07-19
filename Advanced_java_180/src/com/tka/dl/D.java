package com.tka.dl;

public class D {
		
public static void main(String[] args) {
	A a = new A();
	B b = a.m1();
	C c = b.m3();
//	System.out.println(c.m5());
	System.out.println(a.m1().m3().m5());
}

}
