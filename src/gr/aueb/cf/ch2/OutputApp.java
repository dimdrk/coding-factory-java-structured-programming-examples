package gr.aueb.cf.ch2;

import java.util.Locale;

/**
 * Output Deom.
 *
 * @author DimDrk
 */
public class OutputApp {

    public static void main(String[] args) {
        int num = 1;
        long num2 = 20000L;

        System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is %d", num);
        System.out.printf(Locale.forLanguageTag("el"), "Num is: %02d, Num2 is: %,d", num, num2);
    }
}
