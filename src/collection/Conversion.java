package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Conversion {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("101,Joshua");
        al.add("102,Swaroop");
        al.add("103,John");

        System.out.println(al);

        HashMap<Integer, String> hp = new HashMap<>();
        for (String str: al) {
            String[] split = str.split(",");
            String keys = split[0];
            String values = split[1];
            hp.put(Integer.valueOf(keys), values);
        }

        System.out.println(hp);

        //----------------------------------------------

        String str1 = "100";
        String str2 = "200";
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);
        int  sum = x+y;
        System.out.println(sum);
    }
}
