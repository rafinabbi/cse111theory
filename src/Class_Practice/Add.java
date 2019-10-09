package Class_Practice;

public class Add {
    public static int[][] add(int [][]x,int[][]y){
        int addition[][]= new int[x.length][x[0].length];
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j <x[0].length ; j++) {
                addition[i][j]=x[i][j]+y[i][j];
            }
        }
        return addition;
    }
}
