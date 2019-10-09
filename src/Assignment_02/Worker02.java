package Assignment_02;

public class Worker02 {
    public static int[] copy(int[]x) {
        int a[]= new int[x.length];
        for (int i = 0; i <x.length ; i++) {
            a[i]= x[i];
        }
      return a;
    }
    public static int[] join(int[]x,int[]y){
        int a[]= new int[x.length+y.length];
        for (int i = 0; i <x.length ; i++) {
            a[i]= x[i];
        }
        for (int i =x.length; i <x.length+y.length ; i++) {
            a[i]= y[i-x.length];
        }
        return a;
    }
    public static int[] copyRef(int []x){
        int a[]= new int[x.length];
        a=x;
//        for (int i = 0; i <x.length ; i++) {
//            a[i]= x[i];
//        }
        return a;
    }
    public static int add(int x,int y){
        return x+y;
        }
    }

