package interface_abstract;

public class bai_6_4 {
    public static void main(String[] args) {
        movablePointt movablePointt1 = new movablePointt(2,3,4,5);
        System.out.println(movablePointt1);

        MovableCircle movableCircle1 = new MovableCircle(6,7,8,9,1);
        System.out.println(movableCircle1);


    }
}
interface movaablee {
    public  abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
}
class movablePointt implements movaablee {
    int x,y,xS,yS;
    public movablePointt(int x, int y, int xS, int yS){
        this.x = x;
        this.y = y;
        this.xS = xS;
        this.yS = yS;
    }
    public String toString(){
        return "(" + x + "," + y + ")" + "speed( " + xS + "," + yS + " )";
    }
    public void moveUp(){
        y = yS;
    }
    public void moveDown(){
        y = yS;
    }
    public void moveLeft(){
        x = xS;
    }
    public void moveRight(){
        x = xS;
    }
}
class MovableCircle extends movablePointt implements movaablee {
    int radius;
    MovableCircle center;
    public MovableCircle(int x, int y, int xS, int yS, int radius){
        super(x, y, xS, yS);
        this.radius = radius;
        this.center = center;
    }
    public String toString(){
        return "(" + x + "," + y + ")" + "speed( " + xS + "," + yS + " ) " + ", " + " r = " + radius ;

    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }
}