package Bootcamp_replay;

import java.util.Scanner;

public class ProbC {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int z= s.nextInt();
            for (int i = 0; i <z ; i++) {
                String I = s.next();
                String J[]= I.split(" ");
//               for (int j = 0; j <I.length() ; j++) {
                String cleaned1 = I.replaceAll("[i]", "e");
                String cleaned2 = I.replaceAll("[e]", "a");
                String cleaned3 = I.replaceAll("[v]", "b");
                String cleaned4 = I.replaceAll("[u]", "o");
                String cleaned5 = I.replaceAll("[h]", "");
//                }

                    System.out.println(cleaned1);
                System.out.println(cleaned2);
                System.out.println(cleaned3);
                System.out.println(cleaned4);
                System.out.println(cleaned5);


//                boolean a = true;
//
////        System.out.println(cleaned);
//                for (int k = 0; k < cleaned.length() / 2; k++) {
//                    if (cleaned.charAt(k) != cleaned.charAt(cleaned.length() - 1 - k)) {
//                        a = false;
//                        break;
//                    }
//                }
//                if (a) {
//                    System.out.println("Palindrome");
//
//                } else {
//                    System.out.println("Not Palindrome");
//                }
//            }

        }
    }



}
