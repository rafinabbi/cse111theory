package Online_Judge;

import java.util.Scanner;

public class CF1252_A {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        fac f = new fac();
        int a= s.nextInt();
        int main[]= new int [a];
        int p1[]= new int [a];
        System.out.println(f.factorial(a));
        for (int i = 0; i <a ; i++) {
            main[i]=s.nextInt();
        }
        int k=1;
        for (int i = 0; i <f.factorial(a)-1 ; i++) {
            if(i%2==0){
                p1[i]=main[k];
                p1[i]=main[k];
            }


        }


        }
}
class fac{

    public  long factorial(long a){
        long x = 1;
        for (long i = a; i >0 ; i--) {
            x=x*i;
        }
        return x;
    }
}



