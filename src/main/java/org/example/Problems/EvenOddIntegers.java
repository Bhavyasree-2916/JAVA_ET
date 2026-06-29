package org.example.Problems;

import java.util.Scanner;

public class EvenOddIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even:"+even);
        System.out.println("Number of odd:"+odd);
    }
}
