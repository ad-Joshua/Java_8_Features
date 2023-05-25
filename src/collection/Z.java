package collection;

public class Z {
    int x ;
    Z(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        Z z1 = new Z(10);
        System.out.println(z1);
        System.out.println(z1.x);
        Integer i = new Integer(20);
        System.out.println(i);
    }
}
