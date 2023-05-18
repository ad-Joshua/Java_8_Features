package lambdas.fun;

import java.util.function.Function;

public class Function3 {
    public static void main(String[] args) {
        Function<Integer, String> i = t -> {
            int i1 = t * 10;
            return "Multiplication done";
        };
        String str = i.apply(2);
        System.out.println(str);
    }
}
