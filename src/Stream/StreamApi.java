package Stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
//        List<String> list1 = Arrays.asList("Samuel","Suresh", "Rohit", "Raina", "Sam","Simran");
//        List<String> collect = list1.stream().filter(s -> s.startsWith("S"))
//             .map(String::toUpperCase)  //instead of lambdas expression we can use method ref to improve readability
//             .collect(Collectors.toList());
//        System.out.println(collect);

        List<String> list = Arrays.asList("Samuel", "Suresh", "Rohit", "Raina", "Sam", "Simran");
        List<String> collect = list.stream().filter(s -> s.startsWith("S"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);

        List<List<Integer>> listList = Arrays.asList(Arrays.asList(1, 2, 3,4), Arrays.asList(4, 5));
        List<Integer> coll = listList.stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(coll);

        List<String> stringList = Arrays.asList("Swaroop", "Sam", "Suresh", "Samuel", "Samson", "Samrat");
//        stringList.stream()
//                .map(s -> s.toLowerCase())
//                .collect(Collectors.toList())  //without using reference method
//                .forEach(s->System.out.println(s));

        stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
