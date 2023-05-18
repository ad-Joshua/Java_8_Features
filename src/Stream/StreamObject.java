package Stream;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        String [] names = {"Joshua", "Swaroop", "John", "Naveen"};
        Stream<String> names1 = Stream.of(names);
        names1.forEach(e->{
            System.out.println(e);
        });

    }
}
