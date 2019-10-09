package Assignment_01;

import java.util.Scanner;

public class Input {
    Scanner s= new Scanner(System.in);
    int a= s.nextInt();
    int matrix1[][]= new int[a][a];
    int matrix2[][]= new int[a][a];
    public static void takeinput(int [][]x){
        Scanner s= new Scanner(System.in);
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                x[i][j]=s.nextInt();
            }
        }
    }
}