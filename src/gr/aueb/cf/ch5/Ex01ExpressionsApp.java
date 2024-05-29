package gr.aueb.cf.ch5;


/**
 * Demo of float / double  expressions.
 */
public class Ex01ExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum;                // int, long, short, byte promotes to float
        resultDouble = doubleNum + floatNum + intNum;   // int, long, short, byte, float promotes to double

        System.out.printf("Result Float: %06.2f\t%e\t%g\n", resultFloat, resultFloat, resultFloat);
        System.out.printf("Result Double: %08.3f", resultDouble);
    }
}
