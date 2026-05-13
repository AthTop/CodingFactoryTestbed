package gr.aueb.cf.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * A class mimicking a very simple bank with deposit and withdraw versions
 * and some basic exception handling
 */
public class SimpleBank {
    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    /**
     * Gets and handles user choice and amount
     * @param args none
     */
    public static void main(String[] args) {
        double amount = 0;
        int choice = 0;

        System.out.println("Balance: " + balance);
        while (true) {
            System.out.println("Please select: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) continue;
            break;
        }
        System.out.println("Please enter amount: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number: ");
            scanner.nextLine();
        }
        amount = scanner.nextDouble();
        try {
            switch (choice) {
                case 1 -> deposit(amount);
                case 2 -> withdraw((amount));
                default -> System.out.println("You shouldn't ever see this");
            }
            System.out.println("New balance is: " + balance);
        } catch (Exception e) {
            System.out.println("Can't process the transaction.");
        }
    }

    /**
     * increases balance by amount
     * @param amount double, amount to increase balance by
     * @throws Exception amount can't be negative exception
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount can't be negative");
            balance += amount;
        }
        catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }


    /**
     * decreases balance by amount
     * @param amount double, amount to decrease balance by
     * @throws Exception amount can't be negative exception
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Amount can't be negative");
            if (balance < amount) throw new Exception("Not enough balance");
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e;
        }
    }
}
