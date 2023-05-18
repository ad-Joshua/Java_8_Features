package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rohit", "Sam", "Sanjay", "Sunil", "Tim", "Kim", "Sham", "Sanam");
        List<String> collect = names.stream().filter(n -> {
                    System.out.println("Filtering" + n);
                    return n.endsWith("m");
                })
                .map(String::toUpperCase)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
