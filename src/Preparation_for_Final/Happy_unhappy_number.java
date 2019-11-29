package Preparation_for_Final;

import java.util.*;

public class Happy_unhappy_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        String g;
        int a = s.nextInt();
        //String a=s.nextLine();
        int c = (int) Math.pow(a, 2);
        g = Integer.toString(c);
        String b[] = g.split("");

        for (int i = 0; sum==1 ; i++) {
            for (int j = 0; j<b.length; j++) {
                int h = Integer.parseInt(b[j]);
                sum += (int) Math.pow(h, 2);
            }
        }



    }
}
