package Practice;

import java.util.Scanner;

public class MockB {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
        int roll [] = new int[n];
        int marks [] = new int[n];
        String name [] = new String[n];
        for (int i = 0; i <n ; i++) {
            roll [i] = s.nextInt();
            marks [i] = s.nextInt();
            name [i] = s.next();
        }

        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <marks.length; j++) {
                if (marks[j] > marks[j + 1]) {
                    int x = marks[j + 1];
                    marks[j + 1] = marks[i];
                    marks[j] = x;
                }
            }
        }
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < marks.length; j++) {
                if (marks[j] == marks[j + 1]) {
                    if(roll [i]< roll [i+1]){
                        int x = marks[j + 1];
                        marks[j + 1] = marks[i];
                        marks[j] = x;
                    }
                }
            }
        }
        for (int i = n-1; i <=0 ; i--) {
            System.out.println(marks[i]);
        }
    }
}
