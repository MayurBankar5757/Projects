package com.Practical_test;

public class Pract {
    public static void main(String[] args) {
        
        
    
        for (int i = 1; i <= 9; i++) {
        
        	 System.out.println();
            for (int j = 1; j <= 3; j++) {
                if (i <= 3) {
                    System.out.print("* "); 
                }
                
             if (i >= 4 && i<=6){
                    System.out.print("@ "); 
                }
           	 if (i == 7 ){
                    System.out.print("1 "); 
                }
           	 else if(i==8) {
           		 System.out.print("2 "); 
           	 }
           	else if(i==9) {
          		 System.out.print("3 "); 
               
                
             }
          
            
             }
            System.out.println();  
            
    }
       
    }}

