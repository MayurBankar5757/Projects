package com.practical;

public class Matrix {
    int a[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    int b[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    int c[][] = new int[3][3];

    public void addMatrices() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.addMatrices();

        // Printing the result matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix.c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
