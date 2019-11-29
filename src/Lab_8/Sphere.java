package Lab_8;

public class Sphere extends Point{
    public Sphere(double r) {
        super(r);

    }
    double space(){
        return getRadius()*Math.PI*getRadius()*getRadius()*(4.0/3.0);
    }
}