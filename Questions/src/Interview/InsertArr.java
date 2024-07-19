package Interview;
import java.util.Scanner;
public class InsertArr {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        
	        // Create an array of the specified size
	        int[] array = new int[size];
	        
	        // Prompt the user to enter elements of the array
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }
	        
	        // Display the entered array
	        System.out.println("Entered array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        
	        // Close the scanner
	        scanner.close();
	    }
	
}

