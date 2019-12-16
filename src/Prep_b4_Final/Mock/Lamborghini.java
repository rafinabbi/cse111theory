package Prep_b4_Final.Mock;

public class Lamborghini extends Car {
    private int topSpeed;

    public Lamborghini(String a, String b, String c) {
        super(a,c,b);
    }

    public void setTopSpeed(int i) {
        this.topSpeed = i;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void move() {
        System.out.println(manufacturer+" is moving\n" +
                "Top Speed of "+topSpeed);
    }

    public int totalCars() {
        return carCount;
    }

//    @Override
//    public void move() {
//
//    }
}
