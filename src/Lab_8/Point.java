package Lab_8;
//Task03
public class Point {
    private double radius;
    Point ( double r) {
        radius = r;
    }
    double space ( ) {
        System.out.println("Space for a Point can’t be defined");
        return 0;
    }
    protected double getRadius(){
        return radius;
    }
}
