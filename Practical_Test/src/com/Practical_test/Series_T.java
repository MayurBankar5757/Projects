package com.Practical_test;


public class Series_T {
	
	    public static void main(String[] args) {
	        int current = 1;
	        int value=1;
	        for (int i = 1; i <= 9; i++) {
	            System.out.print(current + " "); 
           value+=i;
	            current = value+i;
	            

	        }
	    }
	

}
