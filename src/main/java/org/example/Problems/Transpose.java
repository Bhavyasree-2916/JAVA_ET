package org.example.Problems;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (m < 1) {
            System.out.println("Invalid Input: Number of rows must be at least 1");
            return;
        }

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        if (n > 50) {
            System.out.println("Invalid Input: Number of columns must be at most 50");
            return;
        }

        int[][] arr = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose:");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
