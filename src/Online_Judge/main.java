package Online_Judge;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        int count=0;
        int arr[]= new int[x];
        for (int i = 0; i < x; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            if(a>=150)
            arr[i]=(a*100)/b;
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0) count++;

        }
        System.out.println(count);
    }
}
