package Interview;

public class MatrixDiagonalZero {

	    public static void setZeroes(int[][] matrix) {
	        int row = matrix.length;
	        int col = matrix[0].length;

	        boolean row1[]= new boolean[row];
	        boolean col2[]= new boolean[col];

	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	                if(matrix[i][j]==0){
	                    row1[i] = true;
	                    col2[j] = true;

	                }
	            }


	        }
	        for(int p=0; p<row; p++){
	            for(int o=0; o<col; o++){
	                if(row1[p]||col2[o]){
	                    matrix[p][o]=0;
	                }
	            }
	        }
	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	            	System.out.print(matrix[i][j]+" ");
	                }
	           System.out.println();
	            }
	        
	    }
	
	public static void main(String []args) {
		int matrix [][]= { {1,0,0,4,4},
					       {1,2,3,4,5}
									   };
		setZeroes(matrix);
		
	}

}
