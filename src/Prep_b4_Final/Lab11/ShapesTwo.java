package Prep_b4_Final.Lab11;


//    public class ShapesTwo{
//        publicstaticvoid main(String[] args){
//        int n = 3;
//        Shape[] shapes = new Shape[n];
//
//        shapes[0] = new Circle(5, 10, 2.0);
//        shapes[1] = new Rectangle(40, 10, 3.25, 5.75);
//        shapes[2] = new Circle(15, 30, 4.0);
//
//        for (int i = 0; i < n; i++){
//        System.out.println(i + ") " + shapes[i].getArea() + " at " +shapes[i].getX() + ", " +
//        shapes[i].getY());
//        }
//        }
//        }

 class Point {
    private int my_xPos;
    private int my_yPos;

    public Point(int x, int y) {
        my_xPos = x;
        my_yPos = y;
    }

    public int getX() {
        return my_xPos;
    }

    public int getY() {
        return my_yPos;
    }
}
class Rectangle{
    private Point my_upperLeft;
    private double my_width;
    private double my_height;

    public Rectangle(int x, int y, double height, double width){
        my_upperLeft = new Point(x, y);
        my_width = width;
        my_height = height;
    }

    public int getX()  {
        return my_upperLeft.getX();
    }

    public int getY()  {
        return my_upperLeft.getY();
    }

    public double getArea() {
        return my_width * my_height;
    }
}

class Circle{
    private Point my_upperLeftCorner;
    private double my_radius;

    public Circle(int x, int y,  double diameter) {
        my_upperLeftCorner= new Point(x,y);
        my_radius = diameter / 2;
    }

    public int getX() {
        return my_upperLeftCorner.getX();
    }

    public int getY() {
        return my_upperLeftCorner.getY();
    }

    public double getArea(){
        return Math.PI*Math.pow(my_radius,2);
    }
}
