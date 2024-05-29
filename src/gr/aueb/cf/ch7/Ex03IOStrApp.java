package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Ex03IOStrApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = in.next();         // Διαβάζει μέχρι να βρει whitespaces ή \t ή \n
        s2 = in.nextLine();     // Διαβάζει μέχρι να βρει \n, το καταναλώνει αλλά δεν το αποδίδει

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
