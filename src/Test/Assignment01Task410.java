package Test;


import java.util.Scanner;
public class Assignment01Task410{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter Array amount: ");
        int n = scanner.nextInt();
        int [] array = new int [n];
        System.out.print ("Enter numbers");
        for (int i = 0; i <n ; i++) {
            array[i] = scanner.nextInt();
        }
        int x = 0;
            for (int j = n-1; j >n/2 ; j--) {
                int temp= array[j];
                array[j]=array[x];
                array[x]=temp;
                x++;
            }


        for (int i = 0; i <n ; i++) {
            System.out.println(array[i]);
            }
        }
    }
