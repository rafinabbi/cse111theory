package Prep_b4_Final;

import java.util.Scanner;

public class trim {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String p= s.nextLine();
        String j[]=p.split(" ");
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i]+"\n");
        }

    }
}
