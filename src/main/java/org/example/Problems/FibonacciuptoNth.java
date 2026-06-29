package org.example.Problems;

import java.util.Scanner;

public class FibonacciuptoNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid input");
            return;
        }

        int a = 0;
        int b = 1;

        int sum = a+b;
        if(n==0){
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(1);
            return;
        }

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            sum += c;

            a = b;
            b = c;
        }

        System.out.println(sum);
    }
}
