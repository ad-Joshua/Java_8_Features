package lambdas.fun;

import java.util.function.Predicate;

public class Predicate1 {     //Boolean Result
    public static void main(String[] args) {
        Predicate<String> checkLength = str->  str.length()>5;

        boolean t = checkLength.test("Hello");
        System.out.println(t);
    }
}
