package Assignment_06;

import java.util.Scanner;

public class Driver {


    public static void main(String[] args) {
        Object arr[]= new Object[100];
        Scanner s= new Scanner(System.in);

        Anime l = new Anime();
        Series l1 = new Series();
        Movie l2 = new Movie();
//        System.out.println(l.toString());


//        arr[1]=l1;
//        arr[2]=l2;

//        l.replace("name");
//        l.print();
//        l1.print();
//        l2.print();
//        l1.replace("rating");
//        l.print();
//        l1.print();
//        l2.print();
        System.out.println("which variable do you want to delete");
        arr[0]=l;
        //l.delete("name");
        l.deleteobject();
        System.out.println(l);
        System.out.println(arr[0]);
//        l.print();
        //l = new Anime();
        //l.name=s.nextLine();
       //System.out.println(arr[0]);
    }
}
