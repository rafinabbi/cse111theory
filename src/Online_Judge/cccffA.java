package Online_Judge;

import java.util.*;

public class cccffA {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int sum = 0;
        for (int i = 0; i <x ; i++) {
            int a= s.nextInt();
            int b=s.nextInt();
            for (int j = 1; j <= a; j++) {
                sum+=(int)Math.pow(j,2);
            }
            System.out.println(sum);
        }
    }
}
