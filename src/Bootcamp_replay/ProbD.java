package Bootcamp_replay;

import java.util.Scanner;

public class ProbD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int z= s.nextInt();
        for (int i = 0; i <z ; i++) {
            String I = s.next();
            String cleaned = I.replaceAll("[^0-9]", "");
            boolean a = true;

//        System.out.println(cleaned);
            for (int k = 0; k < cleaned.length() / 2; k++) {
                if (cleaned.charAt(k) != cleaned.charAt(cleaned.length() - 1 - k)) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println("Palindrome");

            } else {
                System.out.println("Not Palindrome");
            }
        }

    }
}