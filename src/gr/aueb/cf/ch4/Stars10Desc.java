package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές με,
 * 1η σειρά -> 10 αστεράκια,
 * 2η σειρά -> 9 αστεράκια,
 * κ.ο.κ.
 */
public class Stars10Desc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Δεύτερος τρόπος
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
