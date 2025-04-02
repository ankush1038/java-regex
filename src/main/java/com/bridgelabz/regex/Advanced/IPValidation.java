package com.bridgelabz.regex.Advanced;

import java.util.Scanner;

public class IPValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter an IP address: ");
        String ipAdress = sc.nextLine();

        // Validate IP
        if(isValidIp(ipAdress)){
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }
    }

    public static boolean isValidIp(String ipAddress){
        // Regular expression for validation
        String regex = "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        return ipAddress.matches(regex);
    }
}
