package gr.aueb.cf.ch4.exercise2;

/**
 * Prints the sum of all ints
 * between 1 and 50
 */
public class IntSumApp {
    public static void main(String[] args) {
        final int n = 50;
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
