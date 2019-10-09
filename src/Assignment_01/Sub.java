package Assignment_01;

public class Sub {
    public static int[][] sub(int [][]x,int[][]y){
        int subtraction[][]= new int[x.length][x[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                subtraction[i][j]=x[i][j]-y[i][j];
            }
        }
        System.out.println("Subtraction of those Matrix: ");
        return subtraction;
    }
}
