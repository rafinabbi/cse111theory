package Test;

import java.util.Scanner;

public class Habizabi {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        for (int i = 0; i <100 ; i++) {
            String x= s.nextLine();
            object obji= new object(x);
            obji.rolladd(obji);
            obji.seatcapacity(obji);
        }
    }
}
