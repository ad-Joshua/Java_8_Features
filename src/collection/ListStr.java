package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStr {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Joshua", "Swaroop", "John");
        List<String> name = new ArrayList<>();
        name.addAll(names);
        System.out.println(name);


    }
}
