package com.poly;

public class OverPoly {
	

		// Main driver method
		public static void main(String[] args)
		{

			// Creating object of class 1
			Parent a = new Parent();
	          a.Print();
//
//			// Now we will be calling print methods
//			// inside main() method
//
			a = new subclass1();
			a.Print();
	   subclass1 b = new subclass1();
	   b.Print();
//
//		a = new subclass2();
//			a.Print();
			
//			   System.out.println(Helper.Multiply(5.5, 6.3));
		}
	}
		

