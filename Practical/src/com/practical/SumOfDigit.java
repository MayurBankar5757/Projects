package com.practical;

public class SumOfDigit {
	public static void main(String[] args) {
		String n = madam,rev=""; 
		String temp =n;
		int len = n.length();
		for(int i=len-1;i<=0 ;i++){
			
			rev += charAt(i);
			
		}
		if(rev==temp) {
		System.out.println("This is Palindrome Number " + rev);
		}
		else {
			System.out.println("This is not Palindrome Number " + temp);
		}
	}

}
