package Interview;

import java.util.Scanner;

public class CreditialCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "example@gmail.com";
		String s2 = "pass@123";
		String a,b;
		a = sc.nextLine();
		if(s1.equals(a)) {
			System.out.println("Enter your Password");
			b = sc.nextLine();
			if(b.equals(s2)) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Invalid passowrd");
			}
		}
		else {
			System.out.println("Invalid Creditials");
		}
		sc.close();
		
	}
}
