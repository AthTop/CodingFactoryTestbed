package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Squares an integer using methods
 */
public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        System.out.println("Please provide an integer: ");
        inputNum = scanner.nextInt();
        System.out.printf("%d^2 = %d%n", inputNum, square(inputNum));
    }

    /**
     * returns the square of num
     * @param num an integer
     * @return num squared
     */
    public static int square(int num) {
        return num * num;
    }
}
