import java.util.Scanner;

public class Prob10 {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
        int x;
        for (int i= 1; i<=n-1; i++) {
          System.out.print(" ");
             }
        System.out.print("1");
        System.out.println();
        for (int i = 1 ; i <=n-2 ; i++) {
            for (int j = n-2; j >0; j--) {
                System.out.print(" ");
            }
            
            System.out.print("1");
            for (int k = 1; k <= i; k++) {
                    System.out.print(" ");
                }
            System.out.print(2*i+1);
            System.out.println();
        }
        for (int k = 1; k <= 2*n-1; k++) {
          System.out.print(k);
             }
    }
}
            
            
            
            
            
            
//            if(i==1){
//                System.out.print("1");
//             System.out.println();
//             }
//            
//            
//            
//            
//            
//            else {
//                for (int k = 1; k <= i; k++) {
//                    System.out.print(k);
//                }
//                for (int m = i-1; m >0 ; m--) {
//                    System.out.print(m);
//                }
//                System.out.println();
//            }
//        }
//
//    }
//}
