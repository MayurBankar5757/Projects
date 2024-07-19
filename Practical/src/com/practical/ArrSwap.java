package com.practical;

public class ArrSwap {
public static void main(String[]args) {
	int arr []= {21,32,53,36,75,56,47,65,96};
	int temp = 0;
	System.out.println("Element are arraged in asending order");
	
	for (int i=0; i<arr.length; i++) {
		
		for (int j=i+1; j<arr.length;j++) {
		if (arr[i]>arr[j]) {
			temp = arr[i];
			arr [i]= arr[j];
			arr[j] = temp;
		}	
		}
		System.out.print(arr[i]+ " ");

		
	}
	System.out.println();
	System.out.println("Element are arraged in decending order");
	System.out.println();



	for (int i=0; i<arr.length; i++) {
		
		for (int j=i+1; j<arr.length;j++) {
		if (arr[i]<arr[j]) {
			temp = arr[i];
			arr [i]= arr[j];
			arr[j] = temp;
		}	
		}
		System.out.print(arr[i]+ " ");

		
	}
}
}
