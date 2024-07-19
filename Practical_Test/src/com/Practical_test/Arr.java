package com.Practical_test;

public class Arr {
  public static void main(String[]args) {
	  int arr[] = {1,2,3,4,5,6,7,8,9,10};
	 
	  for(int i=0; i<=9;i++) {
		  System.out.print(arr[i]+  " ");
	  }
	  System.out.println();
	  for(int i=0; i<=arr.length -1;i++) {
		  System.out.print(arr[i]+  " ");
	  }
	  System.out.println();

	  System.out.print("by using for each loop ");
	  

	  for(int i:arr) {
		  System.out.print(i+  " ");
	  }
	  
	  
  }
}
