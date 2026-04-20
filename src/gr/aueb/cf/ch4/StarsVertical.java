package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Prints n, user inputted, stars vertically
 */
public class StarsVertical {

    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // User input
        System.out.println("Input number of stars to print: ");
        n = scanner.nextInt();

        // Print stars
        for(int i = 0; i < n; i++) {
            System.out.println('*');
        }
    }
}
