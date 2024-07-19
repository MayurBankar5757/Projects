package com.Practical_test;

public class Greater {
	
	public static void main(String[]args) {
		
	
	int arr[]= {1,3,3,4,5};
	int greater= 0;
	
	for (int i=0;i<arr.length;i++) {
		if (arr[i]>greater) {
			greater = arr[i];
			System.out.println(arr[i]);
		}
		
	}
	System.out.println(greater);
	}
}
