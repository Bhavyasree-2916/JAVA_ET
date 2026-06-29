package org.example.Problems;

import java.util.Scanner;

public class FirstLastPos{

    static int firstPosition(long[] arr, long x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int lastPosition(long[] arr, long x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Invalid Input: The number of elements must be at least 1.");
            return;
        }

        long[] arr = new long[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();

            if (arr[i] < -1000000000L || arr[i] > 1000000000L) {
                System.out.println("Invalid Input: Array elements must be between -1000000000 and 1000000000.");
                return;
            }
        }

        System.out.print("Enter the element to find: ");
        long x = sc.nextLong();

        int first = firstPosition(arr, x);
        int last = lastPosition(arr, x);

        System.out.println(first + " " + last);
    }
}
