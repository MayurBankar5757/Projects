package com.basic;

public class BankAccount {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	
	  private  double p,r,t,si;
	    
	    public  BankAccount (double p,double r,double t){
	        this.p = p;
	         this.r = r;
	        
	        this.t= t;
	        
	        
	        
	       
	        
	    }
	    private double calculateInterest(){
	     
	   
	        return si = (p*r*t)/100;

	    }
	    public void display(){
	        System.out.println(calculateInterest());
	    }
	    public static void main(String[] args) {
	        BankAccount a = new BankAccount(1000,20,3);
	        a.display();
	    }
	}

