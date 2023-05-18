package inheritance;

public class DogChild extends AnimalParent {
    public static void run_Static(){
        System.out.println("Dog is running");
    }
    @Override
    public void eat_Nonstatic(){
        System.out.println("Dog is eating");
    }
}
