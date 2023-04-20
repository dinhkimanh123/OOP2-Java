package interface_abstract;

 class person {
    public static void main(String[] args) {

        staff staff1 = new staff(" Tung ", 18 , true);
        System.out.println(staff1.name + staff1.age + staff1.gender);
        System.out.println(staff1.eat());
        System.out.println(staff1.sleep());
        System.out.println(staff1.study());

        studenImp studenImp1 = new studenImp(" kim " , 19 , false);
        System.out.println(studenImp1.name + studenImp1.age + studenImp1.gender);
        System.out.println(studenImp1.eat());
        System.out.println(studenImp1.sleep());
        System.out.println(studenImp1.study());
        
    }

}
abstract class People {
    String name;
    int age;
    boolean gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract String eat(); //  phương thức trừu tượng //
    public abstract String sleep();
    public abstract String study();
}
interface Student {
    void registerCourse(String course);
    void attendClass();
}
interface Employee {
    void work();
    void takeBreak();
}
class studenImp extends People implements Student {
    public studenImp(String name, int age, boolean gender) {
        super(name, age, gender);
    }
    @Override
    public String eat() {
        return "dang an";
    }
    @Override
    public String sleep(){
        return "dang ngu";
    }
    public String study(){
        return "dang hoc";
    }
    public void registerCourse(String course){
        System.out.println("Dang ki khoa hoc II ");
    }
    public void attendClass(){
        System.out.println("tham du lop D101_C2 ");
    }

}
class staff extends People implements Employee {
    public staff (String name, int age, boolean gender) {
        super(name, age, gender);
    }
    @Override
    public String eat() {
        return "dang an";
    }
    @Override
    public String sleep(){
        return "dang ngu";
    }
    public String study(){
        return "dang lam";
    }
    @Override
    public void work(){
        System.out.println("work");
    }
    @Override
    public void takeBreak(){
        System.out.println("nghỉ giải lao");
    }

}



