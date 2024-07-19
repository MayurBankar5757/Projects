package com.String;

public class Frequency {
	int size = 26;
	
	void print(String str) {
		int n= str.length();
		
		int freq [] = new int[size];
		
		for (int i=0;i<n; i++) {
			
			freq[str.charAt(i)-'a']++;
			
		}
		
		for (int i=0;i<n; i++) {
		if(	freq[str.charAt(i)-'a'] !=0) {
			System.out.print(str.charAt(i));
			System.out.print(freq[str.charAt(i)-'a'] + " ");

			freq[str.charAt(i)-'a'] =0;
		}
		
			
		}
	}
	public static void main(String[]args) {
		Frequency obj = new Frequency();
		String str = "good";
		obj.print(str);
		
	}
}
