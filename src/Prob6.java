import java.util.Scanner;
public class Prob6 {
    public static void main (String [] args){
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        for (int i = 1; i<=a ; i++) {
            for (int j = a-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j =1 ; j <=2*i-1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = a-1; i>0 ; i--) {
            for (int j = 1; j<=a-i ; j++) {
                System.out.print(" ");
            }
            for (int j =1 ; j <=2*i-1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
