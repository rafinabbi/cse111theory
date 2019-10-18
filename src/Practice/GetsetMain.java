package Practice;

import java.util.Scanner;

public class GetsetMain {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        GetterSetter person1= new GetterSetter("ashik","19101","017174748");
        GetterSetter person2= new GetterSetter("raag","13434","1313113");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1.getId());
        System.out.println(person2.getId());

    }
}
