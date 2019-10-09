package Bootcamp_replay;

import java.util.Scanner;

public class ProbI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int a[] = new int[x];
        int k = s.nextInt();
        int count=0;
        for (int i = 0; i < k; i++) {
            int b = s.nextInt();
            int c = s.nextInt();
            for (int j = 0; j <a.length; j++) {
                for (int l = c; l <=b ; l++) {
                    if (a[j] >= l){
                    count++;
                    }
                }

            }
        }
        System.out.println(x-count);
    }
}
