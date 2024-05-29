package gr.aueb.cf.ch7;

/**
 * String copy
 */
public class Ex10StrCopy {

    public static void main(String[] args) {
        String s1 ="Athens";
        String s2 = copyStr(s1);

        System.out.println(s2);
        s2 = "Paris";

        System.out.println(s1);
        System.out.println(s2);
    }

    public static String copyStr(String s) {
        return s;
    }
}
