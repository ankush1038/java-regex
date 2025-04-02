package com.bridgelabz.regex.Advanced;

import java.util.Scanner;
import java.util.regex.*;

public class SSNValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter SSN number: ");
        String number = sc.nextLine();

        // Method to validate SSN number
        isValidSSN(number);

        sc.close();
    }

    // Method to check valid SSN
    public static void isValidSSN(String number){
        // Regular expression for SSN validation
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        boolean found = false;
        System.out.println();
        while (matcher.find()){
            System.out.println(matcher.group() + " is valid");
            found = true;
        }

        if(!found){
            System.out.println("Invalid SSN number");
        }
    }
}
