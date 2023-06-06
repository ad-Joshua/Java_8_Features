package inheritance;

public class Test {
    public static void main(String[] args) {
        AnimalParent animalParent = new DogChild();  // class upcasting i.e, storing child class object in parent class ref variable

        animalParent.eat_Nonstatic();

//        if(animalParent instanceof DogChild){
//            DogChild d1 = (DogChild) animalParent;
//            d1.eat_Nonstatic();
//        }   class down casting, here animalParent is a ref variable of parent class/object which consists of DogChild object

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
