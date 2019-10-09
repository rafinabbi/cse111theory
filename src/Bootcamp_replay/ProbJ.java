package Bootcamp_replay;

import java.util.Scanner;

public class ProbJ {
            public static void main(String[] args) {
                Scanner s= new Scanner(System.in);
                int sumu =0;
                int zumu =0;

                for (int i = 0; i <7 ; i++) {
                    sumu+= s.nextInt();
                }
                for (int i = 0; i <7 ; i++) {
                    zumu+= s.nextInt();;
                }
                if(sumu>zumu){
                    System.out.println("umair wins the buffet");
                }
                else{
                    System.out.println("zuaina wins the buffet");
                }
            }
        }