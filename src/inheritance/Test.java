package inheritance;

public class Test {
    public static void main(String[] args) {
        AnimalParent animalParent = new DogChild();

        animalParent.eat_Nonstatic();

        animalParent.run_Static();
        AnimalParent.run_Static();

        DogChild.run_Static();

        DogChild dogChild =new DogChild();
        dogChild.eat_Nonstatic();
        dogChild.run_Static();
        DogChild.run_Static();

        AnimalParent a = new AnimalParent();
        a.eat_Nonstatic();
    }
}
