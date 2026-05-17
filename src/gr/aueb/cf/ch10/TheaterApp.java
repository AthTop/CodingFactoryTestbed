package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * App to manage and book theater seats,
 * in 30-row, 12-column theater
 */
public class TheaterApp {
    public static final int ROWS = 30;
    public static final int COLS = 12;
    // boolean arrays default to false values when initialized
    public static boolean[][] theaterSeats = new boolean[ROWS][COLS];

    /**
     * Handles menu printing, user I/O and exiting
     * @param args none are used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String inputChoice = "";
        int row = 0;
        char column = 0;
        while (true) {
            // Menu
            System.out.println("Welcome to the theater app.");
            System.out.println("Please choose an action: ");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel booking");
            System.out.println("3. Exit");
            inputChoice = scanner.nextLine();
            if (!inputChoice.matches("[1-3]")) continue;
            if (inputChoice.matches("3")) {
                System.out.println("Thank your for using our app.");
                break;
            }

            // Seat Input
            System.out.println("Please enter seat number (A-L, 1-30): (example C23) ");
            input = scanner.nextLine().trim().toUpperCase();
            while (!isValidInput(input)) {
                System.out.println("Please provide a valid seat number");
                input = scanner.nextLine().trim().toUpperCase();
            }
            column = input.charAt(0);
            row = Integer.parseInt(input.substring(1)) - 1;
            switch (inputChoice) {
                case "1" -> {
                    try {
                        book(column, row);
                        System.out.println("Seat booked successfully.");
                    } catch (Exception e) {
                        System.out.println("Seat not available.");
                    }
                }
                case "2" -> {
                    try {
                        cancel(column, row);
                        System.out.println("Seat unbooked successfully.");
                    } catch (Exception e) {
                        System.out.println("Seat is not booked..");
                    }
                }
                default -> System.out.println("You should never see this");
            }
        }
    }

    public static boolean isValidInput(String str) {
        if (str.trim().length() < 2 || str.trim().length() > 3) return false;
        char a = str.charAt(0);
        try{
            int b = Integer.parseInt(str.substring(1));
            return isValidColumn(a) && isValidRow(b);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * helper method to verify that row input is within array bounds
     * @param row int
     * @return true if within bounds, otherwise false
     */
    public static boolean isValidRow(int row) {
        return row > 0 && row <= 30;
    }

    /**
     * helper method to verify if column input is within array bounds
     * @param column int column input
     * @return true if within bounds, otherwise false
     */
    public static boolean isValidColumn(char column) {
        return column >= 'A' && column <= 'L';
    }

    /**
     * Attempts to book a seat by setting it to true
     * @param column A-L column of the seat
     * @param row 0-29
     * @throws Exception thrown if a seat is booked
     */
    public static void book(char column, int row) throws Exception {
        try {
            if (theaterSeats[row][charColToInt(column)]) throw new Exception("Seat is already booked");
            theaterSeats[row][charColToInt(column)] = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    /**
     * Attempts to cancel a booking, setting the array position to false
     * @param column A-L column of the seat
     * @param row 0-29 row of the seat
     * @throws Exception thrown if a seat isn't booked
     */
    public static void cancel(char column, int row) throws Exception {
        try {
            if (!theaterSeats[row][charColToInt(column)]) throw new Exception("Seat is not booked");
            theaterSeats[row][charColToInt(column)] = false;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    /**
     * helps convert the A-L columns to ints for the array index
     * @param col char (A-L)
     * @return 0 for A, 1 for B... 11 for L
     */
    public static int charColToInt(char col) {
        return col - 'A';
    }
}
