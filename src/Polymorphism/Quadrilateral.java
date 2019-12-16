package Polymorphism;

public class Quadrilateral {
    public static void main(String[] args) {
        Quadrilateral shape1 = new Quadrilateral();
        Object shape2 = new Kite();
        Quadrilateral shape3 = new Trapezium();
        Object shape4 = new Parallelogram();
        Parallelogram shape5 = new Rhombus();
        Quadrilateral shape6 = new Rectangle();
        Parallelogram shape7 = new Square();
        Rectangle shape8 = new Square();

    }
    public String name = "Quadrilateral";

    public void method1()
    {
        System.out.println("Quadrilateral 1");
    }
    public void method2()
    {
        System.out.println("Quadrilateral 2");
    }
    public void method3()
    {
        System.out.println("Quadrilateral 3");
    }
    public void method4()
    {
        System.out.println("Quadrilateral 4");
    }
    public String toString(){
        this.method4();
        return "This is Quadrilateral Class";
    }
}
class Trapezium extends Quadrilateral {
    public String name = "Trapezium";

    public void method1(){
        System.out.println("Trapezium 1");
    }

    public String toString(){
        return "This is a "+ name;
    }
}
class Kite extends Quadrilateral {
    public String name = "Kite";

    public void method1()
    {
        System.out.println("Kite 1");
    }
    public void method3()
    {
        System.out.println("Kite 3");
    }
    public void method4()
    {
        System.out.println("Kite 4");
    }
}
class Parallelogram extends Quadrilateral
{
    public String name = "Parallelogram";

    public void method3()
    {
        System.out.println("Parallelogram 3");
        super.method2();
        method4();
    }
}
class Rhombus extends Parallelogram
{
    public String name = "Rhombus";

    public void method1(){
        System.out.println(this);
        System.out.println("Rhombus 1");
    }

    public void method3(){
        super.method2();
        System.out.println("Rhombus 3");
    }

}
class Rectangle extends Parallelogram
{
    public String name = "Rectangle";

    public void method2(){
        method4();
        System.out.println("Rectangle 2");
        System.out.println(this);
    }

    public int compareTo(Rectangle a){
        if(a instanceof Rectangle){
            return 1;
        }else{
            return 0;
        }
    }

}
class Square extends Rectangle
{
    public String name = "Square";

    public void method1(){
        method3();
        System.out.println("Square 1");
    }

    public void method2(){
        super.method2();
        System.out.println("Square 2");
        method3();
    }
}






