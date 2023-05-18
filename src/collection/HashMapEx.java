package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    String name;
    String College;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public HashMapEx(String name, String college) {
        this.name = name;
        College = college;
    }

    public static void main(String[] args) {
        HashMap<Integer, HashMapEx> hp = new HashMap<>();

        hp.put(1, new HashMapEx("Joshua Swaroop", "JNNCE"));
        hp.put(2, new HashMapEx("John", "RV College"));

        System.out.println(hp);
        for (Map.Entry<Integer, HashMapEx> entry : hp.entrySet()) {
            Integer key = entry.getKey();
            HashMapEx value = entry.getValue();
            System.out.println(key + ")" + "Name:" + value.getName() + "," + "College: " + value.getCollege());
        }
    }

}
