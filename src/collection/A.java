package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class A {
    int x;
    String y;
    A(int x, String y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        A a1 = new A(1, "Joshua");
        A a2 = new A(2, "Swaroop");

        ArrayList<A> a = new ArrayList();
        a.add(a1);
        a.add(a2);
        System.out.println(a1.x);
        System.out.println(a2);
        System.out.println(a);

//        sum();
    }

//    public void sum(){
//        System.out.println(100);
//    }

}
