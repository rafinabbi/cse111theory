package Online_Judge;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class divisoor {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for (int i = 0; i < n; i++) {
//            int x = s.nextInt();
//            int y = s.nextInt();
//            for (int j = x; j <= y; j++) {
//                printDivisors(j);
//                System.out.println();
//            }
//
//        }
//    }
//
//    static void printDivisors(int n) {
//        ArrayList<Integer> arrcount = new ArrayList<Integer>(n);
//        ArrayList<Integer> arrnumber = new ArrayList<Integer>(n);
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//                System.out.printf("%d ", i);
//            }
//        }
//        System.out.println("count" + count);
//        arrcount.add(count);
//        arrnumber.add(n);
//        ArrayList<Integer> newcount = removeDuplicates(arrcount);
//        Collections.sort(newcount);
//        for (int i = 0; i <arrnumber.size() ; i++) {
//            if(){}
//        }
//
//    }
//    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
//    {
//
//        // Create a new ArrayList
//        ArrayList<T> newList = new ArrayList<T>();
//
//        // Traverse through the first list
//        for (T element : list) {
//
//            // If this element is not present in newList
//            // then add it
//            if (!newList.contains(element)) {
//
//                newList.add(element);
//            }
//        }
//
//        // return the new list
//        return newList;
//    }
//}
