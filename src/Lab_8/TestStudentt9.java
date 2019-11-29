package Lab_8;

public class TestStudentt9 extends Studentt9{
        public static void printShout(Studentt9 s){
            System.out.println("------------------");
            System.out.println(s.msg);
            System.out.println(s.shout());
        }
        public static void main(String [] args){
            Studentt9 s = new Studentt9();
            CSEStudent cs = new CSEStudent();
            CSE111Student cs111 = new CSE111Student();
            System.out.println(s.msg);
            System.out.println(cs.msg);
            System.out.println(cs111.msg);
            printShout(s);
            printShout(cs);
            printShout(cs111);
        }
    }