package study;

public class Bean {
    private int x ;


    public Bean(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        Bean bn = new Bean(10);
        System.out.println(bn.x);
//        bn.x = 10;
//        System.out.println(bn.x);
//        bn.setX(10);
//        int x1 = bn.getX();
//        System.out.println(x1);
    }

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
}
