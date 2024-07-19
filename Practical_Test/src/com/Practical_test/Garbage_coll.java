package com.Practical_test;

public class Garbage_coll {

	public void finalize() {
		System.out.println("Garbage collection implemented");
	}
	public static void main(String []args) {
		Garbage_coll s = new Garbage_coll();
		s = null;
		System.gc();
	}
}
