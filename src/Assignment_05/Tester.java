package Assignment_05;

public class Tester{
    public static void main (String[] args){

        MyString s1 = new MyString("AAAAA OIYmF");
        MyString s2 = new MyString("OIYF");
        System.out.println(s1.length());// This should print 5
        System.out.println(s1.charAt(2));
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.replaceFirst('A','a'));
        System.out.println(s1.replaceAll('A','a'));
    }
}