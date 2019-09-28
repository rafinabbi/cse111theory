package Practice;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("1st matrix's row digit");
        int a= s.nextInt();
        System.out.println("1st matrix's column digit");
        int b= s.nextInt();
        System.out.println("2nd matrix's row digit");
        int c= s.nextInt();
        System.out.println("2nd matrix's column digit");
        int d = s.nextInt();
        int x[][] = new int[a][b];
        int y[][] = new int[c][d];
//        int r[] []= new int[a][d];

        takeInput(x);
        takeInput(y);
        int r[] []= multiply2D(x,y);
        print(r);
    }
    public static int [][] multiply2D(int a[][],int b[][]){
        int result [][]= new int [a.length][b[0].length];
        if(a.length==b[0].length){
            for (int i=0;i<result.length;i++){
                for (int j=0;j<result[0].length;j++){
                    int index=0;
                    int k=0;
                    for (int l=0; l < b.length; l++) {
                        index+=a[i][k++]*b[l][j];
                    }
                    result[i][j]=index;
                }
            }
        }
        else
            System.out.println("Matrixes cannot be multipled");
        return result;
    }
    public static void takeInput(int [] [] array) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = in.nextInt();
            }
        }
    }
    public static void print(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}
