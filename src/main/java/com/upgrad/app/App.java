package com.upgrad.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the input string: ");

        // Read a line of input from the user
        String name = scanner.nextLine();

	int nameLength = name.length(); // Get the length of the name



        // Close the scanner to release resources
        scanner.close();

        // Display the user's input
        System.out.println("the string enterd is, " + name );
	
	System.out.println("the length of string is, " + nameLength );

    }
}

















