package Interview;

import java.util.Scanner;

public class TCSSol1 {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		int[] arr = new int[n];
		int d[] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
			
		}
		for(int i=0; i<n;i++) {
			if(arr[i]<sum) {
				sum -= arr[i];
				d[i]=1;
//				System.out.print("1");
			}
			else {
//				System.out.print("0");
				d[i]=0;
			}
		}
	for(int i=0; i<n; i++) {
		System.out.print(d[i]);
	}
		
	}
}
