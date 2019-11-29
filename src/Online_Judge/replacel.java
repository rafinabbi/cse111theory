package Online_Judge;

import java.util.Scanner;

public class replacel {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a;
        while(s.hasNextLine()){
            a=s.nextLine();
            String s1=a.replaceAll("]","");
            String s2=s1.replace("[","");
            System.out.println(s2);
        }
    }
}
