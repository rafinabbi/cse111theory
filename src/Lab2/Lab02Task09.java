package Lab2;

import java.util.Scanner;

public class Lab02Task09 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a []= new int [10];
//        int b[] = new int[10];
//        int c[]=new int[10];
        int count=0;
        int count2=0;
        for (int i = 0; i <10 ; i++) {
            a[i]= s.nextInt();
            if(a[i]%2!=0){
                count++;
//                b[i]=a[i];
            }
            else{
                count2++;
//                c[i]=a[i];
            }
        }
        int b[] = new int[count];
        int c[]=new int[count2];
        for (int i = 0; i <b.length ; i++) {
            if(a[i]%2!=0){
               b[i]=a[i];
            }
            else{

               c[i]=a[i];
            }
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+""+c[i]);
        }

    }
}
