package org.example.Problems;


import java.util.Scanner;

public class ReverseVowels {

    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if(str.trim().isEmpty()){
            System.out.println("Empty String");
            return;
        }

        for(int i=0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i))){
                System.out.println("Invalid String");
                return;
            }
        }
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            while(left<right && !isVowel(arr[left])){
                left++;
            }
            while(left<right && !isVowel(arr[right])){
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed String"+new String(arr));

    }
}
