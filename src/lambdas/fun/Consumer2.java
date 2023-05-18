package lambdas.fun;

import java.util.function.Consumer;

public class Consumer2 {       //No Result
    public static void main(String[] args) {
        Person p = new Person();      // when object is created person class non static variables n non static methods
        Consumer<Person> setName = t -> t.setName("Josh");   //are stored in p reference variable.
        setName.accept(p);
        System.out.println(p.getName());

    }
}
