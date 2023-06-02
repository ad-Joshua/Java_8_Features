package study;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        Iterator<Object> itr = a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
