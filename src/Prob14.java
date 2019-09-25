import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print(" ");
            }
            if(i==1){
                System.out.print("1");
                System.out.println();
            }
            else {
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                for (int m = i-1; m >0 ; m--) {
                    System.out.print(m);
                }
                System.out.println();
            }
        }

    }
}
