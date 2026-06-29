package org.example.Problems;

//Cognizant
import java.util.Scanner;

public class LitresKmProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of litres to fill the tank");
        double litres = sc.nextDouble();

        if(litres<=0){
            System.out.printf("%.0f is an invalid input",litres);
            return;
        }

        System.out.println("Enter distance covered");
        double distance = sc.nextDouble();

        if(distance<=0){
            System.out.printf("%.0f is an invalid input",distance);
            return;
        }

        double litresper100km = (litres/distance) * 100;

        double miles = distance * 0.6214;
        double gallons = litres * 0.2642;

        double milespergallon = miles/gallons;

        System.out.println("Liters/100KM");

        System.out.printf("%.2f%n", litresper100km);

        System.out.println("Miles/gallons");
        System.out.printf("%.2f%n", milespergallon);
    }
}
