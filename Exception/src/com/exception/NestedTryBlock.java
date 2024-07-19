package com.exception;

public class NestedTryBlock{    
 public static void main(String args[]){   
 //outer try block  
 int x = 20, y=0;
 
  try{    
//   inner try block 1 
//  System.out.println( x/y);
    int arr[] = new int [5];
    arr[5]= 4;
    try{    
     System.out.println("going to divide by 0");    
     int b =39/0;    
   }  
    //catch block of inner try block 1  
    catch(NullPointerException e)  
    {  
      System.out.println(e);  
    }    
       
    
    //inner try block 2  
    try{    
    int a[]=new int[5];    
  
    //assigning the value out of array bounds  
     a[5]=4;    
     }  
  
    //catch block of inner try block 2  
    catch(ArrayIndexOutOfBoundsException e)  
    {  
       System.out.println(e);  
    }    
  
      
    System.out.println("other statement");    
  }  
  //catch block of outer try block  
  catch(Exception e)  
  {  
    System.out.println("handled the exception (outer catch)");  
  } 
  finally{
    
  System.out.println("it is final Statement");   
  }
         throw new Custom_Excep ();
 }    
}