package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class List<S> {
    public static void main(String[] args) {
//        java.util.List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
//        ArrayList<Integer> l1 = new ArrayList<>();
//        for (Integer i: list1) {              //without streams
//            if(i%2==0){                      //using foreach and if condition
//                l1.add(i);
//            }
//
//        }
//        System.out.println(l1);        //stream is an interface in utils has alot of functions ,builtin methods
//
//        java.util.List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
//        java.util.List<Integer>  list = list2.stream()
//                .filter(x -> x % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(list);


        //--------------------------------------------------------------------------------------------
        java.util.List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        ArrayList<Object> upperCaseNames = new ArrayList<>();
        for (String name : names) {
            String upperCase = name.toUpperCase();
            upperCaseNames.add(upperCase);
        }

//        for (Object name: upperCaseNames) {   // here we are taking arraylist and converting it normal object and then
//            System.out.println(name);        // print the object which is nit in the form of an array
//        }

        System.out.println(upperCaseNames);  //here we are printing the arraylist whose op is in the form of array
        //-------------------------------------------------------------------------------------

        java.util.List<String> stringList = Arrays.asList("John", "Jane", "Jack", "Jill");
        java.util.List<String> sl = stringList.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(sl);
        //----------------------------------------------------------------
        java.util.List<String> stringList2 = Arrays.asList("John", "Jane", "Jack", "Jill");
        stringList2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                //.forEach(System.out::println)
//                .forEach(x-> {System.out.print(x+" ");
//                              System.out.println("hi");});
                .forEach(x->System.out.println(x));






        //----------------------------------------------------------------
        // methods of creating list
        //1
        //java.util.List<Integer> lst1 = java.util.List.of(1, 2, 3, 4, 5, 6);
        //lst1.add(10);// in the list created by list.of() we cannot add new objects or values

        //2
//        ArrayList<Integer> lst2 = new ArrayList<>();
//        lst2.add(19);
//        lst2.add(29);    //arraylist is dynamic array, initial size of arraylist is 10, when its filled it increases to 1.5x

        //3
        //  java.util.List<Integer> lst3 = Arrays.asList(1, 2, 3, 4, 5, 6); // this is also a unmodifiable list


        //--------------------------------------------------------------------------------------------------

        //        java.util.List<Integer> collect = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//        java.util.List<Integer> collect1 = list.stream().filter(i -> i > 2).collect(Collectors.toList());
//        System.out.println(collect1);
//       Stream<Integer> stream = list.stream();
//        java.util.List<Integer> collect2 = stream.map(i -> i * 2).collect(Collectors.toList());
//        System.out.println(collect2);
    }


}
