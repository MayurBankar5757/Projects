package Interview;

public class ReveseNum {
	public static void main(String[] args) {
		int n = 123,rev=0,digit=0;
		
		while(n>0) {
			digit = n%10;
			rev = (rev*10)+digit;
			n= n/10;
			
		}
		System.out.println("Reverse Number " + rev);
		
	}
}
