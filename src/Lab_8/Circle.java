package Lab_8;

class Circle extends Point {

    public Circle(double r) {
        super(r);

    }
    double space(){
        return getRadius()*Math.PI*getRadius();
    }

}