package Interview;

public class PalindromeNum {
	
	public static void main(String[] args) {
		int n = 121, rev =0, digit =0;
		int temp = n;
		while(n>0) {
			digit = n%10;
			rev = (rev*10)+digit;
			n = n/10;
			
		}
		if(temp== rev) {
			System.out.println("Palindrome Number " + rev);
		}
		else {
			System.out.println("Not Palindrome Number " + temp);
		}
	}
	/*
	public static void main(String[] args) {
		int num = 121;
		int rev =0;
		int n =0;
		for(int i=0; i<3;i++) {
			 n =  num%10;
			 rev = rev*10+n;
			 
			 num = num/10;
			
		}
		System.out.println(rev);
	}
	*/
}
