package Lab_8;

public class Tester {
    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);

        System.out.println("--------------------");

        rn = new ComplexNumber(5, 7);
        System.out.println(rn);

        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }
}
class RealNumber {
    private double realValue;
    public double getRealValue() {
        return realValue;
    }
    public void setRealValue(double r) {
        realValue = r;
    }
    public RealNumber() {
        this(0);
    }
    public RealNumber(double r) {
        setRealValue(r);
    }
    public String toString() {
        return "RealPart: "+getRealValue();
    }
    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
}
class ComplexNumber extends RealNumber{
    public ComplexNumber(int a, int b){

    }
    public ComplexNumber(){

    }
    public void check(){

    }
}