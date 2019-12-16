package Prep_b4_Final;

        import java.util.*;

public class Lab6task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] myArray = new int[256];
        String a=s.nextLine();
        for(int i=0;i<a.length();i++){
            myArray[a.charAt(i)]++;
            //System.out.println(myArray[a.charAt(i)]);
        }
        int p[]= new int [256];
        int j=0;
        for(int i=0;i<256;i++){
            if(myArray[i]!=0){
                j++;
                p[j]=myArray[i];
                System.out.println(p[j]);
                //System.out.println((char)i+"="+myArray[i]);
            }
        }
        Arrays.sort(p);
        System.out.println((char)p[1]);
        for (int i = 0; i <256 ; i++) {
            if(p[i]!=0) {
                System.out.println((char)p[i]);
                //System.out.println(p[i]);
            }
        }
    }
}
