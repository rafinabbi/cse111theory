package Test;

import java.util.*;

public class Palndrm {
    public static void main(String[] args) {
        //String s=new String();
        Scanner bob = new Scanner(System.in);
        System.out.println("koyta");
        int a = bob.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("de");
            String date = bob.next();
            String[] n = date.split("/");
            int count=0;
//            boolean d = true;
//            int x=0;
//            int y=0;
            for (int j = 0; j <n.length/2 ; j++) {
                if (n[j] == n[(n.length - 1) - j]) {
                   count++;
                }

            }
            if(count==n.length/2){
                System.out.println("palindrome");
                }
                else {
                System.out.println("not palindrome");
            }

          }
        }

    }
