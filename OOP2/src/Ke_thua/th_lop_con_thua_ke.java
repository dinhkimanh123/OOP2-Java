package Ke_thua;

import java.util.Scanner;

public class th_lop_con_thua_ke {

}
class peopel {
    String name ;
    boolean gender ;
    int age;

    public peopel() {
        this.name = "tên mặc định ";
        this.gender = false;
        this.age = 0;
    }
    public peopel(String name, boolean gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println(" dang an... ");
    }
    public void sleep(){
        System.out.println(" dang ngu...");
    }
    @Override // cài đè //
    public String toString(){
        return "A people with name : " + getName()  + "\n"  + "Age : " + getAge() + "\n" + "gender : " + isGender();
    }


    public class Student extends peopel {
        private String classname;
        public Student(){
            super();
            this.classname = "d101_k14";
        }
        public Student (String classname){
            super();
            this.classname = classname;
        }
        public Student(String name, boolean gender, int age, String classname){
            super(name,gender,age);
            this.classname = classname;
        }
        public String getClassname(){
            return classname;
        }

        public void setClassname(String classname) {
            this.classname = classname;
        }
        public void study(){
            System.out.println("learning....");
        }
        @Override
        public String toString(){
            return "A student with class name" + getClassname() + "wich is subclass" + super.toString();
        }
    }
}
class employee extends peopel {
    String enterprise;
    public employee(){
        super();
        this.enterprise = "codegym";
    }
    public employee(String enterprise){
        super();
        this.enterprise = enterprise;
    }
    public employee(String name, boolean gender, int age, String enterprise){
        super(name,gender,age);
        this.enterprise = enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public void work(){
        System.out.println("work...");
    }
    @Override
    public String toString(){
        return "a employee.." + getEnterprise() + "which is.."+ super.toString();
    }
}
class show {
        public static void main(String[] args) {
            peopel peopel1 = new peopel();
            System.out.println(peopel1);
            peopel1 = new peopel("nguyen van a", false, 18);
            peopel1.setAge(20);
            System.out.println(peopel1);
        }
}



