package Online_Judge;

import java.util.Scanner;

public class H26_10_19 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a =s.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int x=a*i;
                System.out.println(a+" x " + i + " = " + (x));
        }
    }
}
