package com.poly;


	//Java Program for Method overloading
	// By using Different Types of Arguments 
	 
	// Class 1
	// Helper class
	class Helper {
	 
	    // Method with 2 integer parameters
	   public  static int Multiply(int a, int b)
	    {
	        // Returns product of integer numbers
	        return a * b;
	    }
	 
	    // Method 2
	    // With same name but with 2 double parameters
	   protected static double Multiply(double a, double b)
	    {
	        // Returns product of double numbers
	        return a * b;
	    }
	   protected static double Multiply(String a, double b)
	    {
	        // Returns product of double numbers
		   return b;
	    }
	   protected static double Multiply( double b,String a)
	    {
	        // Returns product of double numbers
		   return b;
	    }
	}
	
	 
	

