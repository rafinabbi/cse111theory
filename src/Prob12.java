import java.util.Scanner;

public class Prob12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=n-2 ; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >=n-i ; k--) {
                System.out.print(k);
            }
            for (int m = 1; m <2 ; m++) {
                System.out.print("5");
            }
            System.out.println();
        }


    }
}
