package org.example.Problems;

import java.util.Scanner;

public class GCDArray {
    public static int gcd(int a ,int b){
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result =0;

        for(int i=0;i<n;i++){
            result = gcd(result,arr[i]);
        }
        System.out.println(result);
    }
}
