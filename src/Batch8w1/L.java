package Batch8w1;

import java.util.Scanner;

public class L {
        static int  d;
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int x= s.nextInt();
            String q= s.nextLine();
            for (int i = 0; i < x; i++) {
                String a=s.nextLine();
                String m []=a.split("");
                for (int j = 0; j <a.length() ; j++) {
                    if(m[j].equals("a")||m[j].equals("d")||m[j].equals("g")||m[j].equals("j")||m[j].equals("m")||m[j].equals("p")||m[j].equals("t")||m[j].equals("w")||m[j].equals(" ")){
                        d=d+1;
                    }
                    if(m[j].equals("b")||m[j].equals("e")||m[j].equals("h")||m[j].equals("k")||m[j].equals("n")||m[j].equals("q")||m[j].equals("u")||m[j].equals("x")){
                        d=d+2;
                    }
                    if(m[j].equals("c")||m[j].equals("f")||m[j].equals("j")||m[j].equals("l")||m[j].equals("o")||m[j].equals("r")||m[j].equals("v")||m[j].equals("y")){
                        d=d+3;
                    }
                    if(m[j].equals("s")||m[j].equals("z")){
                        d=d+4;
                    }
                }
                System.out.println(d);
                d=0;
            }
        }
    }
