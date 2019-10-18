package Test;

import java.util.*;
class tesst{
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        int [] myArray = new int[256];
        String a;
        a=s.nextLine();
        for(int i=0;i<a.length();i++){
            myArray[a.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(myArray[i]!=0){
                if(myArray[i]==1){
                    System.out.print((char)i);
                }
                else{
                    for (int j = 0; j <myArray[i] ; j++) {
                        System.out.print((char)i);
                    }
                }

            }
        }
    }
}