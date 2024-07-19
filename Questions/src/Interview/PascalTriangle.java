package Interview;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case for numRows = 0
        if (numRows == 0) {
            return triangle;
        }

        // Create the first row with just one element (1)
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate subsequent rows based on the previous row
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> prevRow = triangle.get(rowNum - 1);
            List<Integer> currRow = new ArrayList<>();

            // The first element of each row is always 1
            currRow.add(1);

            // Calculate middle elements based on the previous row
            for (int j = 1; j < rowNum; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last element of each row is always 1
            currRow.add(1);

            triangle.add(currRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);

        // Print the Pascal's triangle
        for (List<Integer> row : triangle) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
