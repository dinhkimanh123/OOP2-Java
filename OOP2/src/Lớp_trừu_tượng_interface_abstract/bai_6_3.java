package interface_abstract;

public class bai_6_3 {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(2,3,4,5);
        System.out.println(movablePoint1);
    }
}
interface Movaable {
    public abstract void Movaable();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}
 class MovablePoint implements Movaable {
    int x,y,xS,yS;
    public MovablePoint(int x, int y, int xS, int yS){
        this.x = x;
        this.y = y;
        this.xS = xS;
        this.yS = yS;
    }

    public String toString(){
        return "(" + x + "," + y + ")" + "speed( " + xS + "," + yS + " )";
    }
    public void Movaable(){
        y = -yS;
    }
    public void moveDown(){
        y = +yS;
    }
    public void moveLeft(){
        x = -xS;
    }
    public void moveRight(){
        x = +xS;
    }
}