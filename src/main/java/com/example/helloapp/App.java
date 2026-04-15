package com.example.helloapp;
public class App {
    public static void main(String[] args) {
        // 1. Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // 2. Use an enhanced for loop to iterate through all arguments
            for (String name : args) {
                // Append each name followed by a delimiter
                nameBuilder.append(name).append(", ");
            }

            // 3. Remove the trailing comma and space (", ")
            // Always check length to avoid StringIndexOutOfBoundsException
            String names = "";
            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }

            // 4. Print the final formatted greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}