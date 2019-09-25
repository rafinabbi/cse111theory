import java.util.Scanner;

public class Prob23 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    
    for(int i=0; i<n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int k= n-i; k<=n ; k++){
        if(k==n-i || k==n || i==0 || i==n-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println();
  }
}