package study;

public class ValueOf1 {
    public static void main(String[] args) {
        String str1 = "100";
        String str2 = "200";
        int i1 = Integer.parseInt(str1);
        Integer i2 = Integer.valueOf(str2);
        String s = String.valueOf(i2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(s);
    }
}
