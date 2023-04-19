package Lớp_trừu_tượng_interface_abstract;

public class th_Animal_interface_Edible {
}
class animal {
    public abstract class Animal { // lop truu tuong //
        public abstract String makeSound();// pthuc truu tuong//
    }
}
class tiger extends animal {
    public String makeSound(){
        return " Tiger ";
    }
}
class Chicken extends animal {
    public String makeSound(){
        return " Chicken ";
    }
}
interface edible {
    public interface Edible {
        String eat();
    }
}
 class chicken extends animal implements edible {
     public String makeSound(){
         return "chicken : cluck";
     }
     public String eat(){
         return "could be";
     }
 }




