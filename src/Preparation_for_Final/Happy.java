package Preparation_for_Final;

import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        for (int i = 1; i <=x ; i++) {
            int n = s.nextInt();
            if (happycheck(n)) System.out.println("Case #"+i+": "+n+" is a Happy number.");
            else System.out.println("Case #"+i+": "+n+" is  an Unhappy number.");
        }
    }

    public static int square(int n) {
        int sum = 0;
        while (n!= 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static boolean happycheck(int n) {
        int s, f;
        s = f = n;
        do {
            s = square(s);

            f = square(square(f));
        }
        while (s != f);

        return (s == 1);
    }

}