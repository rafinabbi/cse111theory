package Bootcamp_replay;

import java.util.Scanner;
import java.lang.Math;
        public class ProbH{
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);

                int a,m;
                String n;
                int T=s.nextInt();

                for(int x=1;x<=T;x++){
                    a= s.nextInt();
                    n=s.next();
                    m=s.nextInt();
                    if(n.length()==1){
                        int h=(int)Math.pow(a,(int)(n.charAt(0)-'0'));
                        System.out.println("Case "+x+": "+(h%m));
                    }
                    else{
                        if(a==m)
                            System.out.println("Case "+x+": 0");
                        else if(a==3&&m==6)
                            System.out.println("Case "+x+": 3");
                        else if(a==3&&m==9)
                            System.out.println("Case "+x+": 0");
                        else if(a==6&&m==3)
                            System.out.println("Case "+x+": 0");
                        else if(a==6&&m==9)
                            System.out.println("Case "+x+": 0");
                        else if(a==9&&m==3)
                            System.out.println("Case "+x+": 0");
                        else if(a==9&&m==6)
                            System.out.println("Case "+x+": 3");

                    }
                }

            }
        }