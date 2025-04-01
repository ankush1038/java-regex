package com.bridgelabz.regex.Extraction;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;

public class EmailExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        //Extract and print email Address
        extractEmail(text);

        sc.close();
    }

    // Method to extract email
    public static void extractEmail(String text){
        // Regular expression to match email address
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        
        // Compile pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Print found email addresses
        System.out.println("Extracted Email Addresses: ");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
/*
Enter text:
My email is ankush1029@gmail.com and my friends' is ansh2323@chitkara.edu.in

Extracted Email Addresses:
ankush1029@gmail.com
ansh2323@chitkara.edu.in

 */
