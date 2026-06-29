package org.example.Problems;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if(str.isEmpty()){
            System.out.println("Empty string");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                System.out.println("Invalid input. String contains non-alphabetic characters.");
                return;
            }
        }

        HashSet<Character> set = new HashSet<Character>();

        int left = 0;
        int maxLen = 0;
        int start = 0;

        for(int right = 0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(right));
                left++;
            }
            set.add(str.charAt(right));

            if(right-left+1>maxLen){
                maxLen = right-left+1;
                start = left;
            }
        }

        String longest = str.substring(start,start+maxLen);
        System.out.println(longest);
        System.out.println(maxLen);
    }
}
