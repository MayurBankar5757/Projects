package Interview;

public class SpiralTest {
	

		public static void Spiral_Matrix(int matrix[][]) {
			// TODO Auto-generated method stub
			int SC = 0;
			int SR = 0;
			int ER = matrix.length-1;
			int EC = matrix[0].length-1;
			
			while(SR<=ER&&SC <= EC) {
				
				for(int i=SC; i<=EC; i++) {
					System.out.print(matrix[SR][i]+" ");
				}
				
				for(int i=SR+1; i<=ER; i++) {
					System.out.print(matrix[i][EC]+" ");
					if (SR==ER) {
						break;
					}
				}
				for(int i=EC-1; i>= SC; i--) {
					System.out.print(matrix[ER][i]+" ");
					if (SC==EC) {
						break;
					}
				}
				for(int i=ER-1; i>=SR+1; i--) {
					System.out.print(matrix[i][SC]+" ");
				}
				SC++;
				SR++;
				ER--;
				EC--;
				
			}
		   // 	System.out.print(" ");
		}
		public static void main(String[]args) {
			int matrix [][] = {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};	
			
		 Spiral_Matrix(matrix);
		
		


	}
		}


