package Assignment_01;

public class Add_Subtract {
    public static void main(String[] args) {
        Input i= new Input();
        Add da= new Add();
        Sub su= new Sub();
        Print pa= new Print();
        i.takeinput(i.matrix1);
        i.takeinput(i.matrix2);
        int addition[][]=da.add(i.matrix1,i.matrix2);
        pa.print(addition);
        int subtraction[][]=su.sub(i.matrix1,i.matrix2);
        pa.print(subtraction);
    }

}
