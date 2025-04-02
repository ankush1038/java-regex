package com.bridgelabz.regex.Advanced;

import java.util.regex.*;
import java.util.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regular expression to match capitalized words
        String regex = "\\b[A-Z][a-zA-Z]+\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // List to store extracted words
        List<String> extractedWords = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            extractedWords.add(matcher.group());
        }

        // Print extracted words
        System.out.println("Extracted Words: " + String.join(", ", extractedWords));
    }
}

