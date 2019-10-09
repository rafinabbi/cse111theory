package Bootcamp_replay;

import java.util.Arrays;
import java.util.Scanner;

public class ProbF {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        int a[]= new int[x];
        for (int i = 0; i <x ; i++) {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
      for (int i = 0; i <x ; i++) {
          if (i == x-1) {
              System.out.print(a[i]);
          } else {
              System.out.print(a[i] + ",");
          }
      }

    }
}
