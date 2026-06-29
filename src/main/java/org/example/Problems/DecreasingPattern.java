package org.example.Problems;

import java.util.*;

//Decreasing rows with increasing numbers

public class DecreasingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        if(n<1 || n>50){
            System.out.println("Invalid number");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
