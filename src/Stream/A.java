package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> num1 = num.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(num1);

        List<Integer> no = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> no1 = no.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(no1);

        List<String> names = Arrays.asList("sam", "sham", "ram", "Sim", "kim");
        List<String> name = names.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
System.out.println(name);

        List<String> na = Arrays.asList("sam", "sham", "ram", "Sim", "kim");
        List<String> na1 = na.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(na1);

        List<String> n = Arrays.asList("sam", "sham", "ram", "sim", "kim");
        List<String> n1 = n.stream().filter(s -> s.startsWith("s")).collect(Collectors.toList());
        System.out.println(n1);

        List<Integer> number = Arrays.asList(2, 1, 4, 2, 5, 4, 3, 6, 21, 1);
        List<Integer> collect = number.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

}
