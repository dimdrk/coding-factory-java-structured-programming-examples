package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n.
 * Δηλαδή n! = 1*2*3*...*n.
 */
public class FactorialApp {

    public static void main(String[] args) {
        // Δήλωση & Αρχικοποίηση τιμών.
        Scanner in = new Scanner(System.in);
        int facto = 1;
        int n = 0;
        int i = 1;

        // Εντολές.
        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            facto = facto * i;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων.
        System.out.printf("%d! = %,d\n", n, facto);
    }
}
