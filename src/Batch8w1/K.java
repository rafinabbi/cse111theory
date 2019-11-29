package Batch8w1;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        int i=1;
        while (i > 0){
            x1=s.nextInt();
            y1=s.nextInt();
            x2=s.nextInt();
            y2=s.nextInt();
            int x,y = 0;
            if(x1==0 && y1==0 && x2==0 &&y2==0 ){
                break;
            }
            if(x1>x2){
                x=x1-x2;
            }
            else {
                x=x2-x1;
            }
            if(y1>y2){
                y=y1-y2;
            }
            else{
                y=y2-y1;
            }
            if(x==0 && y==0){
                System.out.println("0");
            }
            else if(x==y||x==0||y==0){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }
    }
}
