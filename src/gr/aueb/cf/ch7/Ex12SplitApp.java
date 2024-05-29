package gr.aueb.cf.ch7;

public class Ex12SplitApp {

    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";

        String[] tokens = s.split(" +"); // Αντί για κενό " " -> "\\s"

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
