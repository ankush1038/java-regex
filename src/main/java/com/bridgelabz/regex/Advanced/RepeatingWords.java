package com.bridgelabz.regex.Advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RepeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        // FInd repeating words
        repeatingWordsFinder(sentence);

        sc.close();
    }

    public static void repeatingWordsFinder(String sentence){
        sentence = sentence.toLowerCase();
        String words[] = sentence.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for(String word: words){
            map.put(word, map.getOrDefault(word,0) + 1);
        }

        System.out.println("Repeating Words: ");
        boolean found = false;

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " ");
                found = true;
            }
        }
        if (!found) System.out.println("none");
    }
}
