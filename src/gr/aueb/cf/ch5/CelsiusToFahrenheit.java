package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Converts user input from Celsius to Fahrenheit
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        double result = 0;
        System.out.println("Please provide temperature in Celsius (in decimal): ");

        input = scanner.nextDouble();
        result = celsiusToFahrenheit(input);
        System.out.println(result);
    }

    /**
     * converts celsius input to fahrenheit
     * @param celsius celsius in double
     * @return fahrenheit in double
     */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * ( 9.0 / 5.0) + 32;
        return fahrenheit;
    }
}
