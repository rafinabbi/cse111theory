package Assignment_01;

import java.util.Scanner;

public class Add_Subtr {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int matrix1[][]= new int[a][a];
        int matrix2[][]= new int[a][a];
        takeinput(matrix1);
        takeinput(matrix2);
        int addition[][]=add(matrix1,matrix2);
        print(addition);
    }
    public static int[][] add(int [][]x,int[][]y){
        int addition[][]= new int[x.length][x[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                addition[i][j]=x[i][j]+y[i][j];
            }
        }
        return addition;
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
}
