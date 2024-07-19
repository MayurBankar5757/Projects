package Interview;
import java.util.Scanner;
public class LoginCheck {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String login = "example@gmail.com";
			String pwd = "pass@123";
			String userName,pass;
			System.out.println("Enter your UserName");
			userName = sc.nextLine();
			System.out.println("Enter your Password");
			pass = sc.nextLine();
			int len = pass.length();
			
			if(userName.contains("@") && userName.contains(".")) {
				
				if(len==8) {
					
					if(login.equals(userName)&& pwd.equals(pass)) {
					System.out.println("Login Successful");
					}
					else {
					System.out.println("Login Un-Successful");
					}
				}
				else {
					System.out.println("no of digit exeeded invalid password");
				}
			}
			else {
				System.out.println("Invalid UserName");
			}
			sc.close();
	}

}
