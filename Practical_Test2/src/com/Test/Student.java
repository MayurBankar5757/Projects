package com.Test;
import java.util.Scanner;
public class Student {
		public static void main(String[] args) {
			   Scanner sc = new Scanner(System.in);

			   System.out.println("Enter marks obtained in Physics:");
			   int physics = sc.nextInt();

			   System.out.println("Enter marks obtained in Chemistry:");
			        int chemistry = sc.nextInt();

			   System.out.println("Enter marks obtained in Biology:");
			        int biology = sc.nextInt();

			   System.out.println("Enter marks obtained in Math:");
			   int math = sc.nextInt();

			   System.out.println("Enter marks obtained in Science:");
			   int science = sc.nextInt();

			   int totalMarks = physics + chemistry + biology + math + science;
			   double percentage = (totalMarks * 100.0) / 500.0;

			 System.out.println("Total Marks Obtained: " + totalMarks);
			 System.out.println("Percentage: " + percentage + "%");

			       
			        String grade;
			        if (percentage >= 75) {
			            grade = "Distinction";
			        } else if (percentage >= 60) {
			            grade = "First Class";
			        } else if (percentage >= 50) {
			            grade = "Second Class";
			        } else if (percentage >= 40) {
			            grade = "Pass Class";
			        } else {
			            grade = "Fail";
			        }

			        System.out.println("Grade: " + grade);

			        sc.close();
			    }
			

			
			
		}

