package gr.aueb.cf.ch5;

/**
 * Προσθέτει δύο ακεραίους με τη χρήση
 * μεθόδου.
 */
public class Ex07AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b);     // Πλήρες όνομα AppApp.add()

        System.out.printf("%d + %d = %d", a, b, result);
//        System.out.println("Result: " + result);
    }


    /**
     * Adds two integers.
     *
     * @param a     the first integer.
     * @param b     the second integer.
     * @return      the sum of the two integers.
     */
    public static int add(int a, int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;

        return a + b;
    }
}
