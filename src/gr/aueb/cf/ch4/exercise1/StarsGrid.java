package gr.aueb.cf.ch4.exercise1;

import java.util.Scanner;

/**
 * Prints user inputted n stars in a n x n grid
 */
public class StarsGrid {

    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // User input
        System.out.println("Input number of stars to print: ");
        n = scanner.nextInt();

        // Print stars
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
