package Assignment_01;

public class Mul {
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
        System.out.println("Multiplication of those Matrix:");
        return multiplication;
    }
}
