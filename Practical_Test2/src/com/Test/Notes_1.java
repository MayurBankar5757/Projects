package com.Test;

import java.util.Scanner;

public class Notes_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();

        int[] denominations = { 500, 100, 50, 20, 10, 5 };
        int[] notesCount = new int[6]; // To store count of each denomination

        // Calculate number of notes for each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }

        // Displaying the count of each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] > 0) {
                System.out.println("Number of " + denominations[i] + " notes: " + notesCount[i]);
            }
        }

        scanner.close();
    }
}

