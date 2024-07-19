package com.Test;
import java.util.Scanner;
public class Power_2 {
  public static void main(String[]args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a Number");
	  int n =sc.nextInt();
	  int expo =10;
	  int base =2,result=1;
	  
	  
	  while (expo != 0) {
	       result*= base;
	       if (n==result) {
	    	   System.out.println(n + " is the power of two");
	       }
	      
	      --expo;
	    }

	 
	  
	  sc.close();
	  
	
  }
}
