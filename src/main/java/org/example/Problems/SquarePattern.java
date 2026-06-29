package org.example.Problems;

import java.util.Scanner;

//Square matrix with repeated row numbers
public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();

        if(n<1 || n>50){
            System.out.println("Invalid value");
            return;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
