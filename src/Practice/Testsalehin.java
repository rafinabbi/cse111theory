package Practice;
import java.util.Scanner;
public class Testsalehin {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int[][] x = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int[][] y = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        print(x); //{{1,1,1},{2,2,2},{3,3,3}}

        print(y); //{{1,2,3},{4,5,6},{7,8,9}}


        swap(x, y);


        print(x); //{{1,2,3},{4,5,6},{7,8,9}}

        print(y); //{{1,1,1},{2,2,2},{3,3,3}}


        int[][] z = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}, {5, 5, 5}, {6, 6, 6}, {7, 7, 7}};


        int a[][] = reverseRow(z);


        print(z); //{{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}}


        print(a); //{{7,7,7},{6,6,6},{5,5,5},{4,4,4},{3,3,3},{2,2,2},{1,1,1}};


        int b[][] = join(x, y);


        print(b); //{{1,2,3},{4,5,6},{7,8,9},{1,1,1},{2,2,2},{3,3,3}}

    }

    public static void print(int [] []a){
        int result[][]= new int[a.length ][a[0].length];
        for (int i = 0; i<a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                result[i][j]=a[i][j];
            }
        }
        System.out.print("{");
        for (int i = 0; i <a.length ; i++) {
            System.out.print("{");
            for (int j = 0; j <a[0].length ; j++) {
                if(j==a[0].length-1){
                    System.out.print(result[i][j]);
                }
                else {
                    System.out.print(result[i][j] + ",");
                }
            }
            if(i==a.length-1){
                System.out.print("}");
            }
            else{
                System.out.print("},");
            }
        }
        System.out.print("}");
        System.out.println();

    }

    public static void swap(int[][] x, int[][] y) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                int temp = 0;
                temp = x[i][j];
                x[i][j] = y[i][j];
                y[i][j] = temp;

            }

        }

    }

    public static int[][] reverseRow(int [][]x){
        int k=x.length-1;
        int reverse[][]= new int[x.length][x[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                reverse[i][j]=x[k][j];
            }
            k--;
        }
        return reverse;
    }

    public static int[][] join(int[][] x, int[][] y) {
        int k = 0;

        int s[][] = new int[x.length + y.length][x[0].length];
        for (int i = 0; i < s.length; i++) {


            int l = 0;
            for (int j = 0; j < s[0].length; j++) {
                if (i < x.length)
                    s[i][j] = x[i][j];
                else {

                    s[i][j] = y[k][l];
                    l++;


                }

            }
            if (i >= x.length) {
                k++;


            }
        }
        return s;
    }
}
//You may need to code here