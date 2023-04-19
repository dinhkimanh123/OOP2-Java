package interface_abstract;

public class animal_cat {
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new catt();
        for (Animal animal1 : animals
             ) {
            System.out.println(animal1.makesound());

            if (animal1 instanceof catt) {
                Edible edible1 = (catt) animal1 ;
                System.out.println(edible1.howtoEat());
            }
        }
    }

}
abstract class Animal {
    public abstract String makesound();
}

interface Edible {
    String howtoEat();
}

class catt extends  Animal implements  Edible{
    public String makesound() {
        return "cat : meo meo ";
    }

    public  String howtoEat(){
        return "eat";
    }
}
