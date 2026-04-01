package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Asks for 3 ints and displays them in a DD/MM/YYYY format
 */

public class DateApp {

    public static void main(String[] args) {
        // Declarations and initialization
        Scanner scanner = new Scanner(System.in);
        int dayInput = 0;
        int monthInput = 0;
        int yearInput = 0;
        int yearToDisplay = 0;

        // Get user input
        System.out.println("Δώσε ήμερα, μήνα και έτος σε μορφή '5 3 2026");
        dayInput = scanner.nextInt();
        monthInput = scanner.nextInt();
        yearInput = scanner.nextInt();

        // Convert year input
        yearToDisplay = yearInput % 1000;

        // Display date
        System.out.printf("%02d/%02d/%d", dayInput, monthInput, yearToDisplay);
    }
}
