package Java14_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_4 {
    public static void main(String[] args) {
        String regex = "(.*\\++.*)";
        System.out.println("(1 + 8) – 9 / 4: " + "(1 + 8) – 9 / 4".matches(regex));
        System.out.println("6 / 5 – 2 * 9: " + "(6 / 5 – 2 * 9".matches(regex));

    }
}
