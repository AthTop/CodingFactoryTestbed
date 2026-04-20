package gr.aueb.cf.ch4.exercise3;

import java.util.Scanner;

/**
 * Takes in an integer and returns
 * the day of the week that matches that integer, in Greek.
 * i.e 1 should return "Δευτέρα"
 */
public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = 0;

        System.out.println("Give an integer from 1 to 7: ");
        inputInt = scanner.nextInt();

        switch (inputInt) {
            case 1 ->
                System.out.println("Δευτέρα");

            case 2 ->
                System.out.println("Τρίτη");
            case 3 ->
                System.out.println("Τετάρτη");
            case 4 ->
                System.out.println("Πέμπτη");
            case 5 ->
                System.out.println("Παρασκευή");
            case 6 ->
                System.out.println("Σάββατο");
            case 7 ->
                System.out.println("Κυριακή");
            default ->
                System.out.println("Please provide an integer between 1 and 7");
        }
    }
}
