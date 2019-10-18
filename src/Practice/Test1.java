package Practice;

import java.util.Scanner;

public class Test1 {
//    public static int x,y;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        x = 0;
//        int y=0;
        int x=inputnao();
        int y=inputnao();
        print(x);
        print(y);
        int w=add(x,y);
        print(w);

    }
    public static int inputnao(){
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        return s;
    }



    public static int add(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static void print(int a){
        System.out.println(a);
    }

}
