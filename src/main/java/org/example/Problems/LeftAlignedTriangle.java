package org.example.Problems;

import java.util.*;
public class LeftAlignedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int n = sc.nextInt();

        if(n<1 || n>50){
            System.out.println("Invalid value");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
