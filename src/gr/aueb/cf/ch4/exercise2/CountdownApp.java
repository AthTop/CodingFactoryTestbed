package gr.aueb.cf.ch4.exercise2;

/**
 * Prints out ints from 1 to 10,
 * in reverse, starting from 10
 */
public class CountdownApp {

    public static void main(String[] args) {
        final int n = 10;

        for (int i = n; i > 0; i--){
            System.out.println(i);
        }
    }
}
