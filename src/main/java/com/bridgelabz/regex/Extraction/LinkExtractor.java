package com.bridgelabz.regex.Extraction;

import java.util.Scanner;
import java.util.regex.*;

public class LinkExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Extract and print URLs
        extractLink(sentence);

        sc.close();
    }

    // Method to extract URLs
    public static void extractLink(String sentence){
        // Regular expression
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[^\\s]";

        // Pattern compilation
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        // Extract and print Links
        System.out.println("Extracted links: ");
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
