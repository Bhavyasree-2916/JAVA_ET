package org.example.Problems;

import java.util.Scanner;

public class NegativePositiveArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of values: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int pos=0;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp = arr[i];
                for(int j=i;j>pos;j--){
                    arr[j] = arr[j-1];
                }
                arr[pos] = temp;
                pos++;
            }

        }
        for(int x: arr){
            System.out.println(x);
        }
    }
}
