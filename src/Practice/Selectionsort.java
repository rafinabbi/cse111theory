package Practice;

import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int min;
        int arr[] = new int[a];
        for (int i = 0; i <a ; i++) {
            arr[i]= s.nextInt();
        }
        for (int j = 0; j <a ; j++) {
            for (int i = 0; i < a - 1; i++) {
                if (arr[1 + i] < arr[i]) {
                    int x = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = x;
                }
            }
        }
        for (int i = 0; i <a ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
