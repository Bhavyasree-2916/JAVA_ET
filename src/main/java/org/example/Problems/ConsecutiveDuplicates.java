package org.example.Problems;

import java.util.Scanner;

public class ConsecutiveDuplicates {
    static String removeDuplicates(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
            return removeDuplicates(str.substring(1));
        }
        return str.charAt(0) + removeDuplicates(str.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of testCases ");
        int t = sc.nextInt();
        while (t-- >0){
            System.out.println("enter the size of the string");
            int n = sc.nextInt();

            System.out.println("enter the string");
            String str = sc.next();

            if(str.length()!=n){
                System.out.println("The length of the string is not the same as the length of the string");
                continue;
            }

            boolean valid = true;

            for(int i=0;i<str.length();i++){
                if(!Character.isLowerCase(str.charAt(i))){
                    valid = false;
                    break;
                }
            }

            if(!valid){
                System.out.println("String must contain only lowercase alphabets");
                continue;
            }

            System.out.println(removeDuplicates(str));
        }
    }
}
