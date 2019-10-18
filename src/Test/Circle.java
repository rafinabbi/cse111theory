package Test;

public class Circle {
    private double radius=1.0;
    private String colour="red";
    private double area;

    public Circle(){
        this.setArea(area);
        this.getArea();
        this.setRadius(radius);
        this.getRadius();

    }

    public Circle(double radius){
        this.setRadius(radius);
        this.getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
