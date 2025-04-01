package com.bridgelabz.regex;

import java.util.Scanner;
public class LicensePlateValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a license plate number: ");
        String licensePlate = sc.nextLine();

        // Validate license plate
        if(isValidLicensePlate(licensePlate)){
            System.out.println("Valid License Plate");
        } else{
            System.out.println("Invalid License Plate");
        }
        sc.close();
    }

    // Method to validate license plate
    public static boolean isValidLicensePlate(String licensePlate){
        // Regular expression
        String regex = "^[A-Z]{2}\\d{4}$";

        // Check license plate matches the pattern
        return licensePlate.matches(regex);

    }
}
