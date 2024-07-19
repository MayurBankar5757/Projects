package com.basic;

public class Spiral_new_Test {




    public static void spiralMatrix(int[][] matrix) {
        int SC = 0;
        int SR = 0;
        int ER = matrix.length - 1;
        int EC = matrix[0].length - 1;

        while (SR <= ER && SC <= EC) {

            // Print the first row
            for (int i = SC; i <= EC; i++) {
                System.out.print(matrix[SR][i] + " ");
            }
            SR++;

            // Print the last column
            for (int i = SR; i <= ER; i++) {
                System.out.print(matrix[i][EC] + " ");
            }
            EC--;

            // Print the last row
            if (SR <= ER) {
                for (int i = EC; i >= SC; i--) {
                    System.out.print(matrix[ER][i] + " ");
                }
                ER--;
            }

            // Print the first column
            if (SC <= EC) {
                for (int i = ER; i >= SR; i--) {
                    System.out.print(matrix[i][SC] + " ");
                }
                SC++;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralMatrix(matrix);
    }
}


