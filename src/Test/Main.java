package Test;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        String []s1= s.split("");
        Arrays.sort(s1);
        for(int i = 0; i<s1.length;i++){
            System.out.print(s1[i]);
        }
    }
}
