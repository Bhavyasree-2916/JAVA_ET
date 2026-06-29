package org.example.Problems;

import java.util.*;

public class TrianglePossibilities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    if(a+b>c && a+c>b && b+c>a){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

