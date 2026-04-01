package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates taxi cost for a distance
 */
public class TaxiCostApp {

    public static void main(String[] args) {
        // Declaration and initialization
        Scanner scanner = new Scanner(System.in);
        final int STARTING_COST = 300; // cents
        final int COST_PER_KM = 74; // cents
        int distanceInput = 0;
        int cost = 0;
        int euro = 0;
        int cents = 0;

        // Get user input
        System.out.println("Δώσε χιλιόμετρα: ");
        distanceInput = scanner.nextInt();

        // Calculate cost
        cost = STARTING_COST + distanceInput * COST_PER_KM;
        euro = cost / 100; // get euros from cost
        cents = cost % 100; // get cents from cost

        // Print result
        System.out.printf("Κόστος: %d ευρώ και %d λεπτά%n", euro, cents);
    }
}
