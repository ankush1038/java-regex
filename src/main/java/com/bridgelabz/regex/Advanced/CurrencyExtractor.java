package com.bridgelabz.regex.Advanced;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter text: ");
        String currency = sc.nextLine();

        // Method to extract currency
        currencyExtractor(currency);

        sc.close();
    }
    public static void currencyExtractor(String currency){
        // Regular expression

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(currency);

        // Print extracted currency values
        System.out.println("Extracted Currency Values:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

    }
}
