package Interview;

public class SumOfDigit {
	public static void main(String[]args) {
		
		int n = 123, sum =0,digit=0;
		while(n>0) {
			digit = n%10;
			sum = sum+digit;
			n = n/10;
			
		}
		System.out.println("Sum of digit "+ sum);
	}

}
