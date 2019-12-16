package Prep_b4_Final.Mock;

public class CarTesterA {
    public static void main(String[] args) {
        Lamborghini car1 = new Lamborghini("Yellow", "Lamborginni", "Garraldo");
        Lamborghini car2 = new Lamborghini("Yellow", "Lamborginni", "Huracan");
        Lamborghini car3 = (Lamborghini) car1;
        car1.setTopSpeed(349);
        car1.move();
        System.out.println("==================");
        car2.setTopSpeed(444);
        car2.move();
        System.out.println("==================");
        car3.move();
        System.out.println("==================");
        System.out.println(car1.totalCars());
        System.out.println(car3.totalCars());
    }
}
