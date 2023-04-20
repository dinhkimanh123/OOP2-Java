package interface_abstract;

public class bai_6_2 {

}
//  giao diện có tên GeometricObject, chứa 2 phương thức abstract là getArea()và getPerimeter()//
interface GeometricObject {
    double getArea();
    double getPerimeter();
}
class Circle2 implements GeometricObject {
    double radius;
    public Circle2(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return "Circle[radius = " + getRadius();
    }
}
class Retangle2 implements GeometricObject {
    double width;
    double lenght;
    public Retangle2(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
    public String toString(){
        return "Rectangle[width = " + getWidth()
                + "length = " + getLenght();
    }
}
class show_GeometricObject {
    public static void main(String[] args) {
        Circle2 circle23 = new Circle2(2);
        System.out.println(circle23);
        System.out.println("Area : " + circle23.getArea());
        System.out.println("getPerimeter : " + circle23.getPerimeter());


        Retangle2 retangle23 = new Retangle2(3,4);
        System.out.println(retangle23);
        System.out.println("Area : " + retangle23.getArea());
        System.out.println("getPerimeter : " + retangle23.getPerimeter());
    }
}
