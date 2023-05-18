package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    public static void main(String[] args) {
        List<Integer> x1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer> x2 = x1.stream().filter(x -> x % 2 == 0).map(x -> x * 2).sorted().collect(Collectors.toList());
        System.out.println(x2);

        List<Integer> a1 = Arrays.asList(71, 72, 73, 74, 75, 76, 77, 78, 79, 80);
        List<Integer> collect = a1.stream().filter(n -> {
                    System.out.println("filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("Mapping" + n);
                    return n * n;
                })
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
