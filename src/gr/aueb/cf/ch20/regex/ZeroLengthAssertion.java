package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroLengthAssertion {

    public static void main(String[] args) {
        String password = "C0d1ngF@ct0ry";

    Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[1-9])(?=.*?[!@#$%^&*()~+=_])^.{8,}$");
        Matcher matcher = pattern.matcher(password);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
