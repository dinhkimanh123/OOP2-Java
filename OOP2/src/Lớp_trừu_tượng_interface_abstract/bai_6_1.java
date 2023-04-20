package interface_abstract;

public class bai_6_1 {
}
abstract class shape {
    String color;
    boolean filled = false;

    public shape() {
        this.color = "red";
        this.filled = false;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString(){
        return "Shape [color = " + getColor()
                + "filled = " + isFilled();
    }
}
class Circle extends shape {
    double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAreaCircle(){
       return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return Math.PI * radius * 2;
    }
    public String toString(){
        return "Circle[Shape[color= " + super.getColor() +
                ",filled= " + super.isFilled();
    }
}
class Rectangle extends shape {
    double width;
    double lengh;
    public Rectangle(){
        this.width = 1.0;
        this.lengh = 1.0;
    }
    public Rectangle(double width, double lengh){
        this.width = width;
        this.lengh = lengh;
    }
    public Rectangle(double width, double lengh,String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.lengh = lengh;
    }

    public double getWidth() {
        return width;
    }

    public double getLengh() {
        return lengh;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }
    @Override
    public double getArea(){
        return width * width;
    }
    @Override
    public double getPerimeter(){
        return width + width * 2;
    }
    public String toString(){
        return "Rectangle[Shape[color= " + super.getColor() +
                ",filled= " + super.isFilled() +
                ",width= " + this.width +
                ",lenght= " + this.lengh;
    }
}
class Square extends Rectangle {
    double side;
    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public String toString(){
        return "Square[Shape[width= " + this.width +
                ",lenght= " + this.lengh;
    }
}
class Show_shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1,2);
        Square square1 = new Square(3,"blue",true);

        System.out.println(rectangle);
        System.out.println(square1);
    }
}


