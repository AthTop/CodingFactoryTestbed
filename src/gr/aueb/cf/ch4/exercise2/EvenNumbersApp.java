package gr.aueb.cf.ch4.exercise2;

/**
 * Prints all even numbers between 1 and 20
 */
public class EvenNumbersApp {

    public static void main(String[] args) {
        final int n = 20;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
