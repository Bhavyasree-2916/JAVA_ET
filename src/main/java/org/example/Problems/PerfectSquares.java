package org.example.Problems;

import java.util.*;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a<1 || b<1 || a>b){
            System.out.println("Invalid input");
            return;
        }

        int low = (int) Math.ceil(Math.sqrt(a));
        int high = (int) Math.floor(Math.sqrt(b));

        int count = high - low + 1;
        
        if(count<0){
            count = 0;
        }
        System.out.println(count);

    }
}
