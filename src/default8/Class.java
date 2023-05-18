package default8;

public class Class implements A,B,Z{
    public static void main(String[] args) {
        A a = new Class();
        B b = new Class(); // class upcasting
        Class c = new Class();// multiple inheritance is allowed at interface level
         c.test();           // but if we make the A,B as classes rather than interface then the problem
        a.test();            //occurs , so multiple inheritance is not allowed at class level.page 1.
        b.test();
        Z.test();

    }

    @Override
    public void test() {
        System.out.println("Hiiii");
    }
}
