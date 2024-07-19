package com.Test;
import java.util.Scanner;
public class Notes {
	public static void main(String[]args) {
		int count500 = 0,count100 = 0,count50 = 0,count20 = 0,count10 = 0,count5 = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		

		  
		for(int i=0; i<=n;i++) {
			if (n % 500==0) {
				count500++;
			}
			else if (n%100 == 0) {
				count100++;
			}
			else if (n%50 == 0) {
				count100++;
			}
			else if (n%20 == 0) {
				count20++;
			} 
			else if (n%10 == 0) {
				count10++;
			}
			else if (n%5 == 0) {
				count10++;
			}
		}
		
		System.out.println(count500 + "  note of 500");
		System.out.println(count100 + "  note of 100");
		System.out.println(count50 + "	note of 50");
		System.out.println(count20 + "	note of20");
		System.out.println(count10 + "	note of 10");
		System.out.println(count5 + "	note of 5");

		sc.close();

	}
}
