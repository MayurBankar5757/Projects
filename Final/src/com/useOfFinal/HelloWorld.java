package com.useOfFinal;

class HelloWorld {	
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	    final int a;// if we assign value from here ie.a=10
	    // we can't assign value or intantiate value from constructor
	    HelloWorld(int a){
	       this. a = a;
	    } 
	    HelloWorld(String us){
	        a = Integer.valueOf(us) ;
	    }
	    
	    public int Display() {
	    	return a;
	    }
	    public static void main(String[] args) {
	        System.out.println("Hello, World!");
	        HelloWorld p = new HelloWorld(20);
	        HelloWorld p2= new HelloWorld(200);
	        System.out.println(p.a);
	        System.out.println(p2.a);

	    }
	}

