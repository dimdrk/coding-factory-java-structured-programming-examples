package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει τους θετικούς αριθμούς που δίνει
 * ο χρήστης μέχρι να δώσει αρνητικό.
 */
public class PositivesCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivecount = 0;

        System.out.println("Please insert a num (<0 for exit)");
        //num = in.nextInt();

        while ((num = in.nextInt()) >= 0 ) {
            positivecount++;
            System.out.println("Please insert a num (<0 for exit)");
            //num = in.nextInt();
        }

        System.out.println("Positives count: " + positivecount);
    }
}
