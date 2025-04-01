package com.bridgelabz.regex.BasicRegex;

import java.util.Scanner;
public class HexColorValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a hex color code: ");
        String colorCode = sc.nextLine();

        // Validate hex color
        if(isValidHexColor(colorCode)){
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }
    }

    public static boolean isValidHexColor(String colorCode){
        // Regular expression to match hex color code
        String regex = "^#[0-9A-Fa-f]{6}$";

        // Check if color code matches the pattern
        return colorCode.matches(regex);
    }
}
