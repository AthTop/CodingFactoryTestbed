package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Displays a menu and prompts user for a choice
 * then displays a message based on it
 */
public class MenuWithFeedbackApp {

    public static void main(String[] args) {
        // Declaration
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Main loop
        while(true) {
            System.out.println("Επιλέξτε μια επιλογή: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();
            if(choice < 1 || choice > 5) {
                System.out.println("Please provide values between 1 and 5");
                continue;
            }
            if(choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
                continue;
            }
            if(choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
                continue;
            }
            if(choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
                continue;
            }
            if(choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
                continue;
            }
            System.out.println("Thank you for using our app");
            break;
        }
    }
}
