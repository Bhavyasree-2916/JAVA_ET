package org.example.Questions.IBM;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        System.out.println(Parking(new int[]{1,0,0,0,0}));
        }
        public static int Parking(int[] arr){
            int max = 0;
            int prev = -1;

            for(int i=0;i<arr.length;i++){
                if(arr[i] == 1){
                    if(prev == -1) {
                        max = i;
                    }
                    else {
                        max = Math.max(max, (i - prev) / 2);
                    }
                    prev=i;
                }

            }
            max = Math.max(max,arr.length-1-prev);
            return max;
        }
    }

