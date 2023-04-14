package Ke_thua;

public class th_dong_vat_ke_thua {

}
class animal {
    double wight;
    double height;

    public animal(){
        this.wight = 0.0;
        this.height = 0.0;
    }
    public animal(double wight,double height){
        this.wight = wight;
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public double getHeight() {
        return height;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return "A animal : " + getWight() + "with : " + getHeight() + "height : ";
    }
}
class cat extends animal {
    double age;

    public cat(){
        super();
        this.age = 1.0;
    }
    public cat(double age){
        super();
        this.age = age;
    }
    public cat(double wight, double height, double age) {
        super(wight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public String eat(){
        return "dang an..";
    }
    public String sound(){
        return "dang phat am thanh ";
    }
    @Override
    public String toString(){
        return "A cat age : " + getAge() + super.toString();
    }
}
class show_animal {
    public static void main(String[] args) {
        cat cat1 = new cat();
        System.out.println(cat1);

        cat1 = new cat(2);
        System.out.println(cat1);

        cat1 = new cat(3, 5,7 );
    }

}
