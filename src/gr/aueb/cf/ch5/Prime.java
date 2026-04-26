package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Accepts an integer and returns if it's a prime number
 */
public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please provide a number: ");
        inputNum = scanner.nextInt();
        System.out.println(inputNum + " prime =  " + (isPrime(inputNum)));
    }

    /**
     * returns if a number is prime
     * @param num input integer
     * @return true/false if num is or isn't prime
     */
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
