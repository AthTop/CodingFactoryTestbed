package gr.aueb.cf.ch10;

import java.util.Arrays;

/**
 * An implementation of the famous Tic-Tac-Toe game
 * using the console as a visual interface
 */
public class TicTacToe {
    public static final int ROWS = 3;
    public static final int COLUMNS = 3;
    public static int[][] gameBoard = new int[ROWS][COLUMNS];

    /**
     * Main game loop, control flow and user I/O
     * @param args none used
     */
    public static void main(String[] args) {
        printGrid();
    }

    public static boolean placeMove(int player, int row, int column) {
        return false;
    }

    public static boolean isWin(int player) {
        return false;
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
        int count = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                if (gameBoard[j][i] == player) count++;
            }
        }
        return count == 3;
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
        return count == 3;
    }

    public static boolean isAntiDiagonalWin(int player) {
        return false;
    }

    /**
     * Prints the game board in a nice 3x3 grid
     * Player 1 is printed as O
     * Player is printed as X
     * Unmarked cells are marked with an empty space
     */
    public static void printGrid() {
        for (int[] line : gameBoard) {
            String lineString = Arrays.toString(line);
            String formatedLine = lineString
                    .substring(1, lineString.length() - 1)
                    .replace("1", "O")
                    .replace("2", "X")
                    .replace("0", " ")
                    .replace(",", " |");
            System.out.print("| " + formatedLine + " |");
            System.out.println();
        }
    }
}
