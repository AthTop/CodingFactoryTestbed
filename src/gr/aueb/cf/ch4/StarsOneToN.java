package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Prints user inputted n stars,
 * starting from 1 up to n
 */
public class StarsOneToN {

    public static void main(String[] args) {
        // Initialization
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // User input
        System.out.println("Input number of stars to print: ");
        n = scanner.nextInt();

        // Print stars
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
