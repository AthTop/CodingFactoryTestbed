package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Gets user input for a year
 * and returns if it's leap or not
 */
public class LeapYearApp {

    public static void main(String[] args) {
        // Declarations
        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        boolean isLeap = false;

        // Data binding
        System.out.println("Insert year(integer): ");
        inputYear = in.nextInt();

        // Processing
        isLeap = (inputYear % 400) == 0 ||
                (inputYear % 4 == 0 && inputYear % 100 == 0) ; // A year is a leap year if it's fully dividable by 400
        if(!isLeap) {
            System.out.println(inputYear + " is not a leap year");
        } else {
            System.out.println(inputYear + " is a leap year");
        }
    }
}
