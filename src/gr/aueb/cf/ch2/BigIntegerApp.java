package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάση BigInteger ώστε να μην
 * έχουμε υπερχείληση (overflow)
 */
public class BigIntegerApp {

    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger("12345678912345678988888876446566");
        BigInteger myBigNum2 = new BigInteger("123456789745");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
        System.out.printf("The result is: %,d", result);
    }
}
