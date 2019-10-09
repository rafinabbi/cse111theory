package Class_Practice;

import java.util.Scanner;

public class AddingTest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Input i= new Input();
        Add da= new Add();
        Print pa= new Print();
        i.takeinput(i.matrix1);
        i.takeinput(i.matrix2);
        int addition[][]=da.add(i.matrix1,i.matrix2);
        pa.print(addition);
    }
}