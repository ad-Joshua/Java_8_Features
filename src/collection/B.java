package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class B {
    public static void main(String[] args) {
        HashSet b = new HashSet();
        b.add(10);
        b.add("jj");
        b.add(true);
        System.out.println(b);

        String s = "hello";
        String concat = s.concat(" Joshua");
        System.out.println(concat);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
