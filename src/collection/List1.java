package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<List<Integer>> numberLists = new ArrayList<>();  //       [[1,2,3] , [4,5,6], [7,8,9]]
                                                              //index      0          1        2
        numberLists.add(Arrays.asList(1, 2, 3));
        numberLists.add(Arrays.asList(4, 5, 6));
        numberLists.add(Arrays.asList(7, 8, 9));

        for (List<Integer> numberList : numberLists) {  //-----> // numberList[0]= [1,2,3]
            for (int number : numberList) {                     // numberList[1]= [4,5,6]
                System.out.print(number + " ");                  // numberList[3]= [7,8,9]
            }
            System.out.println();
        }


        List<Integer> num = Arrays.asList(1,2,3);
        for (int x: num) {
            System.out.print(x+" ");
        }


                                //1 iteration
    }                           //List<Integer> numberList = Arrays.asList{1,2,3}
}                               // for( int number : numberList){
                                //    System.out.print(number + " ");
