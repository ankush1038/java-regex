package com.bridgelabz.regex.Advanced;

import java.util.Scanner;
public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a credit card number: ");
        String cardNumber = sc.nextLine();

        // Check validation
        if(isValidCardNumber(cardNumber)){
            System.out.println("Valid Card Number");
        } else {
            System.out.println("Invalid Card number");
        }

        sc.close();
    }

    // Method to check validation
    public static boolean isValidCardNumber(String cardNumber){
        // Regular expression to check validity
        String regex = "^(4\\d{15}|5\\d{15})$";

        return cardNumber.matches(regex);
    }
}
