package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * finds the highest among 3 integers
 */
public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please provide 3 integers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        System.out.printf("%d is the highest among %d %d %d", findMax(num1, num2, num3), num1, num2, num3);
    }

    /**
     * returns the biggest number among 3
     * @param num1 int
     * @param num2 int
     * @param num3 int
     * @return the biggest out of the 3 in int
     */
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
