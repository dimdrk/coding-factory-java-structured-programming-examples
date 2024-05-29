package gr.aueb.cf.ch5;

/**
 * Μετατρέπει βαθμούς Fahrenheit σε Celsius.
 */
public class Ex15FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        for (int i = -100; i <= 100; i += 10) {
            System.out.printf("%4d\u2109\t=\t%6.2f\u2103\n", i, getCelsiusFromFahrenheit(i));
        }
    }

    /**
     * COnverts Fahrenheit to Celsius.
     * @param fahrenheitDegrees
     *          the input in Fahrenheit degrees.
     * @return
     *          celsius degrees after converting from fahrenheit.
     */
    public static double getCelsiusFromFahrenheit(double fahrenheitDegrees) {
        return (fahrenheitDegrees - 32) * 5 / 9;
    }
}
