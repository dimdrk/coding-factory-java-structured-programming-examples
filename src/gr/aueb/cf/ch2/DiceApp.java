package gr.aueb.cf.ch2;

/**
 *
 *
 * @author DimDrk
 */
public class DiceApp {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;       // Ψευδοτυχαία Random
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("%d, %d", die1, die2);
    }
}
