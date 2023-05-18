package lambdas;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0; i<=10;i++){
                System.out.println("Value of index" + i);
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

    }
}
