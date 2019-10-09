package Assignment_01;

public class Multiplication {
    public static void main(String[] args) {
        Mul gun= new Mul();
        Input i= new Input();
        Print pa= new Print();
        i.takeinput(i.matrix1);
        i.takeinput(i.matrix2);
        int multiplication[][]=gun.mul(i.matrix1,i.matrix2);
        pa.print(multiplication);
    }
}
