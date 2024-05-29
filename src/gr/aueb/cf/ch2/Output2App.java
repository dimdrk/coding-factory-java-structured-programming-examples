package gr.aueb.cf.ch2;

/**
 * Template for programming.
 * Πολλαπλασιάζει δύο ακεραίους και εκτυπώνει
 * το αποτέλεσμα στην κονσόλα.
 *
 * @author DimDrk
 */
public class Output2App {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        int price = 100;
        int quantity = 500;
        int totalPrice = 0;

        // Εντολές
        totalPrice = price * quantity;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("Price: %d, Quantity: %3d, Total Price: %,d", price, quantity, totalPrice);
    }
}
