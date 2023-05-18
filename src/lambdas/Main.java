package lambdas;

public class Main {
    public static void main(String[] args) {
        MyInter my = new MyInterImpl();
        my.test();

        MyInter i = new MyInter() {
            @Override
            public void test() {
                System.out.println("my first anonymous class");
            }
        };
        MyInter i1 = new MyInter() {    // class A implements B
                                         //A a1 = new A();
            @Override
            public void test() {
                System.out.println("my second anonymous class ");
            }
        };

           i.test();
           i1.test();

        MyInter a = ()->{
            System.out.println("Lambdas expression");
            // this can be used for only functional interface which has only one abstract method
        };
        a.test();
        MyInter b = ()->System.out.println("Second Lambdas expression");
        b.test();

        SumInter s1 = new SumInter() {
            @Override
            public int sum(int a, int b)
            {
                return a+b ;
            }
        };
        int sum = s1.sum(2, 4);
        System.out.println(sum);



        SumInter z = (int p, int q)->{
            return p+q;
        };
        int sum1 = z.sum(4, 5);
        System.out.println(sum1);
        System.out.println(z.sum(6,6));
     //or
        SumInter z1 = (p,q)-> p+q;
        int sum2 = z1.sum(12, 11);
        System.out.println(sum2);

        LengthInter lg = (String str)-> {
            return str.length();
        };
        int name = lg.getLength("Swaroop");
        System.out.println(name);

        LengthInter lg2= (str) -> str.length();
        int name1 = lg2.getLength("Joshua");
        System.out.println(name1);
        System.out.println(lg2.getLength("sam"));
    }
}
