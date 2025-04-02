package com.bridgelabz.regex.Replace;

import java.util.Scanner;
public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter input with bad words: ");
        String input = sc.nextLine();

        // Replacing bad words
        String[] badWords = {"damn", "stupid", "bastard"};

        for(String word: badWords){
            input = input.replaceAll("(?i)\\b" + word + "\\b", "*****");
        }

        //Display censored sentence
        System.out.println("Censored Output: ");
        System.out.println(input);

        sc.close();
    }
}
