package Practice;

import java.util.Scanner;

public class Lab03Task04 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String x= s.nextLine();
        int a[] =new int[256];
        for (int i = 0; i <x.length() ; i++) {
            char chi = x.charAt(i);
            int codeForCh = (int) chi;
            a[codeForCh]=a[codeForCh]+1;
            if(a[i]!=0){
            System.out.println((char)i+":"+codeForCh+" "+a[i]);
            }
            }
    }
}

