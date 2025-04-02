package com.bridgelabz.regex.Replace;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();

        // Method call
        replaceSpacesWithSpace(input);

         sc.close();
    }

    // Method to remove extra spaces
    public static void replaceSpacesWithSpace(String input){
        // Output String
        String output = input.replaceAll("\\s+", " ");

        System.out.println("After removing extra spaces: ");
        System.out.println(output);
    }
}
