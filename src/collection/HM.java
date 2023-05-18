package collection;

import java.util.HashMap;
import java.util.Map;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(1,"JNNCE");
        h1.put(2,"RV");
        System.out.println(h1);

        for (Map.Entry<Integer, String> hmap: h1.entrySet()) {
            Integer key = hmap.getKey();
            String value = hmap.getValue();
            System.out.println(key + " " + value);

        }
    }
}
