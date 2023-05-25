package collection;

public class ForEach1 {
    public static void main(String[] args) {
        int sum = 0;
        int [] x = {1,2,3,4,5};
        for (int y: x) {
            sum =sum+y;

        }
        System.out.println(sum);
    }
}
