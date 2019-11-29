package Lab_8;

public class Vehicle2010 extends Vehicle {
    public void moveLowerLeft() {
       moveDown();
       moveLeft();
    }
    public void moveUpperLeft() {
        moveUp();
        moveLeft();
    }
    public void moveLowerRight() {
        x=x++;
        y=y--;
    }
    public void moveUpperRight() {
        x=x++;
        y=y++;
    }
    public boolean equals(Vehicle2010 a){
        if(super.x==a.x && super.y==a.y){
            return true;
        }
        return false;
    }

}
