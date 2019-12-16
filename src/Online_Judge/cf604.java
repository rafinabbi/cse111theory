package Online_Judge;

import java.util.Scanner;

public class cf604 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int k = 0;
        boolean f=true;
        for (int i = 0; i < a; i++) {
            String ss=s.next();
            String[] sp=ss.split("");
            for (int j = 0; j <ss.length() ; j++) {
                if (j != 0) {
                    if (ss.charAt(j) == ss.charAt(j - 1)&&!sp[j].equals("?")) {
                        System.out.println("-1");
                        f=false;
                        break;
                    }
                }
                if(sp[j].equals("?")){
                    if(sp[j-1].equals("a")&&sp[j+1].equals("c")) sp[j]="b";
                    if(sp[j-1].equals("a")&&sp[j+1].equals("b")) sp[j]="c";
                    if(sp[j-1].equals("b")&&sp[j+1].equals("a")) sp[j]="c";
                    if(sp[j-1].equals("b")&&sp[j+1].equals("c")) sp[j]="a";
                    if(sp[j-1].equals("c")&&sp[j+1].equals("a")) sp[j]="b";
                    if(sp[j-1].equals("c")&&sp[j+1].equals("b")) sp[j]="a";
                    if(sp[j-1].equals("a")&&sp[j+1].equals("a")) sp[j]="b";
                    if(sp[j-1].equals("b")&&sp[j+1].equals("b")) sp[j]="c";
                    if(sp[j-1].equals("c")&&sp[j+1].equals("c")) sp[j]="a";

                }
            }
            for (int j = 0; j < ss.length(); j++) {
                if(false) {
                    System.out.print(sp[j]);
                }
            }
            if(false) {
                System.out.println();
            }

        }
    }
}
