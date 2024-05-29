package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητσ υψηλή. Ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμαμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι.
 *
 * @author DimDrk
 */
public class LightOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        boolean lights = false;
        int speed = 0;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert current speed");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        lights = isRaining && (isDark || isRunning);

        System.out.println("Lights are on: " + lights);

    }
}
