import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 1; i <=2 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <=n-3 ; i++) {
            System.out.print("1");
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i+2; j <=n-1 ; j++) {
                System.out.print(j);
                break;
            }
            System.out.println();

        }
        for (int j = 1; j <=n ; j++) {
            System.out.print(j);
        }
    }
}
