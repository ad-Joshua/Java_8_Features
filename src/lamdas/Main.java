package lamdas;

public class Main {
    public static void main(String[] args) {
        Inter inter = new InterImpl();   //1
        inter.sayHello();                //2

        Inter fA = new Inter() {         //1
            @Override
            public void sayHello()
            {
                System.out.println("First anonymous class");
            }
        };
        fA.sayHello();             //2

        Inter sA = new Inter() {      //1
            @Override
            public void sayHello()
            {
                System.out.println("Second anonymous class");
            }
        };
         sA.sayHello();             //2

        Inter i = ()->{
            System.out.println("Lambdas");
        };
        i.sayHello();

    }
}
