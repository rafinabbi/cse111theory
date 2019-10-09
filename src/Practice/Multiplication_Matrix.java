package Practice;

import java.util.Scanner;

public class Multiplication_Matrix {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int matrix1[][]= new int[a][a];
        int matrix2[][]= new int[a][a];
        takeinput(matrix1);
        takeinput(matrix2);
        int multiplication[][]=mul(matrix1,matrix2);
        print(multiplication);
    }
    public static void takeinput(int [][]x){
        Scanner s= new Scanner(System.in);
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                x[i][j]=s.nextInt();
            }
        }
    }
    public static void print(int[][]x){
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] mul(int [][]x,int[][]y){
        int multiplication[][]= new int[x.length][x[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                int index=0;
                int k= 0;
                for (int l = 0; l <x.length ; l++) {
                    index+=x[i][k++]*y[l][j];
                }
                multiplication[i][j]=index;
            }
        }
        return multiplication;
    }
}
