package Test;

import java.util.*;

public class ttttt {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        int [] myArray = new int[256];
        String a;
        a=s.nextLine();
        for(int i=0;i<a.length();i++){
            myArray[a.charAt(i)]++;
        }
        //Arrays.sort(myArray);
        int m[]= new int[256];
        int j= 0;
        for(int i=0;i<256;i++){
            if(myArray[i]!=0){
                m[j]=i;
                j++;
                //System.out.println((char)i+"="+myArray[i]);
            }
        }
        Arrays.sort(m);
        System.out.println((char)m[256-2]);
    }
}