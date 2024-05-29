package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μία απλή διαίρεση. Διαίρεση με 0
 * απαγορεύεται στους ακεραίους της Java.
 * Δίνει ArithmeticException.
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

        // Error conditions
        if (denominator == 0) {
            System.out.println("Error. Denominator can not be zero");
            System.exit(1);
        }
        if (numerator == 0) {
            System.out.println("Error. Numerator can not be zero");
            System.exit(1);
        }

        // Εντολές
        result = numerator / denominator;

        // Εκτύπωση αποτελέσματος
        System.out.println("Result: " + result);
    }
}
