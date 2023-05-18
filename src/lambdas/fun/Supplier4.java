package lambdas.fun;

import java.util.function.Supplier;

public class Supplier4 {
    public static void main(String[] args) {
        Supplier<Integer> sp = ()-> 10;
        Integer ir = sp.get();
        System.out.println(ir);
    }
}
