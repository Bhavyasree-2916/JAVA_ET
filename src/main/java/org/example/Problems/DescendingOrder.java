package org.example.Problems;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]<-1000000 || arr[i]>1000000){
                System.out.println("Invalid");
                return;
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("the descending order of elements is");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
