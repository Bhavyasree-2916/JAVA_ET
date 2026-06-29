package org.example.Problems;

import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<-100 || arr[i]>100){
                System.out.println("Invalid input");
                return;
            }
        }

        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int index = 0;

        while(left<=right){
            if(left!=right){
                result[index++] = arr[right--];
                result[index++] = arr[left++];
            }
            else{
                result[index++] = arr[left--];
                left++;
            }
        }

        System.out.println("The rearranged array is");
        for(int num: result){
            System.out.print(num+" ");
        }
    }
}
