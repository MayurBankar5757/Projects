package Interview;

public class AmstrongNum {
	public static void main(String[] args) {
		int n= 153,sum =0,digit=0;
		int temp =n;
		
		while(n>0) {
			digit = n%10;
			sum = sum +(digit*digit*digit);
			n = n/10;
			
			
		}
		if (temp==sum) {
			System.out.println("Amstrong Number " + sum);
		}
		else {
			System.out.println("Not Amstrong Number " + temp);
		}
		
	}
}
