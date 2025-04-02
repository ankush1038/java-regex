package com.bridgelabz.regex.Extraction;

import java.util.Scanner;
import java.util.regex.*;

public class CapitalisedWordsExtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        extractCapitalWords(sentence);

        sc.close();
    }

    public static void extractCapitalWords(String sentence){
        // Defining regular expression
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Extracted Capitalised Words: ");
        while (matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }
}
