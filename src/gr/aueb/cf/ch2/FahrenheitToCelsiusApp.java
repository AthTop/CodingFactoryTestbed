package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts Fahrenheit temperature to Celsius
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        // Declarations and initialization
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        // Ask user for input
        System.out.println("Εισάγετε θερμοκρασία σε Fahrenheit: ");
        fahrenheit = scanner.nextInt();

        // Convert input
        celsius = 5 * (fahrenheit -32) / 9; // formula to convert f to c

        // Display result
        System.out.printf("Fahrenheit: %d, Celsius: %d%n", fahrenheit, celsius);
    }
}
