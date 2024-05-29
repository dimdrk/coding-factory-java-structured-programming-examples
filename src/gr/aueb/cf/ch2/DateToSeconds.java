package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ακέραιους που συμβολίζουν ημέρες, ώρες,
 * λεπτά, δευτερόλεπτα και μετατρέπει σε συνολικά δευτερόλεπτα.
 *
 * @author DimDrk
 */
public class DateToSeconds {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner in = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;

        // Εντολές.
        System.out.println("Please insert days");
        days = in.nextInt();
        System.out.println("Please insert hours");
        hours = in.nextInt();
        System.out.println("Please insert nimutes");
        minutes = in.nextInt();
        System.out.println("Please insert seconds");
        seconds = in.nextInt();

        days = days * SECS_PER_DAY;
        hours = hours * SECS_PER_HOUR;
        minutes = minutes * SECS_PER_MINUTE;
        totalSeconds = days + hours + minutes + seconds;

        // Εκτύπωση αποτελέσμος.
        System.out.printf("Total Second: %,d", totalSeconds);

    }
}
