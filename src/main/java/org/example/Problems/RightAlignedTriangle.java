package org.example.Problems;


import java.util.Scanner;

public class RightAlignedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value N: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid input (less than minimum allowed)");
            return;
        }

        if (n > 50) {
            System.out.println("Invalid input (exceeds maximum limit)");
            return;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}