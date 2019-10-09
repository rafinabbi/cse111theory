package Assignment_01;

public class Print {
    public static void print(int[][]x){

        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}