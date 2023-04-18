package Ke_thua;

import java.util.Date;

public class Circle_Cylinder {

}
class circle {
    String PI;
    String coler;
    double radius;
    public circle(){
        this.PI = "3.14";
        this.coler = "xanh";

    }
    public circle(String PI,String coler){
        this.PI = PI;
        this.coler = coler;
    }

    public String getPI() {
        return PI;
    }

    public String getColer() {
        return coler;
    }

    public double getRadius() {
        return radius;
    }

    public void setPI(String PI) {
        this.PI = PI;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Circle : " + getPI() + " mau : " + getColer() + " r : " + getRadius();
    }
}
class cylinder extends circle {
    double height;
    public cylinder(){
        super();
        this.height = 1;
    }
    public cylinder(double height){
        super();
        this.height = height;
    }
    public cylinder(String color, double radius, double height){
        super();
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "cylinder : " + getPI() + "  : " + getColer() + " r : " + getRadius() + " height : " + getHeight();
    }
}
class show_circle_cylinder {
    public static void main(String[] args) {
        circle circle1 = new circle();
        System.out.println(circle1);

         cylinder cylinder1 = new cylinder();
         cylinder1 = new cylinder(2);
        System.out.println(cylinder1);

    }
}
