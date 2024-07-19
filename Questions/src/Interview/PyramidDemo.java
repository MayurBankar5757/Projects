package Interview;

public class PyramidDemo {
	public static void main(String[] args) {
		
			for(int i=0; i<5;i++) {
				
				for(int j=2*(4-i); j>=0; j--)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
	            
	           for(int j=0; j<=i; j++)
	            {
	               	if(j==1|| j==2||j==3)
	                System.out.print("* ");
	            }
	          
				for(int j=0; j<=i;j++) {
					System.out.print("* ");
					
				}
//			
				
				
				System.out.println();
			}
	}
}
