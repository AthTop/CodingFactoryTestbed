package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * An implementation of the famous Tic-Tac-Toe game
 * using the console as a visual interface
 */

public class TicTacToe {
    public static final int ROWS = 3;
    public static final int COLUMNS = 3;
    public static int[][] gameBoard = new int[ROWS][COLUMNS];
    public static int occupiedPositions = 0;

    /**
     * Main game loop, control flow, and user I/O
     * @param args none used
     */
    public static void main(String[] args) {
        int activePlayer = 1;
        int row = 0;
        int col = 0;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Player " + activePlayer + " is playing");
            // input logic
            while (true) {
                System.out.println("Please enter your row placement (1-3): ");
                input = scanner.nextLine();
                while (!isValidInput(input)) {
                    System.out.println("Please provide a number between 1 and 3");
                    input = scanner.nextLine();
                }
                row = Integer.parseInt(input);

                System.out.println("Please enter your column placement (1-3): ");
                input = scanner.nextLine();
                while (!isValidInput(input)) {
                    System.out.println("Please provide a number between 1 and 3");
                    input = scanner.nextLine();
                }
                col = Integer.parseInt(input);

                if (!placeMove(activePlayer, row - 1, col - 1)) {
                    System.out.println("Position is unavailable, try again.");
                    continue;
                }
                break;
            }
            printGrid();
            if (isWin(activePlayer)) {
                System.out.println("Player " + activePlayer + " wins!");
                break;
            }
            if (isTie()) {
                System.out.println("It's a tie, no more available positions!");
                break;
            }
            activePlayer = 3 - activePlayer; // returns 2 if player = 1, 1 if player = 2
        }
    }

    /**
     * checks if the string is 1, 2,  or 3
     * @param s input string
     * @return true if the string is "1", "2" or "3"
     */
    public static boolean isValidInput(String s) {
        return s.matches("[1-3]");
    }

    /**
     * Attempts to place a player mark on the gameboard
     * Expects row and length in 0-2 range, or 0-gameboard.length - 1
     * @param player int representing the player
     * @param row int representing the row to place marker at(outer array)
     * @param column int representing the column to place marker at (inner array)
     * @return true if marker placed, false if spot is occupied
     */
    public static boolean placeMove(int player, int row, int column) {
        if (gameBoard[row][column] != 0) return false;
        gameBoard[row][column] = player;
        occupiedPositions++;
        return true;
    }

    /**
     * Checks if a ny win condition applies
     * @param player int player to check for
     * @return true if any condition matches, otherwise false
     */
    public static boolean isWin(int player) {
        return isRowWin(player)
                || isColumnWin(player)
                || isAntiDiagonalWin(player)
                || isMainDiagonalWin(player);
    }

    /**
     * Checks if all positions in the gameboard are occupied
     * @return true if all occupied, false otherwise
     */
    public static boolean isTie() {
        return occupiedPositions == ROWS * COLUMNS;
    }

    /**
     * Loops through the gameboard and checks if the same player
     * marks all cells in a row
     * @param player int representing the player to check for
     * @return true if the player marks all cells in a row, otherwise false
     */
    public static boolean isRowWin(int player) {
        for (int[] row : gameBoard) {
            int count = 0;
            for (int cell : row) {
                if (cell == player) count++;
            }
            if (count == row.length) return true;
        }
        return false;
    }

    /**
     * Loops through the gameboard and checks if the same player
     * marks are all cells in a column
     * @param player int representing the player to check for
     * @return true if the player marks all cells in a column, otherwise false
     */
    public static boolean isColumnWin(int player) {
        for (int i = 0; i < gameBoard.length; i++) {
            int count = 0;
            for (int j = 0; j < gameBoard.length; j++) {
                if (gameBoard[j][i] == player) count++;
            }
            if (count == gameBoard.length) return true;
        }
        return false;
    }

    /**
     * checks the gameboard diagonally for player marks
     * @param player int representing the player to check for
     * @return true if the player marks the diagonal, otherwise false
     */
    public static boolean isMainDiagonalWin(int player) {
        int count = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][i] == player) count++;
        }
        return count == gameBoard.length;
    }

    /**
     * checks the gameboard anti-diagonally for player marks
     * @param player int representing the player to check for
     * @return true if the player marks the anti-diagonal, otherwise false
     */
    public static boolean isAntiDiagonalWin(int player) {
        int count = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][gameBoard.length - 1 - i] == player) count++;
        }
        return count == gameBoard.length;
    }

    /**
     * Prints the game board in a nice 3x3 grid
     * Player 1 is printed as O
     * Player 2 is printed as X
     * Unmarked cells are marked with a .
     */
    public static void printGrid() {
        for (int[] row : gameBoard) {
            System.out.print("| ");
            for (int cell : row) {
                char symbol = cell == 1 ? 'O' : cell == 2 ? 'X' : '.';
                System.out.print(symbol + " | ");
            }
            System.out.println();
        }
    }
}
