import java.util.Scanner;

public class Array2DAssignment01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();

        int x [] []= new int [row] [column];
        for (int i = 0; i <row ; i++) {
            for (int j =0  ; j <=column ; j++) {
                x[i] [j]= s.nextInt();
                System.out.println(x[i] [j]);
            }
        }
    }
}