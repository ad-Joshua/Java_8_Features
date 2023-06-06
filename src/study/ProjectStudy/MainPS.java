package study.ProjectStudy;

import Stream.List;

import java.util.ArrayList;

public class MainPS {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setId(1);
        a1.setName("Joshua");

        A a2 = new A();
        a2.setId(2);
        a2.setName("Swaroop");

        ArrayList<A> arrlist = new ArrayList<>();
        arrlist.add(a1);
        arrlist.add(a2);

        B<A> b1 = new B<>();
        b1.setListA(arrlist);
        b1.setTotalRecords(arrlist.size());

        ArrayList<A> al = b1.getListA();
        for (A a: al) {
         System.out.println("Id:"+a.getId()+", Name:" + a.getName());
        }
        System.out.println(b1.getTotalRecords());
    }
}
