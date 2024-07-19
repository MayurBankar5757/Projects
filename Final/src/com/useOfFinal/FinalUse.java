package com.useOfFinal;

public class FinalUse {
	void m1(int z) {
		final int x =z;
		// here we cannot Re-assign x=90; it will occured error
		System.out.println(x);
	}
	public static void main(String[] args) {
		FinalUse f = new FinalUse();
		f.m1(20);
		f.m1(25);
	}
}
