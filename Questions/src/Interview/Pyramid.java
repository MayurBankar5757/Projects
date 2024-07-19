package Interview;

public class Pyramid {
	public static void main(String[] args) {
		int row=5,i,j;
		for(i=0;i<row;i++) {
			for(j=row-i;j>1;j--) {
			System.out.print(" ");// for demostrating use - here in between spaces
		}
		
		for(j=0;j<=i;j++) {
		System.out.print("* ");
		}
		System.out.println();
	}
	}
}
