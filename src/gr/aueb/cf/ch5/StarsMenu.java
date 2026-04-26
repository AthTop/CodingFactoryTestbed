package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Displays a menu and based on user input
 * displays user inputted n stars in various formations
 */
public class StarsMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        while (true) {
            menu();
            choice = getOneInt();
            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
            if (choice < 0 || choice > 6) {
                System.out.println("Please provide an integer between 1 and 6");
                continue;
            }
            handleChoice(choice);
        }
    }

    /**
     * prints out a menu for the user
     */
    public static void menu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * gets the next int in user input
     * @return user scanned int
     */
    public static int getOneInt() {
        return scanner.nextInt();
    }

    /**
     * prompts the user for number of stars to print
     * @return a positive or 0 integer
     */
    public static int getStarsInput() {
        int n = 0;
        System.out.println("Please give number of stars to print: ");
        n = getOneInt();
        while (n < 0) {
            System.out.println("Please provide a positive integer");
            n = getOneInt();
        }
        return n;
    }

    /**
     * handles user's choice
     * @param choice int > 0 and < 6
     */
    public static void handleChoice(int choice) {
        int numberOfStars = 0;
        numberOfStars = getStarsInput();
        switch (choice) {
            case 1 -> horizontalStars(numberOfStars);
            case 2 -> verticalStars(numberOfStars);
            case 3 -> gridStars(numberOfStars);
            case 4 -> oneToN(numberOfStars);
            case 5 -> nToOne(numberOfStars);
            default -> System.out.println("Invalid value provided. You should never see this");
        }
    }

    /**
     * prints out n stars horizontally
     * @param n int of stars to print
     */
    public static void horizontalStars(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print('*');
        }
    }

    /**
     * prints n stars vertically
     * @param n stars to print
     */
    public static void verticalStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println('*');
        }
    }

    /**
     * prints stars in a n x n pattern
     * @param n number of stars to print
     */
    public static void gridStars(int n) {
        for (int i = 0; i < n; i++) {
            horizontalStars(n);
            System.out.println();
        }
    }

    /**
     * prints out a grid of stars, starting with 1 up to n per line
     * @param n lines and highest amount of stars to print
     */
    public static void oneToN(int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(i);
            System.out.println();
        }
    }

    /**
     * prints out a grid of stars, starting with n down to 1 per line
     * @param n lines and highest amount of stars to print
     */
    public static void nToOne(int n) {
        for (int i = n; i > 0; i--) {
            horizontalStars(i);
            System.out.println();
        }
    }
}
