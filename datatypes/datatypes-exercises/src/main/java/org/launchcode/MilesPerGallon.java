package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many miles you have driven:");
        double miles = input.nextInt();
        System.out.println("Enter how much gas you consumed (in gallons):");
        double gallons = input.nextInt();
        input.close();

        double mpg = miles / gallons;
        System.out.println("Your car gets " + mpg + " mpg.");
    }
}
