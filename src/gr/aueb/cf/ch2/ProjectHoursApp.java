package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Gets work hours, employees and
 * calculates hours per employee.
 * Remainder hours go to project manager
 */
public class ProjectHoursApp {

    public static void main(String[] args) {
        // Declaration and initialization
        Scanner scanner = new Scanner(System.in);
        int employeesInput = 0;
        int totalHoursInput = 0;
        int hoursPerEmployee = 0;
        int remainderHours = 0;

        // Get user input
        System.out.println("Εισάγετε αριθμό εργαζομένων και ώρες που χρειάζεται το project: ");
        employeesInput = scanner.nextInt();
        totalHoursInput = scanner.nextInt();

        // Calculate
        hoursPerEmployee = totalHoursInput / employeesInput;
        remainderHours = totalHoursInput % employeesInput;

        // Display result
        System.out.printf("Κάθε εργαζόμενος: %d ώρες. Ώρες που περισσεύουν: %d%n", hoursPerEmployee, remainderHours);
    }
}
